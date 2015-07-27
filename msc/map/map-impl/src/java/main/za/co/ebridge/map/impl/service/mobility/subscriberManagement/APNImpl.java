package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.APN;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class APNImpl
        extends OctetStringBase
        implements APN
{

    public APNImpl()
    {
        super(2, 63, "APN");
    }

    public APNImpl(byte[] data)
    {
        super(2, 63, "APN", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
