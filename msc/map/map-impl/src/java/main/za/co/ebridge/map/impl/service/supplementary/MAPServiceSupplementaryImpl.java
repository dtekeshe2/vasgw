package za.co.ebridge.map.impl.service.supplementary;

import org.apache.log4j.Logger;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.impl.MAPServiceBaseImpl;
import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPApplicationContextName;
import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.MAPServiceListener;
import za.co.ebridge.map.api.dialog.ServingCheckData;
import za.co.ebridge.map.api.dialog.ServingCheckResult;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.supplementary.MAPDialogSupplementary;
import za.co.ebridge.map.api.service.supplementary.MAPServiceSupplementary;
import za.co.ebridge.map.api.service.supplementary.MAPServiceSupplementaryListener;
import za.co.ebridge.map.impl.dialog.ServingCheckDataImpl;
import za.co.ebridge.map.impl.service.sms.MAPServiceSmsImpl;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.TcapFactory;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;

public class MAPServiceSupplementaryImpl
        extends MAPServiceBaseImpl
        implements MAPServiceSupplementary
{

    private static final Logger logger = Logger.getLogger(MAPServiceSmsImpl.class);

    public MAPServiceSupplementaryImpl(MAPProviderImpl mapProviderImpl)
    {
        super(mapProviderImpl);
    }

    /**
     * Creating a new outgoing MAP Supplementary dialog and adding it to the MAPProvider.dialog collection
     */
    public MAPDialogSupplementary createNewDialog(
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

    public MAPDialogSupplementary createNewDialog(
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
            throw new MAPException("Cannot create MAPDialogSupplementary because MAPServiceSupplementary is not " +
                    "activated");

        Dialog tcapDialog = this.createNewTCAPDialog(origAddress, destAddress, ssn, localTrId);
        MAPDialogSupplementaryImpl dialog = new MAPDialogSupplementaryImpl(appCntx, tcapDialog, this.mapProviderImpl,
                this,
                origReference, destReference);

        this.putMAPDialogIntoCollection(dialog);

        return dialog;
    }

    protected MAPDialogImpl createNewDialogIncoming(MAPApplicationContext appCntx, Dialog tcapDialog)
    {
        return new MAPDialogSupplementaryImpl(appCntx, tcapDialog, this.mapProviderImpl, this, null, null);
    }

    public void addMAPServiceListener(MAPServiceSupplementaryListener mapServiceListener)
    {
        super.addMAPServiceListener(mapServiceListener);
    }

    public void removeMAPServiceListener(MAPServiceSupplementaryListener mapServiceListener)
    {
        super.removeMAPServiceListener(mapServiceListener);
    }

    public ServingCheckData isServingService(MAPApplicationContext dialogApplicationContext)
    {
        MAPApplicationContextName ctx = dialogApplicationContext.getApplicationContextName();
        int vers = dialogApplicationContext.getApplicationContextVersion().getVersion();

        switch (ctx)
        {
            case networkUnstructuredSsContext:
                if (vers == 2)
                {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_Serving);
                } else if (vers > 2)
                {
                    long[] altOid = dialogApplicationContext.getOID();
                    altOid[7] = 2;
                    ApplicationContextName alt = TcapFactory.createApplicationContextName(altOid);
                    return new ServingCheckDataImpl(ServingCheckResult.AC_VersionIncorrect, alt);
                } else
                {
                    return new ServingCheckDataImpl(ServingCheckResult.AC_VersionIncorrect);
                }

        }

        return new ServingCheckDataImpl(ServingCheckResult.AC_NotServing);
    }

    public long[] getLinkedOperationList(long operCode)
    {
        if (operCode == MAPOperationCode.registerPassword)
        {
            return new long[]{MAPOperationCode.getPassword};
        }

        return null;
    }

    public void processComponent(
            ComponentType compType, OperationCode oc, Parameter parameter, MAPDialog mapDialog,
            Long invokeId, Long linkedId, Invoke linkedInvoke)
            throws
            MAPParsingComponentException
    {

        // if an application-context-name different from version 1 is
        // received in a syntactically correct TC-
        // BEGIN indication primitive but is not acceptable from a load
        // control point of view, the MAP PM
        // shall ignore this dialogue request. The MAP-user is not informed.
        if (compType == ComponentType.Invoke && this.mapProviderImpl.isCongested())
        {
            // we reject all supplementary services when congestion
            return;
        }

        MAPDialogSupplementaryImpl mapDialogSupplementaryImpl = (MAPDialogSupplementaryImpl) mapDialog;

        Long ocValue = oc.getLocalOperationCode();
        if (ocValue == null)
            new MAPParsingComponentException("", MAPParsingComponentExceptionReason.UnrecognizedOperation);

        long ocValueInt = ocValue;
        int ocValueInt2 = (int) ocValueInt;
        switch (ocValueInt2)
        {
            case MAPOperationCode.processUnstructuredSS_Request:
                if (compType == ComponentType.Invoke)
                    this.processUnstructuredSSRequest(parameter, mapDialogSupplementaryImpl, invokeId);
                else
                    this.processUnstructuredSSResponse(parameter, mapDialogSupplementaryImpl, invokeId);
                break;
            case MAPOperationCode.unstructuredSS_Request:
                if (compType == ComponentType.Invoke)
                    this.unstructuredSSRequest(parameter, mapDialogSupplementaryImpl, invokeId);
                else
                    this.unstructuredSSResponse(parameter, mapDialogSupplementaryImpl, invokeId);
                break;
            case MAPOperationCode.unstructuredSS_Notify:
                if (compType == ComponentType.Invoke)
                    this.unstructuredSSNotifyRequest(parameter, mapDialogSupplementaryImpl, invokeId);
                else
                    this.unstructuredSSNotifyResponse(parameter, mapDialogSupplementaryImpl, invokeId);
                break;
            default:
                throw new MAPParsingComponentException("", MAPParsingComponentExceptionReason.UnrecognizedOperation);
        }
    }

    private void unstructuredSSNotifyRequest(
            Parameter parameter,
            MAPDialogSupplementaryImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {
        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding unstructuredSSNotifyIndication: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                .isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding unstructuredSSNotifyIndication: Bad tag or tagClass or parameter is " +
                            "primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        UnstructuredSSNotifyRequestImpl ind = new UnstructuredSSNotifyRequestImpl();
        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceSupplementaryListener) serLis).onUnstructuredSSNotifyRequest(ind);
            }
            catch (Exception e)
            {
                logger.error("Error processing unstructuredSSNotifyIndication: " + e.getMessage(), e);
            }
        }
    }

    private void unstructuredSSNotifyResponse(
            Parameter parameter,
            MAPDialogSupplementaryImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {

        UnstructuredSSNotifyResponseImpl ind = new UnstructuredSSNotifyResponseImpl();
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceSupplementaryListener) serLis).onUnstructuredSSNotifyResponse(ind);
            }
            catch (Exception e)
            {
                logger.error("Error processing unstructuredSSNotifyIndication: " + e.getMessage(), e);
            }
        }
    }

    private void unstructuredSSRequest(Parameter parameter, MAPDialogSupplementaryImpl mapDialogImpl, Long invokeId)
            throws
            MAPParsingComponentException
    {
        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding UnstructuredSSRequestIndication: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                .isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding UnstructuredSSRequestIndication: Bad tag or tagClass or parameter is " +
                            "primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        UnstructuredSSRequestImpl ind = new UnstructuredSSRequestImpl();
        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceSupplementaryListener) serLis).onUnstructuredSSRequest(ind);
            }
            catch (Exception e)
            {
                logger.error("Error processing UnstructuredSSRequestIndication: " + e.getMessage(), e);
            }
        }
    }

    private void unstructuredSSResponse(Parameter parameter, MAPDialogSupplementaryImpl mapDialogImpl, Long invokeId)
            throws
            MAPParsingComponentException
    {

        UnstructuredSSResponseImpl ind = new UnstructuredSSResponseImpl();

        if (parameter != null)
        {
            if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                    .isPrimitive())
                throw new MAPParsingComponentException(
                        "Error while decoding UnstructuredSSResponseIndication: Bad tag or tagClass or parameter is " +
                                "primitive, received tag="
                                + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

            byte[] buf = parameter.getData();
            AsnInputStream ais = new AsnInputStream(buf);

            ind.decodeData(ais, buf.length);
        }

        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceSupplementaryListener) serLis).onUnstructuredSSResponse(ind);
            }
            catch (Exception e)
            {
                logger.error("Error processing UnstructuredSSResponseIndication: " + e.getMessage(), e);
            }
        }

    }

    private void processUnstructuredSSRequest(
            Parameter parameter,
            MAPDialogSupplementaryImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {

        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSRequestIndication: Parameter is mandatory but not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                .isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSRequestIndication: Bad tag or tagClass or parameter is" +
                            " primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        ProcessUnstructuredSSRequestImpl ind = new ProcessUnstructuredSSRequestImpl();
        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceSupplementaryListener) serLis).onProcessUnstructuredSSRequest(ind);
            }
            catch (Exception e)
            {
                logger.error("Error processing ProcessUnstructuredSSRequestIndication: " + e.getMessage(), e);
            }
        }

    }

    private void processUnstructuredSSResponse(
            Parameter parameter,
            MAPDialogSupplementaryImpl mapDialogImpl,
            Long invokeId)
            throws
            MAPParsingComponentException
    {

        if (parameter == null)
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSResponseIndication: Parameter is mandatory but not " +
                            "found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (parameter.getTag() != Tag.SEQUENCE || parameter.getTagClass() != Tag.CLASS_UNIVERSAL || parameter
                .isPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSResponseIndication: Bad tag or tagClass or parameter " +
                            "is primitive, received tag="
                            + parameter.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);

        byte[] buf = parameter.getData();
        AsnInputStream ais = new AsnInputStream(buf);

        ProcessUnstructuredSSResponseImpl ind = new ProcessUnstructuredSSResponseImpl();
        ind.decodeData(ais, buf.length);
        ind.setInvokeId(invokeId);
        ind.setMAPDialog(mapDialogImpl);

        for (MAPServiceListener serLis : this.serviceListeners)
        {
            try
            {
                serLis.onMAPMessage(ind);
                ((MAPServiceSupplementaryListener) serLis).onProcessUnstructuredSSResponse(ind);
            }
            catch (Exception e)
            {
                logger.error("Error processing ProcessUnstructuredSSResponseIndication: " + e.getMessage(), e);
            }
        }

    }
}
