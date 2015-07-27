/* eBridge SS7 */

package za.co.ebridge.map.impl.service.callhandling;

import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPApplicationContextName;
import za.co.ebridge.map.api.MAPApplicationContextVersion;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPServiceBase;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.EMLPPPriority;
import za.co.ebridge.map.api.primitives.ExtExternalSignalInfo;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.NAEAPreferredCI;
import za.co.ebridge.map.api.service.callhandling.AllowedServices;
import za.co.ebridge.map.api.service.callhandling.CCBSIndicators;
import za.co.ebridge.map.api.service.callhandling.CUGCheckInfo;
import za.co.ebridge.map.api.service.callhandling.CallDiversionTreatmentIndicator;
import za.co.ebridge.map.api.service.callhandling.CallReferenceNumber;
import za.co.ebridge.map.api.service.callhandling.CamelInfo;
import za.co.ebridge.map.api.service.callhandling.ExtendedRoutingInfo;
import za.co.ebridge.map.api.service.callhandling.InterrogationType;
import za.co.ebridge.map.api.service.callhandling.MAPDialogCallHandling;
import za.co.ebridge.map.api.service.callhandling.RoutingInfo;
import za.co.ebridge.map.api.service.callhandling.SuppressMTSS;
import za.co.ebridge.map.api.service.callhandling.UnavailabilityCause;
import za.co.ebridge.map.api.service.mobility.locationManagement.ISTSupportIndicator;
import za.co.ebridge.map.api.service.mobility.locationManagement.PagingArea;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.NumberPortabilityStatus;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.SubscriberInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBasicServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OfferedCamel4CSIs;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SupportedCamelPhases;
import za.co.ebridge.map.api.service.supplementary.ForwardingReason;
import za.co.ebridge.map.api.service.supplementary.SSCode;
import za.co.ebridge.tcap.api.api.TCAPException;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;

/*
 *
 * @author cristian veliscu
 *
 */
public class MAPDialogCallHandlingImpl extends MAPDialogImpl implements MAPDialogCallHandling {
    // Include these constants in MAPApplicationContextName and MAPOperationCode
    // sendRoutingInfo_Request: add constant to MAPMessageType
    // sendRoutingInfo_Response: add constant to MAPMessageType
    protected static final int locationInfoRetrievalContext = 5;
    protected static final int sendRoutingInfo = 22;
    protected static final int version = 3;

