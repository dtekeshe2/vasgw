package za.co.ebridge.map.impl.service.pdpContextActivation;

import org.apache.log4j.Logger;
import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.impl.MAPServiceBaseImpl;
import za.co.ebridge.map.api.dialog.ServingCheckData;
import za.co.ebridge.map.api.dialog.ServingCheckResult;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPDialogPdpContextActivation;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPServicePdpContextActivation;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPServicePdpContextActivationListener;
import za.co.ebridge.map.impl.dialog.ServingCheckDataImpl;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;

public class MAPServicePdpContextActivationImpl
        extends MAPServiceBaseImpl
        implements MAPServicePdpContextActivation
{

    protected Logger loger = Logger.getLogger(MAPServicePdpContextActivationImpl.class);

    public MAPServicePdpContextActivationImpl(MAPProviderImpl mapProviderImpl)
    {
        super(mapProviderImpl);
    }

    /*
     * Creating a new outgoing MAP PdpContextActivation dialog and adding it to the MAPProvider.dialog collection
     */
    public MAPDialogPdpContextActivation createNewDialog(
            MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn)
            throws
            MAPException
    {
        return this.createNewDialog(appCntx, origAddress, origReference, destAddress, destReference,ssn, null);
    }

    public MAPDialogPdpContextActivation createNewDialog(
            MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn, Long localTrId)
            throws
            MAPException
    {

        // We cannot create a dialog if the service is not activated
        if (!this.isActivated())
            throw new MAPException(
                    "Cannot create MAPDialogPdpContextActivation because MAPServicePdpContextActivation is not " +
                            "activated");

        Dialog tcapDialog = this.createNewTCAPDialog(origAddress, destAddress, ssn, localTrId);
        MAPDialogPdpContextActivationImpl dialog = new MAPDialogPdpContextActivationImpl(appCntx, tcapDialog,
                this.mapProviderImpl, this, origReference, destReference);

        this.putMAPDialogIntoCollection(dialog);

        return dialog;
    }

    protected MAPDialogImpl createNewDialogIncoming(MAPApplicationContext appCntx, Dialog tcapDialog)
    {
        return new MAPDialogPdpContextActivationImpl(appCntx, tcapDialog, this.mapProviderImpl, this, null, null);
    }

    public void addMAPServiceListener(MAPServicePdpContextActivationListener mapServiceListener)
    {
        super.addMAPServiceListener(mapServiceListener);
    }

    public void removeMAPServiceListener(MAPServicePdpContextActivationListener mapServiceListener)
    {
        super.removeMAPServiceListener(mapServiceListener);
    }

    public ServingCheckData isServingService(MAPApplicationContext dialogApplicationContext)
    {
        // TODO Implement it

        return new ServingCheckDataImpl(ServingCheckResult.AC_NotServing);
    }

    public void processComponent(
            ComponentType compType, OperationCode oc, Parameter parameter, MAPDialog mapDialog,
            Long invokeId, Long linkedId, Invoke linkedInvoke)
            throws
            MAPParsingComponentException
    {
        // TODO Implement it
    }
}
