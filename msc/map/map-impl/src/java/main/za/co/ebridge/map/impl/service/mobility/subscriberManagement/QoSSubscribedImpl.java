package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.QoSSubscribed;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class QoSSubscribedImpl
        extends OctetStringBase
        implements QoSSubscribed
{

    public QoSSubscribedImpl()
    {
        super(3, 3, "QoSSubscribed");
    }

    public QoSSubscribedImpl(byte[] data)
    {
        super(3, 3, "QoSSubscribed", data);
    }

    public byte[] getData()
    {
        return data;
    }

}
