package za.co.ebridge.map.impl.service.sms;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.*;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCode;
import za.co.ebridge.map.api.service.sms.LocationInfoWithLMSI;
import za.co.ebridge.map.api.service.sms.MAPDialogSms;
import za.co.ebridge.map.api.service.sms.MAPServiceSms;
import za.co.ebridge.map.api.service.sms.MWStatus;
import za.co.ebridge.map.api.service.sms.SMDeliveryOutcome;
import za.co.ebridge.map.api.service.sms.SM_RP_DA;
import za.co.ebridge.map.api.service.sms.SM_RP_MTI;
import za.co.ebridge.map.api.service.sms.SM_RP_OA;
import za.co.ebridge.map.api.service.sms.SM_RP_SMEA;
import za.co.ebridge.map.api.service.sms.SmsSignalInfo;
import za.co.ebridge.tcap.api.api.TCAPException;
import za.co.ebridge.tcap.api.api.tc.component.InvokeClass;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;

public class MAPDialogSmsImpl
        extends MAPDialogImpl
        implements MAPDialogSms
{

    protected MAPDialogSmsImpl(
            MAPApplicationContext appCntx, Dialog tcapDialog, MAPProviderImpl mapProviderImpl,
            MAPServiceSms mapService, AddressString origReference, AddressString destReference)
    {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

    public Long addForwardShortMessageRequest(
            SM_RP_DA sm_RP_DA, SM_RP_OA sm_RP_OA, SmsSignalInfo sm_RP_UI,
            boolean moreMessagesToSend)
            throws
            MAPException
    {
        return addForwardShortMessageRequest(_Timer_Default, sm_RP_DA, sm_RP_OA, sm_RP_UI, moreMessagesToSend);
    }

    public Long addForwardShortMessageRequest(
            int customInvokeTimeout, SM_RP_DA sm_RP_DA, SM_RP_OA sm_RP_OA,
            SmsSignalInfo sm_RP_UI, boolean moreMessagesToSend)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgMORelayContext && this
                .appCntx
                .getApplicationContextName() != MAPApplicationContextName.shortMsgMTRelayContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version2))
            throw new MAPException(
                    "Bad application context name for addForwardShortMessageRequest: must be " +
                            "shortMsgMORelayContext_V1 or V2 or shortMsgMTRelayContext_V1 or V2");

        if (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2)
            moreMessagesToSend = false;

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_ml);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.mo_forwardSM);
        invoke.setOperationCode(oc);

        ForwardShortMessageRequestImpl req = new ForwardShortMessageRequestImpl(sm_RP_DA, sm_RP_OA, sm_RP_UI,
                moreMessagesToSend);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        invoke.setParameter(p);

        Long invokeId;
        try
        {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);

        return invokeId;
    }

    public void addForwardShortMessageResponse(long invokeId)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgMORelayContext && this
                .appCntx
                .getApplicationContextName() != MAPApplicationContextName.shortMsgMTRelayContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version2))
            throw new MAPException(
                    "Bad application context name for addForwardShortMessageResponse: must be " +
                            "shortMsgMORelayContext_V1 or V2 or shortMsgMTRelayContext_V1 or V2");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // we need not Operation Code because no answer

        this.sendReturnResultLastComponent(resultLast);
    }

    public Long addMoForwardShortMessageRequest(
            SM_RP_DA sm_RP_DA, SM_RP_OA sm_RP_OA, SmsSignalInfo sm_RP_UI,
            MAPExtensionContainer extensionContainer, IMSI imsi)
            throws
            MAPException
    {
        return addMoForwardShortMessageRequest(_Timer_Default, sm_RP_DA, sm_RP_OA, sm_RP_UI, extensionContainer, imsi);
    }

    public Long addMoForwardShortMessageRequest(
            int customInvokeTimeout, SM_RP_DA sm_RP_DA, SM_RP_OA sm_RP_OA,
            SmsSignalInfo sm_RP_UI, MAPExtensionContainer extensionContainer, IMSI imsi)
            throws
            MAPException
    {

        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgMORelayContext
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addMoForwardShortMessageRequest: must be " +
                            "shortMsgMORelayContext_V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_ml);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.mo_forwardSM);
        invoke.setOperationCode(oc);

        MoForwardShortMessageRequestImpl req = new MoForwardShortMessageRequestImpl(sm_RP_DA, sm_RP_OA, sm_RP_UI,
                extensionContainer, imsi);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        invoke.setParameter(p);

        Long invokeId;
        try
        {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);

        return invokeId;
    }

    public void addMoForwardShortMessageResponse(
            long invokeId,
            SmsSignalInfo sm_RP_UI,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgMORelayContext
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addMoForwardShortMessageResponse: must be " +
                            "shortMsgMORelayContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.mo_forwardSM);
        resultLast.setOperationCode(oc);

        if (sm_RP_UI != null || extensionContainer != null)
        {

            MoForwardShortMessageResponseImpl req = new MoForwardShortMessageResponseImpl(sm_RP_UI, extensionContainer);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            resultLast.setParameter(p);
        }

        this.sendReturnResultLastComponent(resultLast);
    }

    public Long addMtForwardShortMessageRequest(
            SM_RP_DA sm_RP_DA, SM_RP_OA sm_RP_OA, SmsSignalInfo sm_RP_UI,
            boolean moreMessagesToSend, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {
        return this.addMtForwardShortMessageRequest(_Timer_Default, sm_RP_DA, sm_RP_OA, sm_RP_UI, moreMessagesToSend,
                extensionContainer);
    }

    public Long addMtForwardShortMessageRequest(
            int customInvokeTimeout, SM_RP_DA sm_RP_DA, SM_RP_OA sm_RP_OA,
            SmsSignalInfo sm_RP_UI, boolean moreMessagesToSend, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgMTRelayContext
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addMtForwardShortMessageRequest: must be " +
                            "shortMsgMTRelayContext_V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_ml);
        else
            invoke.setTimeout(customInvokeTimeout);

        try
        {
            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                    .createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.mt_forwardSM);
            invoke.setOperationCode(oc);

            MtForwardShortMessageRequestImpl req = new MtForwardShortMessageRequestImpl(sm_RP_DA, sm_RP_OA, sm_RP_UI,
                    moreMessagesToSend, extensionContainer);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;

        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }
    }

    public void addMtForwardShortMessageResponse(
            long invokeId,
            SmsSignalInfo sm_RP_UI,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgMTRelayContext
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addMtForwardShortMessageResponse: must be " +
                            "shortMsgMTRelayContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.mt_forwardSM);
        resultLast.setOperationCode(oc);

        if (sm_RP_UI != null || extensionContainer != null)
        {

            MtForwardShortMessageResponseImpl resp = new MtForwardShortMessageResponseImpl(sm_RP_UI,
                    extensionContainer);
            AsnOutputStream aos = new AsnOutputStream();
            resp.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(resp.getTagClass());
            p.setPrimitive(resp.getIsPrimitive());
            p.setTag(resp.getTag());
            p.setData(aos.toByteArray());
            resultLast.setParameter(p);
        }

        this.sendReturnResultLastComponent(resultLast);
    }

    public Long addSendRoutingInfoForSMRequest(
            ISDNAddressString msisdn,
            boolean sm_RP_PRI,
            AddressString serviceCentreAddress,
            MAPExtensionContainer extensionContainer,
            boolean gprsSupportIndicator,
            SM_RP_MTI sM_RP_MTI,
            SM_RP_SMEA sM_RP_SMEA,
            TeleserviceCode teleservice)
            throws
            MAPException
    {
        return this.addSendRoutingInfoForSMRequest(_Timer_Default, msisdn, sm_RP_PRI, serviceCentreAddress,
                extensionContainer,
                gprsSupportIndicator, sM_RP_MTI, sM_RP_SMEA, teleservice);
    }

    public Long addSendRoutingInfoForSMRequest(
            int customInvokeTimeout, ISDNAddressString msisdn, boolean sm_RP_PRI,
            AddressString serviceCentreAddress, MAPExtensionContainer extensionContainer, boolean gprsSupportIndicator,
            SM_RP_MTI sM_RP_MTI, SM_RP_SMEA sM_RP_SMEA, TeleserviceCode teleservice)
            throws
            MAPException
    {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgGatewayContext
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 &&
                vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addSendRoutingInfoForSMRequest: must be " +
                            "shortMsgGatewayContext_V1, V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendRoutingInfoForSM);
        invoke.setOperationCode(oc);

        try
        {
            SendRoutingInfoForSMRequestImpl req = new SendRoutingInfoForSMRequestImpl(msisdn, sm_RP_PRI,
                    serviceCentreAddress,
                    extensionContainer, gprsSupportIndicator, sM_RP_MTI, sM_RP_SMEA, teleservice);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;

        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }
    }

    public void addSendRoutingInfoForSMResponse(
            long invokeId, IMSI imsi, LocationInfoWithLMSI locationInfoWithLMSI,
            MAPExtensionContainer extensionContainer, Boolean mwdSet)
            throws
            MAPException
    {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgGatewayContext
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 &&
                vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addSendRoutingInfoForSMResponse: must be " +
                            "shortMsgGatewayContext_V1, V2 or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendRoutingInfoForSM);
        resultLast.setOperationCode(oc);

        SendRoutingInfoForSMResponseImpl resp = new SendRoutingInfoForSMResponseImpl(imsi, locationInfoWithLMSI,
                extensionContainer, mwdSet);
        AsnOutputStream aos = new AsnOutputStream();
        resp.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(resp.getTagClass());
        p.setPrimitive(resp.getIsPrimitive());
        p.setTag(resp.getTag());
        p.setData(aos.toByteArray());
        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);
    }

    public Long addReportSMDeliveryStatusRequest(
            ISDNAddressString msisdn, AddressString serviceCentreAddress,
            SMDeliveryOutcome sMDeliveryOutcome, Integer absentSubscriberDiagnosticSM,
            MAPExtensionContainer extensionContainer, boolean gprsSupportIndicator, boolean deliveryOutcomeIndicator,
            SMDeliveryOutcome additionalSMDeliveryOutcome, Integer additionalAbsentSubscriberDiagnosticSM)
            throws
            MAPException
    {
        return this.addReportSMDeliveryStatusRequest(_Timer_Default, msisdn, serviceCentreAddress, sMDeliveryOutcome,
                absentSubscriberDiagnosticSM, extensionContainer, gprsSupportIndicator, deliveryOutcomeIndicator,
                additionalSMDeliveryOutcome, additionalAbsentSubscriberDiagnosticSM);
    }

    public Long addReportSMDeliveryStatusRequest(
            int customInvokeTimeout,
            ISDNAddressString msisdn,
            AddressString serviceCentreAddress,
            SMDeliveryOutcome sMDeliveryOutcome,
            Integer absentSubscriberDiagnosticSM,
            MAPExtensionContainer extensionContainer,
            boolean gprsSupportIndicator,
            boolean deliveryOutcomeIndicator,
            SMDeliveryOutcome additionalSMDeliveryOutcome,
            Integer additionalAbsentSubscriberDiagnosticSM)
            throws
            MAPException
    {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgGatewayContext
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 &&
                vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addReportSMDeliveryStatusRequest: must be " +
                            "shortMsgGatewayContext_V1, V2 or V3");

        if (msisdn == null || serviceCentreAddress == null
                || (vers != MAPApplicationContextVersion.version1 && sMDeliveryOutcome == null))
            throw new MAPException("msisdn, serviceCentreAddress and sMDeliveryOutcome must not be null");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_s);
        else
            invoke.setTimeout(customInvokeTimeout);

        try
        {
            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                    .createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.reportSM_DeliveryStatus);
            invoke.setOperationCode(oc);

            ReportSMDeliveryStatusRequestImpl req = new ReportSMDeliveryStatusRequestImpl(this.getApplicationContext()
                    .getApplicationContextVersion().getVersion(), msisdn, serviceCentreAddress, sMDeliveryOutcome,
                    absentSubscriberDiagnosticSM, extensionContainer, gprsSupportIndicator, deliveryOutcomeIndicator,
                    additionalSMDeliveryOutcome, additionalAbsentSubscriberDiagnosticSM);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;

        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }
    }

    public void addReportSMDeliveryStatusResponse(
            long invokeId, ISDNAddressString storedMSISDN,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgGatewayContext
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 &&
                vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addReportSMDeliveryStatusResponse: must be " +
                            "shortMsgGatewayContext_V1, V2 or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.reportSM_DeliveryStatus);
        resultLast.setOperationCode(oc);

        if (vers.getVersion() == 3 && (storedMSISDN != null || extensionContainer != null) || vers.getVersion() == 2
                && storedMSISDN != null)
        {
            ReportSMDeliveryStatusResponseImpl resp = new ReportSMDeliveryStatusResponseImpl(vers.getVersion(),
                    storedMSISDN,
                    extensionContainer);
            AsnOutputStream aos = new AsnOutputStream();
            resp.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(resp.getTagClass());
            p.setPrimitive(resp.getIsPrimitive());
            p.setTag(resp.getTag());
            p.setData(aos.toByteArray());
            resultLast.setParameter(p);
        }

        this.sendReturnResultLastComponent(resultLast);
    }

    public Long addInformServiceCentreRequest(
            ISDNAddressString storedMSISDN, MWStatus mwStatus,
            MAPExtensionContainer extensionContainer, Integer absentSubscriberDiagnosticSM,
            Integer additionalAbsentSubscriberDiagnosticSM)
            throws
            MAPException
    {
        return this.addInformServiceCentreRequest(_Timer_Default, storedMSISDN, mwStatus, extensionContainer,
                absentSubscriberDiagnosticSM, additionalAbsentSubscriberDiagnosticSM);
    }

    public Long addInformServiceCentreRequest(
            int customInvokeTimeout, ISDNAddressString storedMSISDN, MWStatus mwStatus,
            MAPExtensionContainer extensionContainer, Integer absentSubscriberDiagnosticSM,
            Integer additionalAbsentSubscriberDiagnosticSM)
            throws
            MAPException
    {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgGatewayContext
                || (vers != MAPApplicationContextVersion.version2 && vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addInformServiceCentreRequest: must be " +
                            "shortMsgGatewayContext_V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCInvokeRequest(InvokeClass.Class4);
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_s);
        else
            invoke.setTimeout(customInvokeTimeout);

        try
        {
            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                    .createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.informServiceCentre);
            invoke.setOperationCode(oc);

            InformServiceCentreRequestImpl req = new InformServiceCentreRequestImpl(storedMSISDN, mwStatus,
                    extensionContainer,
                    absentSubscriberDiagnosticSM, additionalAbsentSubscriberDiagnosticSM);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;

        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }
    }

    public Long addAlertServiceCentreRequest(ISDNAddressString msisdn, AddressString serviceCentreAddress)
            throws
            MAPException
    {
        return this.addAlertServiceCentreRequest(_Timer_Default, msisdn, serviceCentreAddress);
    }

    public Long addAlertServiceCentreRequest(
            int customInvokeTimeout, ISDNAddressString msisdn,
            AddressString serviceCentreAddress)
            throws
            MAPException
    {

        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgAlertContext
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version2))
            throw new MAPException(
                    "Bad application context name for addAlertServiceCentreRequest: must be shortMsgAlertContext_V1 " +
                            "or V2");

        Invoke invoke;
        if (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version1)
            invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                    .createTCInvokeRequest(InvokeClass.Class4);
        else
            invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_s);
        else
            invoke.setTimeout(customInvokeTimeout);

        try
        {
            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                    .createOperationCode();
            if (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version1)
                oc.setLocalOperationCode((long) MAPOperationCode.alertServiceCentreWithoutResult);
            else
                oc.setLocalOperationCode((long) MAPOperationCode.alertServiceCentre);
            invoke.setOperationCode(oc);

            AlertServiceCentreRequestImpl req = new AlertServiceCentreRequestImpl(msisdn, serviceCentreAddress);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;

        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }
    }

    public void addAlertServiceCentreResponse(long invokeId)
            throws
            MAPException
    {

        if (this.appCntx.getApplicationContextName() != MAPApplicationContextName.shortMsgAlertContext
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2))
            throw new MAPException(
                    "Bad application context name for addAlertServiceCentreResponse: must be shortMsgAlertContext_V2");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // we need not Operation Code because no answer
        // OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
        // .createOperationCode();
        // oc.setLocalOperationCode((long) MAPOperationCode.alertServiceCentre);
        // resultLast.setOperationCode(oc);

        this.sendReturnResultLastComponent(resultLast);
    }
}
