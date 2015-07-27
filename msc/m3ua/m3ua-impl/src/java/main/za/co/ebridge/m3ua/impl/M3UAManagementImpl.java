package za.co.ebridge.m3ua.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javolution.text.TextBuilder;
import javolution.util.FastMap;
import javolution.xml.XMLObjectReader;
import javolution.xml.XMLObjectWriter;
import javolution.xml.stream.XMLStreamException;

import org.apache.log4j.Logger;

import za.co.ebridge.m3ua.impl.oam.M3UAOAMMessages;

import za.co.ebridge.m3ua.api.*;
import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageFactory;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.transfer.PayloadData;
import za.co.ebridge.m3ua.api.parameter.*;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.message.MessageFactoryImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterFactoryImpl;
import za.co.ebridge.m3ua.impl.scheduler.M3UAScheduler;
import za.co.ebridge.mtp.api.Mtp3PausePrimitive;
import za.co.ebridge.mtp.api.Mtp3ResumePrimitive;
import za.co.ebridge.mtp.api.Mtp3StatusPrimitive;
import za.co.ebridge.mtp.api.Mtp3TransferPrimitive;
import za.co.ebridge.mtp.impl.Mtp3UserPartBaseImpl;
import za.co.ebridge.sctp.api.Association;
import za.co.ebridge.sctp.api.Management;

