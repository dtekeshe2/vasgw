package za.co.ebridge.map.impl.service.mobility.imei;

import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIuA;
import za.co.ebridge.map.impl.primitives.BitStringBase;

public class UESBIIuAImpl
        extends BitStringBase
        implements UESBIIuA
{

    public static final String _PrimitiveName = "UESBIIuA";

    public UESBIIuAImpl()
    {
        super(1, 128, 1, _PrimitiveName);
    }

    public UESBIIuAImpl(BitSetStrictLength data)
    {
        super(1, 128, data.getStrictLength(), _PrimitiveName, data);
    }

    @Override
    public BitSetStrictLength getData()
    {
        return bitString;
    }

}
