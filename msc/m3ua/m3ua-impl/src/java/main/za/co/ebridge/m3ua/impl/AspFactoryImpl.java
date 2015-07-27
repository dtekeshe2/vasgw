package za.co.ebridge.m3ua.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import za.co.ebridge.m3ua.impl.oam.M3UAOAMMessages;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.m3ua.impl.message.transfer.PayloadDataImpl;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;

import org.apache.log4j.Logger;

import za.co.ebridge.m3ua.api.*;
import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageFactory;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.aspsm.ASPDown;
import za.co.ebridge.m3ua.api.message.aspsm.ASPDownAck;
import za.co.ebridge.m3ua.api.message.aspsm.ASPUp;
import za.co.ebridge.m3ua.api.message.aspsm.ASPUpAck;
import za.co.ebridge.m3ua.api.message.aspsm.Heartbeat;
import za.co.ebridge.m3ua.api.message.asptm.ASPActive;
import za.co.ebridge.m3ua.api.message.asptm.ASPActiveAck;
import za.co.ebridge.m3ua.api.message.asptm.ASPInactive;
import za.co.ebridge.m3ua.api.message.asptm.ASPInactiveAck;
import za.co.ebridge.m3ua.api.message.mgmt.Notify;
import za.co.ebridge.m3ua.api.message.ssnm.DestinationAvailable;
import za.co.ebridge.m3ua.api.message.ssnm.DestinationRestricted;
import za.co.ebridge.m3ua.api.message.ssnm.DestinationStateAudit;
import za.co.ebridge.m3ua.api.message.ssnm.DestinationUPUnavailable;
import za.co.ebridge.m3ua.api.message.ssnm.DestinationUnavailable;
import za.co.ebridge.m3ua.api.message.ssnm.SignallingCongestion;
import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.m3ua.api.parameter.ParameterFactory;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.UnknownTransitionException;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.message.MessageFactoryImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterFactoryImpl;
import za.co.ebridge.map.impl.CBSDataCodingSchemeImpl;
import za.co.ebridge.map.impl.primitives.OctetStringBase;
import za.co.ebridge.sctp.api.*;

