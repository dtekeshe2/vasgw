package za.co.ebridge.map.impl.service.callhandling;

import org.apache.log4j.Logger;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.impl.MAPServiceBaseImpl;
import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPApplicationContextName;
import za.co.ebridge.map.api.MAPApplicationContextVersion;
import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.MAPServiceListener;
import za.co.ebridge.map.api.dialog.ServingCheckData;
import za.co.ebridge.map.api.dialog.ServingCheckResult;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.callhandling.MAPDialogCallHandling;
import za.co.ebridge.map.api.service.callhandling.MAPServiceCallHandling;
import za.co.ebridge.map.api.service.callhandling.MAPServiceCallHandlingListener;
import za.co.ebridge.map.impl.dialog.ServingCheckDataImpl;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;

public class MAPServiceCallHandlingImpl
        extends MAPServiceBaseImpl
        implements MAPServiceCallHandling
{
    private static final Logger loger = Logger.getLogger(MAPServiceCallHandlingImpl.class);

    // Include these constants in MAPApplicationContextName and MAPOperationCode
    // sendRoutingInfo_Request: add constant to MAPMessageType
    // sendRoutingInfo_Response: add constant to MAPMessageType
    protected static final int locationInfoRetrievalContext = 5;
    protected static final int sendRoutingInfo = 22;
    protected static final int version = 3;

    public MAPServiceCallHandlingImpl(MAPProviderImpl mapProviderImpl)
    {
        super(mapProviderImpl);
    }

    @Override
    public MAPDialogCallHandling createNewDialog(
            MAPApplicationContext appCntx,
            SccpAddress origAddress,
            AddressString origReference,
            SccpAddress destAddress,
            AddressString destReference,
            Integer ssn)
            throws
            MAPException
    {
        return this.createNewDialog(appCntx, origAddress, origReference, destAddress, destReference, ssn, null);
    }

    @Override
    public MAPDialogCallHandling createNewDialog(
            MAPApplicationContext appCntx,
            SccpAddress origAddress,
            AddressString origReference,
            SccpAddress destAddress,
            AddressString destReference,
            Integer ssn,
            Long localTrId)
            throws
            MAPException
    {

        // We cannot create a dialog if the service is not activated
        if (!this.isActivated())
            throw new MAPException(
                    "Cannot create MAPDialogRoutingInformation because MAPServiceRoutingInformation is not activated");

        Dialog tcapDialog = this.createNewTCAPDialog(origAddress, destAddress, ssn, localTrId);
        MAPDialogCallHandlingImpl dialog = new MAPDialogCallHandlingImpl(appCntx, tcapDialog, this.mapProviderImpl,
                this,
                origReference, destReference);

        this.putMAPDialogIntoCollection(dialog);
        return dialog;
    }

    @Override
    protected MAPDialogImpl createNewDialogIncoming(MAPApplicationContext appCntx, Dialog tcapDialog)
    {
        return new MAPDialogCallHandlingImpl(appCntx, tcapDialog, this.mapProviderImpl, this, null, null);
    }

    @Override
    public void addMAPServiceListener(MAPServiceCallHandlingListener mapServiceListener)
    {
        super.addMAPServiceListener(mapServiceListener);
    }

    @Override
    public void removeMAPServiceListener(MAPServiceCallHandlingListener mapServiceListener)
    {
        super.removeMAPServiceListener(mapServiceListener);
    }

    @Override
    public ServingCheckData isServingService(MAPApplicationContext dialogApplicationContext)
    {
        MAPApplicationContextName ctx = dialogApplicationContext.getApplicationContextName();
        int vers = dialogApplicationContext.getApplicationContextVersion().getVersion();

        switch (ctx)
        {
            case locationInfoRetrievalContext:
                if (vers >= 1 && vers <= 3)
                {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_Serving);
                } else
                {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_VersionIncorrect);
                }
            case roamingNumberEnquiryContext:
                if (vers >= 1 && vers <= 3)
                {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_Serving);
                } else
                {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_VersionIncorrect);
                }
        }

        return new ServingCheckDataImpl(ServingCheckResult.AC_NotServing);
    }

    @Override
    public MAPApplicationContext getMAPv1ApplicationContext(int operationCode, Invoke invoke)
    {
        switch (operationCode)
        {
            case MAPOperationCode.sendRoutingInfo:
                return MAPApplicationContext.getInstance(MAPApplicationContextName.locationInfoRetrievalContext,
                        MAPApplicationContextVersion.version1);
            case MAPOperationCode.provideRoamingNumber:
                return MAPApplicationContext.getInstance(MAPApplicationContextName.roamingNumberEnquiryContext,
                        MAPApplicationContextVersion.version1);
        }

        return null;
    }

    @Override
    public void processComponent(
            ComponentType compType, OperationCode oc, Parameter parameter, MAPDialog mapDialog,
            Long invokeId, Long linkedId, Invoke linkedInvoke)
            throws
            MAPParsingComponentException
    {

        if (compType == ComponentType.Invoke && this.mapProviderImpl.isCongested())
        {
            // we reject all supplementary services when congestion
            return;
        }

        MAPDialogCallHandlingImpl mapDialogImpl = (MAPDialogCallHandlingImpl) mapDialog;

        Long ocValue = oc.getLocalOperationCode();
        if (ocValue == null)
            new MAPParsingComponentException("", MAPParsingComponentExceptionReason.UnrecognizedOperation);
        MAPApplicationContextName acn = mapDialog.getApplicationContext().getApplicationContextName();
        int vers = mapDialog.getApplicationContext().getApplicationContextVersion().getVersion();
        int ocValueInt = (int) (long) ocValue;

        switch (ocValueInt)
        {
            case MAPOperationCode.sendRoutingInfo:
                if (compType == ComponentType.Invoke)
                    this.sendRoutingInformationRequest(parameter, mapDialogImpl, invokeId);
                else if (compType == ComponentType.ReturnResult || compType == ComponentType.ReturnResultLast)
                    this.sendRoutingInformationResponse(parameter, mapDialogImpl, invokeId);
                break;

            case MAPOperationCode.provideRoamingNumber:
                if (compType == ComponentType.Invoke)
                    this.provideRoamingNumberRequest(parameter, mapDialogImpl, invokeId);
                else if (compType == ComponentType.ReturnResult || compType == ComponentType.ReturnResultLast)
                    this.provideRoamingNumberResponse(parameter, mapDialogImpl, invokeId);
                break;
            default:
                throw new MAPParsingComponentException("", MAPParsingComponentExceptionReason.UnrecognizedOperation);
        }
    }

    private void sendRoutingInformationRequest(
            Parameter parameter,
            MAPDialogCallHandlingImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {
        long version = mapDialogImpl.getApplicationContext().getApplicationContextVersion().getVersion();
        SendRoutingInformationRequestImpl ind = new SendRoutingInformationRequestImpl(version);

        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding SendRoutingInformationRequestIndication: Parameter is mandatory but not " +
                            "found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        // No matter what MAP version V1,V2,V3: tag=Tag.SEQUENCE and tagClass=Tag.CLASS_UNIVERSAL
        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                .isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding SendRoutingInformationRequestIndication: Bad tag or tagClass or parameter " +
                            "is primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceCallHandlingListener) serLis).onSendRoutingInformationRequest(ind);
            }
            catch (Exception e)
            {
                loger.error("Error processing SendRoutingInformationRequestIndication: " + e.getMessage(), e);
            }
        }
    }

    private void sendRoutingInformationResponse(
            Parameter parameter,
            MAPDialogCallHandlingImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {
        long version = mapDialogImpl.getApplicationContext().getApplicationContextVersion().getVersion();
        SendRoutingInformationResponseImpl ind = new SendRoutingInformationResponseImpl(version);

        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding SendRoutingInformationResponseIndication: Parameter is mandatory but not " +
                            "found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (version >= 3)
        { // tag=3 and tagClass=Tag.CLASS_CONTEXT_SPECIFIC
            if (parameter.getTag() != SendRoutingInformationResponseImpl.TAG_sendRoutingInfoRes
                    || parameter.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || parameter.isPrimitive())
                throw new MAPParsingComponentException(
                        "Error while decoding SendRoutingInformationResponseIndication: Bad tag or tagClass or " +
                                "parameter is primitive, received tag="
                                + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        } else
        {
            if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                    .isPrimitive())
                throw new MAPParsingComponentException(
                        "Error while decoding SendRoutingInformationResponseIndication: Bad tag or tagClass or " +
                                "parameter is primitive, received tag="
                                + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        }

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceCallHandlingListener) serLis).onSendRoutingInformationResponse(ind);
            }
            catch (Exception e)
            {
                loger.error("Error processing SendRoutingInformationResponseIndication: " + e.getMessage(), e);
            }
        }
    }

    private void provideRoamingNumberRequest(
            Parameter parameter,
            MAPDialogCallHandlingImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {
        long version = mapDialogImpl.getApplicationContext().getApplicationContextVersion().getVersion();
        ProvideRoamingNumberRequestImpl ind = new ProvideRoamingNumberRequestImpl(version);

        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding ProvideRoamingNumberRequestIndication: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        // No matter what MAP version V1,V2,V3: tag=Tag.SEQUENCE and tagClass=Tag.CLASS_UNIVERSAL
        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                .isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProvideRoamingNumberRequestIndication: Bad tag or tagClass or parameter is " +
                            "primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceCallHandlingListener) serLis).onProvideRoamingNumberRequest(ind);
            }
            catch (Exception e)
            {
                loger.error("Error processing ProvideRoamingNumberRequestIndication: " + e.getMessage(), e);
            }
        }
    }

    private void provideRoamingNumberResponse(
            Parameter parameter,
            MAPDialogCallHandlingImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {
        long version = mapDialogImpl.getApplicationContext().getApplicationContextVersion().getVersion();
        ProvideRoamingNumberResponseImpl ind = new ProvideRoamingNumberResponseImpl(version);

        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding ProvideRoamingNumberResponseIndication: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (version >= 3)
        {
            if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                    .isPrimitive())
                throw new MAPParsingComponentException(
                        "Error while decoding ProvideRoamingNumberResponseIndication: Bad tag or tagClass or " +
                                "parameter is primitive, received tag="
                                + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        } else
        {
            if (parameter.getTag() != Tag.STRING_OCTET || parameter.getTagClass() != Tag.CLASS_UNIVERSAL
                    || !parameter.isPrimitive())
                throw new MAPParsingComponentException(
                        "Error while decoding ProvideRoamingNumberResponseIndication: Bad tag or tagClass or " +
                                "parameter is primitive, received tag="
                                + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        }

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf, parameter.getTagClass(), parameter.isPrimitive(), parameter.getTag());

        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceCallHandlingListener) serLis).onProvideRoamingNumberResponse(ind);
            }
            catch (Exception e)
            {
                loger.error("Error processing ProvideRoamingNumberResponseIndication: " + e.getMessage(), e);
            }
        }
    }
}