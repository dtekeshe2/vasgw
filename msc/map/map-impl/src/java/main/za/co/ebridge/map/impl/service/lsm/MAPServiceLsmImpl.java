package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.impl.MAPServiceBaseImpl;
import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.MAPServiceListener;
import za.co.ebridge.map.api.dialog.ServingCheckData;
import za.co.ebridge.map.api.dialog.ServingCheckResult;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.lsm.MAPDialogLsm;
import za.co.ebridge.map.api.service.lsm.MAPServiceLsm;
import za.co.ebridge.map.api.service.lsm.MAPServiceLsmListener;
import za.co.ebridge.map.impl.dialog.ServingCheckDataImpl;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.TcapFactory;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;

public class MAPServiceLsmImpl extends MAPServiceBaseImpl implements MAPServiceLsm {

    /**
     * @param mapProviderImpl
     */
    public MAPServiceLsmImpl(MAPProviderImpl mapProviderImpl) {
        super(mapProviderImpl);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPServiceLsm#createNewDialog
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPApplicationContext, org.mobicents.protocols.protocols.ss7.cap.api.sccp.parameter.SccpAddress,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString, org.mobicents.protocols.protocols.ss7.cap.api.sccp.parameter.SccpAddress,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.AddressString)
     */
    public MAPDialogLsm createNewDialog(MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn) throws MAPException {
        return this.createNewDialog(appCntx, origAddress, origReference, destAddress, destReference, ssn, null);
    }

    public MAPDialogLsm createNewDialog(MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn, Long localTrId) throws MAPException {
        // We cannot create a dialog if the service is not activated
        if (!this.isActivated())
            throw new MAPException("Cannot create MAPDialogLsm because MAPServiceLsm is not activated");

        Dialog tcapDialog = this.createNewTCAPDialog(origAddress, destAddress, ssn, localTrId);

        MAPDialogLsmImpl dialog = new MAPDialogLsmImpl(appCntx, tcapDialog, this.mapProviderImpl, this, origReference,
                destReference);

        this.putMAPDialogIntoCollection(dialog);

        return dialog;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPServiceLsm# addMAPServiceListener
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPServiceLsmListener)
     */
    public void addMAPServiceListener(MAPServiceLsmListener mapServiceListener) {
        super.addMAPServiceListener(mapServiceListener);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPServiceLsm# removeMAPServiceListener
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.MAPServiceLsmListener)
     */
    public void removeMAPServiceListener(MAPServiceLsmListener mapServiceListener) {
        super.removeMAPServiceListener(mapServiceListener);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.MAPServiceBaseImpl#createNewDialogIncoming
     * (org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPApplicationContext, org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.Dialog)
     */
    @Override
    protected MAPDialogImpl createNewDialogIncoming(MAPApplicationContext appCntx, Dialog tcapDialog) {
        return new MAPDialogLsmImpl(appCntx, tcapDialog, this.mapProviderImpl, this, null, null);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPServiceBase#isServingService(org
     * .mobicents.protocols.protocols.ss7.cap.api.map.api.MAPApplicationContext)
     */
    public ServingCheckData isServingService(MAPApplicationContext dialogApplicationContext) {

        int vers = dialogApplicationContext.getApplicationContextVersion().getVersion();

        switch (dialogApplicationContext.getApplicationContextName()) {
            case locationSvcEnquiryContext:
            case locationSvcGatewayContext:
                if (vers == 3) {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_Serving);
                } else if (vers > 3) {
                    long[] altOid = dialogApplicationContext.getOID();
                    altOid[7] = 3;
                    ApplicationContextName alt = TcapFactory.createApplicationContextName(altOid);
                    return new ServingCheckDataImpl(ServingCheckResult.AC_VersionIncorrect, alt);
                } else {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_VersionIncorrect);
                }
        }

