package za.co.ebridge.map.api;

import za.co.ebridge.tcap.api.api.TCAPStack;

public interface MAPStack
{

    /**
     * Returns the name of this stack
     *
     * @return
     */
    String getName();

    MAPProvider getMAPProvider();

    void stop();

    void start()
            throws
            Exception;

    TCAPStack getTCAPStack();

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
