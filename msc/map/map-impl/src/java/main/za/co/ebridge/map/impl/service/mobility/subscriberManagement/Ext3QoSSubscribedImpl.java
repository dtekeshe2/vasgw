package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.Ext3QoSSubscribed;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class Ext3QoSSubscribedImpl
        extends OctetStringBase
        implements Ext3QoSSubscribed
{

    public Ext3QoSSubscribedImpl()
    {
        super(1, 2, "Ext3QoSSubscribed");
    }

    public Ext3QoSSubscribedImpl(byte[] data)
    {
        super(1, 2, "Ext3QoSSubscribed", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
