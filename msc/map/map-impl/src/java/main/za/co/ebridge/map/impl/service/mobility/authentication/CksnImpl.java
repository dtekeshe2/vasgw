package za.co.ebridge.map.impl.service.mobility.authentication;

import za.co.ebridge.map.api.service.mobility.authentication.Cksn;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class CksnImpl
        extends OctetStringLength1Base
        implements Cksn
{

    public CksnImpl(int data)
    {
        super("Cksn", data);
    }

    public CksnImpl()
    {
        super("Cksn");
    }

    @Override
    public int getData()
    {
        return this.data;
    }

}
