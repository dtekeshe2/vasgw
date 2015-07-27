package za.co.ebridge.map.impl.service.oam;

import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.oam.MAPDialogOam;
import za.co.ebridge.map.api.service.oam.MAPServiceOam;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;

public class MAPDialogOamImpl
        extends MAPDialogImpl
        implements MAPDialogOam
{

    protected MAPDialogOamImpl(
            MAPApplicationContext appCntx, Dialog tcapDialog, MAPProviderImpl mapProviderImpl,
            MAPServiceOam mapService, AddressString origReference, AddressString destReference)
    {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

}