public class M3UAManagementImpl
        extends Mtp3UserPartBaseImpl
        implements M3UAManagement
{

    private static final Logger logger = Logger.getLogger(M3UAManagementImpl.class);

    private static final String AS_LIST = "asList";
    private static final String ASP_FACTORY_LIST = "aspFactoryList";
    private static final String DPC_VS_AS_LIST = "route";

    private static final String M3UA_PERSIST_DIR_KEY = "m3ua.persist.dir";
    private static final String USER_DIR_KEY = "user.dir";
    private static final String PERSIST_FILE_NAME = "m3ua.xml";

    private static final M3UAXMLBinding binding = new M3UAXMLBinding();
    private static final String TAB_INDENT = "\t";
    private static final String CLASS_ATTRIBUTE = "type";

    protected static final int MAX_SEQUENCE_NUMBER = 256;

    protected List<As> appServers = new ArrayList<>();
    protected List<AspFactory> aspfactories = new ArrayList<>();

    protected M3UAScheduler m3uaScheduler = new M3UAScheduler();

    private final TextBuilder persistFile = new TextBuilder();

    private final String name;

    private String persistDir = null;

    protected ParameterFactory parameterFactory = new ParameterFactoryImpl();
    protected MessageFactory messageFactory = new MessageFactoryImpl();

    protected Management transportManagement = null;

    private ScheduledExecutorService fsmTicker;

    protected int maxAsForRoute = 2;

    protected int timeBetweenHeartbeat = 10000; // 10 sec default

    private M3UARouteManagement routeManagement = null;

    protected List<M3UAManagementEventListener> managementEventListeners = new ArrayList<>();

    /**
     * Maximum sequence number received from SCCTP user.
     * If SCCTP users sends seq number greater than max, packet will be dropped and error message will be logged
     */
    private int maxSequenceNumber = MAX_SEQUENCE_NUMBER;

    public M3UAManagementImpl(String name)
    {
        this.name = name;
        binding.setClassAttribute(CLASS_ATTRIBUTE);
        binding.setAlias(AspFactoryImpl.class, "aspFactory");
        binding.setAlias(AsImpl.class, "as");
        binding.setAlias(AspImpl.class, "asp");

        this.routeManagement = new M3UARouteManagement(this);
    }

    public String getName()
    {
        return name;
    }

    public int getMaxSequenceNumber()
    {
        return maxSequenceNumber;
    }

    /**
     * Set the maximum SLS that can be used by SCTP.
     * Internally SLS vs SCTP Stream Sequence Number is maintained.
     * Stream Seq Number 0 is for management.
     */
    public void setMaxSequenceNumber(int maxSequenceNumber)
    {
        if (this.maxSequenceNumber < 1)
        {
            this.maxSequenceNumber = 1;
        }

        if (this.maxSequenceNumber > MAX_SEQUENCE_NUMBER)
        {
            this.maxSequenceNumber = MAX_SEQUENCE_NUMBER;
        }
        this.maxSequenceNumber = maxSequenceNumber;
    }

    public String getPersistDir()
    {
        return persistDir;
    }

    public void setPersistDir(String persistDir)
    {
        this.persistDir = persistDir;
    }

    public int getMaxAsForRoute()
    {
        return maxAsForRoute;
    }

    public void setMaxAsForRoute(int maxAsForRoute)
    {
        this.maxAsForRoute = maxAsForRoute;
    }

    public int getHeartbeatTime()
    {
        return this.timeBetweenHeartbeat;
    }

    public void setHeartbeatTime(int timeBetweenHeartbeat)
    {
        this.timeBetweenHeartbeat = timeBetweenHeartbeat;
    }

    public Management getTransportManagement()
    {
        return transportManagement;
    }

    public void setTransportManagement(Management transportManagement)
    {
        this.transportManagement = transportManagement;
    }

    public void start()
            throws
            Exception
    {

        if (this.transportManagement == null)
        {
            throw new NullPointerException("TransportManagement is null");
        }

        if (maxAsForRoute < 1 || maxAsForRoute > 4)
        {
            throw new Exception("Max AS for a route can be minimum 1 or maximum 4");
        }

        super.start();

        this.persistFile.clear();

        if (persistDir != null)
        {
            this.persistFile
                    .append(persistDir)
                    .append(File.separator)
                    .append(this.name)
                    .append("_")
                    .append(PERSIST_FILE_NAME);
        } else
        {
            persistFile.append(System.getProperty(M3UA_PERSIST_DIR_KEY, System.getProperty(USER_DIR_KEY)))
                    .append(File.separator).append(this.name).append("_").append(PERSIST_FILE_NAME);
        }

        logger.info(String.format("M3UA configuration file path %s", persistFile.toString()));

        binding.setM3uaManagement(this);

        try
        {
            this.load();
        }
        catch (FileNotFoundException e)
        {
            logger.warn(String.format("Failed to load the SS7 configuration file. \n%s", e.getMessage()));
        }

        this.routeManagement.reset();

        fsmTicker = Executors.newSingleThreadScheduledExecutor();
        fsmTicker.scheduleAtFixedRate(m3uaScheduler, 500, 500, TimeUnit.MILLISECONDS);

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {
            try
            {
                m3uaManagementEventListener.onServiceStarted();
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking M3UAManagementEventListener.onServiceStarted", ee);
            }
        }

        logger.info("Started M3UAManagement");
    }

    public void stop()
            throws
            Exception
    {

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {
            try
            {
                m3uaManagementEventListener.onServiceStopped();
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onServiceStopped", ee);
            }
        }

        this.store();

        this.stopFactories();
        super.stop();

        fsmTicker.shutdown();
    }

    @Override
    public boolean isStarted()
    {
        return this.isStarted;
    }

    @Override
    public void addM3UAManagementEventListener(M3UAManagementEventListener m3uaManagementEventListener)
    {
        synchronized (this)
        {
            if (this.managementEventListeners.contains(m3uaManagementEventListener))
                return;

            List<M3UAManagementEventListener> newManagementEventListeners
                    = new ArrayList<>();
            newManagementEventListeners.addAll(this.managementEventListeners);
            newManagementEventListeners.add(m3uaManagementEventListener);
            this.managementEventListeners = newManagementEventListeners;
        }
    }

    @Override
    public void removeM3UAManagementEventListener(M3UAManagementEventListener m3uaManagementEventListener)
    {
        synchronized (this)
        {
            if (!this.managementEventListeners.contains(m3uaManagementEventListener))
                return;

            List<M3UAManagementEventListener> newManagementEventListeners = new ArrayList<M3UAManagementEventListener>();
            newManagementEventListeners.addAll(this.managementEventListeners);
            newManagementEventListeners.remove(m3uaManagementEventListener);
            this.managementEventListeners = newManagementEventListeners;
        }
    }

    public List<As> getAppServers()
    {
        List<As> appServersTmp = new ArrayList<As>();
        appServersTmp.addAll(this.appServers);
        return appServersTmp;
    }

    public List<AspFactory> getAspfactories()
    {
        List<AspFactory> aspfactoriesTemp = new ArrayList<>();
        aspfactoriesTemp.addAll(this.aspfactories);
        return aspfactoriesTemp;
    }

    public Map<String, As[]> getRoute()
    {
        Map<String, As[]> routeTmp = new HashMap<>();
        routeTmp.putAll(this.routeManagement.route);
        return routeTmp;
    }

    protected As getAs(String asName)
    {

        for (As as : appServers)
        {
            if (as.getName().equals(asName))
            {
                return as;
            }
        }
        return null;
    }

    /**
     * <p>
     * Create new {@link AsImpl}
     * </p>
     * <p>
     * Command is m3ua as create <as-name> <AS | SGW | IPSP> mode <SE | DE> ipspType <client | server > rc <routing-context>
     * traffic-mode <traffic mode> min-asp <minimum asp active for TrafficModeType.Loadshare> network-appearance <network
     * appearance>
     * </p>
     * <p>
     * where mode is optional, by default SE. ipspType should be specified if type is IPSP. rc is optional and traffi-mode is
     * also optional, default is Loadshare
     * </p>
     *
     * @param asName
     * @return
     * @throws Exception
     */
    public As createAs(
            String asName,
            Functionality functionality,
            ExchangeType exchangeType,
            IPSPType ipspType,
            RoutingContext rc,
            TrafficModeType trafficMode,
            int minAspActiveForLoadbalance,
            NetworkAppearance na)
            throws
            Exception
    {

        As as = this.getAs(asName);
        if (as != null)
        {
            throw new Exception(String.format(M3UAOAMMessages.CREATE_AS_FAIL_NAME_EXIST, asName));
        }

        // TODO check if RC is already taken?

        if (exchangeType == null)
        {
            exchangeType = ExchangeType.SE;
        }

        if (functionality == Functionality.IPSP && ipspType == null)
        {
            ipspType = IPSPType.CLIENT;
        }

        as = new AsImpl(asName, rc, trafficMode, minAspActiveForLoadbalance, functionality, exchangeType, ipspType, na);
        ((AsImpl) as).setM3UAManagement(this);
        FSM localFSM = ((AsImpl) as).getLocalFSM();
        this.m3uaScheduler.execute(localFSM);

        FSM peerFSM = ((AsImpl) as).getPeerFSM();
        this.m3uaScheduler.execute(peerFSM);

        appServers.add(as);

        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {
            try
            {
                m3uaManagementEventListener.onAsCreated(as);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAsCreated", ee);
            }
        }
        return as;
    }

    public AsImpl destroyAs(String asName)
            throws
            Exception
    {

        AsImpl as = (AsImpl) this.getAs(asName);
        if (as == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_AS_FOUND, asName));
        }

        if (as.applicationServerProcesses.size() != 0)
        {
            throw new Exception(String.format(M3UAOAMMessages.DESTROY_AS_FAILED_ASP_ASSIGNED, asName));
        }


        for (As[] asList : this.routeManagement.route.values())
        {
            for (As asTemp : asList)
            {
                logger.fatal(" As checks not performed. Fix ambiguity.");
                /*
                 TODO fix ambiguity
                if ( (asTemp != null) && (asTemp.equals(as)) ) {
                    throw new Exception(String.format(M3UAOAMMessages.AS_USED_IN_ROUTE_ERROR, asName, e.getKey()));
                }
                */
            }
        }

        FSM asLocalFSM = as.getLocalFSM();
        if (asLocalFSM != null)
        {
            asLocalFSM.cancel();
        }

        FSM asPeerFSM = as.getPeerFSM();
        if (asPeerFSM != null)
        {
            asPeerFSM.cancel();
        }

        appServers.remove(as);

        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {
            try
            {
                m3uaManagementEventListener.onAsDestroyed(as);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAsDestroyed", ee);
            }
        }

        return as;
    }

    /**
     * Create new {@link AspFactoryImpl} without passing optional aspid and heartbeat is false
     *
     * @param aspName
     * @param associationName
     * @return
     * @throws Exception
     */
    public AspFactory createAspFactory(String aspName, String associationName)
            throws
            Exception
    {
        return this.createAspFactory(aspName, associationName, false);
    }

    /**
     * Create new {@link AspFactoryImpl} without passing optional aspid
     *
     * @param aspName
     * @param associationName
     * @return
     * @throws Exception
     */
    public AspFactory createAspFactory(
            String aspName,
            String associationName,
            boolean isHeartBeatEnabled)
            throws
            Exception
    {

        long aspid = 0L;
        boolean regenerateFlag = true;

        while (regenerateFlag)
        {
            aspid = AspFactoryImpl.generateId();
            if (aspfactories.size() == 0)
            {
                // Special case where this is first Asp added
                break;
            }

            for (AspFactory aspFactoryImpl : aspfactories)
            {
                if (aspid == aspFactoryImpl.getAspId().getAspId())
                {
                    regenerateFlag = true;
                    break;
                } else
                {
                    regenerateFlag = false;
                }
            }
        }

        return this.createAspFactory(aspName, associationName, aspid, isHeartBeatEnabled);
    }

    /**
     * <p>
     * Create new {@link AspFactoryImpl}
     * </p>
     * <p>
     * Command is m3ua asp create <asp-name> <sctp-association> aspid <aspid> heartbeat <true|false>
     * </p>
     * <p>
     * asp-name and sctp-association is mandatory where as aspid is optional. If aspid is not passed, next available aspid wil
     * be used
     * </p>
     *
     * @param aspName
     * @param associationName
     * @param aspid
     * @return
     * @throws Exception
     */
    public AspFactory createAspFactory(String aspName, String associationName, long aspid, boolean isHeartBeatEnabled)
            throws
            Exception
    {

        AspFactoryImpl factory = this.getAspFactory(aspName);

        if (factory != null)
        {
            throw new Exception(String.format(M3UAOAMMessages.CREATE_ASP_FAIL_NAME_EXIST, aspName));
        }

        Association association = this.transportManagement.getAssociation(associationName);
        if (association == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_ASSOCIATION_FOUND, associationName));
        }

        if (association.isStarted())
        {
            throw new Exception(String.format(M3UAOAMMessages.ASSOCIATION_IS_STARTED, associationName));
        }

        if (association.getAssociationListener() != null)
        {
            throw new Exception(String.format(M3UAOAMMessages.ASSOCIATION_IS_ASSOCIATED, associationName));
        }

        for (AspFactory aspFactoryImpl : aspfactories)
        {
            if (aspid == aspFactoryImpl.getAspId().getAspId())
            {
                throw new Exception(String.format(M3UAOAMMessages.ASP_ID_TAKEN, aspid));
            }
        }

        factory = new AspFactoryImpl(aspName, this.getMaxSequenceNumber(), aspid, isHeartBeatEnabled);
        factory.setM3UAManagement(this);
        factory.setAssociation(association);
        factory.setTransportManagement(this.transportManagement);

        aspfactories.add(factory);

        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {
            try
            {
                m3uaManagementEventListener.onAspFactoryCreated(factory);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAspFactoryCreated", ee);
            }
        }

        return factory;
    }

    public AspFactoryImpl destroyAspFactory(String aspName)
            throws
            Exception
    {
        AspFactoryImpl aspFactroy = this.getAspFactory(aspName);
        if (aspFactroy == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_ASP_FOUND, aspName));
        }

        if (aspFactroy.aspList.size() != 0)
        {
            throw new Exception("Asp are still assigned to As. Unassign all");
        }
        aspFactroy.unsetAssociation();
        this.aspfactories.remove(aspFactroy);
        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {
            try
            {
                m3uaManagementEventListener.onAspFactoryDestroyed(aspFactroy);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAspFactoryDestroyed", ee);
            }
        }

        return aspFactroy;
    }

    /**
     * Associate {@link AspImpl} to {@link AsImpl}
     *
     * @param asName
     * @param aspName
     * @return
     * @throws Exception
     */
    public AspImpl assignAspToAs(String asName, String aspName)
            throws
            Exception
    {
        // check ASP and AS exist with given name
        AsImpl asImpl = (AsImpl) this.getAs(asName);

        if (asImpl == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_AS_FOUND, asName));
        }

        AspFactoryImpl aspFactroy = this.getAspFactory(aspName);

        if (aspFactroy == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_ASP_FOUND, aspName));
        }

        // If ASP already assigned to AS we don't want to re-assign
        for (Asp asp : asImpl.applicationServerProcesses)
        {

            AspImpl aspImpl = (AspImpl) asp;
            if (aspImpl.getName().equals(aspName))
            {
                throw new Exception(String.format(M3UAOAMMessages.ADD_ASP_TO_AS_FAIL_ALREADY_ASSIGNED_TO_THIS_AS, aspName,
                        asName));
            }
        }

        List<Asp> aspImpls = aspFactroy.aspList;

        // Checks for RoutingContext. We know that for null RC there will always
        // be a single ASP assigned to AS and ASP cannot be shared
        if (asImpl.getRoutingContext() == null)
        {
            // If AS has Null RC, this should be the first assignment of ASP to
            // AS
            if (aspImpls.size() != 0)
            {
                throw new Exception(String.format(M3UAOAMMessages.ADD_ASP_TO_AS_FAIL_ALREADY_ASSIGNED_TO_OTHER_AS, aspName,
                        asName));
            }
        } else if (aspImpls.size() > 0)
        {
            // RoutingContext is not null, make sure there is no ASP that is
            // assigned to AS with null RC
            Asp asp = aspImpls.get(0);
            if (asp != null && asp.getAs().getRoutingContext() == null)
            {
                throw new Exception(String.format(M3UAOAMMessages.ADD_ASP_TO_AS_FAIL_ALREADY_ASSIGNED_TO_OTHER_AS_WITH_NULL_RC,
                        aspName, asName));
            }
        }

        if (aspFactroy.getFunctionality() != null && aspFactroy.getFunctionality() != asImpl.getFunctionality())
        {
            throw new Exception(String.format(M3UAOAMMessages.ADD_ASP_TO_AS_FAIL_ALREADY_ASSIGNED_TO_OTHER_AS_TYPE, aspName,
                    asName, aspFactroy.getFunctionality()));
        }

        if (aspFactroy.getExchangeType() != null && aspFactroy.getExchangeType() != asImpl.getExchangeType())
        {
            throw new Exception(String.format(M3UAOAMMessages.ADD_ASP_TO_AS_FAIL_ALREADY_ASSIGNED_TO_OTHER_AS_EXCHANGETYPE,
                    aspName, asName, aspFactroy.getExchangeType()));
        }

        if (aspFactroy.getIpspType() != null && aspFactroy.getIpspType() != asImpl.getIpspType())
        {
            throw new Exception(String.format(M3UAOAMMessages.ADD_ASP_TO_AS_FAIL_ALREADY_ASSIGNED_TO_OTHER_IPSP_TYPE, aspName,
                    asName, aspFactroy.getIpspType()));
        }

        aspFactroy.setExchangeType(asImpl.getExchangeType());
        aspFactroy.setFunctionality(asImpl.getFunctionality());
        aspFactroy.setIpspType(asImpl.getIpspType());

        AspImpl aspImpl = aspFactroy.createAsp();
        FSM aspLocalFSM = aspImpl.getLocalFSM();
        m3uaScheduler.execute(aspLocalFSM);

        FSM aspPeerFSM = aspImpl.getPeerFSM();
        m3uaScheduler.execute(aspPeerFSM);
        asImpl.addAppServerProcess(aspImpl);

        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {

            try
            {
                m3uaManagementEventListener.onAspAssignedToAs(asImpl, aspImpl);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAspAssignedToAs", ee);
            }
        }

        return aspImpl;
    }

    public Asp unAssignAspFromAs(String asName, String aspName)
            throws
            Exception
    {
        // check ASP and AS exist with given name
        AsImpl asImpl = (AsImpl) this.getAs(asName);

        if (asImpl == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_AS_FOUND, asName));
        }

        AspImpl aspImpl = asImpl.removeAppServerProcess(aspName);
        aspImpl.getAspFactory().destroyAsp(aspImpl);
        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {

            try
            {
                m3uaManagementEventListener.onAspUnassignedFromAs(asImpl, aspImpl);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAspUnassignedFromAs", ee);
            }
        }

        return aspImpl;
    }

    /**
     * This method should be called by management to start the ASP
     *
     * @param aspName The name of the ASP to be started
     * @throws Exception
     */
    public void startAsp(String aspName)
            throws
            Exception
    {

        AspFactoryImpl aspFactoryImpl = this.getAspFactory(aspName);

        if (aspFactoryImpl == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_ASP_FOUND, aspName));
        }

        if (aspFactoryImpl.getStatus())
        {
            throw new Exception(String.format(M3UAOAMMessages.ASP_ALREADY_STARTED, aspName));
        }

        if (aspFactoryImpl.aspList.size() == 0)
        {
            throw new Exception(String.format(M3UAOAMMessages.ASP_NOT_ASSIGNED_TO_AS, aspName));
        }

        aspFactoryImpl.start();
        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {

            try
            {
                m3uaManagementEventListener.onAspFactoryStarted(aspFactoryImpl);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAspFactoryStarted", ee);
            }

        }
    }

    /**
     * This method should be called by management to stop the ASP
     *
     * @param aspName The name of the ASP to be stopped
     * @throws Exception
     */
    public void stopAsp(String aspName)
            throws
            Exception
    {

        this.doStopAsp(aspName, true);
    }

    private void doStopAsp(String aspName, boolean needStore)
            throws
            Exception
    {
        AspFactoryImpl aspFactoryImpl = this.getAspFactory(aspName);

        if (aspFactoryImpl == null)
        {
            throw new Exception(String.format(M3UAOAMMessages.NO_ASP_FOUND, aspName));
        }

        if (!aspFactoryImpl.getStatus())
        {
            throw new Exception(String.format(M3UAOAMMessages.ASP_ALREADY_STOPPED, aspName));
        }

        aspFactoryImpl.stop();

        if (needStore)
            this.store();

        // TODO : Should calling
        // m3uaManagementEventListener.onAspFactoryStopped() be before actual
        // stop of aspFactory? The problem is ASP_DOWN and AS_INACTIV callbacks
        // are before AspFactoryStopped. Is it ok?

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {

            try
            {
                m3uaManagementEventListener.onAspFactoryStopped(aspFactoryImpl);
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onAspFactoryStopped", ee);
            }
        }
    }

    public void addRoute(int dpc, int opc, int si, String asName)
            throws
            Exception
    {
        this.routeManagement.addRoute(dpc, opc, si, asName);
    }

    public void removeRoute(int dpc, int opc, int si, String asName)
            throws
            Exception
    {
        this.routeManagement.removeRoute(dpc, opc, si, asName);
    }

    public void removeAllResources()
            throws
            Exception
    {

        if (!this.isStarted)
        {
            throw new Exception(String.format("Management=%s not started", this.name));
        }

        if (this.appServers.size() == 0 && this.aspfactories.size() == 0)
            // no resources allocated - nothing to do
            return;

        if (logger.isInfoEnabled())
        {
            logger.info(String.format("Removing allocated resources: AppServers=%d, AspFactories=%d", this.appServers.size(),
                    this.aspfactories.size()));
        }

        this.stopFactories();

        // Remove routes
        this.routeManagement.removeAllResourses();

        // Unassign asp from as
        FastMap<String, List<String>> lstAsAsp = new FastMap<String, List<String>>();

        for (As as : this.appServers)
        {
            AsImpl asImpl = (AsImpl) as;
            List<String> lstAsps = new ArrayList<String>();

            for (Asp asp : asImpl.applicationServerProcesses)
            {

                AspImpl aspImpl = (AspImpl) asp;
                lstAsps.add(aspImpl.getName());
            }
            lstAsAsp.put(asImpl.getName(), lstAsps);
        }

        for (String asName : lstAsAsp.keySet())
        {
            for (String aspName : lstAsAsp.get(asName))
            {
                this.unAssignAspFromAs(asName, aspName);
            }
        }

        // Remove all AspFactories
        ArrayList<AspFactory> lstAspFactory = new ArrayList<AspFactory>();
        for (AspFactory aspFact : this.aspfactories)
        {
            lstAspFactory.add(aspFact);
        }
        for (AspFactory aspFact : lstAspFactory)
        {
            this.destroyAspFactory(aspFact.getName());
        }

        // Remove all AppServers
        ArrayList<String> lst = new ArrayList<String>();
        for (As asImpl : this.appServers)
        {
            lst.add(asImpl.getName());
        }
        for (String n : lst)
        {
            this.destroyAs(n);
        }

        // We store the cleared state
        this.store();

        for (M3UAManagementEventListener m3uaManagementEventListener : this.managementEventListeners)
        {

            try
            {
                m3uaManagementEventListener.onRemoveAllResources();
            }
            catch (Throwable ee)
            {
                logger.error("Exception while invoking onRemoveAllResources", ee);
            }
        }
    }

    private void stopFactories()
            throws
            Exception
    {
        // Stopping asp factories
        boolean someFactoriesIsStopped = false;
        for (AspFactory aspFact : this.aspfactories)
        {
            AspFactoryImpl aspFactImpl = (AspFactoryImpl) aspFact;
            if (aspFactImpl.started)
            {
                someFactoriesIsStopped = true;
                this.doStopAsp(aspFact.getName(), false);
            }
        }
        // waiting 5 seconds till stopping factories
        if (someFactoriesIsStopped)
        {
            for (int step = 1; step < 50; step++)
            {
                boolean allStopped = true;
                for (AspFactory aspFact : this.aspfactories)
                {
                    if (aspFact.getAssociation() != null && aspFact.getAssociation().isConnected())
                    {
                        allStopped = false;
                        break;
                    }
                }
                if (allStopped)
                    break;

                Thread.sleep(100);
            }
        }
    }

    public void sendTransferMessageToLocalUser(Mtp3TransferPrimitive msg, int seqControl)
    {
        super.sendTransferMessageToLocalUser(msg, seqControl);
    }

    public void sendPauseMessageToLocalUser(Mtp3PausePrimitive msg)
    {
        super.sendPauseMessageToLocalUser(msg);
    }

    public void sendResumeMessageToLocalUser(Mtp3ResumePrimitive msg)
    {
        super.sendResumeMessageToLocalUser(msg);
    }

    public void sendStatusMessageToLocalUser(Mtp3StatusPrimitive msg)
    {
        super.sendStatusMessageToLocalUser(msg);
    }

    private AspFactoryImpl getAspFactory(String aspName)
    {

        for (AspFactory aspFactory : aspfactories)
        {
            if (aspFactory.getName().equals(aspName))
            {
                return (AspFactoryImpl) aspFactory;
            }
        }

        return null;
    }

    /**
     * Persist
     */
    public void store()
    {

        // TODO : Should we keep reference to Objects rather than recreating
        // everytime?
        try
        {
            XMLObjectWriter writer = XMLObjectWriter.newInstance(new FileOutputStream(persistFile.toString()));
            writer.setBinding(binding);
            // Enables cross-references.
            // writer.setReferenceResolver(new XMLReferenceResolver());
            writer.setIndentation(TAB_INDENT);
            writer.write(aspfactories, ASP_FACTORY_LIST, List.class);
            writer.write(appServers, AS_LIST, List.class);
            writer.write(this.routeManagement.route, DPC_VS_AS_LIST, RouteMap.class);

            writer.close();
        }
        catch (Exception e)
        {
            logger.error("Error while persisting the Rule state in file", e);
        }
    }

    /**
     * Load and create LinkSets and Link from persisted file
     *
     * @throws Exception
     */
    public void load()
            throws
            FileNotFoundException
    {

        XMLObjectReader reader = null;
        try
        {
            reader = XMLObjectReader.newInstance(new FileInputStream(persistFile.toString()));

            reader.setBinding(binding);
            aspfactories = reader.read(ASP_FACTORY_LIST, List.class);
            appServers = reader.read(AS_LIST, List.class);
            this.routeManagement.route = reader.read(DPC_VS_AS_LIST, RouteMap.class);

            // Create Asp's and assign to each of the AS. Schedule the FSM's

            for (As as : appServers)
            {

                AsImpl asImpl = (AsImpl) as;
                asImpl.setM3UAManagement(this);
                FSM asLocalFSM = asImpl.getLocalFSM();
                m3uaScheduler.execute(asLocalFSM);

                FSM asPeerFSM = asImpl.getPeerFSM();
                m3uaScheduler.execute(asPeerFSM);

                // All the Asp's for this As added in temp list
                List<Asp> tempAsp = new ArrayList<Asp>();
                tempAsp.addAll(asImpl.applicationServerProcesses);

                // Clear Asp's from this As
                asImpl.applicationServerProcesses.clear();

                for (Asp asp : tempAsp)
                {

                    AspImpl aspImpl = (AspImpl) asp;

                    try
                    {
                        // Now let the Asp's be created from respective
                        // AspFactory and added to As
                        this.assignAspToAs(asImpl.getName(), aspImpl.getName());
                    }
                    catch (Exception e)
                    {
                        logger.error("Error while assigning Asp to As on loading from xml file", e);
                    }
                }
            }

            // Set the transportManagement
            for (AspFactory aspFactory : aspfactories)
            {

                AspFactoryImpl factory = (AspFactoryImpl) aspFactory;
                factory.setTransportManagement(this.transportManagement);
                factory.setM3UAManagement(this);
                try
                {
                    factory.setAssociation(this.transportManagement.getAssociation(factory.associationName));
                }
                catch (Throwable e1)
                {
                    logger.error(String.format("Error setting Association=%s for the AspFactory=%s while loading from XML",
                            factory.associationName, factory.getName()), e1);
                }

                if (factory.getStatus())
                {
                    try
                    {
                        factory.start();
                    }
                    catch (Exception e)
                    {
                        logger.error(
                                String.format("Error starting the AspFactory=%s while loading from XML", factory.getName()), e);
                    }
                }
            }

        }
        catch (XMLStreamException ex)
        {
            // this.logger.info(
            // "Error while re-creating Linksets from persisted file", ex);
        }
    }

    @Override
    public void sendMessage(Mtp3TransferPrimitive mtp3TransferPrimitive)
            throws
            IOException
    {

        logger.debug("sendMessage()");
        logger.debug("Opc : " + mtp3TransferPrimitive.getOpc() + "\ndpc : " + mtp3TransferPrimitive.getDpc() +
                "\nOpc" + mtp3TransferPrimitive.getOpc() + "\ndata : " + mtp3TransferPrimitive.getData());

        ProtocolData data = this.parameterFactory.createProtocolData(mtp3TransferPrimitive.getOpc(),
                mtp3TransferPrimitive.getDpc(), mtp3TransferPrimitive.getSi(), 2 /* mtp3TransferPrimitive.getNi()*/,
                mtp3TransferPrimitive.getMp(), mtp3TransferPrimitive.getSls(), mtp3TransferPrimitive.getData());

        logger.debug("data : " + data);
        PayloadData payload = (PayloadData) messageFactory.createMessage(MessageClass.TRANSFER_MESSAGES, MessageType.PAYLOAD);
        logger.debug("payload : " + payload);
        payload.setData(data);

        AsImpl asImpl = this.routeManagement.getAsForRoute(data.getDpc(), data.getOpc(), data.getSI(), data.getSLS());
        logger.debug("asImpl : " + asImpl);
        if (asImpl == null)
        {
            logger.error(String.format("Tx : No AS found for routing message %s", payload));
            return;
        }
        logger.debug("asImpl.getNetworkAppearance() : " + asImpl.getNetworkAppearance());
        payload.setNetworkAppearance(asImpl.getNetworkAppearance());
        logger.debug("asImpl.getRoutingContext() : " + asImpl.getRoutingContext());
        payload.setRoutingContext(asImpl.getRoutingContext());
        logger.debug("writing");
        asImpl.write(payload);
        logger.debug("wrote");
    }
}
