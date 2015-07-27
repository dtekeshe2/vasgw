package com.ebridgevas.protocols.ss7.statistics;

import java.util.Date;

import javolution.util.FastMap;
import za.co.ebridge.statistics.api.LongValue;
import za.co.ebridge.statistics.api.StatResult;

public abstract class StatDataCollectorLongImpl
        extends StatDataCollectorAbstractImpl
{

    protected long val;

    public StatDataCollectorLongImpl(String campaignName)
    {
        super(campaignName);
    }

    public StatResult restartAndGet()
    {
        StatResultLong res = new StatResultLong(val);
        this.sessionStartTime = new Date();
        this.reset();
        return res;
    }

    public class StatResultLong
            implements StatResult
    {

        private long val;

        public StatResultLong(long val)
        {
            this.val = val;
        }

        @Override
        public long getLongValue()
        {
            return val;
        }

        @Override
        public FastMap<String, LongValue> getStringLongValue()
        {
            return null;
        }

    }
}
