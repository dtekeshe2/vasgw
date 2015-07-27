package za.co.ebridge.map.impl.service.mobility.imei;

import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIuB;
import za.co.ebridge.map.impl.primitives.BitStringBase;

public class UESBIIuBImpl
        extends BitStringBase
        implements UESBIIuB
{

    public static final String _PrimitiveName = "UESBIIuB";

    public UESBIIuBImpl()
    {
        super(1, 128, 1, _PrimitiveName);
    }

    public UESBIIuBImpl(BitSetStrictLength data)
    {
        super(1, 128, data.getStrictLength(), _PrimitiveName, data);
    }

    @Override
    public BitSetStrictLength getData()
    {
        return bitString;
    }

}
