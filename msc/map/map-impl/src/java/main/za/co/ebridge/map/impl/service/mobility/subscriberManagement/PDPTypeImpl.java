package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDPType;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class PDPTypeImpl
        extends OctetStringBase
        implements PDPType
{

    public PDPTypeImpl()
    {
        super(2, 2, "PDPType");
    }

    public PDPTypeImpl(byte[] data)
    {
        super(2, 2, "PDPType", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
