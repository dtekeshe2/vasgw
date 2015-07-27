package za.co.ebridge.sccp.impl;

import java.io.IOException;
import java.util.Map;

import za.co.ebridge.mtp.api.Mtp3TransferPrimitive;
import za.co.ebridge.mtp.api.Mtp3TransferPrimitiveFactory;
import za.co.ebridge.mtp.api.Mtp3UserPart;
import za.co.ebridge.mtp.impl.Mtp3;
import za.co.ebridge.sccp.api.*;
import za.co.ebridge.sccp.api.indicator.NatureOfAddress;
import za.co.ebridge.sccp.api.indicator.NumberingPlan;
import javolution.util.FastMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import za.co.ebridge.sccp.api.indicator.RoutingIndicator;
import za.co.ebridge.sccp.impl.message.EncodingResultData;
import za.co.ebridge.sccp.impl.message.MessageFactoryImpl;
import za.co.ebridge.sccp.impl.message.SccpAddressedMessageImpl;
import za.co.ebridge.sccp.impl.message.SccpDataMessageImpl;
import za.co.ebridge.sccp.impl.message.SccpMessageImpl;
import za.co.ebridge.sccp.impl.message.SccpNoticeMessageImpl;
import za.co.ebridge.sccp.impl.parameter.ParameterFactoryImpl;
import za.co.ebridge.sccp.api.message.SccpDataMessage;
import za.co.ebridge.sccp.api.message.SccpNoticeMessage;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;
import za.co.ebridge.sccp.api.parameter.ReturnCause;
import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public class SccpRoutingControl
{
    private static final Logger logger = Logger.getLogger(SccpRoutingControl.class);

    private SccpStackImpl sccpStackImpl = null;
    private SccpProviderImpl sccpProviderImpl = null;

    private SccpManagement sccpManagement = null;

    private MessageFactoryImpl messageFactory;

    public SccpRoutingControl(SccpProviderImpl sccpProviderImpl, SccpStackImpl sccpStackImpl)
    {
        this.messageFactory = sccpStackImpl.messageFactory;
        this.sccpProviderImpl = sccpProviderImpl;
        this.sccpStackImpl = sccpStackImpl;
    }

    public SccpManagement getSccpManagement()
    {
        return sccpManagement;
    }

    public void setSccpManagement(SccpManagement sccpManagement)
    {
        this.sccpManagement = sccpManagement;
    }

    public void start()
    {
        // NOP for now

    }

    public void stop()
    {
        // NOP for now

    }

    protected void routeMssgFromMtp(SccpAddressedMessageImpl msg)
            throws
            IOException
    {
        if (this.sccpStackImpl.isPreviewMode())
        {
            // we route all incoming message (except management messages) to all registered SccpListeners

            int ssn = msg.getCalledPartyAddress().getSubsystemNumber();
            if (ssn == 1)
            {
                return;
            }

            for (Map.Entry<Integer, SccpListener> val : this.sccpProviderImpl.getAllSccpListeners().entrySet())
            {
                SccpListener listener = val.getValue();
                if (msg instanceof SccpDataMessage)
                {
                    SccpDataMessage dataMsg = (SccpDataMessage) msg;
                    listener.onMessage(dataMsg);
                }
            }

            return;
        }

        // TODO if the local SCCP or node is in an overload condition, SCRC
        // shall inform SCMG

        SccpAddress calledPartyAddress = msg.getCalledPartyAddress();
        RoutingIndicator ri = calledPartyAddress.getAddressIndicator().getRoutingIndicator();
        switch (ri)
        {
            case ROUTING_BASED_ON_DPC_AND_SSN:
                int ssn = msg.getCalledPartyAddress().getSubsystemNumber();
                if (ssn == 1)
                {
                    // This is for management
                    if (msg instanceof SccpDataMessage)
                    {
                        this.sccpManagement.onManagementMessage((SccpDataMessage) msg);
                    }
                    return;
                }

                SccpListener listener = this.sccpProviderImpl.getSccpListener(ssn);
                if (listener == null)
                {
                    // SCCP user with received SSN is not available - Notify Management
                    this.sccpManagement.recdMsgForProhibitedSsn(msg, ssn);

                    logger.warn(
                        String.format(
                            "Received SccpMessage=%s from MTP but the SSN is not available for local routing",
                            msg));

                    this.sendSccpError(msg, ReturnCauseValue.SUBSYSTEM_FAILURE);
                    return;
                }

                // Notify Listener
                try
                {
                    if (msg instanceof SccpDataMessage)
                    {
                        logger.debug(String.format("Local deliver : SCCP Data Message=%s", msg.toString()));

                        listener.onMessage((SccpDataMessage) msg);
                    } else if (msg instanceof SccpNoticeMessage)
                    {
                        logger.debug(String.format("Local deliver : SCCP Notice Message=%s", msg.toString()));
                        listener.onNotice((SccpNoticeMessage) msg);
                    } else
                    {
                        // TODO: process connection-oriented messages
                    }

                }
                catch (Exception e)
                {
                    logger.warn(String.format(
                            "Exception from the listener side when delivering SccpData to ssn=%d: Message=%s",
                            msg.getOriginLocalSsn(), msg), e);
                }
                break;
            case ROUTING_BASED_ON_GLOBAL_TITLE:
                this.translationFunction(msg);
                break;
            default:
                // This can never happen
                logger.error(String.format("Invalid Routing Indictaor received for message=%s from MTP3", msg));
                break;
        }
    }

    protected void routeMssgFromSccpUser(SccpAddressedMessageImpl msg)
            throws
            IOException
    {
        if (this.sccpStackImpl.isPreviewMode())
        {
            // we drop off local originated message in pereviewMode
            return;
        }
        logger.debug("routing ... " + msg);
        this.route(msg);
    }

    protected ReturnCauseValue send(SccpMessageImpl message)
            throws
            IOException
    {

        int dpc = message.getOutgoingDpc();
        int sls = message.getSls();

        logger.debug("Sending dpc : " + dpc + ", sls : " + sls);

        Mtp3ServiceAccessPoint sap = this.sccpStackImpl.router.findMtp3ServiceAccessPoint(dpc, sls);
        logger.debug("Mtp3ServiceAccessPoint : " + sap);
        if (sap == null)
        {
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format("SccpMessage for sending=%s but no matching dpc=%d & sls=%d SAP found",
                        message, dpc,
                        sls));
            }
            return ReturnCauseValue.SCCP_FAILURE;
        }

        Mtp3UserPart mup = this.sccpStackImpl.getMtp3UserPart(sap.getMtp3Id());

        logger.debug("Mtp3UserPart : " + mup);

        if (mup == null)
        {
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format("SccpMessage for sending=%s but no matching Mtp3UserPart found for Id=%d",
                        message,
                        sap.getMtp3Id()));
            }
            return ReturnCauseValue.SCCP_FAILURE;
        }

        LongMessageRule lmr = this.sccpStackImpl.router.findLongMessageRule(dpc);
        logger.debug("LongMessageRule : " + lmr);

        LongMessageRuleType lmrt = LongMessageRuleType.LongMessagesForbidden;
        if (lmr != null)
            lmrt = lmr.getLongMessageRuleType();
        EncodingResultData erd = message.encode(lmrt, mup.getMaxUserDataLength(dpc), logger);

        logger.debug("switch erd.getEncodingResult() : " + erd.getEncodingResult());
        switch (erd.getEncodingResult())
        {
            case Success:
                logger.debug("Success");
                Mtp3TransferPrimitiveFactory factory = mup.getMtp3TransferPrimitiveFactory();
                logger.debug("erd.getSolidData() : " + erd.getSolidData());
                if (erd.getSolidData() != null)
                {
                    logger.debug("nonsegmented data");
                    // nonsegmented data
                    Mtp3TransferPrimitive msg = factory.createMtp3TransferPrimitive(Mtp3._SI_SERVICE_SCCP, sap.getNi
                                    (), 0,
                            sap.getOpc(), dpc, sls, erd.getSolidData());
                    logger.debug("nonsegmented data msg : " + msg);
                    mup.sendMessage(msg);
                    logger.debug("sent");
                } else
                {
                    logger.debug("segmented data : " + erd.getSegementedData());
                    // segmented data
                    for (byte[] bf : erd.getSegementedData())
                    {
                        Mtp3TransferPrimitive msg = factory.createMtp3TransferPrimitive(Mtp3._SI_SERVICE_SCCP, sap
                                        .getNi(), 0,
                                sap.getOpc(), dpc, sls, bf);
                        logger.debug("segmented data msg : " + msg);
                        mup.sendMessage(msg);
                        logger.debug("sent");
                    }
                }
                logger.debug("return null");
                return null;

            case ReturnFailure:
                logger.debug("ReturnFailure");
                return erd.getReturnCause();

            default:
                logger.debug("default");
                String em = String.format("Error %s when encoding a SccpMessage\n%s", erd.getEncodingResult()
                                .toString(),
                        message.toString());
                if (logger.isEnabledFor(Level.WARN))
                {
                    logger.warn(em);
                }
                throw new IOException(em);
        }
    }

    private enum TranslationAddressCheckingResult
    {
        destinationAvailable, destinationUnavailable_SubsystemFailure, destinationUnavailable_MtpFailure,
        translationFailure;
    }

    private TranslationAddressCheckingResult checkTranslationAddress(
            SccpAddressedMessageImpl msg, Rule rule,
            SccpAddress translationAddress, String destName)
    {

        if (translationAddress == null)
        {
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format(
                        "Received SccpMessage=%s for Translation but no matching %s Address defined for Rule=%s for " +
                                "routing",
                        msg, destName, rule));
            }
            return TranslationAddressCheckingResult.translationFailure;
        }

        if (!translationAddress.getAddressIndicator().pcPresent())
        {

            // destination PC is absent - bad rule
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format("Received SccpMessage=%s for Translation but no PC is present for %s " +
                                "Address ", msg,
                        destName));
            }
            return TranslationAddressCheckingResult.translationFailure;
        }

        int targetSsn = translationAddress.getSubsystemNumber();
        if (targetSsn == 0)
            targetSsn = msg.getCalledPartyAddress().getSubsystemNumber();

        if (this.sccpStackImpl.router.spcIsLocal(translationAddress.getSignalingPointCode()))
        {
            // destination PC is local
            if (targetSsn == 1 || this.sccpProviderImpl.getSccpListener(targetSsn) != null)
            {
                return TranslationAddressCheckingResult.destinationAvailable;
            } else
            {
                if (logger.isEnabledFor(Level.WARN))
                {
                    logger.warn(String.format(
                            "Received SccpMessage=%s for Translation but no local SSN is present for %s Address ", msg,
                            destName));
                }
                return TranslationAddressCheckingResult.destinationUnavailable_SubsystemFailure;
            }
        }

        // Check if the DPC is prohibited
        RemoteSignalingPointCode remoteSpc = this.sccpStackImpl.getSccpResource().getRemoteSpcByPC(
                translationAddress.getSignalingPointCode());
        if (remoteSpc == null)
        {
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format(
                        "Received SccpMessage=%s for Translation but no %s Remote Signaling Pointcode = %d resource " +
                                "defined ",
                        msg, destName, translationAddress.getSignalingPointCode()));
            }
            return TranslationAddressCheckingResult.translationFailure;
        }

        if (remoteSpc.isRemoteSpcProhibited())
        {
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format(
                        "Received SccpMessage=%s for Translation but %s Remote Signaling Pointcode = %d is prohibited" +
                                " ", msg,
                        destName, translationAddress.getSignalingPointCode()));
            }
            return TranslationAddressCheckingResult.destinationUnavailable_MtpFailure;
        }

        if (translationAddress.getAddressIndicator().getRoutingIndicator() == RoutingIndicator
                .ROUTING_BASED_ON_DPC_AND_SSN)
        {
            if (targetSsn != 1)
            {
                RemoteSubSystem remoteSubSystem = this.sccpStackImpl.getSccpResource().getRemoteSsn(
                        translationAddress.getSignalingPointCode(), targetSsn);
                if (remoteSubSystem == null)
                {
                    if (logger.isEnabledFor(Level.WARN))
                    {
                        logger.warn(String
                                .format("Received SccpMessage=%s for Translation but no %s Remote SubSystem = %d " +
                                                "(dpc=%d) resource defined ",
                                        msg, destName, translationAddress.getSubsystemNumber(),
                                        translationAddress.getSignalingPointCode()));
                    }
                    return TranslationAddressCheckingResult.translationFailure;
                }
                if (remoteSubSystem.isRemoteSsnProhibited())
                {
                    if (logger.isEnabledFor(Level.WARN))
                    {
                        logger.warn(String.format(
                                "Received SccpMessage=%s for Translation but %s Remote SubSystem = %d (dpc=%d) is " +
                                        "prohibited ",
                                msg, destName, translationAddress.getSubsystemNumber(),
                                translationAddress.getSignalingPointCode()));
                    }
                    return TranslationAddressCheckingResult.destinationUnavailable_SubsystemFailure;
                }
            }
        }

        return TranslationAddressCheckingResult.destinationAvailable;
    }

    private void translationFunction(SccpAddressedMessageImpl msg)
            throws
            IOException
    {

        logger.debug("translationFunction()");

        // checking for hop counter
        if (!msg.reduceHopCounter())
        {
            if (logger.isEnabledFor(Level.WARN))
            {
                logger.warn(String.format(
                        "Received SccpMessage for Translation but hop counter violation detected\nSccpMessage=%s",
                        msg));
            }
            this.sendSccpError(msg, ReturnCauseValue.HOP_COUNTER_VIOLATION);
            return;
        }
        /*
        SccpAddress calledPartyAddress = msg.getCalledPartyAddress();

        Rule rule = this.sccpStackImpl.router.findRule(calledPartyAddress, msg.getIsMtpOriginated());
        if (rule == null) {
            if (logger.isEnabledFor(Level.WARN)) {
                logger.warn(String.format(
                        "Received SccpMessage for Translation but no matching Rule found for local
                        routing\nSccpMessage=%s",
                        msg));
            }
            // Translation failed return error
            this.sendSccpError(msg, ReturnCauseValue.NO_TRANSLATION_FOR_ADDRESS);
            return;
        }

        // Check whether to use primary or backup address
        SccpAddress translationAddressPri = this.sccpStackImpl.router.getRoutingAddress(rule.getPrimaryAddressId());
        TranslationAddressCheckingResult resPri = this.checkTranslationAddress(msg, rule, translationAddressPri,
        "primary");
        if (resPri == TranslationAddressCheckingResult.translationFailure) {
            this.sendSccpError(msg, ReturnCauseValue.NO_TRANSLATION_FOR_ADDRESS);
            return;
        }

        SccpAddress translationAddressSec = null;
        TranslationAddressCheckingResult resSec = TranslationAddressCheckingResult
        .destinationUnavailable_SubsystemFailure;
        if (rule.getRuleType() != RuleType.Solitary) {
            translationAddressSec = this.sccpStackImpl.router.getRoutingAddress(rule.getSecondaryAddressId());
            resSec = this.checkTranslationAddress(msg, rule, translationAddressSec, "secondary");
            if (resSec == TranslationAddressCheckingResult.translationFailure) {
                this.sendSccpError(msg, ReturnCauseValue.NO_TRANSLATION_FOR_ADDRESS);
                return;
            }
        }

        if (resPri != TranslationAddressCheckingResult.destinationAvailable
                && resSec != TranslationAddressCheckingResult.destinationAvailable) {
            switch (resPri) {
                case destinationUnavailable_SubsystemFailure:
                    this.sendSccpError(msg, ReturnCauseValue.SUBSYSTEM_FAILURE);
                    return;
                case destinationUnavailable_MtpFailure:
                    this.sendSccpError(msg, ReturnCauseValue.MTP_FAILURE);
                    return;
                default:
                    this.sendSccpError(msg, ReturnCauseValue.SCCP_FAILURE);
                    return;
            }
        }

        SccpAddress translationAddress = null;
        SccpAddress translationAddress2 = null;
        if (resPri == TranslationAddressCheckingResult.destinationAvailable
                && resSec != TranslationAddressCheckingResult.destinationAvailable) {
            translationAddress = translationAddressPri;
        } else if (resPri != TranslationAddressCheckingResult.destinationAvailable
                && resSec == TranslationAddressCheckingResult.destinationAvailable) {
            translationAddress = translationAddressSec;
        } else {
            switch (rule.getRuleType()) {
                case Solitary:
                case Dominant:
                    translationAddress = translationAddressPri;
                    break;

                case Loadshared:
                    // loadsharing case and both destinations are available
                    if (msg.getSccpCreatesSls()) {
                        if (this.sccpStackImpl.newSelector())
                            translationAddress = translationAddressPri;
                        else
                            translationAddress = translationAddressSec;
                    } else {
                        if (this.selectLoadSharingRoute(rule.getLoadSharingAlgorithm(), msg))
                            translationAddress = translationAddressPri;
                        else
                            translationAddress = translationAddressSec;
                    }
                    break;

                case Broadcast:
                    // Broadcast case and both destinations are available
                    translationAddress = translationAddressPri;
                    translationAddress2 = translationAddressSec;
                    break;
            }
        }

        // changing calling party address if a rule has NewCallingPartyAddress
        if (rule.getNewCallingPartyAddressId() != null) {
            SccpAddress newCallingPartyAddress = this.sccpStackImpl.router
                    .getRoutingAddress(rule.getNewCallingPartyAddressId());
            if (newCallingPartyAddress != null) {
                msg.setCallingPartyAddress(newCallingPartyAddress);
                if (logger.isDebugEnabled()) {
                    logger.debug(String.format("New CallingPartyAddress assigned after translation = %s",
                            newCallingPartyAddress));
                }
            }
        }

        // translate address
        SccpAddress address = rule.translate(calledPartyAddress, translationAddress);
        msg.setCalledPartyAddress(address);

        if (logger.isDebugEnabled()) {
            logger.debug(String.format("CalledPartyAddress after translation = %s", address));
        }
        */

        // routing procedures then continue's

        SccpAddress calledPartyAddress = msg.getCalledPartyAddress();
        SccpAddress callingPartyAddress = msg.getCallingPartyAddress();
        logger.debug("Original calledPartyAddress : " + calledPartyAddress);
        logger.debug("Original callingPartyAddress : " + callingPartyAddress);

        msg.setCallingPartyAddress(
                new SccpAddress(
                        RoutingIndicator.ROUTING_BASED_ON_GLOBAL_TITLE,
                        1216,
                        GlobalTitle.getInstance(0,
                                NumberingPlan.ISDN_TELEPHONY,
                                NatureOfAddress.NATIONAL,
                                "263730100066"),
                        calledPartyAddress.getSubsystemNumber()));

        msg.setCalledPartyAddress(
                new SccpAddress(
                        RoutingIndicator.ROUTING_BASED_ON_GLOBAL_TITLE,
                        9,
                        GlobalTitle.getInstance(0,
                                NumberingPlan.ISDN_TELEPHONY,
                                NatureOfAddress.NATIONAL,
                                "263730100040"),
                        callingPartyAddress.getSubsystemNumber()));

        logger.debug("calling party now : " + msg.getCallingPartyAddress());
        logger.debug("called party now : " + msg.getCalledPartyAddress());

        this.route(msg);

        /*
         * David-Tekeshe-2015-03-05
         * TODO Implement SCCP Routing Rules
         *
        if (translationAddress2 != null) {
            // for broadcast mode - route to a secondary destination if it is available
            address = rule.translate(calledPartyAddress, translationAddress2);
            msg.setCalledPartyAddress(address);
            msg.clearReturnMessageOnError();

            if (logger.isDebugEnabled()) {
                logger.debug(String.format("CalledPartyAddress after translation - a second broadcast address = %s",
                address));
            }

            // routing procedures then continue's
            this.route(msg);
        }

        */
    }

    private boolean selectLoadSharingRoute(LoadSharingAlgorithm loadSharingAlgo, SccpAddressedMessageImpl msg)
    {

        if (loadSharingAlgo == LoadSharingAlgorithm.Bit4)
        {
            if ((msg.getSls() & 0x10) == 0)
                return true;
            else
                return false;
        } else if (loadSharingAlgo == LoadSharingAlgorithm.Bit3)
        {
            if ((msg.getSls() & 0x08) == 0)
                return true;
            else
                return false;
        } else if (loadSharingAlgo == LoadSharingAlgorithm.Bit2)
        {
            if ((msg.getSls() & 0x04) == 0)
                return true;
            else
                return false;
        } else if (loadSharingAlgo == LoadSharingAlgorithm.Bit1)
        {
            if ((msg.getSls() & 0x02) == 0)
                return true;
            else
                return false;
        } else if (loadSharingAlgo == LoadSharingAlgorithm.Bit0)
        {
            if ((msg.getSls() & 0x01) == 0)
                return true;
            else
                return false;
        } else
        {
            // TODO: implement complicated algorithms for selecting a destination
            // (CallingPartyAddress & SLS depended)
            // Look at Q.815 8.1.3 - active loadsharing
            return true;
        }
    }

    private void route(SccpAddressedMessageImpl msg)
            throws
            IOException
    {

        logger.debug("---> routing : " + msg);

        SccpAddress calledPartyAddress = msg.getCalledPartyAddress();
        logger.debug("---> calledPartyAddress : gt : " +
                calledPartyAddress.getGlobalTitle() +
                ", ssn : " + calledPartyAddress.getSubsystemNumber() +
                " spc " + calledPartyAddress.getSignalingPointCode() +
                " is PC Present : " + calledPartyAddress.getAddressIndicator().pcPresent());

        int dpc = calledPartyAddress.getSignalingPointCode();
        int ssn = calledPartyAddress.getSubsystemNumber();
        GlobalTitle gt = calledPartyAddress.getGlobalTitle();

        logger.debug("calledPartyAddress.getAddressIndicator().pcPresent() : " + calledPartyAddress
                .getAddressIndicator().pcPresent());
        if (calledPartyAddress.getAddressIndicator().pcPresent())
        {
            // DPC present
            logger.debug("DPC is present");
            logger.debug("this.sccpStackImpl.router.spcIsLocal : " + this.sccpStackImpl.router.spcIsLocal(dpc));
            if (this.sccpStackImpl.router.spcIsLocal(dpc))
            {
                // This message is for local routing
                logger.debug("This message is for local routing");

                if (ssn > 0)
                {
                    // if a non-zero SSN is present but not the GT (case 2 a) of
                    // 2.2.2), then the message is passed based on the message
                    // type to either connection-oriented control or
                    // connectionless control and based on the availability of
                    // the subsystem;
                    if (ssn == 1)
                    {
                        // This is for management
                        if (msg instanceof SccpDataMessage)
                        {
                            this.sccpManagement.onManagementMessage((SccpDataMessage) msg);
                        }
                        return;
                    }

                    logger.debug(String.format(
                            "Received SccpMessage=%s for routing but the SSN is available for local routing", msg));

                    SccpListener listener = this.sccpProviderImpl.getSccpListener(ssn);
                    if (listener == null)
                    {
                        if (logger.isEnabledFor(Level.WARN))
                        {
                            logger.warn(String.format(
                                    "Received SccpMessage=%s for routing but the SSN is not available for local " +
                                            "routing", msg));
                        }
                        this.sendSccpError(msg, ReturnCauseValue.SUBSYSTEM_FAILURE);
                        return;
                    }
                    // Notify Listener
                    try
                    {
                        // JIC: user may behave bad and throw something here.
                        if (msg instanceof SccpDataMessage)
                        {
                            if (logger.isDebugEnabled())
                            {
                                logger.debug(String.format("Local deliver : SCCP Data Message=%s", msg.toString()));
                            }
                            listener.onMessage((SccpDataMessage) msg);
                        } else if (msg instanceof SccpNoticeMessage)
                        {
                            if (logger.isDebugEnabled())
                            {
                                logger.debug(String.format("Local deliver : SCCP Notice Message=%s", msg.toString()));
                            }
                            listener.onNotice((SccpNoticeMessage) msg);
                        } else
                        {
                            // TODO: process connection-oriented messages
                        }
                    }
                    catch (Exception e)
                    {
                        if (logger.isEnabledFor(Level.WARN))
                        {
                            logger.warn(String.format(
                                    "Exception from the listener side when delivering SccpData to ssn=%d: Message=%s",
                                    msg.getOriginLocalSsn(), msg), e);
                        }
                    }
                } else if (gt != null)
                {
                    // if the GT is present but no SSN or a zero SSN is present
                    // (case 2 b) of 2.2.2), then the message is passed to the
                    // translation function;

                    if (calledPartyAddress.isTranslated())
                    {
                        // Called address already translated once. This is loop
                        // condition and error
                        logger.error(String
                                .format("Dropping message. Received SCCPMessage=%s for routing but CalledPartyAddress" +
                                                " is already translated once",
                                        msg));
                        this.sendSccpError(msg, ReturnCauseValue.SCCP_FAILURE);
                        return;
                    }

                    this.translationFunction(msg);

                } else
                {
                    // if an SSN equal to zero is present but not a GT (case 2
                    // d) of 2.2.2), then the address information is incomplete
                    // and the message shall be discarded. This abnormality is
                    // similar to the one described in 3.8.3.3, item 1) b6.

                    logger.error(String.format("Received SCCPMessage=%s for routing, but neither SSN nor GT present",
                            msg));
                    this.sendSccpError(msg, ReturnCauseValue.NO_TRANSLATION_FOR_NATURE);
                }

            } else
            {
                // DPC present but its not local pointcode. This message should be Tx to MTP
                logger.debug("DPC present but its not local point code. This message should be Tx to MTP");
                // Check if the DPC is not prohibited
                RemoteSignalingPointCode remoteSpc = this.sccpStackImpl.getSccpResource().getRemoteSpcByPC(dpc);
                if (remoteSpc == null)
                {
                    if (logger.isEnabledFor(Level.WARN))
                    {
                        logger.warn(String.format(
                                "Received SccpMessage=%s for routing but no Remote Signaling Pointcode = %d resource " +
                                        "defined ",
                                msg, dpc));
                    }
                    this.sendSccpError(msg, ReturnCauseValue.SCCP_FAILURE);
                    return;
                }

                logger.debug("Checking if the DPC is not prohibited");

                if (remoteSpc.isRemoteSpcProhibited())
                {
                    if (logger.isEnabledFor(Level.WARN))
                    {
                        logger.warn(String.format(
                                "Received SccpMessage=%s for routing but Remote Signaling Pointcode = %d is " +
                                        "prohibited", msg,
                                dpc));
                    }
                    this.sendSccpError(msg, ReturnCauseValue.MTP_FAILURE);
                    return;
                }
                logger.debug("DPC is not prohibited for ssn : " + ssn);

                if (ssn > 1)
                { // was: ssn > 1 ???
                    logger.debug("Is ROUTING_BASED_ON_DPC_AND_SSN? ");
                    if (calledPartyAddress.getAddressIndicator().getRoutingIndicator() == RoutingIndicator
                            .ROUTING_BASED_ON_DPC_AND_SSN)
                    {

                        logger.debug("Confirmed ROUTING_BASED_ON_DPC_AND_SSN ");

                        // if a non-zero SSN is present but not the GT (case 2a) of 2.2.2),
                        // then the called party address provided shall
                        // contain this SSN and the routing indicator shall be set
                        // to "Route on SSN"; See 2.2.2.1 point 2 of ITU-T Q.714
                        // If routing based on SSN, check remote SSN is available
                        RemoteSubSystem remoteSsn = this.sccpStackImpl.getSccpResource().getRemoteSsn(dpc,
                                calledPartyAddress.getSubsystemNumber());
                        if (remoteSsn == null)
                        {
                            if (logger.isEnabledFor(Level.WARN))
                            {
                                logger.warn(String.format(
                                        "Received SCCPMessage=%s for routing, but no Remote SubSystem = %d resource " +
                                                "defined ",
                                        msg, calledPartyAddress.getSubsystemNumber()));
                            }
                            // Routing failed return error
                            this.sendSccpError(msg, ReturnCauseValue.SCCP_FAILURE);
                            return;
                        } else
                        {
                            logger.debug(String.format(
                                    "Received SCCPMessage=%s for routing, but no Remote SubSystem = %d resource not " +
                                            "defined ",
                                    msg, calledPartyAddress.getSubsystemNumber()));
                        }

                        if (remoteSsn.isRemoteSsnProhibited())
                        {
                            if (logger.isEnabledFor(Level.WARN))
                            {
                                logger.warn(String.format(
                                        "Routing of Sccp Message=%s failed as Remote SubSystem = %d is prohibited ",
                                        msg,
                                        calledPartyAddress.getSubsystemNumber()));
                            }
                            this.sendSccpError(msg, ReturnCauseValue.SUBSYSTEM_FAILURE);
                            return;
                        } else
                        {
                            logger.debug(String.format(
                                    "Routing of Sccp Message=%s failed as Remote SubSystem = %d is not prohibited ",
                                    msg,
                                    calledPartyAddress.getSubsystemNumber()));
                        }
                    }

                    // send to MTP
                    logger.debug(String.format("Tx : SCCP Message=%s", msg.toString()));
                    if (logger.isDebugEnabled())
                    {
                        logger.debug(String.format("Tx : SCCP Message=%s", msg.toString()));
                    }
                    this.sendMessageToMtp(msg);
                } else if (gt != null)
                {

                    // if the GT is present but no SSN or a zero SSN is present
                    // (case 2 b) of 2.2.2), then the DPC identifies where the
                    // global title translation occurs. The called party address
                    // provided shall contain this GT and the routing indicator
                    // shall be set to "Route on GT"; See 2.2.2.1 point 3 of
                    // ITU-T Q.714

                    // send to MTP
                    if (logger.isDebugEnabled())
                    {
                        logger.debug(String.format("Tx : SCCP Message=%s", msg.toString()));
                    }
                    this.sendMessageToMtp(msg);
                } else
                {

                    logger.error(String.format("Received SCCPMessage=%s for routing, but neither SSN nor GT present",
                            msg));
                    this.sendSccpError(msg, ReturnCauseValue.NO_TRANSLATION_FOR_NATURE);
                }
            }
        } else
        {

            logger.debug("DPC not present. gt : " + gt);
            // DPC not present

            // If the DPC is not present, (case 3 of 2.2.2), then a global title
            // translation is required before the message can be sent out.
            // Translation results in a DPC and possibly a new SSN or new GT or
            // both.

            if (gt == null)
            {
                // No DPC, and no GT. This is insufficient information
                if (logger.isEnabledFor(Level.WARN))
                {
                    logger.warn(String
                            .format("Received SccpMessage=%s for routing from local SCCP user part but no pointcode " +
                                            "and no GT or SSN included",
                                    msg, dpc));
                }
                this.sendSccpError(msg, ReturnCauseValue.NO_TRANSLATION_FOR_NATURE);
                return;
            }

            logger.debug("calledPartyAddress.isTranslated() : " + calledPartyAddress.isTranslated());
            if (calledPartyAddress.isTranslated())
            {
                // Called address already translated once. This is loop
                // condition and error
                logger.error(String
                        .format("Droping message. Received SCCPMessage=%s for Routing , but CalledPartyAddress is " +
                                        "already translated once",
                                msg));
                this.sendSccpError(msg, ReturnCauseValue.SCCP_FAILURE);
                return;
            }

            logger.debug("translationFunction");
            this.translationFunction(msg);
        }
    }

    protected void sendMessageToMtp(SccpAddressedMessageImpl msg)
            throws
            IOException
    {

        logger.debug("sendMessageToMtp : " + msg);
        msg.setOutgoingDpc(msg.getCalledPartyAddress().getSignalingPointCode());

        // if (msg.getSccpCreatesSls()) {
        // msg.setSls(this.sccpStackImpl.newSls());
        // }
        logger.debug("sending ...");
        ReturnCauseValue er = this.send(msg);
        logger.debug("ReturnCauseValue ..." + er);

        if (er != null)
        {
            this.sendSccpError(msg, er);
        }
    }

    protected void sendSccpError(SccpAddressedMessageImpl msg, ReturnCauseValue returnCauseInt)
            throws
            IOException
    {

        // sending only if "ReturnMessageOnError" flag of the origin message
        if (!msg.getReturnMessageOnError())
            return;

        // in case we did not consume and this message has arrived from
        // other end.... we have to reply in some way Q.714 4.2 for now
        SccpNoticeMessageImpl ans = null;
        // not sure if its proper
        ReturnCause returnCause = ((ParameterFactoryImpl) this.sccpProviderImpl.getParameterFactory())
                .createReturnCause(returnCauseInt);
        if (msg instanceof SccpDataMessageImpl)
        {
            SccpDataMessageImpl msgData = (SccpDataMessageImpl) msg;
            ans = (SccpNoticeMessageImpl) messageFactory.createNoticeMessage(msg.getType(), returnCause,
                    msg.getCallingPartyAddress(), msg.getCalledPartyAddress(), msgData.getData(), msgData.getHopCounter(),
                    msgData.getImportance());
        } else
        {
            // TODO: Implement return errors for connection-oriented messages
        }

        if (ans != null)
        {
            if (msg.getIsMtpOriginated())
            {

                // send to MTP3
                if (logger.isDebugEnabled())
                {
                    logger.debug(String.format("sendSccpError to a remote user: SCCP Message=%s", msg.toString()));
                }
                this.route(ans);
            } else
            {

                // deliver locally
                if (logger.isDebugEnabled())
                {
                    logger.debug(String.format("sendSccpError to a local user: SCCP Message=%s", msg.toString()));
                }
                SccpListener listener = this.sccpProviderImpl.getSccpListener(msg.getOriginLocalSsn());
                if (listener != null)
                {
                    try
                    {
                        listener.onNotice(ans);
                    }
                    catch (Exception e)
                    {
                        if (logger.isEnabledFor(Level.WARN))
                        {
                            logger.warn(String.format(
                                    "Exception from the listener side when delivering SccpNotice to ssn=%d: Message=%s",
                                    msg.getOriginLocalSsn(), msg), e);
                        }
                    }
                }
            }
        }
    }
}
