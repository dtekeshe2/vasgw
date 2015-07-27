package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ChargingCharacteristics;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class ChargingCharacteristicsImpl
        extends OctetStringBase
        implements ChargingCharacteristics
{

    public ChargingCharacteristicsImpl()
    {
        super(2, 2, "ChargingCharacteristics");
    }

    public ChargingCharacteristicsImpl(byte[] data)
    {
        super(2, 2, "ChargingCharacteristics", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
