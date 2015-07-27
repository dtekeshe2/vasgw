package za.co.ebridge.map.impl.service.mobility;

import za.co.ebridge.map.impl.MessageImpl;
import za.co.ebridge.map.api.service.mobility.MAPDialogMobility;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public abstract class MobilityMessageImpl
        extends MessageImpl
        implements MobilityMessage, MAPAsnPrimitive
{

    public MAPDialogMobility getMAPDialog()
    {
        return (MAPDialogMobility) super.getMAPDialog();
    }

}
