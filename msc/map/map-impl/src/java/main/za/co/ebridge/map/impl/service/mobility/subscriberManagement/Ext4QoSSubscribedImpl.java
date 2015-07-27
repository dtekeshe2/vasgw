package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.Ext4QoSSubscribed;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class Ext4QoSSubscribedImpl
        extends OctetStringLength1Base
        implements Ext4QoSSubscribed
{

    public Ext4QoSSubscribedImpl()
    {
        super("Ext4QoSSubscribed");
    }

    public Ext4QoSSubscribedImpl(int data)
    {
        super("Ext4QoSSubscribed", data);
    }

    public int getData()
    {
        return data;
    }
}
