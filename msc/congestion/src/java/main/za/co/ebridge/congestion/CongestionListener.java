package za.co.ebridge.congestion;

/**
 * The listener interface for receiving congestion state. The class that is interested in listening for congestion
 * state should
 * implement this interface and register itself to {@link CongestionMonitor}
 */
public interface CongestionListener
{

    /**
     * As soon as congestion starts in the underlying source, it calls this method to notify about it. Notification
     * is only
     * one-time till the congestion abates in which case {@link CongestionListener#onCongestionFinish(String)} is called
     *
     * @param source The underlying source which is facing congestion
     */
    void onCongestionStart(String source);

    /**
     * As soon as congestion abates in the underlying source, it calls this method to notify about it. Notification
     * is only
     * one-time till the congestion starts agaain in which case {@link CongestionListener#onCongestionStart(String)}
     * is called
     *
     * @param source The underlying source
     */
    void onCongestionFinish(String source);

}
