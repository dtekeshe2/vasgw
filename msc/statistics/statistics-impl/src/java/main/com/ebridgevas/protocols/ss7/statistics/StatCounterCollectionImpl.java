package com.ebridgevas.protocols.ss7.statistics;

import javolution.util.FastMap;
import za.co.ebridge.statistics.api.StatCounterCollection;
import za.co.ebridge.statistics.api.StatDataCollectorType;
import za.co.ebridge.statistics.api.StatResult;

import java.util.ArrayList;
import java.util.Date;

public class StatCounterCollectionImpl
        implements StatCounterCollection
{

    private String counterName;
    private StatDataCollectorType type;
    private FastMap<String, StatDataCollectorAbstractImpl> coll = new FastMap<String, StatDataCollectorAbstractImpl>();

    public StatCounterCollectionImpl(String counterName, StatDataCollectorType type)
    {
        this.counterName = counterName;
        this.type = type;
    }

    @Override
    public String getCounterName()
    {
        return counterName;
    }

    @Override
    public void clearDeadCampaignes(Date lastTime)
    {
        synchronized (this)
        {
            ArrayList<String> toDel = new ArrayList<String>();
            for (String s : coll.keySet())
            {
                StatDataCollectorAbstractImpl d = coll.get(s);
                if (d.getSessionStartTime().before(lastTime))
                {
                    toDel.add(s);
                }
            }
            for (String s : toDel)
            {
                coll.remove(s);
            }
        }
    }

    @Override
    public StatResult restartAndGet(String campaignName)
    {
        synchronized (this)
        {
            StatDataCollectorAbstractImpl sdc = coll.get(campaignName);
            if (sdc != null)
            {
                return sdc.restartAndGet();
            } else
            {
                switch (type)
                {
                    case MIN:
                        sdc = new StatDataCollectorMin(campaignName);
                        sdc.reset();
                        break;
                    case MAX:
                        sdc = new StatDataCollectorMax(campaignName);
                        sdc.reset();
                        break;
                    case StringLongMap:
                        sdc = new StringLongMap(campaignName);
                        sdc.reset();
                        break;
                }
                if (sdc != null)
                {
                    coll.put(campaignName, sdc);
                }
                return null;
            }
        }
    }

    @Override
    public void updateData(long newVal)
    {
        synchronized (this)
        {
            for (String s : coll.keySet())
            {
                StatDataCollectorAbstractImpl d = coll.get(s);
                d.updateData(newVal);
            }
        }
    }

    @Override
    public void updateData(String newVal)
    {
        synchronized (this)
        {
            for (String s : coll.keySet())
            {
                StatDataCollectorAbstractImpl d = coll.get(s);
                d.updateData(newVal);
            }
        }
    }

}
