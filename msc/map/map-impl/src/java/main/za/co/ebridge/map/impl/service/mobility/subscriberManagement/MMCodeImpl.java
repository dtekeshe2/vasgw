package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.MMCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MMCodeValue;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

public class MMCodeImpl
        extends OctetStringLength1Base
        implements MMCode
{

    public MMCodeImpl()
    {
        super("MMCode");
    }

    public MMCodeImpl(MMCodeValue value)
    {
        super("MMCode", value != null ? value.getCode() : 0);
    }

    @Override
    public MMCodeValue getMMCodeValue()
    {
        return MMCodeValue.getInstance(data & 0xFF);
    }

}
