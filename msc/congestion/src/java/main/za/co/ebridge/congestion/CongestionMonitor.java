package za.co.ebridge.congestion;

/**
 * The user who is interested in monitoring the underlying source should implement this interface.
 */
public interface CongestionMonitor
{

    /**
     * The user should call this method periodically to monitor underlying resource
     */
    void monitor();

    /**
     * Add {@link CongestionListener}
     *
     * @param listener
     */
    void addCongestionListener(CongestionListener listener);

    /**
     * Remove {@link CongestionListener}
     *
     * @param listener
     */
    void removeCongestionListener(CongestionListener listener);

    /**
     * Get the name of underlying source
     *
     * @return
     */
    String getSource();

}
