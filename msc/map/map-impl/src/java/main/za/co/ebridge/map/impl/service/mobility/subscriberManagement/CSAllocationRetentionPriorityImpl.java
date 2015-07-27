package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSAllocationRetentionPriority;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class CSAllocationRetentionPriorityImpl
        extends OctetStringLength1Base
        implements CSAllocationRetentionPriority
{

    public CSAllocationRetentionPriorityImpl()
    {
        super("CSAllocationRetentionPriority");
    }

    public CSAllocationRetentionPriorityImpl(int data)
    {
        super("CSAllocationRetentionPriority", data);
    }

    public int getData()
    {
        return data;
    }

}
