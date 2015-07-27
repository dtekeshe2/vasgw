package com.ebridgevas.protocols.ss7.statistics;

import javolution.util.FastMap;
import za.co.ebridge.statistics.api.LongValue;
import za.co.ebridge.statistics.api.StatDataCollectorType;
import za.co.ebridge.statistics.api.StatResult;

public class StringLongMap
        extends StatDataCollectorAbstractImpl
{

    private FastMap<String, LongValue> data = new FastMap<String, LongValue>();

    public StringLongMap(String campaignName)
    {
        super(campaignName);
    }

    public StatResult restartAndGet()
    {
        synchronized (this)
        {
            StatResultStringLongMap res = new StatResultStringLongMap(this.data);
            this.data = new FastMap<String, LongValue>();
            this.reset();
            return res;
        }
    }

    protected void reset()
    {
        synchronized (this)
        {
            this.data.clear();
        }
    }

    @Override
    public void updateData(long newVal)
    {
    }

    @Override
    public void updateData(String name)
    {
        synchronized (this)
        {
            LongValue val = data.get(name);
            if (val == null)
            {
                val = new LongValue();
                data.put(name, val);
            }
            val.updateValue();
        }
    }

    @Override
    public StatDataCollectorType getStatDataCollectorType()
    {
        return StatDataCollectorType.StringLongMap;
    }

    public class StatResultStringLongMap
            implements StatResult
    {

        private FastMap<String, LongValue> data;

        public StatResultStringLongMap(FastMap<String, LongValue> data)
        {
            this.data = data;
        }

        @Override
        public long getLongValue()
        {
            return 0;
        }

        @Override
        public FastMap<String, LongValue> getStringLongValue()
        {
            return data;
        }

    }
}