        return new ServingCheckDataImpl(ServingCheckResult.AC_NotServing);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPServiceBase#processComponent(org
     * .mobicents.protocols.protocols.ss7.cap.api.tcap.asn.comp.ComponentType, org.mobicents.protocols.protocols.ss7.cap.api.tcap.asn.comp.OperationCode,
     * org.mobicents.protocols.protocols.ss7.cap.api.tcap.asn.comp.Parameter, org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPDialog, java.lang.Long,
     * java.lang.Long)
     */
    @Override
    public void processComponent(ComponentType compType, OperationCode oc, Parameter parameter, MAPDialog mapDialog,
            Long invokeId, Long linkedId, Invoke linkedInvoke) throws MAPParsingComponentException {

        // if an application-context-name different from version 1 is
        // received in a syntactically correct TC-
        // BEGIN indication primitive but is not acceptable from a load
        // control point of view, the MAP PM
        // shall ignore this dialogue request. The MAP-user is not informed.
        if (compType == ComponentType.Invoke && this.mapProviderImpl.isCongested()) {
            // we reject all lms services when congestion
            return;
        }

        MAPDialogLsmImpl mAPDialogLsmImpl = (MAPDialogLsmImpl) mapDialog;

        Long ocValue = oc.getLocalOperationCode();
        if (ocValue == null)
            new MAPParsingComponentException("", MAPParsingComponentExceptionReason.UnrecognizedOperation);

        long ocValueInt = ocValue;
        int ocValueInt2 = (int) ocValueInt;
        switch (ocValueInt2) {
            case MAPOperationCode.provideSubscriberLocation:
                if (compType == ComponentType.Invoke) {
                    this.provideSubscriberLocationReq(parameter, mAPDialogLsmImpl, invokeId);
                } else {
                    this.provideSubscriberLocationRes(parameter, mAPDialogLsmImpl, invokeId);
                }
                break;
            case MAPOperationCode.subscriberLocationReport:
                if (compType == ComponentType.Invoke) {
                    this.subscriberLocationReportReq(parameter, mAPDialogLsmImpl, invokeId);
                } else {
                    this.subscriberLocationReportRes(parameter, mAPDialogLsmImpl, invokeId);
                }
                break;
            case MAPOperationCode.sendRoutingInfoForLCS:
                if (compType == ComponentType.Invoke) {
                    this.sendRoutingInfoForLCSReq(parameter, mAPDialogLsmImpl, invokeId);
                } else {
                    this.sendRoutingInfoForLCSRes(parameter, mAPDialogLsmImpl, invokeId);
                }
                break;
            default:
                throw new MAPParsingComponentException("", MAPParsingComponentExceptionReason.UnrecognizedOperation);
        }
    }

    private void provideSubscriberLocationReq(Parameter param, MAPDialogLsmImpl mapDialogImpl, Long invokeId)
            throws MAPParsingComponentException {
        if (param == null) {
            throw new MAPParsingComponentException(
                    "Error while decoding provideSubscriberLocationRes: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (param.getTag() != Tag.SEQUENCE || param.getTagClass() != Tag.CLASS_UNIVERSAL || param.isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding provideSubscriberLocationReq: Bad tag or tagClass or parameter is primitive, received tag="
                            + param.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = param.getData();
        AsnInputStream ais = new AsnInputStream(buf);
        ProvideSubscriberLocationRequestImpl ind = new ProvideSubscriberLocationRequestImpl();
        ind.decodeData(ais, buf.length);

        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners) {
            serLis.onMAPMessage(ind);
            ((MAPServiceLsmListener) serLis).onProvideSubscriberLocationRequest(ind);
        }

    }

    private void provideSubscriberLocationRes(Parameter param, MAPDialogLsmImpl mapDialogImpl, Long invokeId)
            throws MAPParsingComponentException {
        if (param == null) {
            throw new MAPParsingComponentException(
                    "Error while decoding provideSubscriberLocationRes: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (param.getTag() != Tag.SEQUENCE || param.getTagClass() != Tag.CLASS_UNIVERSAL || param.isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding provideSubscriberLocationRes: Bad tag or tagClass or parameter is primitive, received tag="
                            + param.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = param.getData();
        AsnInputStream ais = new AsnInputStream(buf);
        ProvideSubscriberLocationResponseImpl provideSubsLoctResInd = new ProvideSubscriberLocationResponseImpl();
        provideSubsLoctResInd.decodeData(ais, buf.length);

        provideSubsLoctResInd.setInvokeId(invokeId);
        provideSubsLoctResInd.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners) {
            serLis.onMAPMessage(provideSubsLoctResInd);
            ((MAPServiceLsmListener) serLis).onProvideSubscriberLocationResponse(provideSubsLoctResInd);
        }

    }

    private void subscriberLocationReportReq(Parameter parameter, MAPDialogLsmImpl mapDialogImpl, Long invokeId)
            throws MAPParsingComponentException {
        if (parameter == null) {
            throw new MAPParsingComponentException(
                    "Error while decoding subscriberLocationReport: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter.isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding subscriberLocationReportReq: Bad tag or tagClass or parameter is primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);
        SubscriberLocationReportRequestImpl ind = new SubscriberLocationReportRequestImpl();
        ind.decodeData(ais, buf.length);

        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners) {
            serLis.onMAPMessage(ind);
            ((MAPServiceLsmListener) serLis).onSubscriberLocationReportRequest(ind);
        }
    }

    private void subscriberLocationReportRes(Parameter parameter, MAPDialogLsmImpl mapDialogImpl, Long invokeId)
            throws MAPParsingComponentException {
        if (parameter == null) {
            throw new MAPParsingComponentException(
                    "Error while decoding subscriberLocationReport: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter.isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding subscriberLocationReportRes: Bad tag or tagClass or parameter is primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);
        SubscriberLocationReportResponseImpl resInd = new SubscriberLocationReportResponseImpl();
        resInd.decodeData(ais, buf.length);

        resInd.setInvokeId(invokeId);
        resInd.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners) {
            serLis.onMAPMessage(resInd);
            ((MAPServiceLsmListener) serLis).onSubscriberLocationReportResponse(resInd);
        }
    }

    private void sendRoutingInfoForLCSReq(Parameter parameter, MAPDialogLsmImpl mapDialogImpl, Long invokeId)
            throws MAPParsingComponentException {
        if (parameter == null) {
            throw new MAPParsingComponentException(
                    "Error while decoding sendRoutingInfoForLCS: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter.isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding sendRoutingInfoForLCSReq: Bad tag or tagClass or parameter is primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);
        SendRoutingInfoForLCSRequestImpl ind = new SendRoutingInfoForLCSRequestImpl();
        ind.decodeData(ais, buf.length);

        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners) {
            serLis.onMAPMessage(ind);
            ((MAPServiceLsmListener) serLis).onSendRoutingInfoForLCSRequest(ind);
        }
    }

    private void sendRoutingInfoForLCSRes(Parameter parameter, MAPDialogLsmImpl mapDialogImpl, Long invokeId)
            throws MAPParsingComponentException {
        if (parameter == null) {
            throw new MAPParsingComponentException(
                    "Error while decoding sendRoutingInfoForLCS: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter.isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding sendRoutingInfoForLCSRes: Bad tag or tagClass or parameter is primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);
        SendRoutingInfoForLCSResponseImpl resInd = new SendRoutingInfoForLCSResponseImpl();
        resInd.decodeData(ais, buf.length);

        resInd.setInvokeId(invokeId);
        resInd.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners) {
            serLis.onMAPMessage(resInd);
            ((MAPServiceLsmListener) serLis).onSendRoutingInfoForLCSResponse(resInd);
        }
    }

}
