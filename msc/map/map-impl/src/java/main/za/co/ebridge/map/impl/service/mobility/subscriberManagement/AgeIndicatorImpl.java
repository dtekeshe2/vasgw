package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.locationManagement.AgeIndicator;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class AgeIndicatorImpl
        extends OctetStringBase
        implements AgeIndicator
{

    public AgeIndicatorImpl()
    {
        super(1, 6, "AgeIndicator");
    }

    public AgeIndicatorImpl(byte[] data)
    {
        super(1, 6, "AgeIndicator", data);
    }

    public byte[] getData()
    {
        return data;
    }

}
