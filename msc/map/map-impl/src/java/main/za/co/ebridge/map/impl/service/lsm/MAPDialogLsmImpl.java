/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

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
import za.co.ebridge.map.api.primitives.CellGlobalIdOrServiceAreaIdOrLAI;
import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.IMEI;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.SubscriberIdentity;
import za.co.ebridge.map.api.service.lsm.AccuracyFulfilmentIndicator;
import za.co.ebridge.map.api.service.lsm.AddGeographicalInformation;
import za.co.ebridge.map.api.service.lsm.AreaEventInfo;
import za.co.ebridge.map.api.service.lsm.DeferredmtlrData;
import za.co.ebridge.map.api.service.lsm.ExtGeographicalInformation;
import za.co.ebridge.map.api.service.lsm.GeranGANSSpositioningData;
import za.co.ebridge.map.api.service.lsm.LCSClientID;
import za.co.ebridge.map.api.service.lsm.LCSCodeword;
import za.co.ebridge.map.api.service.lsm.LCSEvent;
import za.co.ebridge.map.api.service.lsm.LCSLocationInfo;
import za.co.ebridge.map.api.service.lsm.LCSPriority;
import za.co.ebridge.map.api.service.lsm.LCSPrivacyCheck;
import za.co.ebridge.map.api.service.lsm.LCSQoS;
import za.co.ebridge.map.api.service.lsm.LocationType;
import za.co.ebridge.map.api.service.lsm.MAPDialogLsm;
import za.co.ebridge.map.api.service.lsm.PeriodicLDRInfo;
import za.co.ebridge.map.api.service.lsm.PositioningDataInformation;
import za.co.ebridge.map.api.service.lsm.ReportingPLMNList;
import za.co.ebridge.map.api.service.lsm.SLRArgExtensionContainer;
import za.co.ebridge.map.api.service.lsm.ServingNodeAddress;
import za.co.ebridge.map.api.service.lsm.SupportedGADShapes;
import za.co.ebridge.map.api.service.lsm.UtranGANSSpositioningData;
import za.co.ebridge.map.api.service.lsm.UtranPositioningDataInfo;
import za.co.ebridge.map.api.service.lsm.VelocityEstimate;
import za.co.ebridge.tcap.api.api.TCAPException;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;

/**
 * @author amit bhayani
 *
 */
public class MAPDialogLsmImpl extends MAPDialogImpl implements MAPDialogLsm {

    /**
     * @param appCntx
     * @param tcapDialog
     * @param mapProviderImpl
     * @param mapService
     * @param origReference
     * @param destReference
     */
    protected MAPDialogLsmImpl(MAPApplicationContext appCntx, Dialog tcapDialog, MAPProviderImpl mapProviderImpl,
            MAPServiceBase mapService, AddressString origReference, AddressString destReference) {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPDialogLsm# addProvideSubscriberLocationRequest
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LocationType,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.ISDNAddressString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSClientID, java.lang.Boolean,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.IMSI, org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.ISDNAddressString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.LMSI, org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.IMEI,
     * java.lang.Integer, org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSQoS,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPExtensionContainer, java.util.BitSet, java.lang.Byte,
     * java.lang.Integer, org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSCodeword,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSPrivacyCheck,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.AreaEventInfo, byte[])
     */
    public Long addProvideSubscriberLocationRequest(LocationType locationType, ISDNAddressString mlcNumber,
            LCSClientID lcsClientID, boolean privacyOverride, IMSI imsi, ISDNAddressString msisdn, LMSI lmsi, IMEI imei,
            LCSPriority lcsPriority, LCSQoS lcsQoS, MAPExtensionContainer extensionContainer,
            SupportedGADShapes supportedGADShapes, Integer lcsReferenceNumber, Integer lcsServiceTypeID,
            LCSCodeword lcsCodeword, LCSPrivacyCheck lcsPrivacyCheck, AreaEventInfo areaEventInfo, GSNAddress hgmlcAddress,
            boolean moLrShortCircuitIndicator, PeriodicLDRInfo periodicLDRInfo, ReportingPLMNList reportingPLMNList)
            throws MAPException {
        return this.addProvideSubscriberLocationRequest(_Timer_Default, locationType, mlcNumber, lcsClientID, privacyOverride,
                imsi, msisdn, lmsi, imei, lcsPriority, lcsQoS, extensionContainer, supportedGADShapes, lcsReferenceNumber,
                lcsServiceTypeID, lcsCodeword, lcsPrivacyCheck, areaEventInfo, hgmlcAddress, moLrShortCircuitIndicator,
                periodicLDRInfo, reportingPLMNList);
    }

