package za.co.ebridge.m3ua.api;

import java.util.List;
import java.util.Map;

import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;

public interface M3UAManagement
{

    /**
     * Unique name of this M3UA stack.
     * The configuration of stack is persisted in name_m3ua.xml file
     *
     * @return name of this stack
     */
    String getName();

    /**
     * The directory where configuration file is persisted.
     *
     * @return directory where configuration file is persisted
     */
    String getPersistDir();

    /**
     * Set the directory where the configuration file is persisted
     *
     * @param persistDir
     */
    void setPersistDir(String persistDir);

    /**
     * The maximum SLS value. By Default this is set to 256
     *
     * @return maximum SLS
     */
    int getMaxSequenceNumber();

    /**
     * Set the maximum SLS
     *
     * @param maxSequenceNumber a integer value
     */
    void setMaxSequenceNumber(int maxSequenceNumber);

    /**
     * Returns maximum AS that can load-balance payload for given route.
     */
    int getMaxAsForRoute();

    /**
     * Set maximum AS that can be configured for given route
     */
    void setMaxAsForRoute(int maxAsForRoute);

    /**
     * Returns the time in millisecond between two heartbeats
     */
    int getHeartbeatTime();

    /**
     * Set the time in milliseconds between two heartbeats.
     * Heartbeat is only sent when MUA association is idle.
     */
    void setHeartbeatTime(int timeBetweenHeartbeat);

    /**
     * Start M3UA stack
     */
    void start() throws Exception;

    /**
     * Stop M3UA stack
     */
    void stop() throws Exception;

    /**
     * Is M3UA stack started
     */
    boolean isStarted();

    /**
     * @return list of {@link As} configured for this stack
     */
    List<As> getAppServers();

    /**
     * @return list of {@link AspFactory} configured for this stack
     */
    List<AspFactory> getAspfactories();

    /**
     * Create new {@link As}.
     *
     * @param asName Unique name of the Application Server
     * @param functionality {@link Functionality} of this Application Server
     * @param exchangeType {@link ExchangeType} of this As. The handshake mechanism before As is ACTIVE
     * @param ipspType {@link IPSPType} of this As. This is used only if {@link Functionality} is IPSP
     * @param rc Optional {@link RoutingContext}
     * @param trafficMode Optional {@link TrafficModeType}.
     * @param minAspActiveForLoadbalance Minimum {@link Asp} that should be ACTIVE before payload can be transferred.
     *                                   This is used only if {@link TrafficModeType} is Loadshare.
     * @param na Optional {@link NetworkAppearance}.
     * @return newly created {@link As}
     */
    As createAs( String asName,
                 Functionality functionality,
                 ExchangeType exchangeType,
                 IPSPType ipspType,
                 RoutingContext rc,
                 TrafficModeType trafficMode,
                 int minAspActiveForLoadbalance,
                 NetworkAppearance na)
            throws Exception;

    /**
     * Destroys the {@link As} that matches the passed asName. {@link As} should be DOWN before it can be destroyed
     *
     * @param asName name of As to be destroyed.
     * @return destroyed {@link As}
     * @throws Exception
     */
    As destroyAs(String asName) throws Exception;

    /**
     * Create a new {@link AspFactory}. Unique ASP id is assigned. HEARTBEAT is disabled
     *
     * @param aspName unique name of this AspFactory
     * @param associationName the underlying SCTP Association to be used
     * @return newly created AspFactory
     */
    AspFactory createAspFactory(String aspName, String associationName) throws Exception;

    /**
     * Create a new {@link AspFactory}. Unique ASP id is assigned
     *
     * @param aspName unique name of this AspFactory
     * @param associationName the underlying SCTP Association to be used
     * @param isHeartBeatEnabled Is the HEARTBEAT enabled for this association
     * @return newly created AspFactory
     */
    AspFactory createAspFactory(String aspName, String associationName, boolean isHeartBeatEnabled) throws Exception;

    /**
     * Create a new {@link AspFactory}.
     *
     * @param aspName unique name of this AspFactory
     * @param associationName
     * @param aspid unique asp id
     * @param isHeartBeatEnabled Is the HEARTBEAT enabled for this association
     * @return newly created AspFactory
     */
    AspFactory createAspFactory( String aspName,
                                 String associationName,
                                 long aspId,
                                 boolean isHeartBeatEnabled)
            throws Exception;

    /**
     * Destroys the {@link AspFactory} that matches the passed aspName.
     * All the ASP within this AspFactory should be DOWN and un-assigned from As
     *
     * @param aspName name of AspFactory to be destroyed.
     * @return destroyed AspFactory
     * @throws Exception
     */
    AspFactory destroyAspFactory(String aspName) throws Exception;

    /**
     * Creates a new {@link Asp} and assigns to {@link As}.
     *
     * @param asName name of As
     * @param aspName name of {@link AspFactory} from which Asp is to be created
     * @return newly created Asp
     */
    Asp assignAspToAs(String asName, String aspName) throws Exception;

    /**
     * Un-assign {@link Asp} from {@link As}
     *
     * @param asName name of As
     * @param aspName name of Asp
     * @return unassigned Asp
     */
    Asp unAssignAspFromAs(String asName, String aspName) throws Exception;

    /**
     * Starts the {@link AspFactory} and all the {@link Asp} within this AspFactory will start the hand-shake mechanism
     *
     * @param aspName name of AspFactory
     */
    void startAsp(String aspName) throws Exception;

    /**
     * Stops the {@link AspFactory} and all the {@link Asp} within this AspFactory will exchange messages to bring down
     * ASP
     *
     * @param aspName name of AspFactory
     */
    void stopAsp(String aspName) throws Exception;

    /**
     * Add new route based on Destination Point Code (DPC), Originating Point Code (OPC) and Service Indicator (SI).
     * While DPC is mandatory and should be actual value, OPC and SI can be -1 indicating wild card
     *
     * @param dpc destination point code
     * @param opc originating point code
     * @param si service indicator
     * @param asName name of {@link As}
     * @throws Exception
     */
    void addRoute(int dpc, int opc, int si, String asName) throws Exception;

    /**
     * Remove the As for given route
     *
     * @param dpc destination point code
     * @param opc originating point code
     * @param si service indicator
     * @param asName name of {@link As}
     * @throws Exception
     */
    void removeRoute(int dpc, int opc, int si, String asName) throws Exception;

    /**
     * Convenient method to remove all the resources of this M3UA stack
     *
     * @throws Exception
     */
    void removeAllResources() throws Exception;

    /**
     * Add new {@link M3UAManagementEventListener}
     */
    void addM3UAManagementEventListener(M3UAManagementEventListener m3uaManagementEventListener);

    /**
     * Remove existing {@link M3UAManagementEventListener}
     */
    void removeM3UAManagementEventListener(M3UAManagementEventListener m3uaManagementEventListener);

    /**
     * Returns the Route table/Map with DPC as key and list of {@link As} array as potential As that can route
     * Payload to this DPC
     */
    Map<String, As[]> getRoute();
}
