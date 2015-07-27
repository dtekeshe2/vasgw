package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.LongGroupId;
import za.co.ebridge.map.impl.primitives.TbcdStringWithFiller;

public class LongGroupIdImpl
        extends TbcdStringWithFiller
        implements LongGroupId
{
    public LongGroupIdImpl()
    {
        super(4, 4, "LongGroupId");
    }

    public LongGroupIdImpl(String data)
    {
        super(4, 4, "LongGroupId", data);
    }

    @Override
    public String getLongGroupId()
    {
        return this.data;
    }
}
