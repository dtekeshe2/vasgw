package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDNType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDNTypeValue;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class PDNTypeImpl
        extends OctetStringLength1Base
        implements PDNType
{

    public PDNTypeImpl()
    {
        super("PDNType");
    }

    public PDNTypeImpl(int data)
    {
        super("PDNType", data);
    }

    public PDNTypeImpl(PDNTypeValue value)
    {
        super("PDNType", value != null ? value.getCode() : 0);
    }

    @Override
    public int getData()
    {
        return data;
    }

    public PDNTypeValue getPDNTypeValue()
    {
        return PDNTypeValue.getInstance(this.data);
    }

}