    protected MAPDialogCallHandlingImpl(MAPApplicationContext appCntx, Dialog tcapDialog, MAPProviderImpl mapProviderImpl,
            MAPServiceBase mapService, AddressString origReference, AddressString destReference) {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

    public Long addSendRoutingInformationRequest(ISDNAddressString msisdn, CUGCheckInfo cugCheckInfo,
            Integer numberOfForwarding, ExternalSignalInfo networkSignalInfo) throws MAPException {
        return this.addSendRoutingInformationRequest(_Timer_Default, msisdn, cugCheckInfo, numberOfForwarding, null, false,
                null, null, null, null, null, networkSignalInfo, null, false, null, null, false, null, null, null, false, null,
                false, false, false, false, null, null, null, false, null);
    }

    public Long addSendRoutingInformationRequest(int customInvokeTimeout, ISDNAddressString msisdn, CUGCheckInfo cugCheckInfo,
            Integer numberOfForwarding, ExternalSignalInfo networkSignalInfo) throws MAPException {

        return this.addSendRoutingInformationRequest(customInvokeTimeout, msisdn, cugCheckInfo, numberOfForwarding, null,
                false, null, null, null, null, null, networkSignalInfo, null, false, null, null, false, null, null, null,
                false, null, false, false, false, false, null, null, null, false, null);

    }

    @Override
    public Long addSendRoutingInformationRequest(ISDNAddressString msisdn, CUGCheckInfo cugCheckInfo,
            Integer numberOfForwarding, InterrogationType interrogationType, boolean orInterrogation, Integer orCapability,
            ISDNAddressString gmscAddress, CallReferenceNumber callReferenceNumber, ForwardingReason forwardingReason,
            ExtBasicServiceCode basicServiceGroup, ExternalSignalInfo networkSignalInfo, CamelInfo camelInfo,
            boolean suppressionOfAnnouncement, MAPExtensionContainer extensionContainer, AlertingPattern alertingPattern,
            boolean ccbsCall, Integer supportedCCBSPhase, ExtExternalSignalInfo additionalSignalInfo,
            ISTSupportIndicator istSupportIndicator, boolean prePagingSupported,
            CallDiversionTreatmentIndicator callDiversionTreatmentIndicator, boolean longFTNSupported, boolean suppressVtCSI,
            boolean suppressIncomingCallBarring, boolean gsmSCFInitiatedCall, ExtBasicServiceCode basicServiceGroup2,
            ExternalSignalInfo networkSignalInfo2, SuppressMTSS supressMTSS, boolean mtRoamingRetrySupported,
            EMLPPPriority callPriority) throws MAPException {

        return this
                .addSendRoutingInformationRequest(_Timer_Default, msisdn, cugCheckInfo, numberOfForwarding, interrogationType,
                        orInterrogation, orCapability, gmscAddress, callReferenceNumber, forwardingReason, basicServiceGroup,
                        networkSignalInfo, camelInfo, suppressionOfAnnouncement, extensionContainer, alertingPattern, ccbsCall,
                        supportedCCBSPhase, additionalSignalInfo, istSupportIndicator, prePagingSupported,
                        callDiversionTreatmentIndicator, longFTNSupported, suppressVtCSI, suppressIncomingCallBarring,
                        gsmSCFInitiatedCall, basicServiceGroup2, networkSignalInfo2, supressMTSS, mtRoamingRetrySupported,
                        callPriority);
    }

    @Override
    public Long addSendRoutingInformationRequest(int customInvokeTimeout, ISDNAddressString msisdn, CUGCheckInfo cugCheckInfo,
            Integer numberOfForwarding, InterrogationType interrogationType, boolean orInterrogation, Integer orCapability,
            ISDNAddressString gmscAddress, CallReferenceNumber callReferenceNumber, ForwardingReason forwardingReason,
            ExtBasicServiceCode basicServiceGroup, ExternalSignalInfo networkSignalInfo, CamelInfo camelInfo,
            boolean suppressionOfAnnouncement, MAPExtensionContainer extensionContainer, AlertingPattern alertingPattern,
            boolean ccbsCall, Integer supportedCCBSPhase, ExtExternalSignalInfo additionalSignalInfo,
            ISTSupportIndicator istSupportIndicator, boolean prePagingSupported,
            CallDiversionTreatmentIndicator callDiversionTreatmentIndicator, boolean longFTNSupported, boolean suppressVtCSI,
            boolean suppressIncomingCallBarring, boolean gsmSCFInitiatedCall, ExtBasicServiceCode basicServiceGroup2,
            ExternalSignalInfo networkSignalInfo2, SuppressMTSS supressMTSS, boolean mtRoamingRetrySupported,
            EMLPPPriority callPriority) throws MAPException {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationInfoRetrievalContext)
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 && vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addSendRoutingInformationRequest: must be locationInfoRetrievalContext_V1, V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendRoutingInfo);
        invoke.setOperationCode(oc);

