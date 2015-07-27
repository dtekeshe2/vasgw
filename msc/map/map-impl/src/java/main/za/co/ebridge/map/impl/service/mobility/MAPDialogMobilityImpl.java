package za.co.ebridge.map.impl.service.mobility;

import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.*;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.DiameterIdentity;
import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.IMEI;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LAIFixedLength;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.NAEAPreferredCI;
import za.co.ebridge.map.api.primitives.PlmnId;
import za.co.ebridge.map.api.primitives.SubscriberIdentity;
import za.co.ebridge.map.api.primitives.TMSI;
import za.co.ebridge.map.api.service.mobility.MAPDialogMobility;
import za.co.ebridge.map.api.service.mobility.MAPServiceMobility;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationSetList;
import za.co.ebridge.map.api.service.mobility.authentication.CurrentSecurityContext;
import za.co.ebridge.map.api.service.mobility.authentication.EpsAuthenticationSetList;
import za.co.ebridge.map.api.service.mobility.authentication.ReSynchronisationInfo;
import za.co.ebridge.map.api.service.mobility.authentication.RequestingNodeType;
import za.co.ebridge.map.api.service.mobility.imei.EquipmentStatus;
import za.co.ebridge.map.api.service.mobility.imei.RequestedEquipmentInfo;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIu;
import za.co.ebridge.map.api.service.mobility.locationManagement.ADDInfo;
import za.co.ebridge.map.api.service.mobility.locationManagement.AgeIndicator;
import za.co.ebridge.map.api.service.mobility.locationManagement.CancellationType;
import za.co.ebridge.map.api.service.mobility.locationManagement.EPSInfo;
import za.co.ebridge.map.api.service.mobility.locationManagement.IMSIWithLMSI;
import za.co.ebridge.map.api.service.mobility.locationManagement.PagingArea;
import za.co.ebridge.map.api.service.mobility.locationManagement.SGSNCapability;
import za.co.ebridge.map.api.service.mobility.locationManagement.SupportedFeatures;
import za.co.ebridge.map.api.service.mobility.locationManagement.TypeOfUpdate;
import za.co.ebridge.map.api.service.mobility.locationManagement.UESRVCCCapability;
import za.co.ebridge.map.api.service.mobility.locationManagement.UsedRATType;
import za.co.ebridge.map.api.service.mobility.locationManagement.VLRCapability;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RequestedInfo;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.SubscriberInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AccessRestrictionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSAllocationRetentionPriority;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSGSubscriptionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.Category;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ChargingCharacteristics;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.EPSSubscriptionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBearerServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtTeleserviceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GPRSSubscriptionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LCSInformation;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAInformation;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MCSSInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.NetworkAccessMode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBGeneralData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OfferedCamel4CSIs;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.RegionalSubscriptionResponse;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SGSNCAMELSubscriptionInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SubscriberStatus;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SupportedCamelPhases;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.VlrCamelSubscriptionInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.VoiceBroadcastData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.VoiceGroupCallData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ZoneCode;
import za.co.ebridge.map.api.service.supplementary.SSCode;
import za.co.ebridge.map.impl.service.mobility.authentication.SendAuthenticationInfoRequestImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.SendAuthenticationInfoResponseImpl;
import za.co.ebridge.map.impl.service.mobility.imei.CheckImeiRequestImpl;
import za.co.ebridge.map.impl.service.mobility.imei.CheckImeiResponseImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.CancelLocationRequestImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.CancelLocationResponseImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.PurgeMSRequestImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.PurgeMSResponseImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SendIdentificationRequestImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SendIdentificationResponseImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.UpdateGprsLocationRequestImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.UpdateGprsLocationResponseImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.UpdateLocationRequestImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.UpdateLocationResponseImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.AnyTimeInterrogationRequestImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.AnyTimeInterrogationResponseImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.InsertSubscriberDataRequestImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.InsertSubscriberDataResponseImpl;
import za.co.ebridge.tcap.api.api.TCAPException;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.TcapFactory;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;

