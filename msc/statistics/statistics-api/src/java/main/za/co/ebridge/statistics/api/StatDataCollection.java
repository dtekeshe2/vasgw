package za.co.ebridge.statistics.api;

import java.util.Date;

/**
 * Collection of data for all StatDataCollector-style counters Contains StatCounterCollection data depending on a
 * counter name
 */
public interface StatDataCollection
{

    StatCounterCollection registerStatCounterCollector(String counterName, StatDataCollectorType type);

    StatCounterCollection unregisterStatCounterCollector(String counterName);

    StatCounterCollection getStatCounterCollector(String counterName);

    void clearDeadCampaignes(Date lastTime);

    StatResult restartAndGet(String counterName, String campaignName);

    void updateData(String counterName, long newVal);

    void updateData(String counterName, String newVal);
}
