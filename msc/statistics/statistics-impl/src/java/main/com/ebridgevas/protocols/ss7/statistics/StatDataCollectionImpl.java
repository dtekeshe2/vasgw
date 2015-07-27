package com.ebridgevas.protocols.ss7.statistics;

import java.util.Date;

import javolution.util.FastMap;
import za.co.ebridge.statistics.api.StatCounterCollection;
import za.co.ebridge.statistics.api.StatDataCollection;
import za.co.ebridge.statistics.api.StatDataCollectorType;
import za.co.ebridge.statistics.api.StatResult;

/**
 * Collection of data for all StatDataCollector-style counters
 * Contains StatCounterCollection data depending on a counter name
 */
public class StatDataCollectionImpl
        implements StatDataCollection
{

    private FastMap<String, StatCounterCollection> coll = new FastMap<String, StatCounterCollection>();

    public StatCounterCollection registerStatCounterCollector(String counterName, StatDataCollectorType type)
    {
        synchronized (this)
        {
            StatCounterCollectionImpl c = new StatCounterCollectionImpl(counterName, type);
            coll.put(counterName, c);
            return c;
        }
    }

    public StatCounterCollection unregisterStatCounterCollector(String counterName)
    {
        synchronized (this)
        {
            StatCounterCollection c = coll.remove(counterName);
            return c;
        }
    }

    public StatCounterCollection getStatCounterCollector(String counterName)
    {
        synchronized (this)
        {
            StatCounterCollection c = coll.get(counterName);
            return c;
        }
    }

    public void clearDeadCampaignes(Date lastTime)
    {
        synchronized (this)
        {
            for (String s : coll.keySet())
            {
                StatCounterCollection d = coll.get(s);
                d.clearDeadCampaignes(lastTime);
            }
        }
    }

    public StatResult restartAndGet(String counterName, String campaignName)
    {
        StatCounterCollection scc;
        synchronized (this)
        {
            scc = this.coll.get(counterName);
        }
        if (scc != null)
        {
            return scc.restartAndGet(campaignName);
        } else
        {
            return null;
        }
    }

    public void updateData(String counterName, long newVal)
    {
        StatCounterCollection scc;
        synchronized (this)
        {
            scc = this.coll.get(counterName);
        }
        if (scc != null)
        {
            scc.updateData(newVal);
        }
    }

    public void updateData(String counterName, String newVal)
    {
        StatCounterCollection scc;
        synchronized (this)
        {
            scc = this.coll.get(counterName);
        }
        if (scc != null)
        {
            scc.updateData(newVal);
        }
    }
}
