package za.co.ebridge.statistics.api;

import java.util.Date;

public interface StatDataCollector {

    String getCampaignName();

    StatDataCollectorType getStatDataCollectorType();

    Date getSessionStartTime();

    StatResult restartAndGet();

    void updateData(long newVal);

    void updateData(String newVal);

}
