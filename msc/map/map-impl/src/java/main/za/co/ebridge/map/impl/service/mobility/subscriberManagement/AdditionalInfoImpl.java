package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalInfo;
import za.co.ebridge.map.impl.primitives.BitStringBase;

public class AdditionalInfoImpl
        extends BitStringBase
        implements AdditionalInfo
{

    public static final String _PrimitiveName = "AdditionalInfo";

    public AdditionalInfoImpl()
    {
        super(1, 136, 1, _PrimitiveName);
    }

    public AdditionalInfoImpl(BitSetStrictLength data)
    {
        super(1, 136, data.getStrictLength(), _PrimitiveName, data);
    }

    @Override
    public BitSetStrictLength getData()
    {
        return bitString;
    }

}
