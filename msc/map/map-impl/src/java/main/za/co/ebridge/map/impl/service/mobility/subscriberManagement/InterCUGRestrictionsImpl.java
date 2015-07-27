package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.InterCUGRestrictions;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.InterCUGRestrictionsValue;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class InterCUGRestrictionsImpl
        extends OctetStringLength1Base
        implements InterCUGRestrictions
{

    public InterCUGRestrictionsImpl()
    {
        super("InterCUGRestrictions");
    }

    public InterCUGRestrictionsImpl(int data)
    {
        super("InterCUGRestrictions", data);
    }

    public InterCUGRestrictionsImpl(InterCUGRestrictionsValue val)
    {
        super("InterCUGRestrictions", (val != null ? val.getCode() : 0));
    }

    @Override
    public int getData()
    {
        return this.data;
    }

    @Override
    public InterCUGRestrictionsValue getInterCUGRestrictionsValue()
    {
        return InterCUGRestrictionsValue.getInstance(data);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(_PrimitiveName);
        sb.append(" [");

        sb.append("InterCUGRestrictions=" + this.getInterCUGRestrictionsValue());

        sb.append("]");

        return sb.toString();
    }

}
