package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGInterlock;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class CUGInterlockImpl
        extends OctetStringBase
        implements CUGInterlock
{

    public CUGInterlockImpl()
    {
        super(4, 4, "CUGInterlock");
    }

    public CUGInterlockImpl(byte[] data)
    {
        super(4, 4, "CUGInterlock", data);
    }

    public byte[] getData()
    {
        return data;
    }

}
