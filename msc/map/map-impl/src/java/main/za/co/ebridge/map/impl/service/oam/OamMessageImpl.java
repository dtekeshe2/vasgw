package za.co.ebridge.map.impl.service.oam;

import za.co.ebridge.map.impl.MessageImpl;
import za.co.ebridge.map.api.service.oam.MAPDialogOam;
import za.co.ebridge.map.api.service.oam.OamMessage;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public abstract class OamMessageImpl
        extends MessageImpl
        implements OamMessage, MAPAsnPrimitive
{

    public MAPDialogOam getMAPDialog()
    {
        return (MAPDialogOam) super.getMAPDialog();
    }

}
