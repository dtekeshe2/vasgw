package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDPAddress;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class PDPAddressImpl
        extends OctetStringBase
        implements PDPAddress
{

    public PDPAddressImpl()
    {
        super(1, 16, "PDPAddress");
    }

    public PDPAddressImpl(byte[] data)
    {
        super(1, 16, "PDPAddress", data);
    }

    public byte[] getData()
    {
        return data;
    }

}
