package com.ebridgevas.protocols.ss7.statistics;

import za.co.ebridge.statistics.api.StatDataCollectorType;

public class StatDataCollectorMax
        extends StatDataCollectorLongImpl
{

    public StatDataCollectorMax(String name)
    {
        super(name);
    }

    @Override
    protected void reset()
    {
        val = Long.MIN_VALUE;
    }

    @Override
    public void updateData(long newVal)
    {
        if (val < newVal)
            val = newVal;
    }

    @Override
    public StatDataCollectorType getStatDataCollectorType()
    {
        return StatDataCollectorType.MAX;
    }

    @Override
    public void updateData(String newVal)
    {
    }

}
