//package com.ebridgevas.ss7interface;
//
///**
//* david@ebridgevas.com
//*
//*/
//
//import com.ebridgevas.protocols.api.IpChannelType;
//
//import com.ebridgevas.protocols.api.Management;
//import com.ebridgevas.protocols.sctp.ManagementImpl;
//import za.co.ebridge.sccp.api.indicator.RoutingIndicator;
//import com.ebridgevas.protocols.ss7.m3ua.Asp;
//import com.ebridgevas.protocols.ss7.m3ua.ExchangeType;
//import com.ebridgevas.protocols.ss7.m3ua.Functionality;
//import com.ebridgevas.protocols.ss7.m3ua.IPSPType;
//import com.ebridgevas.protocols.ss7.m3ua.impl.M3UAManagementImpl;
//import za.co.ebridge.m3ua.impl.parameter.ParameterFactoryImpl;
//import za.co.ebridge.m3ua.api.parameter.RoutingContext;
//import za.co.ebridge.m3ua.api.parameter.TrafficModeType;
//import com.ebridgevas.protocols.ss7.map.MAPStackImpl;
//import com.ebridgevas.protocols.ss7.map.api.*;
//import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
//import za.co.ebridge.map.api.dialog.*;
//import za.co.ebridge.map.api.errors.MAPErrorMessage;
//import za.co.ebridge.map.api.primitives.*;
//import za.co.ebridge.map.api.service.supplementary.*;
//import za.co.ebridge.map.impl.datacoding.CBSDataCodingSchemeImpl;
//import com.ebridgevas.protocols.ss7.sccp.RemoteSignalingPointCode;
//import com.ebridgevas.protocols.ss7.sccp.RemoteSubSystem;
//import com.ebridgevas.protocols.ss7.sccp.impl.RemoteSignalingPointCodeImpl;
//import com.ebridgevas.protocols.ss7.sccp.impl.RemoteSubSystemImpl;
//import com.ebridgevas.protocols.ss7.sccp.impl.SccpStackImpl;
//import za.co.ebridge.sccp.impl.router.Mtp3Destination;
//import za.co.ebridge.sccp.impl.router.Mtp3ServiceAccessPoint;
//import za.co.ebridge.sccp.api.parameter.GlobalTitle;
//import za.co.ebridge.sccp.api.parameter.SccpAddress;
//import za.co.ebridge.tcap.api.asn.ApplicationContextName;
//import za.co.ebridge.tcap.api.asn.comp.Problem;
//import com.ebridgevas.protocols.ss7.tcapAnsi.TCAPStackImpl;
//import com.ebridgevas.protocols.ss7.tcapAnsi.api.TCAPStack;
//import com.ebridgevas.protocols.tools.simulator.level2.GlobalTitleType;
//import za.co.ebridge.mscinterface.dao.SS7ConfigDAO;
//import za.co.ebridge.mscinterface.model.SS7Config;
//import org.apache.log4j.Logger;
//import za.co.ebridge.mscinterface.Boot;
//
//import java.nio.charset.Charset;
//
///**
//* @author david@tekeshe.com
//*
//*/
//public class MSCSimulator implements MAPDialogListener, MAPServiceSupplementaryListener  {
//
//    private static Logger logger = Logger.getLogger(MSCSimulator.class);
//
////    protected final String CLIENT_IP = "127.0.0.1";
////    protected final int CLIENT_PORT = 2345;
//
//    /* SCTP */
//    private Management sctpManagement;
//
//    /* M3UA */
//    private M3UAManagementImpl clientM3UAManagement;
//
//    /* SCCP */
//    private SccpStackImpl sccpStack;
//
//    // private SccpResource sccpResource;
//
//    /* TCAP */
//    private TCAPStack tcapStack;
//
//    /* MAP */
//    private MAPStackImpl mapStack;
//    private MAPProvider mapProvider;
//
//    private SS7Config localDpcConfig;
//    private SS7Config remoteDpcConfig;
//
//    public MSCSimulator(SS7Config localDpcConfig, SS7Config remoteDpcConfig) {
//
//        this.localDpcConfig = localDpcConfig;
//        this.remoteDpcConfig = remoteDpcConfig;
//    }
//
//    /* SS7 Stack Initializer. */
//    protected void initializeStack( ) throws Exception {
//
//        /* Initialize SCTP. */
//        this.initSCTP();
//
//        /* Initialize M3UA */
//        this.initM3UA();
//
//        /* Initialize SCCP */
//        this.initSCCP();
//
//        /* Initialize TCAP */
//        this.initTCAP();
//
//        /* Initialize MAP */
//        this.initMAP();
//
//        /* start ASP */
//        this.clientM3UAManagement.startAsp("ASP1");
//    }
//
//    /* SCTP Initializer. */
//    private void initSCTP( ) throws Exception {
//
//        logger.info( "Initializing SCTP Stack ...." );
//
//        this.sctpManagement = new ManagementImpl("Client");
//        this.sctpManagement.setSingleThread(true);
//        this.sctpManagement.setConnectDelay(10000);
//        this.sctpManagement.start();
//        this.sctpManagement.removeAllResources();
//
//        /* 1. Create SCTP Association */
//        sctpManagement.addAssociation( remoteDpcConfig.getIpAddress(),
//                                       remoteDpcConfig.getPort(),
//                                       localDpcConfig.getIpAddress(),
//                                       localDpcConfig.getPort(),
//                                       remoteDpcConfig.getAssociationName(),
//                                       IpChannelType.SCTP,
//                                       null );
//        logger.info("SCTP Stack Initialized.");
//    }
//
//    /* M3UA Initializer. */
//    private void initM3UA() throws Exception {
//
//        logger.info( "Initializing M3UA Stack ...." );
//
//        this.clientM3UAManagement = new M3UAManagementImpl("Client");
//        this.clientM3UAManagement.setTransportManagement(this.sctpManagement);
//        this.clientM3UAManagement.start();
//        // this.clientM3UAManagement.removeAllResources();
//
//        /* m3ua as create rc <rc> <ras-name> */
//        ParameterFactoryImpl factory = new ParameterFactoryImpl();
//
//        RoutingContext rc = factory.createRoutingContext(new long[] { remoteDpcConfig.getRoutingContext() });
//        TrafficModeType trafficModeType = factory.createTrafficModeType(TrafficModeType.Loadshare);
//        this.clientM3UAManagement.createAs( "AS1",
//                                            Functionality.AS,
//                                            ExchangeType.SE,
//                                            IPSPType.CLIENT,
//                                            rc,
//                                            trafficModeType,
//                                            1,
//                                            null);
//
//        /* Step 2 : Create ASP */
//        this.clientM3UAManagement.createAspFactory( "ASP1", remoteDpcConfig.getAssociationName() );
//
//        /* Step3 : Assign ASP to AS */
//        Asp asp = this.clientM3UAManagement.assignAspToAs("AS1", "ASP1");
//
//        /* Step 4: Add Route. Remote point code is 2 */
//        clientM3UAManagement.addRoute( localDpcConfig.getDestinationPointCode(),
//                                       remoteDpcConfig.getDestinationPointCode(),
//                                       3,
//                                       "AS1" );
//
//        logger.debug("M3UA Stack Initialized.");
//    }
//
//    /* SCCP Initializer. */
//    private void initSCCP() {
//
//        logger.info("Initializing SCCP Stack ....");
//
//        this.sccpStack = new SccpStackImpl("MapLoadClientSccpStack");
//        this.sccpStack.setMtp3UserPart( 1, this.clientM3UAManagement );
//
//        this.sccpStack.start();
//        this.sccpStack.removeAllResourses();
//
//        RemoteSignalingPointCode rspc
//                = new RemoteSignalingPointCodeImpl(
//                        localDpcConfig.getDestinationPointCode(), 0, 0);
//
//        RemoteSubSystem rss
//                = new RemoteSubSystemImpl(
//                        localDpcConfig.getDestinationPointCode(),
//                        localDpcConfig.getSubSystemNumber(), 0, false);
//
//        try {
//            this.sccpStack
//                    .getSccpResource()
//                        .addRemoteSpc(
//                                0, rspc.getRemoteSpc(), rspc.getRemoteSpcFlag(), rspc.getMask());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        int remoteSsnFlag = 0;
//        try {
//            this.sccpStack
//                    .getSccpResource()
//                        .addRemoteSsn(
//                                0, rspc.getRemoteSpc(), rss.getRemoteSsn(), remoteSsnFlag, false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        Mtp3ServiceAccessPoint sap
//                = new Mtp3ServiceAccessPoint(
//                            1,
//                            remoteDpcConfig.getDestinationPointCode(),
//                            remoteDpcConfig.getNetworkIndicator());
//
//        Mtp3Destination destination
//                = new Mtp3Destination(
//                        localDpcConfig.getDestinationPointCode(),
//                        localDpcConfig.getDestinationPointCode(), 0, 255, 255);
//
//        int opc = remoteDpcConfig.getDestinationPointCode();
//        int ni = 0;
//        try {
//            this.sccpStack.getRouter().addMtp3ServiceAccessPoint(1, sap.getMtp3Id(), opc, ni);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // David, 23 Oct 2013
//        // addMtp3Destination(int sapId, int destId, int firstDpc, int lastDpc, int firstSls, int lastSls, int slsMask)
////        this.sccpStack.getRouter().addMtp3Destination(1, 1, dest);
//        try {
//            this.sccpStack
//                    .getRouter()
//                        .addMtp3Destination( 1,
//                                             1,
//                                             destination.getFirstDpc(),
//                                             destination.getLastDpc(),
//                                             destination.getFirstSls(),
//                                             destination.getLastSls(),
//                                             destination.getSlsMask());
//        } catch (Exception e) {
//            // TODO implement exception handler
//            e.printStackTrace();
//        }
//        logger.debug("SCCP Stack Initialized.");
//    }
//
//    /* TCAP Initializer. */
//    private void initTCAP() {
//
//        logger.info("Initializing TCAP Stack ....");
//
//        this.tcapStack
//                = new TCAPStackImpl(
//                        "eBridge TCAP Stack",
//                        this.sccpStack.getSccpProvider(),
//                        remoteDpcConfig.getSubSystemNumber() );
//        this.tcapStack.setDialogIdleTimeout(60000);
//        this.tcapStack.setInvokeTimeout(30000);
//        this.tcapStack.setMaxDialogs(2000);
//        try {
//            this.tcapStack.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        logger.info("TCAP Stack Initialized.");
//    }
//
//    /* MAP Initializer. */
//    private void initMAP() {
//
//        logger.info("Initializing MAP Stack ....");
//
//        // David, 23 Oct 2013
//        this.mapStack
//                = new MAPStackImpl(
//                            "eBridge MAP Stack",
//                            this.sccpStack.getSccpProvider(),
//                            remoteDpcConfig.getSubSystemNumber() );
////        this.mapStack = new MAPStackImpl("", this.tcapStack.getProvider(), SSN);
//
//        this.mapProvider = this.mapStack.getMAPProvider();
//
//        this.mapProvider.addMAPDialogListener(this);
//        this.mapProvider.getMAPServiceSupplementary().addMAPServiceListener(this);
//
//        this.mapProvider.getMAPServiceSupplementary().acivate();
//
//        try {
//            this.mapStack.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        logger.debug("MAP Stack Initialized.");
//    }
//
//    private void initiateUSSD() throws MAPException {
//
//        SccpAddress sccpMscAddress
//                    = new SccpAddress(
//                            RoutingIndicator.ROUTING_BASED_ON_DPC_AND_SSN,
//                            remoteDpcConfig.getDestinationPointCode(),
//                            GlobalTitle.getInstance(remoteDpcConfig.getGlobalTitle()),
//                            remoteDpcConfig.getSubSystemNumber());
//
//        //RoutingIndicator ri, int dpc, GlobalTitle gt, int ssn
//        SccpAddress sccpVasGatewayAddress
//                        = new SccpAddress(
//                                    RoutingIndicator.ROUTING_BASED_ON_DPC_AND_SSN,
//                                    localDpcConfig.getDestinationPointCode(),
//                                    GlobalTitle.getInstance(localDpcConfig.getGlobalTitle()),
//                                    localDpcConfig.getSubSystemNumber() );
//
//        /* create Dialog */
//        MAPDialogSupplementary mapDialog =
//                this.mapProvider.getMAPServiceSupplementary()
//                        .createNewDialog(
//                                MAPApplicationContext.getInstance(
//                                        MAPApplicationContextName.networkUnstructuredSsContext,
//                                        MAPApplicationContextVersion.version2),
//                                        sccpMscAddress,
//                                        null,
//                                        sccpVasGatewayAddress,
//                                        null);
//
//        // David, 23 Oct 2013
////        byte ussdDataCodingScheme = 0x0f;
//        CBSDataCodingScheme ussdDataCodingScheme = new CBSDataCodingSchemeImpl(0x0f);
//
//        // USSD String: *125*+31628839999#
//        // The Charset is null, here we let system use default Charset (UTF-7 as explained in GSM 03.38.
//        // However if MAP User wants, it can set its own impl of Charset
//        USSDString ussdString
//                    = this.mapProvider
//                            .getMAPParameterFactory()
//                            .createUSSDString("*901*+263733803480#");
//
//        ISDNAddressString msisdn =
//                this.mapProvider.getMAPParameterFactory()
//                        .createISDNAddressString(AddressNature.international_number,
//                                NumberingPlan.ISDN,
//                                "263733803480");
//
//        mapDialog.addProcessUnstructuredSSRequest( ussdDataCodingScheme, ussdString, null, msisdn );
//
//        /* This will initiate the TC-BEGIN with INVOKE component */
//        mapDialog.send();
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogAccept(
//     * com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.primitives.MAPExtensionContainer)
//     */
//    public void onDialogAccept( MAPDialog mapDialog,
//                                MAPExtensionContainer extensionContainer) {
//
//        if (logger.isDebugEnabled()) {
//                logger.debug(
//                        String.format(
//                                "onDialogAccept for DialogId=%d MAPExtensionContainer=%s",
//                                mapDialog.getLocalDialogId(),
//                                extensionContainer));
//        }
//
//        // TODO implement onDialogAccept
//    }
//
//    public void onDialogReject(
//                                MAPDialog mapDialog,
//                                MAPRefuseReason refuseReason,
//                                ApplicationContextName alternativeApplicationContext,
//                                MAPExtensionContainer extensionContainer) {
//        // TODO implement onDialogReject
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogClose(org
//     * .ebridgevas.ss7.protocols.map.api.MAPDialog)
//     */
//    public void onDialogClose(MAPDialog mapDialog) {
//        if (logger.isDebugEnabled()) {
//            logger.debug(String.format("DialogClose for Dialog=%d", mapDialog.getLocalDialogId()));
//        }
//
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogDelimiter
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog)
//     */
//    public void onDialogDelimiter(MAPDialog mapDialog) {
//        if (logger.isDebugEnabled()) {
//            logger.debug(String.format("onDialogDelimiter for DialogId=%d", mapDialog.getLocalDialogId()));
//        }
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogNotice(
//     * com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPNoticeProblemDiagnostic)
//     */
//    public void onDialogNotice(MAPDialog mapDialog, MAPNoticeProblemDiagnostic noticeProblemDiagnostic) {
//        logger.error(
//                String.format(
//                        "onDialogNotice for DialogId=%d MAPNoticeProblemDiagnostic=%s ",
//                        mapDialog.getLocalDialogId(),
//                        noticeProblemDiagnostic));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogProviderAbort
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPAbortProviderReason,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPAbortSource,
//     * com.ebridge.ss7.protocols.map.api.primitives.MAPExtensionContainer)
//     */
//    public void onDialogProviderAbort( MAPDialog mapDialog,
//                                       MAPAbortProviderReason abortProviderReason,
//                                       MAPAbortSource abortSource,
//                                       MAPExtensionContainer extensionContainer) {
//        logger.error(
//                String.format(
//                        "onDialogProviderAbort for " +
//                                "DialogId=%d MAPAbortProviderReason=%s MAPAbortSource=%s MAPExtensionContainer=%s",
//                        mapDialog.getLocalDialogId(),
//                        abortProviderReason,
//                        abortSource,
//                        extensionContainer));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogReject(
//     * com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPRefuseReason,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPProviderError,
//     * ApplicationContextName,
//     * com.ebridge.ss7.protocols.map.api.primitives.MAPExtensionContainer)
//     */
//    public void onDialogReject( MAPDialog mapDialog,
//                                MAPRefuseReason refuseReason,
//                                /*MAPProviderError*/Problem providerError,
//                                ApplicationContextName alternativeApplicationContext,
//                                MAPExtensionContainer extensionContainer) {
//
//        logger.error(
//                    String.format(
//                            "onDialogReject for " +
//                                    "DialogId=%d MAPRefuseReason=%s MAPProviderError=%s " +
//                                    "ApplicationContextName=%s MAPExtensionContainer=%s",
//                            mapDialog.getLocalDialogId(),
//                            refuseReason,
//                            providerError,
//                            alternativeApplicationContext,
//                            extensionContainer));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogRelease
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog)
//     */
//    public void onDialogRelease(MAPDialog mapDialog) {
//        if (logger.isDebugEnabled()) {
//            logger.debug(String.format("onDialogResease for DialogId=%d", mapDialog.getLocalDialogId()));
//        }
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogRequest
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.primitives.AddressString,
//     * com.ebridge.ss7.protocols.map.api.primitives.AddressString,
//     * com.ebridge.ss7.protocols.map.api.primitives.MAPExtensionContainer)
//     */
//    public void onDialogRequest( MAPDialog mapDialog,
//                                 AddressString destinationReference,
//                                 AddressString originatingReference,
//                                 MAPExtensionContainer extensionContainer) {
//
//        if (logger.isDebugEnabled()) {
//            logger.debug(
//                        String.format(
//                                "onDialogRequest for " +
//                                        "DialogId=%d DestinationReference=%s " +
//                                        "OriginReference=%s MAPExtensionContainer=%s",
//                                mapDialog.getLocalDialogId(),
//                                destinationReference,
//                                originatingReference,
//                                extensionContainer));
//        }
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogRequestEricsson
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.primitives.AddressString,
//     * com.ebridge.ss7.protocols.map.api.primitives.AddressString,
//     * com.ebridge.ss7.protocols.map.api.primitives.IMSI,
//     * com.ebridge.ss7.protocols.map.api.primitives.AddressString)
//     */
//    public void onDialogRequestEricsson(MAPDialog mapDialog, AddressString destReference, AddressString origReference,
//                                        IMSI arg3, AddressString arg4) {
//        if (logger.isDebugEnabled()) {
//            logger.debug(String.format("onDialogRequest for DialogId=%d DestinationReference=%s OriginReference=%s ",
//                    mapDialog.getLocalDialogId(), destReference, origReference));
//        }
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogTimeout
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog)
//     */
//    public void onDialogTimeout(MAPDialog mapDialog) {
//        logger.error(String.format("onDialogTimeout for DialogId=%d", mapDialog.getLocalDialogId()));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPDialogListener#onDialogUserAbort
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPUserAbortChoice,
//     * com.ebridge.ss7.protocols.map.api.primitives.MAPExtensionContainer)
//     */
//    public void onDialogUserAbort( MAPDialog mapDialog,
//                                   MAPUserAbortChoice userReason,
//                                   MAPExtensionContainer extensionContainer) {
//
//        logger.error(
//                    String.format(
//                            "onDialogUserAbort for DialogId=%d MAPUserAbortChoice=%s MAPExtensionContainer=%s",
//                            mapDialog.getLocalDialogId(),
//                            userReason,
//                            extensionContainer));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.service.supplementary.
//     * MAPServiceSupplementaryListener
//     * #onProcessUnstructuredSSRequest(com.ebridgevas
//     * .ss7.protocols.map.api.service
//     * .supplementary.ProcessUnstructuredSSRequest)
//     */
//    public void onProcessUnstructuredSSRequest(ProcessUnstructuredSSRequest processUnstructuredSSRequest ) {
//
//        // This error condition. Client should never receive the
//        // ProcessUnstructuredSSRequestIndication
//        logger.error(
//                String.format(
//                        "onProcessUnstructuredSSRequestIndication for Dialog=%d and invokeId=%d",
//                        processUnstructuredSSRequest.getMAPDialog().getLocalDialogId(),
//                        processUnstructuredSSRequest.getInvokeId()));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.service.supplementary.
//     * MAPServiceSupplementaryListener
//     * #onProcessUnstructuredSSResponse(com.ebridgevas
//     * .ss7.protocols.map.api.service
//     * .supplementary.ProcessUnstructuredSSResponse)
//     */
//    public void onProcessUnstructuredSSResponse(ProcessUnstructuredSSResponse processUnstructuredSSResponse ) {
//
//        if (logger.isDebugEnabled()) {
//
//            try {
//
//                logger.debug(
//                        String.format(
//                                "Rx ProcessUnstructuredSSResponseIndication.  USSD String=%s",
//                                processUnstructuredSSResponse.getUSSDString().getString(Charset.defaultCharset())));
//            } catch (MAPException e) {
//                System.err.println("Logger error : " + e.getMessage() );
//            }
//        }
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.service.supplementary.
//     * MAPServiceSupplementaryListener
//     * #onUnstructuredSSNotifyRequest(com.ebridgevas
//     * .ss7.protocols.map.api.service.supplementary.UnstructuredSSNotifyRequest)
//     */
//    public void onUnstructuredSSNotifyRequest(UnstructuredSSNotifyRequest unstructuredSSNotifyRequest) {
//
//        // This error condition. Client should never receive the
//        // UnstructuredSSNotifyRequestIndication
//        logger.error(
//                    String.format(
//                                "onUnstructuredSSNotifyRequestIndication for Dialog=%d and invokeId=%d",
//                                unstructuredSSNotifyRequest.getMAPDialog().getLocalDialogId(),
//                                unstructuredSSNotifyRequest.getInvokeId()));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.service.supplementary.
//     * MAPServiceSupplementaryListener
//     * #onUnstructuredSSNotifyResponse(com.ebridgevas
//     * .ss7.protocols.map.api.service
//     * .supplementary.UnstructuredSSNotifyResponse)
//     */
//    public void onUnstructuredSSNotifyResponse(UnstructuredSSNotifyResponse unstructuredSSNotifyResponse) {
//
//        // This error condition. Client should never receive the
//        // UnstructuredSSNotifyRequestIndication
//        logger.error(
//                String.format(
//                        "onUnstructuredSSNotifyResponseIndication for Dialog=%d and invokeId=%d",
//                        unstructuredSSNotifyResponse.getMAPDialog().getLocalDialogId(),
//                        unstructuredSSNotifyResponse.getInvokeId()));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.service.supplementary.
//     * MAPServiceSupplementaryListener
//     * #onUnstructuredSSRequest(com.ebridgevas.proto/Users/david/git/eBridgeVASGateway/eBridgeSS7/commons/src/main/java/com/ebridgevas/commons/ss7/jreadlinecols
//     * .ss7.map.api.service.supplementary.UnstructuredSSRequest)
//     */
//    public void onUnstructuredSSRequest(UnstructuredSSRequest unstructuredSSRequest) {
//
//        if ( logger.isDebugEnabled() ) {
//            try {
//                logger.debug(
//                        String.format(
//                                "Rx UnstructuredSSRequestIndication. USSD String=%s ",
//                                unstructuredSSRequest.getUSSDString().getString(Charset.defaultCharset())));
//            } catch (MAPException e) {
//                System.err.println("Logger Error: " + e.getMessage());
//            }
//        }
//
//        MAPDialogSupplementary mapDialog = unstructuredSSRequest.getMAPDialog();
//
//        try {
//
//            // TODO confirm ussdDataCodingScheme - David
//            // byte ussdDataCodingScheme = 0x0f;
//            CBSDataCodingScheme ussdDataCodingScheme = new CBSDataCodingSchemeImpl(0x0f);
//
//            USSDString ussdString = this.mapProvider.getMAPParameterFactory().createUSSDString("1");
//
//            AddressString msisdn =
//                    this.mapProvider.getMAPParameterFactory()
//                            .createAddressString(AddressNature.international_number,
//                                    NumberingPlan.ISDN,
//                                    "31628838002");
//
//            mapDialog.addUnstructuredSSResponse( unstructuredSSRequest.getInvokeId(), ussdDataCodingScheme, ussdString);
//            mapDialog.send();
//
//        } catch (MAPException e) {
//            logger.error(String.format("Error while sending UnstructuredSSResponse for Dialog=%d",
//                    mapDialog.getLocalDialogId()));
//        }
//
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.service.supplementary.
//     * MAPServiceSupplementaryListener
//     * #onUnstructuredSSResponse(com.ebridgevas.protocols
//     * .ss7.map.api.service.supplementary.UnstructuredSSResponse)
//     */
//    public void onUnstructuredSSResponse(UnstructuredSSResponse unstructuredSSResponse ) {
//
//        // This error condition. Client should never receive the
//        // UnstructuredSSResponseIndication
//        logger.error(
//                String.format(
//                        "onUnstructuredSSResponseIndication for Dialog=%d and invokeId=%d",
//                        unstructuredSSResponse.getMAPDialog().getLocalDialogId(),
//                        unstructuredSSResponse.getInvokeId()));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPServiceListener#onErrorComponent
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog, java.lang.Long,
//     * com.ebridge.ss7.protocols.map.api.errors.MAPErrorMessage)
//     */
//    public void onErrorComponent( MAPDialog mapDialog,
//                                  Long invokeId,
//                                  MAPErrorMessage mapErrorMessage ) {
//
//        logger.error(
//                String.format(
//                        "onErrorComponent for Dialog=%d and invokeId=%d MAPErrorMessage=%s",
//                        mapDialog.getLocalDialogId(),
//                        invokeId,
//                        mapErrorMessage));
//    }
//
//    @Override
//    public void onRejectComponent(MAPDialog mapDialog, Long invokeId, Problem problem, boolean isLocalOriginated) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPServiceListener#onInvokeTimeout
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog, java.lang.Long)
//     */
//    public void onInvokeTimeout(MAPDialog mapDialog, Long invokeId) {
//
//        logger.error(
//                String.format(
//                        "onInvokeTimeout for Dialog=%d and invokeId=%d",
//                        mapDialog.getLocalDialogId(),
//                        invokeId));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPServiceListener#onMAPMessage(org
//     * .ebridgevas.ss7.protocols.map.api.MAPMessage)
//     */
//    public void onMAPMessage(MAPMessage arg0) {
//        // TODO Auto-generated method stub
//
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.ebridge.ss7.protocols.map.api.MAPServiceListener#
//     * onProviderErrorComponent(com.ebridge.ss7.protocols.map.api.MAPDialog,
//     * java.lang.Long,
//     * com.ebridge.ss7.protocols.map.api.dialog.MAPProviderError)
//     */
//    public void onProviderErrorComponent(
//                                            MAPDialog mapDialog,
//                                            Long invokeId, /*MAPProviderError*/
//                                            Problem providerError) {
//
//        logger.error(String.format("onProviderErrorComponent for Dialog=%d and invokeId=%d MAPProviderError=%s",
//                mapDialog.getRemoteDialogId(), invokeId, providerError));
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * com.ebridge.ss7.protocols.map.api.MAPServiceListener#onRejectComponent
//     * (com.ebridge.ss7.protocols.map.api.MAPDialog, java.lang.Long,
//     * Problem)
//     */
//    public void onRejectComponent(MAPDialog mapDialog, Long invokeId, Problem problem) {
//
//        logger.error(
//                    String.format(
//                                "onRejectComponent for Dialog=%d and invokeId=%d Problem=%s",
//                                mapDialog.getRemoteDialogId(),
//                                invokeId,
//                                problem));
//    }
//
//    private static Logger log = Logger.getLogger(Boot.class);
//
//    public static void main(String args[]) throws Exception {
//
//        if ( args.length < 2 ) {
//            System.out.println("Usage java Boot <localGlobalTitle> <remoteGlobalTitle>");
//            System.exit( 1 );
//        }
//
//        String localGlobalTitle = args[ 0 ];
//        String remoteGlobalTitle = args [ 1 ];
//
//
//        log.info("#######################################################");
//        log.info("#     eBridge Mobile Switching Center Simulator       #");
//        log.info("#                ver 14.02                            #");
//        log.info("#######################################################");
//
//        SS7Config localDpcConfig = new SS7ConfigDAO().findById( localGlobalTitle );
//        SS7Config remoteDpcConfig = new SS7ConfigDAO().findById(remoteGlobalTitle );
//        log.info("local  dpc : " + localDpcConfig );
//        log.info("remote dpc : " + remoteDpcConfig );
//
//        final MSCSimulator client =
//                new MSCSimulator( localDpcConfig, remoteDpcConfig);
//
//        try {
//
//            client.initializeStack( );
//
//            // Lets pause for 20 seconds so stacks are initialized properly
//            Thread.sleep(20000);
//
//            client.initiateUSSD();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
