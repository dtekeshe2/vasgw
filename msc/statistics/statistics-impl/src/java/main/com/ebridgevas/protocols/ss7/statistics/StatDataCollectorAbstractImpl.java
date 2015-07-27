package com.ebridgevas.protocols.ss7.statistics;

import za.co.ebridge.statistics.api.StatDataCollector;
import za.co.ebridge.statistics.api.StatDataCollectorType;
import za.co.ebridge.statistics.api.StatResult;

import java.util.Date;

public abstract class StatDataCollectorAbstractImpl
        implements StatDataCollector
{

    private String campaignName;
    protected Date sessionStartTime = new Date();

    public StatDataCollectorAbstractImpl(String campaignName)
    {
        this.campaignName = campaignName;
    }

    public String getCampaignName()
    {
        return campaignName;
    }

    public Date getSessionStartTime()
    {
        return sessionStartTime;
    }

    public abstract StatResult restartAndGet();

    protected abstract void reset();

    public abstract void updateData(long newVal);

    public abstract void updateData(String newVal);

    public abstract StatDataCollectorType getStatDataCollectorType();

}
