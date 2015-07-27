package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.GroupId;
import za.co.ebridge.map.impl.primitives.TbcdStringWithFiller;

public class GroupIdImpl
        extends TbcdStringWithFiller
        implements GroupId
{

    public GroupIdImpl()
    {
        super(3, 3, "GroupId");
    }

    public GroupIdImpl(String data)
    {
        super(3, 3, "GroupId", data);
    }

    @Override
    public String getGroupId()
    {
        return this.data;
    }

}
