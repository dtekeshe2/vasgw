package za.co.ebridge.statistics.api;

import java.util.Date;

/**
 * Collection of data for a whole counter data
 * Contains StatDataCollector data depending on a campaign name
 */
public interface StatCounterCollection
{

    String getCounterName();

    void clearDeadCampaignes(Date lastTime);

    StatResult restartAndGet(String campaignName);

    void updateData(long newVal);

    void updateData(String newVal);

}
