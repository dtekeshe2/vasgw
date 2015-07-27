package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtPDPType;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class ExtPDPTypeImpl
        extends OctetStringBase
        implements ExtPDPType
{

    public ExtPDPTypeImpl()
    {
        super(2, 2, "ExtPDPType");
    }

    public ExtPDPTypeImpl(byte[] data)
    {
        super(2, 2, "ExtPDPType", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
