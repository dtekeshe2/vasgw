package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.APNOIReplacement;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class APNOIReplacementImpl
        extends OctetStringBase
        implements APNOIReplacement
{

    public APNOIReplacementImpl()
    {
        super(9, 100, "APNOIReplacement");
    }

    public APNOIReplacementImpl(byte[] data)
    {
        super(9, 100, "APNOIReplacement", data);
    }

    public byte[] getData()
    {
        return data;
    }

}
