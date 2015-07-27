package za.co.ebridge.map.impl.service.pdpContextActivation;

import za.co.ebridge.map.impl.MessageImpl;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPDialogPdpContextActivation;
import za.co.ebridge.map.api.service.pdpContextActivation.PdpContextActivationMessage;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public abstract class PdpContextActivationMessageImpl
        extends MessageImpl
        implements PdpContextActivationMessage,
        MAPAsnPrimitive
{

    public MAPDialogPdpContextActivation getMAPDialog()
    {
        return (MAPDialogPdpContextActivation) super.getMAPDialog();
    }

}
