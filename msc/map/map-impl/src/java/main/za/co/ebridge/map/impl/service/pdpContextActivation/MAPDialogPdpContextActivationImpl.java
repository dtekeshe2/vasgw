package za.co.ebridge.map.impl.service.pdpContextActivation;

import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPDialogPdpContextActivation;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPServicePdpContextActivation;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;

public class MAPDialogPdpContextActivationImpl
        extends MAPDialogImpl
        implements MAPDialogPdpContextActivation
{

    protected MAPDialogPdpContextActivationImpl(
            MAPApplicationContext appCntx, Dialog tcapDialog,
            MAPProviderImpl mapProviderImpl, MAPServicePdpContextActivation mapService, AddressString origReference,
            AddressString destReference)
    {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

}
