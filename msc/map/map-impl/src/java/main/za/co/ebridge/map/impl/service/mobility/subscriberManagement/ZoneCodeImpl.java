package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ZoneCode;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class ZoneCodeImpl
        extends OctetStringBase
        implements ZoneCode
{

    public ZoneCodeImpl()
    {
        super(2, 2, "ZoneCode");
    }

    public ZoneCodeImpl(byte[] data)
    {
        super(2, 2, "ZoneCode", data);
    }

    public ZoneCodeImpl(int value)
    {
        super(2, 2, "ZoneCode");

        this.data = new byte[2];
        this.data[0] = (byte) ((value & 0xFF00) >> 8);
        this.data[1] = (byte) (value & 0xFF);
    }

    public byte[] getData()
    {
        return data;
    }

    @Override
    public int getValue()
    {
        if (this.data == null || this.data.length != 2)
            return 0;

        int res = ((this.data[0] & 0xFF) << 8) | (this.data[1] & 0xFF);
        return res;
    }

}
