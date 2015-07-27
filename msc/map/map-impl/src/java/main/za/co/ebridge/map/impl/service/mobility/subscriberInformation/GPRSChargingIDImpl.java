package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.GPRSChargingID;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class GPRSChargingIDImpl
        extends OctetStringBase
        implements GPRSChargingID
{

    public GPRSChargingIDImpl()
    {
        super(4, 4, "GPRSChargingID");
    }

    public GPRSChargingIDImpl(byte[] data)
    {
        super(4, 4, "GPRSChargingID", data);
    }

    public byte[] getData()
    {
        return data;
    }
}
