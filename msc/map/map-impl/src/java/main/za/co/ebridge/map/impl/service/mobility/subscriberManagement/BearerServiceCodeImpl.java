package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.BearerServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BearerServiceCodeValue;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class BearerServiceCodeImpl
        extends OctetStringLength1Base
        implements BearerServiceCode
{

    public BearerServiceCodeImpl()
    {
        super("BearerServiceCode");
    }

    public BearerServiceCodeImpl(int data)
    {
        super("BearerServiceCode", data);
    }

    public BearerServiceCodeImpl(BearerServiceCodeValue value)
    {
        super("BearerServiceCode", value != null ? value.getBearerServiceCode() : 0);
    }

    public int getData()
    {
        return data;
    }

    public BearerServiceCodeValue getBearerServiceCodeValue()
    {
        return BearerServiceCodeValue.getInstance(this.data);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this._PrimitiveName);
        sb.append(" [");

        sb.append("Value=");
        sb.append(this.getBearerServiceCodeValue());

        sb.append(", Data=");
        sb.append(this.data);

        sb.append("]");

        return sb.toString();
    }
}
