package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.Ext2QoSSubscribed;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class Ext2QoSSubscribedImpl
        extends OctetStringBase
        implements Ext2QoSSubscribed
{

    public Ext2QoSSubscribedImpl()
    {
        super(1, 3, "Ext2QoSSubscribed");
    }

    public Ext2QoSSubscribedImpl(byte[] data)
    {
        super(1, 3, "Ext2QoSSubscribed", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