public class AspFactoryImpl
        implements AssociationListener, XMLSerializable, AspFactory
{

    private static final Logger logger = Logger.getLogger(AspFactoryImpl.class);

    private static long ASP_ID_COUNT = 1L;

    private static final int SCTP_PAYLOAD_PROT_ID_M3UA = 3;

    private static final String NAME = "name";
    private static final String STARTED = "started";
    private static final String ASSOCIATION_NAME = "assocName";
    private static final String MAX_SEQUENCE_NUMBER = "maxseqnumber";
    private static final String ASP_ID = "aspid";
    private static final String HEART_BEAT = "heartbeat";

    protected String name;

    protected boolean started = false;

    protected Association association = null;
    protected String associationName = null;

    protected List<Asp> aspList = new ArrayList<>();

    private ByteBuffer txBuffer = ByteBuffer.allocateDirect(8192);

    protected Management transportManagement = null;

    protected M3UAManagementImpl m3UAManagementImpl = null;

    private ASPIdentifier aspid;

    protected ParameterFactory parameterFactory = new ParameterFactoryImpl();
    protected MessageFactory messageFactory = new MessageFactoryImpl();

    private TransferMessageHandler transferMessageHandler = new TransferMessageHandler(this);
    private SignalingNetworkManagementHandler signalingNetworkManagementHandler
            = new SignalingNetworkManagementHandler(this);
    private ManagementMessageHandler managementMessageHandler = new ManagementMessageHandler(this);
    private AspStateMaintenanceHandler aspStateMaintenanceHandler = new AspStateMaintenanceHandler(this);
    private AspTrafficMaintenanceHandler aspTrafficMaintenanceHandler = new AspTrafficMaintenanceHandler(this);
    private RoutingKeyManagementHandler routingKeyManagementHandler = new RoutingKeyManagementHandler(this);

    protected Functionality functionality = null;
    protected IPSPType ipspType = null;
    protected ExchangeType exchangeType = null;

    private long aspupSentTime = 0L;

    private int maxSequenceNumber = M3UAManagementImpl.MAX_SEQUENCE_NUMBER;
    private int[] slsTable = null;
    private int maxOutboundStreams;

    protected AspFactoryStopTimer aspFactoryStopTimer = null;

    protected HeartBeatTimer heartBeatTimer = null;
    private boolean isHeartBeatEnabled = false;

    public AspFactoryImpl()
    {
        // clean transmission buffer
        txBuffer.clear();
        txBuffer.rewind();
        txBuffer.flip();

        this.heartBeatTimer = new HeartBeatTimer(this);
    }

    public AspFactoryImpl(String name, int maxSequenceNumber, long aspId, boolean isHeartBeatEnabled)
    {
        this();
        this.name = name;
        this.maxSequenceNumber = maxSequenceNumber;
        this.slsTable = new int[this.maxSequenceNumber];
        this.aspid = parameterFactory.createASPIdentifier(aspId);

        this.isHeartBeatEnabled = isHeartBeatEnabled;
    }

    public ASPIdentifier getAspId()
    {
        return aspid;
    }

    public boolean isHeartBeatEnabled()
    {
        return isHeartBeatEnabled;
    }

    public void setM3UAManagement(M3UAManagementImpl m3uaManagement)
    {
        this.m3UAManagementImpl = m3uaManagement;
        this.transferMessageHandler.setM3UAManagement(m3uaManagement);
    }

    public M3UAManagementImpl getM3UAManagement()
    {
        return m3UAManagementImpl;
    }

    public void start()
            throws
            Exception
    {
        this.transportManagement.startAssociation(this.association.getName());
        this.started = true;
    }

    public void stop()
            throws
            Exception
    {
        this.started = false;

        if (this.association == null)
            return;

        if (this.isHeartBeatEnabled())
        {
            this.heartBeatTimer.cancel();
        }

        if (this.functionality == Functionality.AS
                || (this.functionality == Functionality.SGW && this.exchangeType == ExchangeType.DE)
                || (this.functionality == Functionality.IPSP && this.exchangeType == ExchangeType.DE)
                || (this.functionality == Functionality.IPSP && this.exchangeType == ExchangeType.SE
                && this.ipspType == IPSPType.CLIENT))
        {
            if (this.association.isConnected())
            {
                ASPDown aspDown = (ASPDown)
                        this.messageFactory.createMessage(MessageClass.ASP_STATE_MAINTENANCE, MessageType.ASP_DOWN);
                this.write(aspDown);

                for (Asp asp : aspList)
                {
                    AspImpl aspImpl = (AspImpl) asp;

                    try
                    {
                        FSM aspLocalFSM = aspImpl.getLocalFSM();
                        aspLocalFSM.signal(TransitionState.ASP_DOWN_SENT);

                        AsImpl peerAs = (AsImpl) aspImpl.getAs();
                        FSM asPeerFSM = peerAs.getPeerFSM();

                        asPeerFSM.setAttribute(AsImpl.ATTRIBUTE_ASP, aspImpl);
                        asPeerFSM.signal(TransitionState.ASP_DOWN);

                    } catch (UnknownTransitionException e)
                    {
                        logger.error(e.getMessage(), e);
                    }
                }

                // Start the timer to kill the underlying transport Association
                aspFactoryStopTimer = new AspFactoryStopTimer(this);
                this.m3UAManagementImpl.m3uaScheduler.execute(aspFactoryStopTimer);
            } else
            {
                for (Asp asp : aspList)
                {
                    AspImpl aspImpl = (AspImpl) asp;

                    try
                    {
                        FSM aspLocalFSM = aspImpl.getLocalFSM();
                        aspLocalFSM.signal(TransitionState.COMM_DOWN);

                        AsImpl peerAs = (AsImpl) aspImpl.getAs();
                        FSM asPeerFSM = peerAs.getPeerFSM();
                        asPeerFSM.setAttribute(AsImpl.ATTRIBUTE_ASP, aspImpl);
                        asPeerFSM.signal(TransitionState.ASP_DOWN);
                    } catch (UnknownTransitionException e)
                    {
                        logger.error(e.getMessage(), e);
                    }
                }

                this.transportManagement.stopAssociation(this.association.getName());
            }
        } else
        {
            this.transportManagement.stopAssociation(this.association.getName());
        }
    }

    public boolean getStatus()
    {
        return this.started;
    }

    public Functionality getFunctionality()
    {
        return functionality;
    }

    protected void setFunctionality(Functionality functionality)
    {
        this.functionality = functionality;
    }

    public IPSPType getIpspType()
    {
        return ipspType;
    }

    protected void setIpspType(IPSPType ipspType)
    {
        this.ipspType = ipspType;
    }

    public ExchangeType getExchangeType()
    {
        return exchangeType;
    }

    protected void setExchangeType(ExchangeType exchangeType)
    {
        this.exchangeType = exchangeType;
    }

    protected void setTransportManagement(Management transportManagement)
    {
        this.transportManagement = transportManagement;
    }

    public Association getAssociation()
    {
        return this.association;
    }

    protected void setAssociation(Association association)
    {
        // Unset the listener to previous association
        if (this.association != null)
        {
            this.association.setAssociationListener(null);
        }
        this.association = association;
        this.associationName = this.association.getName();
        // Set the listener for new association
        this.association.setAssociationListener(this);
    }

    protected void unsetAssociation()
            throws
            Exception
    {
        if (this.association != null)
        {
            if (this.association.isStarted())
            {
                throw new Exception(String.format("Association=%s is still started. Stop first",
                        this.association.getName()));
            }
            this.association.setAssociationListener(null);
            this.association = null;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public void read(M3UAMessage message)
    {
        switch (message.getMessageClass())
        {
            case MessageClass.MANAGEMENT:
                switch (message.getMessageType())
                {
                    case MessageType.ERROR:
                        this.managementMessageHandler
                                .handleError((za.co.ebridge.m3ua.api.message.mgmt.Error) message);
                        break;
                    case MessageType.NOTIFY:
                        Notify notify = (Notify) message;
                        this.managementMessageHandler.handleNotify(notify);
                        break;
                    default:
                        logger.error(String.format("Rx : MGMT with invalid MessageType=%d message=%s",
                                message.getMessageType(), message));
                        break;
                }
                break;

            case MessageClass.TRANSFER_MESSAGES:
                switch (message.getMessageType())
                {
                    case MessageType.PAYLOAD:
//                        PayloadData payload = (PayloadData) message;
                        this.transferMessageHandler.handlePayload(
                                (za.co.ebridge.m3ua.api.message.transfer.PayloadData) message);
                        break;
                    default:
                        logger.error(String.format("Rx : Transfer message with invalid MessageType=%d message=%s",
                                message.getMessageType(), message));
                        break;
                }
                break;

            case MessageClass.SIGNALING_NETWORK_MANAGEMENT:
                switch (message.getMessageType())
                {
                    case MessageType.DESTINATION_UNAVAILABLE:
                        DestinationUnavailable duna = (DestinationUnavailable) message;
                        this.signalingNetworkManagementHandler.handleDestinationUnavailable(duna);
                        break;
                    case MessageType.DESTINATION_AVAILABLE:
                        DestinationAvailable dava = (DestinationAvailable) message;
                        this.signalingNetworkManagementHandler.handleDestinationAvailable(dava);
                        break;
                    case MessageType.DESTINATION_STATE_AUDIT:
                        DestinationStateAudit daud = (DestinationStateAudit) message;
                        this.signalingNetworkManagementHandler.handleDestinationStateAudit(daud);
                        break;
                    case MessageType.SIGNALING_CONGESTION:
                        SignallingCongestion scon = (SignallingCongestion) message;
                        this.signalingNetworkManagementHandler.handleSignallingCongestion(scon);
                        break;
                    case MessageType.DESTINATION_USER_PART_UNAVAILABLE:
                        DestinationUPUnavailable dupu = (DestinationUPUnavailable) message;
                        this.signalingNetworkManagementHandler.handleDestinationUPUnavailable(dupu);
                        break;
                    case MessageType.DESTINATION_RESTRICTED:
                        DestinationRestricted drst = (DestinationRestricted) message;
                        this.signalingNetworkManagementHandler.handleDestinationRestricted(drst);
                        break;
                    default:
                        logger.error(String.format("Received SSNM with invalid MessageType=%d message=%s",
                                message.getMessageType(), message));
                        break;
                }
                break;

            case MessageClass.ASP_STATE_MAINTENANCE:
                switch (message.getMessageType())
                {
                    case MessageType.ASP_UP:
                        ASPUp aspUp = (ASPUp) message;
                        this.aspStateMaintenanceHandler.handleAspUp(aspUp);
                        break;
                    case MessageType.ASP_UP_ACK:
                        ASPUpAck aspUpAck = (ASPUpAck) message;
                        this.aspStateMaintenanceHandler.handleAspUpAck(aspUpAck);
                        break;
                    case MessageType.ASP_DOWN:
                        ASPDown aspDown = (ASPDown) message;
                        this.aspStateMaintenanceHandler.handleAspDown(aspDown);
                        break;
                    case MessageType.ASP_DOWN_ACK:
                        ASPDownAck aspDownAck = (ASPDownAck) message;
                        this.aspStateMaintenanceHandler.handleAspDownAck(aspDownAck);
                        break;
                    case MessageType.HEARTBEAT:
                        Heartbeat hrtBeat = (Heartbeat) message;
                        this.aspStateMaintenanceHandler.handleHeartbeat(hrtBeat);
                        break;
                    case MessageType.HEARTBEAT_ACK:
                        // Nothing to do
                        break;
                    default:
                        logger.error(String.format("Received ASPSM with invalid MessageType=%d message=%s",
                                message.getMessageType(), message));
                        break;
                }

                break;

            case MessageClass.ASP_TRAFFIC_MAINTENANCE:
                switch (message.getMessageType())
                {
                    case MessageType.ASP_ACTIVE:
                        ASPActive aspActive = (ASPActive) message;
                        this.aspTrafficMaintenanceHandler.handleAspActive(aspActive);
                        break;
                    case MessageType.ASP_ACTIVE_ACK:
                        ASPActiveAck aspAciveAck = (ASPActiveAck) message;
                        this.aspTrafficMaintenanceHandler.handleAspActiveAck(aspAciveAck);
                        break;
                    case MessageType.ASP_INACTIVE:
                        ASPInactive aspInactive = (ASPInactive) message;
                        this.aspTrafficMaintenanceHandler.handleAspInactive(aspInactive);
                        break;
                    case MessageType.ASP_INACTIVE_ACK:
                        ASPInactiveAck aspInaciveAck = (ASPInactiveAck) message;
                        this.aspTrafficMaintenanceHandler.handleAspInactiveAck(aspInaciveAck);
                        break;
                    default:
                        logger.error(String.format("Received ASPTM with invalid MessageType=%d message=%s",
                                message.getMessageType(), message));
                        break;
                }
                break;

            case MessageClass.ROUTING_KEY_MANAGEMENT:
                break;
            default:
                logger.error(String.format("Received message with invalid MessageClass=%d message=%s",
                        message.getMessageClass(), message));
                break;
        }
    }

    protected void write(M3UAMessage message)
    {
        logger.debug("write()");
        synchronized (txBuffer)
        {
            logger.debug("txBuffer");
            try
            {
                logger.debug("txBuffer.clear()");
                txBuffer.clear();
                logger.debug("encode");
                ((M3UAMessageImpl) message).encode(txBuffer);
                logger.debug("flip()");
                txBuffer.flip();
                logger.debug("create data ...");
                byte[] data = new byte[txBuffer.limit()];
                txBuffer.get(data);

                /*
                try
                {
                    logger.debug("txBuffer " + txBuffer.array() != null ? txBuffer.array().length : " NULL ");
                } catch (Exception e1)
                {
                    e1.printStackTrace();
                    logger.error("exception 1 : " + e1.getMessage());
                }
                 */
                PayloadData payloadData = null;

                logger.debug("message.getMessageClass() : " + message.getMessageClass());

                switch (message.getMessageClass())
                {
                    case MessageClass.ASP_STATE_MAINTENANCE:
                    case MessageClass.MANAGEMENT:
                    case MessageClass.ROUTING_KEY_MANAGEMENT:
                        payloadData = new PayloadData(data.length,
                                data,
                                true,
                                true,
                                SCTP_PAYLOAD_PROT_ID_M3UA,
                                0);
                        break;
                    case MessageClass.TRANSFER_MESSAGES:
                        payloadData = new PayloadData(data.length,
                                data,
                                true,
                                false,
                                SCTP_PAYLOAD_PROT_ID_M3UA,
                                this.slsTable[((PayloadDataImpl) message).getData().getSLS()]);
                        break;
                    default:
                        payloadData = new PayloadData(data.length,
                                data,
                                true,
                                true,
                                SCTP_PAYLOAD_PROT_ID_M3UA,
                                0);
                        break;
                }
                logger.debug("hex : " + payloadData);

//                logger.debug("clear text :" + clearText(payloadData.getData(), payloadData.getDataLength() / 8));

                this.association.send(payloadData);
                logger.debug("sent.");
            } catch (Exception e)
            {
                logger.debug("exception : " + e.getMessage());
                e.printStackTrace();
                logger.error(
                        String.format("Error while trying to send PayloadData to SCTP layer. M3UAMessage=%s", message));
            }
        }
    }
     /*
    private String clearText(byte[] data, int len)
    {

        CBSDataCodingScheme ussdDataCodingScheme = new CBSDataCodingSchemeImpl((byte) 0x0F);

        logger.debug("len : " + len + " octets");
        try
        {
            AsnInputStream asn = new AsnInputStream(data);
            int tag = asn.readTag();
            OctetStringImpl decoder = new OctetStringImpl(len);
            decoder.decodeAll(asn);

            return decoder.getString(null);
        } catch (MAPParsingComponentException e)
        {
            logger.error("MAPParsingComponentException : " + e.getMessage());
            e.printStackTrace();
        } catch (MAPException e)
        {
            logger.error("MAPException : " + e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e)
        {
            logger.error("IOException : " + e.getMessage());
            e.printStackTrace();
        }

        return "";
    }
    */
    private class OctetStringImpl
            extends OctetStringBase
    {

        private CBSDataCodingScheme dataCodingScheme;

        public OctetStringImpl(Integer max)
        {
            super(2, max, "This a test");
        }

        public byte[] getData()
        {
            return this.data;
        }

        public String getString(Charset gsm8Charset)
                throws
                MAPException
        {

            String res = "";

            if (dataCodingScheme == null)
            {
                dataCodingScheme = new CBSDataCodingSchemeImpl(15);
            }
            if (this.data == null)
            {
                throw new MAPException("Error decoding a text in USSDStringImpl: encoded data can not be null");
            }

            if (dataCodingScheme.getIsCompressed())
            {
                // TODO: implement the case with compressed sms message
                throw new MAPException("Error decoding a text in USSDStringImpl: compressed message is not supported yet");
            } else
            {

                switch (dataCodingScheme.getCharacterSet())
                {

                    case GSM8:
                        if (gsm8Charset != null)
                        {
                            byte[] buf = this.data;
                            ByteBuffer bb = ByteBuffer.wrap(buf);
                            CharBuffer bf = gsm8Charset.decode(bb);
                            res = bf.toString();
                        }
                        break;
                }
            }

            return res;
        }
    }

    protected AspImpl createAsp()
    {
        AspImpl remAsp = new AspImpl(this.name, this);

        // We set ASP IP only if its AS or IPSP Client side
        if (this.getFunctionality() == Functionality.AS
                || (this.getFunctionality() == Functionality.IPSP && this.getIpspType() == IPSPType.CLIENT))
        {
            remAsp.setASPIdentifier(aspid);
        }

        this.aspList.add(remAsp);
        return remAsp;
    }

    protected boolean destroyAsp(AspImpl aspImpl)
    {
        aspImpl.aspFactoryImpl = null;
        return this.aspList.remove(aspImpl);
    }

    public List<Asp> getAspList()
    {
        return this.aspList;
    }

    protected AspImpl getAsp(long rc)
    {

        for (Asp aspImpl : aspList)
        {
            if (aspImpl.getAs().getRoutingContext() != null
                    && aspImpl.getAs().getRoutingContext().getRoutingContexts()[0] == rc)
            {
                return (AspImpl) aspImpl;
            }
        }
        return null;
    }

    protected void sendAspActive(AsImpl asImpl)
    {
        ASPActive aspActive = (ASPActive) this.messageFactory.createMessage(MessageClass.ASP_TRAFFIC_MAINTENANCE,
                MessageType.ASP_ACTIVE);
        aspActive.setRoutingContext(asImpl.getRoutingContext());
        aspActive.setTrafficModeType(asImpl.getTrafficModeType());
        this.write(aspActive);
    }

    protected static long generateId()
    {
        ASP_ID_COUNT++;
        if (ASP_ID_COUNT == 4294967295L)
        {
            ASP_ID_COUNT = 1L;
        }
        return ASP_ID_COUNT;
    }

    private void handleCommDown()
    {

        if (this.isHeartBeatEnabled())
        {
            this.heartBeatTimer.cancel();
        }

        for (Asp asp : aspList)
        {

            AspImpl aspImpl = (AspImpl) asp;
            try
            {
                FSM aspLocalFSM = aspImpl.getLocalFSM();
                if (aspLocalFSM != null)
                {
                    aspLocalFSM.signal(TransitionState.COMM_DOWN);
                }

                FSM aspPeerFSM = aspImpl.getPeerFSM();
                if (aspPeerFSM != null)
                {
                    aspPeerFSM.signal(TransitionState.COMM_DOWN);
                }

                AsImpl asImpl = (AsImpl) aspImpl.getAs();

                FSM asLocalFSM = asImpl.getLocalFSM();
                if (asLocalFSM != null)
                {
                    asLocalFSM.setAttribute(AsImpl.ATTRIBUTE_ASP, aspImpl);
                    asLocalFSM.signal(TransitionState.ASP_DOWN);
                }

                FSM asPeerFSM = asImpl.getPeerFSM();
                if (asPeerFSM != null)
                {
                    asPeerFSM.setAttribute(AsImpl.ATTRIBUTE_ASP, aspImpl);
                    asPeerFSM.signal(TransitionState.ASP_DOWN);
                }
            } catch (UnknownTransitionException e)
            {
                logger.error(e.getMessage(), e);
            }
        }
    }

    protected void sendAspUp()
    {
        // TODO : Possibility of race condition?
        long now = System.currentTimeMillis();
        if ((now - aspupSentTime) > 2000)
        {
            ASPUp aspUp = (ASPUp) this.messageFactory.createMessage(MessageClass.ASP_STATE_MAINTENANCE, MessageType.ASP_UP);
            aspUp.setASPIdentifier(this.aspid);
            this.write(aspUp);
            aspupSentTime = now;
        }
    }

    private void handleCommUp()
    {

        if (this.isHeartBeatEnabled())
        {
            this.heartBeatTimer.reset();
            this.m3UAManagementImpl.m3uaScheduler.execute(this.heartBeatTimer);
        }

        if (this.functionality == Functionality.AS
                || (this.functionality == Functionality.SGW && this.exchangeType == ExchangeType.DE)
                || (this.functionality == Functionality.IPSP && this.exchangeType == ExchangeType.DE)
                || (this.functionality == Functionality.IPSP && this.exchangeType == ExchangeType.SE && this.ipspType == IPSPType.CLIENT))
        {
            this.aspupSentTime = 0L;
            this.sendAspUp();
        }

        for (Asp asp : aspList)
        {

            AspImpl aspImpl = (AspImpl) asp;
            try
            {
                FSM aspLocalFSM = aspImpl.getLocalFSM();
                if (aspLocalFSM != null)
                {
                    aspLocalFSM.signal(TransitionState.COMM_UP);
                }

                FSM aspPeerFSM = aspImpl.getPeerFSM();
                if (aspPeerFSM != null)
                {
                    aspPeerFSM.signal(TransitionState.COMM_UP);
                }

            } catch (UnknownTransitionException e)
            {
                logger.error(e.getMessage(), e);
            }
        }
    }

    /**
     * XML Serialization/De-serialization
     */
    protected static final XMLFormat<AspFactoryImpl> ASP_FACTORY_XML = new XMLFormat<AspFactoryImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, AspFactoryImpl aspFactoryImpl)
                throws
                XMLStreamException
        {
            aspFactoryImpl.name = xml.getAttribute(NAME, "");
            aspFactoryImpl.associationName = xml.getAttribute(ASSOCIATION_NAME, "");
            aspFactoryImpl.started = xml.getAttribute(STARTED).toBoolean();
            aspFactoryImpl.maxSequenceNumber = xml.getAttribute(MAX_SEQUENCE_NUMBER, M3UAManagementImpl.MAX_SEQUENCE_NUMBER);
            aspFactoryImpl.slsTable = new int[aspFactoryImpl.maxSequenceNumber];

            // For backward compatible
            long aspIdTemp = xml.getAttribute(ASP_ID, aspFactoryImpl.generateId());

            aspFactoryImpl.aspid = aspFactoryImpl.parameterFactory.createASPIdentifier(aspIdTemp);

            aspFactoryImpl.isHeartBeatEnabled = xml.getAttribute(HEART_BEAT, false);
        }

        @Override
        public void write(AspFactoryImpl aspFactoryImpl, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(NAME, aspFactoryImpl.name);
            xml.setAttribute(ASSOCIATION_NAME, aspFactoryImpl.associationName);
            xml.setAttribute(STARTED, aspFactoryImpl.started);
            xml.setAttribute(MAX_SEQUENCE_NUMBER, aspFactoryImpl.maxSequenceNumber);
            xml.setAttribute(ASP_ID, aspFactoryImpl.aspid.getAspId());
            xml.setAttribute(HEART_BEAT, aspFactoryImpl.isHeartBeatEnabled);
        }
    };

    /**
     * AssociationListener methods
     */

    @Override
    public void onCommunicationLost(Association association)
    {
        logger.warn(String.format("Communication channel lost for AspFactroy=%s Association=%s", this.name,
                association.getName()));
        this.handleCommDown();
    }

    @Override
    public void onCommunicationRestart(Association association)
    {
        logger.warn(String.format("Communication channel restart for AspFactroy=%s Association=%s", this.name,
                association.getName()));
    }

    @Override
    public void onCommunicationShutdown(Association association)
    {
        logger.warn(String.format("Communication channel shutdown for AspFactroy=%s Association=%s", this.name,
                association.getName()));
        this.handleCommDown();

    }

    @Override
    public void onCommunicationUp(Association association, int maxInboundStreams, int maxOutboundStreams)
    {
        this.maxOutboundStreams = maxOutboundStreams;
        // Recreate SLS table. Minimum of two is correct?
        this.createSLSTable(Math.min(maxInboundStreams, maxOutboundStreams) - 1);
        this.handleCommUp();
    }

    protected void createSLSTable(int minimumBoundStream)
    {
        if (minimumBoundStream == 0)
        { // special case - only 1 stream
            for (int i = 0; i < this.maxSequenceNumber; i++)
            {
                slsTable[i] = 0;
            }
        } else
        {
            // SCTP Stream 0 is for management messages, we start from 1
            int stream = 1;
            for (int i = 0; i < this.maxSequenceNumber; i++)
            {
                if (stream > minimumBoundStream)
                {
                    stream = 1;
                }
                slsTable[i] = stream++;
            }
        }
    }

    @Override
    public void onPayload(Association association, PayloadData payloadData)
    {

        byte[] m3uaData = payloadData.getData();

        M3UAMessage m3UAMessage = null;
        if (association.getIpChannelType() == IpChannelType.SCTP)
        {

            // TODO where is streamNumber stored?

            m3UAMessage = this.messageFactory.createSctpMessage(m3uaData);
            if (this.isHeartBeatEnabled())
            {
                this.heartBeatTimer.reset();
            }
            this.read(m3UAMessage);
        } else
        {

            ByteBuffer buffer = ByteBuffer.wrap(m3uaData);
            while (true)
            {
                m3UAMessage = this.messageFactory.createMessage(buffer);
                if (m3UAMessage == null)
                    break;

                if (this.isHeartBeatEnabled())
                {
                    this.heartBeatTimer.reset();
                }
                this.read(m3UAMessage);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.api.AssociationListener#inValidStreamId(org.mobicents .protocols.api.PayloadData)
     */
    @Override
    public void inValidStreamId(PayloadData payloadData)
    {

        logger.error(
                String.format(
                        "Tx : PayloadData with streamNumber=%d which is greater than or equal to maxSequenceNumber=%d. " +
                                "Droping PayloadData=%s",
                        payloadData.getStreamNumber(), this.maxOutboundStreams, payloadData));
    }

    public void show(StringBuffer sb)
    {

        sb.append(M3UAOAMMessages.SHOW_ASP_NAME)
                .append(this.name)
                .append(M3UAOAMMessages.SHOW_ASPID)
                .append(this.aspid.getAspId())
                .append(M3UAOAMMessages.SHOW_HEARTBEAT_ENABLED)
                .append(this.isHeartBeatEnabled())
                .append(M3UAOAMMessages.SHOW_SCTP_ASSOC)
                .append(this.associationName)
                .append(M3UAOAMMessages.SHOW_STARTED)
                .append(this.started);

        sb.append(M3UAOAMMessages.NEW_LINE);
        sb.append(M3UAOAMMessages.SHOW_ASSIGNED_TO);

        for (Asp asp : aspList)
        {

            AspImpl aspImpl = (AspImpl) asp;
            sb.append(M3UAOAMMessages.TAB)
                    .append(M3UAOAMMessages.SHOW_AS_NAME)
                    .append(aspImpl.getAs().getName())
                    .append(M3UAOAMMessages.SHOW_FUNCTIONALITY)
                    .append(this.functionality)
                    .append(M3UAOAMMessages.SHOW_MODE)
                    .append(this.exchangeType);

            if (this.functionality == Functionality.IPSP)
            {
                sb.append(M3UAOAMMessages.SHOW_IPSP_TYPE).append(this.ipspType);
            }

            if (aspImpl.getLocalFSM() != null)
            {
                sb.append(M3UAOAMMessages.SHOW_LOCAL_FSM_STATE).append(aspImpl.getLocalFSM().getState());
            }

            if (aspImpl.getPeerFSM() != null)
            {
                sb.append(M3UAOAMMessages.SHOW_PEER_FSM_STATE).append(aspImpl.getPeerFSM().getState());
            }

            sb.append(M3UAOAMMessages.NEW_LINE);
        }
    }
}
