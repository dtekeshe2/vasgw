package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtQoSSubscribed;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class ExtQoSSubscribedImpl
        extends OctetStringBase
        implements ExtQoSSubscribed
{

    public ExtQoSSubscribedImpl()
    {
        super(1, 9, "ExtQoSSubscribed");
    }

    public ExtQoSSubscribedImpl(byte[] data)
    {
        super(1, 9, "ExtQoSSubscribed", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