        if (true) { // validate parameters here...
            SendRoutingInformationRequestImpl req = new SendRoutingInformationRequestImpl(this.appCntx
                    .getApplicationContextVersion().getVersion(), msisdn, cugCheckInfo, numberOfForwarding, interrogationType,
                    orInterrogation, orCapability, gmscAddress, callReferenceNumber, forwardingReason, basicServiceGroup,
                    networkSignalInfo, camelInfo, suppressionOfAnnouncement, extensionContainer, alertingPattern, ccbsCall,
                    supportedCCBSPhase, additionalSignalInfo, istSupportIndicator, prePagingSupported,
                    callDiversionTreatmentIndicator, longFTNSupported, suppressVtCSI, suppressIncomingCallBarring,
                    gsmSCFInitiatedCall, basicServiceGroup2, networkSignalInfo2, supressMTSS, mtRoamingRetrySupported,
                    callPriority);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);
        }

        Long invokeId;
        try {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);
        return invokeId;
    }

    public void addSendRoutingInformationResponse(long invokeId, IMSI imsi, CUGCheckInfo cugCheckInfo, RoutingInfo routingInfo2)
            throws MAPException {
        this.addSendRoutingInformationResponse(invokeId, imsi, null, cugCheckInfo, false, null, null, null, false, null, null,
                null, null, null, null, null, null, null, routingInfo2, null, null, null, null, false, null);
    }

    @Override
    public void addSendRoutingInformationResponse(long invokeId, IMSI imsi, ExtendedRoutingInfo extRoutingInfo,
            CUGCheckInfo cugCheckInfo, boolean cugSubscriptionFlag, SubscriberInfo subscriberInfo, ArrayList<SSCode> ssList,
            ExtBasicServiceCode basicService, boolean forwardingInterrogationRequired, ISDNAddressString vmscAddress,
            MAPExtensionContainer extensionContainer, NAEAPreferredCI naeaPreferredCI, CCBSIndicators ccbsIndicators,
            ISDNAddressString msisdn, NumberPortabilityStatus nrPortabilityStatus, Integer istAlertTimer,
            SupportedCamelPhases supportedCamelPhases, OfferedCamel4CSIs offeredCamel4CSIs, RoutingInfo routingInfo2,
            ArrayList<SSCode> ssList2, ExtBasicServiceCode basicService2, AllowedServices allowedServices,
            UnavailabilityCause unavailabilityCause, boolean releaseResourcesSupported, ExternalSignalInfo gsmBearerCapability)
            throws MAPException {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationInfoRetrievalContext)
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 && vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addSendRoutingInformationRequest: must be locationInfoRetrievalContext_V1, V2 or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendRoutingInfo);
        resultLast.setOperationCode(oc);

        if (true) { // validate parameters here...
            SendRoutingInformationResponseImpl res = new SendRoutingInformationResponseImpl(this.appCntx
                    .getApplicationContextVersion().getVersion(), imsi, extRoutingInfo, cugCheckInfo, cugSubscriptionFlag,
                    subscriberInfo, ssList, basicService, forwardingInterrogationRequired, vmscAddress, extensionContainer,
                    naeaPreferredCI, ccbsIndicators, msisdn, nrPortabilityStatus, istAlertTimer, supportedCamelPhases,
                    offeredCamel4CSIs, routingInfo2, ssList2, basicService2, allowedServices, unavailabilityCause,
                    releaseResourcesSupported, gsmBearerCapability);
            AsnOutputStream aos = new AsnOutputStream();
            res.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(res.getTagClass());
            p.setPrimitive(res.getIsPrimitive());
            p.setTag(res.getTag());
            p.setData(aos.toByteArray());
            resultLast.setParameter(p);
        }

        this.sendReturnResultLastComponent(resultLast);
    }

    @Override
    public Long addProvideRoamingNumberRequest(IMSI imsi, ISDNAddressString mscNumber, ISDNAddressString msisdn, LMSI lmsi,
            ExternalSignalInfo gsmBearerCapability, ExternalSignalInfo networkSignalInfo, boolean suppressionOfAnnouncement,
            ISDNAddressString gmscAddress, CallReferenceNumber callReferenceNumber, boolean orInterrogation,
            MAPExtensionContainer extensionContainer, AlertingPattern alertingPattern, boolean ccbsCall,
            SupportedCamelPhases supportedCamelPhasesInInterrogatingNode, ExtExternalSignalInfo additionalSignalInfo,
            boolean orNotSupportedInGMSC, boolean prePagingSupported, boolean longFTNSupported, boolean suppressVtCsi,
            OfferedCamel4CSIs offeredCamel4CSIsInInterrogatingNode, boolean mtRoamingRetrySupported, PagingArea pagingArea,
            EMLPPPriority callPriority, boolean mtrfIndicator, ISDNAddressString oldMSCNumber) throws MAPException {
        return this.addProvideRoamingNumberRequest(_Timer_Default, imsi, mscNumber, msisdn, lmsi, gsmBearerCapability,
                networkSignalInfo, suppressionOfAnnouncement, gmscAddress, callReferenceNumber, orInterrogation,
                extensionContainer, alertingPattern, ccbsCall, supportedCamelPhasesInInterrogatingNode, additionalSignalInfo,
                orNotSupportedInGMSC, prePagingSupported, longFTNSupported, suppressVtCsi,
                offeredCamel4CSIsInInterrogatingNode, mtRoamingRetrySupported, pagingArea, callPriority, mtrfIndicator,
                oldMSCNumber);
    }

    @Override
    public Long addProvideRoamingNumberRequest(int customInvokeTimeout, IMSI imsi, ISDNAddressString mscNumber,
            ISDNAddressString msisdn, LMSI lmsi, ExternalSignalInfo gsmBearerCapability, ExternalSignalInfo networkSignalInfo,
            boolean suppressionOfAnnouncement, ISDNAddressString gmscAddress, CallReferenceNumber callReferenceNumber,
            boolean orInterrogation, MAPExtensionContainer extensionContainer, AlertingPattern alertingPattern,
            boolean ccbsCall, SupportedCamelPhases supportedCamelPhasesInInterrogatingNode,
            ExtExternalSignalInfo additionalSignalInfo, boolean orNotSupportedInGMSC, boolean prePagingSupported,
            boolean longFTNSupported, boolean suppressVtCsi, OfferedCamel4CSIs offeredCamel4CSIsInInterrogatingNode,
            boolean mtRoamingRetrySupported, PagingArea pagingArea, EMLPPPriority callPriority, boolean mtrfIndicator,
            ISDNAddressString oldMSCNumber) throws MAPException {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.roamingNumberEnquiryContext)
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 && vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addProvideRoamingNumberRequest: must be roamingNumberEnquiryContext _V1, V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.provideRoamingNumber);
        invoke.setOperationCode(oc);

        ProvideRoamingNumberRequestImpl req = new ProvideRoamingNumberRequestImpl(imsi, mscNumber, msisdn, lmsi,
                gsmBearerCapability, networkSignalInfo, suppressionOfAnnouncement, gmscAddress, callReferenceNumber,
                orInterrogation, extensionContainer, alertingPattern, ccbsCall, supportedCamelPhasesInInterrogatingNode,
                additionalSignalInfo, orNotSupportedInGMSC, prePagingSupported, longFTNSupported, suppressVtCsi,
                offeredCamel4CSIsInInterrogatingNode, mtRoamingRetrySupported, pagingArea, callPriority, mtrfIndicator,
                oldMSCNumber, this.appCntx.getApplicationContextVersion().getVersion());
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        invoke.setParameter(p);

        Long invokeId;
        try {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);
        return invokeId;

    }

    @Override
    public void addProvideRoamingNumberResponse(long invokeId, ISDNAddressString roamingNumber,
            MAPExtensionContainer extensionContainer, boolean releaseResourcesSupported, ISDNAddressString vmscAddress)
            throws MAPException {

        MAPApplicationContextVersion vers = this.appCntx.getApplicationContextVersion();
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.roamingNumberEnquiryContext)
                || (vers != MAPApplicationContextVersion.version1 && vers != MAPApplicationContextVersion.version2 && vers != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addProvideRoamingNumberResponse: must be roamingNumberEnquiryContext_V1, V2 or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.provideRoamingNumber);
        resultLast.setOperationCode(oc);

        ProvideRoamingNumberResponseImpl res = new ProvideRoamingNumberResponseImpl(roamingNumber, extensionContainer,
                releaseResourcesSupported, vmscAddress, this.appCntx.getApplicationContextVersion().getVersion());
        AsnOutputStream aos = new AsnOutputStream();
        res.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(res.getTagClass());
        p.setPrimitive(res.getIsPrimitive());
        p.setTag(res.getTag());
        p.setData(aos.toByteArray());
        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);

    }

}