    public Long addProvideSubscriberLocationRequest(int customInvokeTimeout, LocationType locationType,
            ISDNAddressString mlcNumber, LCSClientID lcsClientID, boolean privacyOverride, IMSI imsi, ISDNAddressString msisdn,
            LMSI lmsi, IMEI imei, LCSPriority lcsPriority, LCSQoS lcsQoS, MAPExtensionContainer extensionContainer,
            SupportedGADShapes supportedGADShapes, Integer lcsReferenceNumber, Integer lcsServiceTypeID,
            LCSCodeword lcsCodeword, LCSPrivacyCheck lcsPrivacyCheck, AreaEventInfo areaEventInfo, GSNAddress hgmlcAddress,
            boolean moLrShortCircuitIndicator, PeriodicLDRInfo periodicLDRInfo, ReportingPLMNList reportingPLMNList)
            throws MAPException {

        if (locationType == null || mlcNumber == null) {
            throw new MAPException(
                    "addProvideSubscriberLocationRequest: Mandatroy parameters locationType or mlcNumber cannot be null");
        }

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationSvcEnquiryContext)
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "addProvideSubscriberLocationRequest: Bad application context name for addProvideSubscriberLocationRequest: must be locationSvcEnquiryContext_V3");

        try {
            Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
            if (customInvokeTimeout == _Timer_Default)
                invoke.setTimeout(_Timer_ml);
            else
                invoke.setTimeout(customInvokeTimeout);

            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.provideSubscriberLocation);
            invoke.setOperationCode(oc);

            ProvideSubscriberLocationRequestImpl req = new ProvideSubscriberLocationRequestImpl(locationType, mlcNumber,
                    lcsClientID, privacyOverride, imsi, msisdn, lmsi, imei, lcsPriority, lcsQoS, extensionContainer,
                    supportedGADShapes, lcsReferenceNumber, lcsServiceTypeID, lcsCodeword, lcsPrivacyCheck, areaEventInfo,
                    hgmlcAddress, moLrShortCircuitIndicator, periodicLDRInfo, reportingPLMNList);

            AsnOutputStream asnOs = new AsnOutputStream();
            req.encodeData(asnOs);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(asnOs.toByteArray());

            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPDialogLsm# addProvideSubscriberLocationResponse(long, byte[],
     * byte[], byte[], java.lang.Integer, byte[], org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPExtensionContainer,
     * java.lang.Boolean, org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm. CellGlobalIdOrServiceAreaIdOrLAI, java.lang.Boolean,
     * org.mobicents.protocols .protocols.ss7.cap.api.map.api.service.lsm.AccuracyFulfilmentIndicator)
     */
    public void addProvideSubscriberLocationResponse(long invokeId, ExtGeographicalInformation locationEstimate,
            PositioningDataInformation geranPositioningData, UtranPositioningDataInfo utranPositioningData,
            Integer ageOfLocationEstimate, AddGeographicalInformation additionalLocationEstimate,
            MAPExtensionContainer extensionContainer, boolean deferredMTLRResponseIndicator,
            CellGlobalIdOrServiceAreaIdOrLAI cellGlobalIdOrServiceAreaIdOrLAI, boolean saiPresent,
            AccuracyFulfilmentIndicator accuracyFulfilmentIndicator, VelocityEstimate velocityEstimate,
            boolean moLrShortCircuitIndicator, GeranGANSSpositioningData geranGANSSpositioningData,
            UtranGANSSpositioningData utranGANSSpositioningData, ServingNodeAddress targetServingNodeForHandover)
            throws MAPException {

        if (locationEstimate == null) {
            throw new MAPException("addProvideSubscriberLocationResponse: Mandatroy parameters locationEstimate cannot be null");
        }

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationSvcEnquiryContext)
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addProvideSubscriberLocationResponse: must be locationSvcEnquiryContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.provideSubscriberLocation);
        resultLast.setOperationCode(oc);

        ProvideSubscriberLocationResponseImpl resInd = new ProvideSubscriberLocationResponseImpl(locationEstimate,
                geranPositioningData, utranPositioningData, ageOfLocationEstimate, additionalLocationEstimate,
                extensionContainer, deferredMTLRResponseIndicator, cellGlobalIdOrServiceAreaIdOrLAI, saiPresent,
                accuracyFulfilmentIndicator, velocityEstimate, moLrShortCircuitIndicator, geranGANSSpositioningData,
                utranGANSSpositioningData, targetServingNodeForHandover);

        AsnOutputStream asnOs = new AsnOutputStream();
        resInd.encodeData(asnOs);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(resInd.getTagClass());
        p.setPrimitive(resInd.getIsPrimitive());
        p.setTag(resInd.getTag());
        p.setData(asnOs.toByteArray());

        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPDialogLsm# addSubscriberLocationReportRequestIndication
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSEvent, org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSClientID,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSLocationInfo, org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.IMSI,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString, org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString, java.lang.String, java.lang.String, java.lang.String,
     * java.lang.String, int, java.lang.String, org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.DeferredmtlrData,
     * java.lang.String, org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm. CellGlobalIdOrServiceAreaIdOrLAI, java.lang.String,
     * int, boolean, org.mobicents .protocols.protocols.ss7.cap.api.map.api.service.lsm.AccuracyFulfilmentIndicator)
     */
    public Long addSubscriberLocationReportRequest(LCSEvent lcsEvent, LCSClientID lcsClientID, LCSLocationInfo lcsLocationInfo,
            ISDNAddressString msisdn, IMSI imsi, IMEI imei, ISDNAddressString naEsrd, ISDNAddressString naEsrk,
            ExtGeographicalInformation locationEstimate, Integer ageOfLocationEstimate,
            SLRArgExtensionContainer slrArgExtensionContainer, AddGeographicalInformation addLocationEstimate,
            DeferredmtlrData deferredmtlrData, Integer lcsReferenceNumber, PositioningDataInformation geranPositioningData,
            UtranPositioningDataInfo utranPositioningData, CellGlobalIdOrServiceAreaIdOrLAI cellIdOrSai,
            GSNAddress hgmlcAddress, Integer lcsServiceTypeID, boolean saiPresent, boolean pseudonymIndicator,
            AccuracyFulfilmentIndicator accuracyFulfilmentIndicator, VelocityEstimate velocityEstimate, Integer sequenceNumber,
            PeriodicLDRInfo periodicLDRInfo, boolean moLrShortCircuitIndicator,
            GeranGANSSpositioningData geranGANSSpositioningData, UtranGANSSpositioningData utranGANSSpositioningData,
            ServingNodeAddress targetServingNodeForHandover) throws MAPException {
        return this.addSubscriberLocationReportRequest(_Timer_Default, lcsEvent, lcsClientID, lcsLocationInfo, msisdn, imsi,
                imei, naEsrd, naEsrk, locationEstimate, ageOfLocationEstimate, slrArgExtensionContainer, addLocationEstimate,
                deferredmtlrData, lcsReferenceNumber, geranPositioningData, utranPositioningData, cellIdOrSai, hgmlcAddress,
                lcsServiceTypeID, saiPresent, pseudonymIndicator, accuracyFulfilmentIndicator, velocityEstimate,
                sequenceNumber, periodicLDRInfo, moLrShortCircuitIndicator, geranGANSSpositioningData,
                utranGANSSpositioningData, targetServingNodeForHandover);
    }

    public Long addSubscriberLocationReportRequest(int customInvokeTimeout, LCSEvent lcsEvent, LCSClientID lcsClientID,
            LCSLocationInfo lcsLocationInfo, ISDNAddressString msisdn, IMSI imsi, IMEI imei, ISDNAddressString naEsrd,
            ISDNAddressString naEsrk, ExtGeographicalInformation locationEstimate, Integer ageOfLocationEstimate,
            SLRArgExtensionContainer slrArgExtensionContainer, AddGeographicalInformation addLocationEstimate,
            DeferredmtlrData deferredmtlrData, Integer lcsReferenceNumber, PositioningDataInformation geranPositioningData,
            UtranPositioningDataInfo utranPositioningData, CellGlobalIdOrServiceAreaIdOrLAI cellIdOrSai,
            GSNAddress hgmlcAddress, Integer lcsServiceTypeID, boolean saiPresent, boolean pseudonymIndicator,
            AccuracyFulfilmentIndicator accuracyFulfilmentIndicator, VelocityEstimate velocityEstimate, Integer sequenceNumber,
            PeriodicLDRInfo periodicLDRInfo, boolean moLrShortCircuitIndicator,
            GeranGANSSpositioningData geranGANSSpositioningData, UtranGANSSpositioningData utranGANSSpositioningData,
            ServingNodeAddress targetServingNodeForHandover) throws MAPException {

        if (lcsEvent == null || lcsClientID == null || lcsLocationInfo == null) {
            throw new MAPException("Mandatroy parameters lCSEvent, lCSClientID or lCSLocationInfo cannot be null");
        }
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationSvcEnquiryContext)
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addSubscriberLocationReportRequest: must be locationSvcEnquiryContext_V3");

        try {
            Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
            if (customInvokeTimeout == _Timer_Default)
                invoke.setTimeout(_Timer_m);
            else
                invoke.setTimeout(customInvokeTimeout);

            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.subscriberLocationReport);
            invoke.setOperationCode(oc);

            SubscriberLocationReportRequestImpl req = new SubscriberLocationReportRequestImpl(lcsEvent, lcsClientID,
                    lcsLocationInfo, msisdn, imsi, imei, naEsrd, naEsrk, locationEstimate, ageOfLocationEstimate,
                    slrArgExtensionContainer, addLocationEstimate, deferredmtlrData, lcsReferenceNumber, geranPositioningData,
                    utranPositioningData, cellIdOrSai, hgmlcAddress, lcsServiceTypeID, saiPresent, pseudonymIndicator,
                    accuracyFulfilmentIndicator, velocityEstimate, sequenceNumber, periodicLDRInfo, moLrShortCircuitIndicator,
                    geranGANSSpositioningData, utranGANSSpositioningData, targetServingNodeForHandover);

            AsnOutputStream asnOs = new AsnOutputStream();
            req.encodeData(asnOs);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(asnOs.toByteArray());

            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPDialogLsm# addSubscriberLocationReportResponseIndication(long,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.MAPExtensionContainer,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString, org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString)
     */
    public void addSubscriberLocationReportResponse(long invokeId, ISDNAddressString naEsrd, ISDNAddressString naEsrk,
            MAPExtensionContainer extensionContainer) throws MAPException {

        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationSvcEnquiryContext)
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addSubscriberLocationReportResponse: must be locationSvcEnquiryContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.subscriberLocationReport);
        resultLast.setOperationCode(oc);

        SubscriberLocationReportResponseImpl resInd = new SubscriberLocationReportResponseImpl(naEsrd, naEsrk,
                extensionContainer);

        AsnOutputStream asnOs = new AsnOutputStream();
        resInd.encodeData(asnOs);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(resInd.getTagClass());
        p.setPrimitive(resInd.getIsPrimitive());
        p.setTag(resInd.getTag());
        p.setData(asnOs.toByteArray());

        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPDialogLsm# addSendRoutingInforForLCSRequestIndication
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.ISDNAddressString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.SubscriberIdentity,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPExtensionContainer)
     */
    public Long addSendRoutingInfoForLCSRequest(ISDNAddressString mlcNumber, SubscriberIdentity targetMS,
            MAPExtensionContainer extensionContainer) throws MAPException {
        return this.addSendRoutingInfoForLCSRequest(_Timer_Default, mlcNumber, targetMS, extensionContainer);
    }

    public Long addSendRoutingInfoForLCSRequest(int customInvokeTimeout, ISDNAddressString mlcNumber,
            SubscriberIdentity targetMS, MAPExtensionContainer extensionContainer) throws MAPException {

        if (mlcNumber == null || targetMS == null) {
            throw new MAPException("Mandatroy parameters mlcNumber or targetMS cannot be null");
        }
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationSvcGatewayContext)
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addSendRoutingInfoForLCSRequest: must be locationSvcGatewayContext_V3");

        try {
            Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
            if (customInvokeTimeout == _Timer_Default)
                invoke.setTimeout(_Timer_m);
            else
                invoke.setTimeout(customInvokeTimeout);

            // Operation Code
            OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
            oc.setLocalOperationCode((long) MAPOperationCode.sendRoutingInfoForLCS);
            invoke.setOperationCode(oc);

            SendRoutingInfoForLCSRequestImpl req = new SendRoutingInfoForLCSRequestImpl(mlcNumber, targetMS, extensionContainer);

            AsnOutputStream asnOs = new AsnOutputStream();
            req.encodeData(asnOs);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(asnOs.toByteArray());

            invoke.setParameter(p);

            Long invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);

            this.sendInvokeComponent(invoke);

            return invokeId;
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPDialogLsm# addSendRoutingInforForLCSResponseIndication
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.SubscriberIdentity,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSLocationInfo,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPExtensionContainer, byte[], byte[], byte[], byte[])
     */
    public void addSendRoutingInfoForLCSResponse(long invokeId, SubscriberIdentity targetMS, LCSLocationInfo lcsLocationInfo,
            MAPExtensionContainer extensionContainer, GSNAddress vgmlcAddress, GSNAddress hGmlcAddress, GSNAddress pprAddress,
            GSNAddress additionalVGmlcAddress) throws MAPException {

        if (targetMS == null || lcsLocationInfo == null) {
            throw new MAPException("Mandatroy parameters targetMS or lcsLocationInfo cannot be null");
        }
        if ((this.appCntx.getApplicationContextName() != MAPApplicationContextName.locationSvcGatewayContext)
                || this.appCntx.getApplicationContextVersion() != MAPApplicationContextVersion.version3)
            throw new MAPException(
                    "Bad application context name for addSendRoutingInfoForLCSResponse: must be locationSvcGatewayContext_V3");

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();
        resultLast.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.sendRoutingInfoForLCS);
        resultLast.setOperationCode(oc);

        SendRoutingInfoForLCSResponseImpl resInd = new SendRoutingInfoForLCSResponseImpl(targetMS, lcsLocationInfo,
                extensionContainer, vgmlcAddress, hGmlcAddress, pprAddress, additionalVGmlcAddress);

        AsnOutputStream asnOs = new AsnOutputStream();
        resInd.encodeData(asnOs);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(resInd.getTagClass());
        p.setPrimitive(resInd.getIsPrimitive());
        p.setTag(resInd.getTag());
        p.setData(asnOs.toByteArray());

        resultLast.setParameter(p);

        this.sendReturnResultLastComponent(resultLast);

    }
}