public class MAPDialogMobilityImpl
        extends MAPDialogImpl
        implements MAPDialogMobility
{

    protected MAPDialogMobilityImpl(
            MAPApplicationContext appCntx, Dialog tcapDialog, MAPProviderImpl mapProviderImpl,
            MAPServiceMobility mapService, AddressString origReference, AddressString destReference)
    {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

    public Long addSendAuthenticationInfoRequest(
            IMSI imsi, int numberOfRequestedVectors, boolean segmentationProhibited,
            boolean immediateResponsePreferred, ReSynchronisationInfo reSynchronisationInfo,
            MAPExtensionContainer extensionContainer, RequestingNodeType requestingNodeType, PlmnId requestingPlmnId,
            Integer numberOfRequestedAdditionalVectors, boolean additionalVectorsAreForEPS)
            throws
            MAPException
    {
        return this.addSendAuthenticationInfoRequest(_Timer_Default, imsi, numberOfRequestedVectors,
                segmentationProhibited,
                immediateResponsePreferred, reSynchronisationInfo, extensionContainer, requestingNodeType,
                requestingPlmnId,
                numberOfRequestedAdditionalVectors, additionalVectorsAreForEPS);
    }

    public Long addSendAuthenticationInfoRequest(
            int customInvokeTimeout,
            IMSI imsi,
            int numberOfRequestedVectors,
            boolean segmentationProhibited,
            boolean immediateResponsePreferred,
            ReSynchronisationInfo reSynchronisationInfo,
            MAPExtensionContainer extensionContainer,
            RequestingNodeType requestingNodeType,
            PlmnId requestingPlmnId,
            Integer numberOfRequestedAdditionalVectors,
            boolean additionalVectorsAreForEPS)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.infoRetrievalContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for sendAuthenticationInfoRequest: must be infoRetrievalContext_V2 " +
                            "or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendAuthenticationInfo);
        invoke.setOperationCode(oc);

        if (imsi != null)
        {
            // parameter is optional: is no imsi is included we will not add a parameter
            SendAuthenticationInfoRequestImpl req = new SendAuthenticationInfoRequestImpl(this.appCntx
                    .getApplicationContextVersion().getVersion(), imsi, numberOfRequestedVectors,
                    segmentationProhibited,
                    immediateResponsePreferred, reSynchronisationInfo, extensionContainer, requestingNodeType,
                    requestingPlmnId, numberOfRequestedAdditionalVectors, additionalVectorsAreForEPS);
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

    public void addSendAuthenticationInfoResponse(
            long invokeId, AuthenticationSetList authenticationSetList,
            MAPExtensionContainer extensionContainer, EpsAuthenticationSetList epsAuthenticationSetList)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.infoRetrievalContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for addSendAuthenticationInfoResponse: must be " +
                            "infoRetrievalContext_V2 or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        if (authenticationSetList != null || extensionContainer != null || epsAuthenticationSetList != null)
        {
            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                    .createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.sendAuthenticationInfo);
            resultLast.setOperationCode(oc);

            SendAuthenticationInfoResponseImpl req = new SendAuthenticationInfoResponseImpl(this.appCntx
                    .getApplicationContextVersion().getVersion(), authenticationSetList, extensionContainer,
                    epsAuthenticationSetList);
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

    public Long addUpdateLocationRequest(
            IMSI imsi,
            ISDNAddressString mscNumber,
            ISDNAddressString roamingNumber,
            ISDNAddressString vlrNumber,
            LMSI lmsi,
            MAPExtensionContainer extensionContainer,
            VLRCapability vlrCapability,
            boolean informPreviousNetworkEntity,
            boolean csLCSNotSupportedByUE,
            GSNAddress vGmlcAddress,
            ADDInfo addInfo,
            PagingArea pagingArea,
            boolean skipSubscriberDataUpdate,
            boolean restorationIndicator)
            throws
            MAPException
    {
        return addUpdateLocationRequest(_Timer_Default, imsi, mscNumber, roamingNumber, vlrNumber, lmsi,
                extensionContainer,
                vlrCapability, informPreviousNetworkEntity, csLCSNotSupportedByUE, vGmlcAddress, addInfo, pagingArea,
                skipSubscriberDataUpdate, restorationIndicator);
    }

    public Long addUpdateLocationRequest(
            int customInvokeTimeout,
            IMSI imsi,
            ISDNAddressString mscNumber,
            ISDNAddressString roamingNumber,
            ISDNAddressString vlrNumber,
            LMSI lmsi,
            MAPExtensionContainer extensionContainer,
            VLRCapability vlrCapability,
            boolean informPreviousNetworkEntity,
            boolean csLCSNotSupportedByUE,
            GSNAddress vGmlcAddress,
            ADDInfo addInfo,
            PagingArea pagingArea,
            boolean skipSubscriberDataUpdate,
            boolean restorationIndicator)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.networkLocUpContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for UpdateLocationRequest: must be networkLocUpContext_V1, V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.updateLocation);
        invoke.setOperationCode(oc);

        UpdateLocationRequestImpl req = new UpdateLocationRequestImpl(this.appCntx.getApplicationContextVersion()
                .getVersion(),
                imsi, mscNumber, roamingNumber, vlrNumber, lmsi, extensionContainer, vlrCapability,
                informPreviousNetworkEntity, csLCSNotSupportedByUE, vGmlcAddress, addInfo, pagingArea,
                skipSubscriberDataUpdate, restorationIndicator);
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

    public void addUpdateLocationResponse(
            long invokeId, ISDNAddressString hlrNumber, MAPExtensionContainer extensionContainer,
            boolean addCapability, boolean pagingAreaCapability)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.networkLocUpContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for UpdateLocationResponse: must be networkLocUpContext_V1, V2 or " +
                            "V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.updateLocation);
        resultLast.setOperationCode(oc);

        UpdateLocationResponseImpl req = new UpdateLocationResponseImpl(this.appCntx.getApplicationContextVersion()
                .getVersion(), hlrNumber, extensionContainer, addCapability, pagingAreaCapability);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * MAPDialogSubscriberInformation
     * #addAnyTimeInterrogationRequest(org.mobicents .protocols.protocols.ss7.cap.api.map.api.primitives
     * .SubscriberIdentity,
     * org.mobicents.protocols .protocols.ss7.cap.api.map.api.service.subscriberInformation.RequestedInfo,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.ISDNAddressString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPExtensionContainer)
     */
    public long addAnyTimeInterrogationRequest(
            SubscriberIdentity subscriberIdentity, RequestedInfo requestedInfo,
            ISDNAddressString gsmSCFAddress, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        return this.addAnyTimeInterrogationRequest(_Timer_Default, subscriberIdentity, requestedInfo, gsmSCFAddress,
                extensionContainer);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * MAPDialogSubscriberInformation#addAnyTimeInterrogationRequest(long,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.SubscriberIdentity, org.mobicents
     * .protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.RequestedInfo,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.ISDNAddressString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPExtensionContainer)
     */
    public long addAnyTimeInterrogationRequest(
            long customInvokeTimeout, SubscriberIdentity subscriberIdentity,
            RequestedInfo requestedInfo, ISDNAddressString gsmSCFAddress, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.anyTimeEnquiryContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for AnyTimeInterrogationRequest: must be networkLocUpContext_V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.anyTimeInterrogation);
        invoke.setOperationCode(oc);

        AnyTimeInterrogationRequestImpl req = new AnyTimeInterrogationRequestImpl(subscriberIdentity, requestedInfo,
                gsmSCFAddress, extensionContainer);

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

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * MAPDialogSubscriberInformation#addAnyTimeInterrogationResponse(long)
     */
    public void addAnyTimeInterrogationResponse(
            long invokeId, SubscriberInfo subscriberInfo,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.anyTimeEnquiryContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for AnyTimeInterrogationRequest: must be networkLocUpContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.anyTimeInterrogation);
        resultLast.setOperationCode(oc);

        AnyTimeInterrogationResponseImpl req = new AnyTimeInterrogationResponseImpl(subscriberInfo, extensionContainer);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);
    }

    @Override
    public Long addCheckImeiRequest(
            IMEI imei, RequestedEquipmentInfo requestedEquipmentInfo,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        return this.addCheckImeiRequest(_Timer_Default, imei, requestedEquipmentInfo, extensionContainer);
    }

    @Override
    public Long addCheckImeiRequest(
            long customInvokeTimeout, IMEI imei, RequestedEquipmentInfo requestedEquipmentInfo,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.equipmentMngtContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
        {
            throw new MAPException(
                    "Bad application context name for CheckImeiRequest: must be equipmentMngtContext_V1, V2 or V3");
        }

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
        {
            invoke.setTimeout(_Timer_m);
        } else
        {
            invoke.setTimeout(customInvokeTimeout);
        }

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.checkIMEI);
        invoke.setOperationCode(oc);

        CheckImeiRequestImpl req = new CheckImeiRequestImpl(this.appCntx.getApplicationContextVersion().getVersion(),
                imei,
                requestedEquipmentInfo, extensionContainer);

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

    @Override
    public void addCheckImeiResponse(
            long invokeId, EquipmentStatus equipmentStatus, UESBIIu bmuef,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.equipmentMngtContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
        {
            throw new MAPException(
                    "Bad application context name for CheckImeiResponse: must be equipmentMngtContext_V1, V2 or V3");
        }

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.checkIMEI);
        resultLast.setOperationCode(oc);

        CheckImeiResponseImpl resp = new CheckImeiResponseImpl(this.appCntx.getApplicationContextVersion().getVersion(),
                equipmentStatus, bmuef, extensionContainer);
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

    @Override
    public Long addCheckImeiRequest_Huawei(
            IMEI imei, RequestedEquipmentInfo requestedEquipmentInfo,
            MAPExtensionContainer extensionContainer, IMSI imsi)
            throws
            MAPException
    {

        return this.addCheckImeiRequest_Huawei(_Timer_Default, imei, requestedEquipmentInfo, extensionContainer, imsi);
    }

    @Override
    public Long addCheckImeiRequest_Huawei(
            long customInvokeTimeout, IMEI imei, RequestedEquipmentInfo requestedEquipmentInfo,
            MAPExtensionContainer extensionContainer, IMSI imsi)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.equipmentMngtContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
        {
            throw new MAPException(
                    "Bad application context name for CheckImeiRequest: must be equipmentMngtContext_V1, V2 or V3");
        }

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
        {
            invoke.setTimeout(_Timer_m);
        } else
        {
            invoke.setTimeout(customInvokeTimeout);
        }

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.checkIMEI);
        invoke.setOperationCode(oc);

        CheckImeiRequestImpl req = new CheckImeiRequestImpl(this.appCntx.getApplicationContextVersion().getVersion(),
                imei,
                requestedEquipmentInfo, extensionContainer);
        req.setIMSI(imsi);

        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        p.setEncodingLength(req.getEncodedLength());
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

    @Override
    public Long addInsertSubscriberDataRequest(
            IMSI imsi, ISDNAddressString msisdn, Category category,
            SubscriberStatus subscriberStatus, ArrayList<ExtBearerServiceCode> bearerServiceList,
            ArrayList<ExtTeleserviceCode> teleserviceList, ArrayList<ExtSSInfo> provisionedSS, ODBData odbData,
            boolean roamingRestrictionDueToUnsupportedFeature, ArrayList<ZoneCode> regionalSubscriptionData,
            ArrayList<VoiceBroadcastData> vbsSubscriptionData, ArrayList<VoiceGroupCallData> vgcsSubscriptionData,
            VlrCamelSubscriptionInfo vlrCamelSubscriptionInfo)
            throws
            MAPException
    {

        return this.addInsertSubscriberDataRequest(_Timer_Default, imsi, msisdn, category, subscriberStatus,
                bearerServiceList,
                teleserviceList, provisionedSS, odbData, roamingRestrictionDueToUnsupportedFeature,
                regionalSubscriptionData,
                vbsSubscriptionData, vgcsSubscriptionData, vlrCamelSubscriptionInfo);
    }

    @Override
    public Long addInsertSubscriberDataRequest(
            long customInvokeTimeout, IMSI imsi, ISDNAddressString msisdn,
            Category category, SubscriberStatus subscriberStatus, ArrayList<ExtBearerServiceCode> bearerServiceList,
            ArrayList<ExtTeleserviceCode> teleserviceList, ArrayList<ExtSSInfo> provisionedSS, ODBData odbData,
            boolean roamingRestrictionDueToUnsupportedFeature, ArrayList<ZoneCode> regionalSubscriptionData,
            ArrayList<VoiceBroadcastData> vbsSubscriptionData, ArrayList<VoiceGroupCallData> vgcsSubscriptionData,
            VlrCamelSubscriptionInfo vlrCamelSubscriptionInfo)
            throws
            MAPException
    {

        return this.addInsertSubscriberDataRequest(customInvokeTimeout, imsi, msisdn, category, subscriberStatus,
                bearerServiceList, teleserviceList, provisionedSS, odbData, roamingRestrictionDueToUnsupportedFeature,
                regionalSubscriptionData, vbsSubscriptionData, vgcsSubscriptionData, vlrCamelSubscriptionInfo, null,
                null,
                null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null,
                false, null,
                null, null, false, false, null);
    }

    @Override
    public Long addInsertSubscriberDataRequest(
            IMSI imsi,
            ISDNAddressString msisdn,
            Category category,
            SubscriberStatus subscriberStatus,
            ArrayList<ExtBearerServiceCode> bearerServiceList,
            ArrayList<ExtTeleserviceCode> teleserviceList,
            ArrayList<ExtSSInfo> provisionedSS,
            ODBData odbData,
            boolean roamingRestrictionDueToUnsupportedFeature,
            ArrayList<ZoneCode> regionalSubscriptionData,
            ArrayList<VoiceBroadcastData> vbsSubscriptionData,
            ArrayList<VoiceGroupCallData> vgcsSubscriptionData,
            VlrCamelSubscriptionInfo vlrCamelSubscriptionInfo,
            MAPExtensionContainer extensionContainer,
            NAEAPreferredCI naeaPreferredCI,
            GPRSSubscriptionData gprsSubscriptionData,
            boolean roamingRestrictedInSgsnDueToUnsupportedFeature,
            NetworkAccessMode networkAccessMode,
            LSAInformation lsaInformation,
            boolean lmuIndicator,
            LCSInformation lcsInformation,
            Integer istAlertTimer,
            AgeIndicator superChargerSupportedInHLR,
            MCSSInfo mcSsInfo,
            CSAllocationRetentionPriority csAllocationRetentionPriority,
            SGSNCAMELSubscriptionInfo sgsnCamelSubscriptionInfo,
            ChargingCharacteristics chargingCharacteristics,
            AccessRestrictionData accessRestrictionData,
            Boolean icsIndicator,
            EPSSubscriptionData epsSubscriptionData,
            ArrayList<CSGSubscriptionData> csgSubscriptionDataList,
            boolean ueReachabilityRequestIndicator,
            ISDNAddressString sgsnNumber,
            DiameterIdentity mmeName,
            Long subscribedPeriodicRAUTAUtimer,
            boolean vplmnLIPAAllowed,
            Boolean mdtUserConsent,
            Long subscribedPeriodicLAUtimer)
            throws
            MAPException
    {

        return this.addInsertSubscriberDataRequest(_Timer_Default, imsi, msisdn, category, subscriberStatus,
                bearerServiceList,
                teleserviceList, provisionedSS, odbData, roamingRestrictionDueToUnsupportedFeature,
                regionalSubscriptionData,
                vbsSubscriptionData, vgcsSubscriptionData, vlrCamelSubscriptionInfo, extensionContainer,
                naeaPreferredCI,
                gprsSubscriptionData, roamingRestrictedInSgsnDueToUnsupportedFeature, networkAccessMode, lsaInformation,
                lmuIndicator, lcsInformation, istAlertTimer, superChargerSupportedInHLR, mcSsInfo,
                csAllocationRetentionPriority, sgsnCamelSubscriptionInfo, chargingCharacteristics,
                accessRestrictionData,
                icsIndicator, epsSubscriptionData, csgSubscriptionDataList, ueReachabilityRequestIndicator, sgsnNumber,
                mmeName, subscribedPeriodicRAUTAUtimer, vplmnLIPAAllowed, mdtUserConsent, subscribedPeriodicLAUtimer);
    }

    @Override
    public Long addInsertSubscriberDataRequest(
            long customInvokeTimeout,
            IMSI imsi,
            ISDNAddressString msisdn,
            Category category,
            SubscriberStatus subscriberStatus,
            ArrayList<ExtBearerServiceCode> bearerServiceList,
            ArrayList<ExtTeleserviceCode> teleserviceList,
            ArrayList<ExtSSInfo> provisionedSS,
            ODBData odbData,
            boolean roamingRestrictionDueToUnsupportedFeature,
            ArrayList<ZoneCode> regionalSubscriptionData,
            ArrayList<VoiceBroadcastData> vbsSubscriptionData,
            ArrayList<VoiceGroupCallData> vgcsSubscriptionData,
            VlrCamelSubscriptionInfo vlrCamelSubscriptionInfo,
            MAPExtensionContainer extensionContainer,
            NAEAPreferredCI naeaPreferredCI,
            GPRSSubscriptionData gprsSubscriptionData,
            boolean roamingRestrictedInSgsnDueToUnsupportedFeature,
            NetworkAccessMode networkAccessMode,
            LSAInformation lsaInformation,
            boolean lmuIndicator,
            LCSInformation lcsInformation,
            Integer istAlertTimer,
            AgeIndicator superChargerSupportedInHLR,
            MCSSInfo mcSsInfo,
            CSAllocationRetentionPriority csAllocationRetentionPriority,
            SGSNCAMELSubscriptionInfo sgsnCamelSubscriptionInfo,
            ChargingCharacteristics chargingCharacteristics,
            AccessRestrictionData accessRestrictionData,
            Boolean icsIndicator,
            EPSSubscriptionData epsSubscriptionData,
            ArrayList<CSGSubscriptionData> csgSubscriptionDataList,
            boolean ueReachabilityRequestIndicator,
            ISDNAddressString sgsnNumber,
            DiameterIdentity mmeName,
            Long subscribedPeriodicRAUTAUtimer,
            boolean vplmnLIPAAllowed,
            Boolean mdtUserConsent,
            Long subscribedPeriodicLAUtimer)
            throws
            MAPException
    {

        boolean isSubscriberDataMngtContext = false;
        boolean isNetworkLocUpContext = false;
        boolean isGprsLocationUpdateContext = false;
        if ((this.appCntx.getApplicationContextName() == MAPApplicationContextName.subscriberDataMngtContext)
                && (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version1
                || this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version2 || this.appCntx
                .getApplicationContextVersion() == MAPApplicationContextVersion.version3))
            isSubscriberDataMngtContext = true;
        if ((this.appCntx.getApplicationContextName() == MAPApplicationContextName.networkLocUpContext)
                && (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version1
                || this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version2 || this.appCntx
                .getApplicationContextVersion() == MAPApplicationContextVersion.version3))
            isNetworkLocUpContext = true;
        if ((this.appCntx.getApplicationContextName() == MAPApplicationContextName.gprsLocationUpdateContext)
                && (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version3))
            isGprsLocationUpdateContext = true;
        if (isSubscriberDataMngtContext == false && isNetworkLocUpContext == false && isGprsLocationUpdateContext ==
                false)
            throw new MAPException(
                    "Bad application context name for InsertSubscriberDataRequest: must be networkLocUpContext_V1, V2" +
                            " or V3 or "
                            + "subscriberDataMngtContext_V1, V2 or V3 or gprsLocationUpdateContext_V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
        {
            invoke.setTimeout(_Timer_m);
        } else
        {
            invoke.setTimeout(customInvokeTimeout);
        }

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.insertSubscriberData);
        invoke.setOperationCode(oc);

        InsertSubscriberDataRequestImpl req = new InsertSubscriberDataRequestImpl(this.appCntx
                .getApplicationContextVersion()
                .getVersion(), imsi, msisdn, category, subscriberStatus, bearerServiceList, teleserviceList,
                provisionedSS,
                odbData, roamingRestrictionDueToUnsupportedFeature, regionalSubscriptionData, vbsSubscriptionData,
                vgcsSubscriptionData, vlrCamelSubscriptionInfo, extensionContainer, naeaPreferredCI,
                gprsSubscriptionData,
                roamingRestrictedInSgsnDueToUnsupportedFeature, networkAccessMode, lsaInformation, lmuIndicator,
                lcsInformation, istAlertTimer, superChargerSupportedInHLR, mcSsInfo, csAllocationRetentionPriority,
                sgsnCamelSubscriptionInfo, chargingCharacteristics, accessRestrictionData, icsIndicator,
                epsSubscriptionData,
                csgSubscriptionDataList, ueReachabilityRequestIndicator, sgsnNumber, mmeName,
                subscribedPeriodicRAUTAUtimer,
                vplmnLIPAAllowed, mdtUserConsent, subscribedPeriodicLAUtimer);

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

    @Override
    public void addInsertSubscriberDataResponse(
            long invokeId, ArrayList<ExtTeleserviceCode> teleserviceList,
            ArrayList<ExtBearerServiceCode> bearerServiceList, ArrayList<SSCode> ssList, ODBGeneralData odbGeneralData,
            RegionalSubscriptionResponse regionalSubscriptionResponse)
            throws
            MAPException
    {

        this.addInsertSubscriberDataResponse(invokeId, teleserviceList, bearerServiceList, ssList, odbGeneralData,
                regionalSubscriptionResponse, null, null, null, null);
    }

    @Override
    public void addInsertSubscriberDataResponse(
            long invokeId,
            ArrayList<ExtTeleserviceCode> teleserviceList,
            ArrayList<ExtBearerServiceCode> bearerServiceList,
            ArrayList<SSCode> ssList,
            ODBGeneralData odbGeneralData,
            RegionalSubscriptionResponse regionalSubscriptionResponse,
            SupportedCamelPhases supportedCamelPhases,
            MAPExtensionContainer extensionContainer,
            OfferedCamel4CSIs offeredCamel4CSIs,
            SupportedFeatures supportedFeatures)
            throws
            MAPException
    {

        boolean isSubscriberDataMngtContext = false;
        boolean isNetworkLocUpContext = false;
        boolean isGprsLocationUpdateContext = false;
        if ((this.appCntx.getApplicationContextName() == MAPApplicationContextName.subscriberDataMngtContext)
                && (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version1
                || this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version2 || this.appCntx
                .getApplicationContextVersion() == MAPApplicationContextVersion.version3))
            isSubscriberDataMngtContext = true;
        if ((this.appCntx.getApplicationContextName() == MAPApplicationContextName.networkLocUpContext)
                && (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version1
                || this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version2 || this.appCntx
                .getApplicationContextVersion() == MAPApplicationContextVersion.version3))
            isNetworkLocUpContext = true;
        if ((this.appCntx.getApplicationContextName() == MAPApplicationContextName.gprsLocationUpdateContext)
                && (this.appCntx.getApplicationContextVersion() == MAPApplicationContextVersion.version3))
            isGprsLocationUpdateContext = true;
        if (isSubscriberDataMngtContext == false && isNetworkLocUpContext == false && isGprsLocationUpdateContext ==
                false)
            throw new MAPException(
                    "Bad application context name for InsertSubscriberDataResponse: must be networkLocUpContext_V1, " +
                            "V2 or V3 or "
                            + "subscriberDataMngtContext_V1, V2 or V3 or gprsLocationUpdateContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.insertSubscriberData);
        resultLast.setOperationCode(oc);

        if (teleserviceList != null || bearerServiceList != null || ssList != null || odbGeneralData != null
                || regionalSubscriptionResponse != null || supportedCamelPhases != null || extensionContainer != null
                || offeredCamel4CSIs != null || supportedFeatures != null)
        {
            InsertSubscriberDataResponseImpl resp = new InsertSubscriberDataResponseImpl(this.appCntx
                    .getApplicationContextVersion().getVersion(), teleserviceList, bearerServiceList, ssList,
                    odbGeneralData,
                    regionalSubscriptionResponse, supportedCamelPhases, extensionContainer, offeredCamel4CSIs,
                    supportedFeatures);
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

    @Override
    public Long addCancelLocationRequest(
            IMSI imsi,
            IMSIWithLMSI imsiWithLmsi,
            CancellationType cancellationType,
            MAPExtensionContainer extensionContainer,
            TypeOfUpdate typeOfUpdate,
            boolean mtrfSupportedAndAuthorized,
            boolean mtrfSupportedAndNotAuthorized,
            ISDNAddressString newMSCNumber,
            ISDNAddressString newVLRNumber,
            LMSI newLmsi)
            throws
            MAPException
    {

        return this.addCancelLocationRequest(_Timer_Default, imsi, imsiWithLmsi, cancellationType, extensionContainer,
                typeOfUpdate, mtrfSupportedAndAuthorized, mtrfSupportedAndNotAuthorized, newMSCNumber, newVLRNumber,
                newLmsi);
    }

    @Override
    public Long addCancelLocationRequest(
            int customInvokeTimeout, IMSI imsi, IMSIWithLMSI imsiWithLmsi,
            CancellationType cancellationType, MAPExtensionContainer extensionContainer, TypeOfUpdate typeOfUpdate,
            boolean mtrfSupportedAndAuthorized, boolean mtrfSupportedAndNotAuthorized, ISDNAddressString newMSCNumber,
            ISDNAddressString newVLRNumber, LMSI newLmsi)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationCancellationContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for CancelLocationRequest: must be locationCancellationContext_V1, " +
                            "V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.cancelLocation);
        invoke.setOperationCode(oc);

        CancelLocationRequestImpl req = new CancelLocationRequestImpl(imsi, imsiWithLmsi, cancellationType,
                extensionContainer,
                typeOfUpdate, mtrfSupportedAndAuthorized, mtrfSupportedAndNotAuthorized, newMSCNumber, newVLRNumber,
                newLmsi,
                this.appCntx.getApplicationContextVersion().getVersion());

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

    @Override
    public void addCancelLocationResponse(long invokeId, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationCancellationContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version1
                && this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for CancelLocationResponse: must be locationCancellationContext_V1," +
                            " V2 or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.cancelLocation);
        resultLast.setOperationCode(oc);

        if (extensionContainer != null)
        {
            CancelLocationResponseImpl req = new CancelLocationResponseImpl(extensionContainer);

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

    @Override
    public Long addSendIdentificationRequest(
            TMSI tmsi, Integer numberOfRequestedVectors, boolean segmentationProhibited,
            MAPExtensionContainer extensionContainer, ISDNAddressString mscNumber, LAIFixedLength previousLAI,
            Integer hopCounter, boolean mtRoamingForwardingSupported, ISDNAddressString newVLRNumber, LMSI lmsi)
            throws
            MAPException
    {
        return this.addSendIdentificationRequest(_Timer_Default, tmsi, numberOfRequestedVectors, segmentationProhibited,
                extensionContainer, mscNumber, previousLAI, hopCounter, mtRoamingForwardingSupported, newVLRNumber,
                lmsi);
    }

    @Override
    public Long addSendIdentificationRequest(
            int customInvokeTimeout, TMSI tmsi, Integer numberOfRequestedVectors,
            boolean segmentationProhibited, MAPExtensionContainer extensionContainer, ISDNAddressString mscNumber,
            LAIFixedLength previousLAI, Integer hopCounter, boolean mtRoamingForwardingSupported,
            ISDNAddressString newVLRNumber, LMSI lmsi)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.interVlrInfoRetrievalContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for SendIdentificationRequest: must be " +
                            "interVlrInfoRetrievalContext_V2 or V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_s);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendIdentification);
        invoke.setOperationCode(oc);

        SendIdentificationRequestImpl req = new SendIdentificationRequestImpl(tmsi, numberOfRequestedVectors,
                segmentationProhibited, extensionContainer, mscNumber, previousLAI, hopCounter,
                mtRoamingForwardingSupported,
                newVLRNumber, lmsi, this.appCntx.getApplicationContextVersion().getVersion());

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

    @Override
    public void addSendIdentificationResponse(
            long invokeId, IMSI imsi, AuthenticationSetList authenticationSetList,
            CurrentSecurityContext currentSecurityContext, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.interVlrInfoRetrievalContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2 && this.appCntx
                .getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for CancelLocationResponse: must be interVlrInfoRetrievalContext_V2" +
                            " or V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendIdentification);
        resultLast.setOperationCode(oc);

        SendIdentificationResponseImpl req = new SendIdentificationResponseImpl(imsi, authenticationSetList,
                currentSecurityContext, extensionContainer, this.appCntx.getApplicationContextVersion().getVersion());

        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);
    }

    @Override
    public Long addUpdateGprsLocationRequest(
            int customInvokeTimeout,
            IMSI imsi,
            ISDNAddressString sgsnNumber,
            GSNAddress sgsnAddress,
            MAPExtensionContainer extensionContainer,
            SGSNCapability sgsnCapability,
            boolean informPreviousNetworkEntity,
            boolean psLCSNotSupportedByUE,
            GSNAddress vGmlcAddress,
            ADDInfo addInfo,
            EPSInfo epsInfo,
            boolean servingNodeTypeIndicator,
            boolean skipSubscriberDataUpdate,
            UsedRATType usedRATType,
            boolean gprsSubscriptionDataNotNeeded,
            boolean nodeTypeIndicator,
            boolean areaRestricted,
            boolean ueReachableIndicator,
            boolean epsSubscriptionDataNotNeeded,
            UESRVCCCapability uesrvccCapability)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.gprsLocationUpdateContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for UpdateGprsLocationRequest: must be gprsLocationUpdateContext_V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.updateGprsLocation);
        invoke.setOperationCode(oc);

        UpdateGprsLocationRequestImpl req = new UpdateGprsLocationRequestImpl(imsi, sgsnNumber, sgsnAddress,
                extensionContainer, sgsnCapability, informPreviousNetworkEntity, psLCSNotSupportedByUE, vGmlcAddress,
                addInfo,
                epsInfo, servingNodeTypeIndicator, skipSubscriberDataUpdate, usedRATType, gprsSubscriptionDataNotNeeded,
                nodeTypeIndicator, areaRestricted, ueReachableIndicator, epsSubscriptionDataNotNeeded,
                uesrvccCapability,
                this.appCntx.getApplicationContextVersion().getVersion());

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

    @Override
    public Long addUpdateGprsLocationRequest(
            IMSI imsi,
            ISDNAddressString sgsnNumber,
            GSNAddress sgsnAddress,
            MAPExtensionContainer extensionContainer,
            SGSNCapability sgsnCapability,
            boolean informPreviousNetworkEntity,
            boolean psLCSNotSupportedByUE,
            GSNAddress vGmlcAddress,
            ADDInfo addInfo,
            EPSInfo epsInfo,
            boolean servingNodeTypeIndicator,
            boolean skipSubscriberDataUpdate,
            UsedRATType usedRATType,
            boolean gprsSubscriptionDataNotNeeded,
            boolean nodeTypeIndicator,
            boolean areaRestricted,
            boolean ueReachableIndicator,
            boolean epsSubscriptionDataNotNeeded,
            UESRVCCCapability uesrvccCapability)
            throws
            MAPException
    {
        return addUpdateGprsLocationRequest(_Timer_Default, imsi, sgsnNumber, sgsnAddress, extensionContainer,
                sgsnCapability,
                informPreviousNetworkEntity, psLCSNotSupportedByUE, vGmlcAddress, addInfo, epsInfo,
                servingNodeTypeIndicator,
                skipSubscriberDataUpdate, usedRATType, gprsSubscriptionDataNotNeeded, nodeTypeIndicator, areaRestricted,
                ueReachableIndicator, epsSubscriptionDataNotNeeded, uesrvccCapability);
    }

    @Override
    public void addUpdateGprsLocationResponse(
            long invokeId, ISDNAddressString hlrNumber,
            MAPExtensionContainer extensionContainer, boolean addCapability, boolean sgsnMmeSeparationSupported)
            throws
            MAPException
    {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.gprsLocationUpdateContext)
                || (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3))
            throw new MAPException(
                    "Bad application context name for UpdateGprsLocationResponse: must be " +
                            "gprsLocationUpdateContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.updateGprsLocation);
        resultLast.setOperationCode(oc);

        UpdateGprsLocationResponseImpl req = new UpdateGprsLocationResponseImpl(hlrNumber, extensionContainer,
                addCapability,
                sgsnMmeSeparationSupported);

        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);

    }

    @Override
    public Long addPurgeMSRequest(
            int customInvokeTimeout, IMSI imsi, ISDNAddressString vlrNumber,
            ISDNAddressString sgsnNumber, MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.msPurgingContext)
                || ((this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
                && (this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2)))
            throw new MAPException(
                    "Bad application context name for PurgeMSRequest: must be msPurgingContext_V2 or " +
                            "msPurgingContext_V3");

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_m);
        else
            invoke.setTimeout(customInvokeTimeout);

        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.purgeMS);
        invoke.setOperationCode(oc);

        PurgeMSRequestImpl req = new PurgeMSRequestImpl(imsi, vlrNumber, sgsnNumber, extensionContainer, this.appCntx
                .getApplicationContextVersion().getVersion());

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

    @Override
    public Long addPurgeMSRequest(
            IMSI imsi, ISDNAddressString vlrNumber, ISDNAddressString sgsnNumber,
            MAPExtensionContainer extensionContainer)
            throws
            MAPException
    {
        return addPurgeMSRequest(_Timer_Default, imsi, vlrNumber, sgsnNumber, extensionContainer);
    }

    @Override
    public void addPurgeMSResponse(
            long invokeId, boolean freezeTMSI, boolean freezePTMSI,
            MAPExtensionContainer extensionContainer, boolean freezeMTMSI)
            throws
            MAPException
    {
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.msPurgingContext)
                || ((this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3) && (this
                .appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version2)))
            throw new MAPException("Bad application context name for PurgeMSResponse: must be msPurgingContext_V3 OR " +
                    " msPurgingContext_V2");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.purgeMS);
        resultLast.setOperationCode(oc);

        PurgeMSResponseImpl resp = new PurgeMSResponseImpl(freezeTMSI, freezePTMSI, extensionContainer, freezeMTMSI);

        if (this.appCntx.getApplicationContextVersion().getVersion() >= 3 && (freezeTMSI || freezePTMSI ||
                extensionContainer != null || freezeMTMSI))
        {
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

}
