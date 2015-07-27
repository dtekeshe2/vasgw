package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCodeValue;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class TeleserviceCodeImpl
        extends OctetStringLength1Base
        implements TeleserviceCode
{

    public TeleserviceCodeImpl()
    {
        super("TeleserviceCode");
    }

    public TeleserviceCodeImpl(int data)
    {
        super("TeleserviceCode", data);
    }

    public TeleserviceCodeImpl(TeleserviceCodeValue value)
    {
        super("TeleserviceCode", value != null ? value.getCode() : 0);
    }

    public int getData()
    {
        return data;
    }

    public TeleserviceCodeValue getTeleserviceCodeValue()
    {
        return TeleserviceCodeValue.getInstance(this.data);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this._PrimitiveName);
        sb.append(" [");

        sb.append("Value=");
        sb.append(this.getTeleserviceCodeValue());

        sb.append(", Data=");
        sb.append(this.data);

        sb.append("]");

        return sb.toString();
    }

}
