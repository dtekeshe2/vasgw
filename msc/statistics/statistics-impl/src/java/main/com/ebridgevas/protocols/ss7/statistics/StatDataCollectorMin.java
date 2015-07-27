package com.ebridgevas.protocols.ss7.statistics;

import za.co.ebridge.statistics.api.StatDataCollectorType;

public class StatDataCollectorMin
        extends StatDataCollectorLongImpl
{

    public StatDataCollectorMin(String name)
    {
        super(name);
    }

    @Override
    protected void reset()
    {
        val = Long.MAX_VALUE;
    }

    @Override
    public void updateData(long newVal)
    {
        if (val > newVal)
            val = newVal;
    }

    @Override
    public StatDataCollectorType getStatDataCollectorType()
    {
        return StatDataCollectorType.MIN;
    }

    @Override
    public void updateData(String newVal)
    {
    }

}
