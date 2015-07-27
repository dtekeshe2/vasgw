package za.co.ebridge.congestion;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class MemoryCongestionMonitor
        implements CongestionMonitor
{
    private static final Logger logger = Logger.getLogger(MemoryCongestionMonitor.class);

    private static final String SOURCE = "MEMORY";

    private final List<CongestionListener> listeners = new ArrayList<CongestionListener>();

    private double maxMemory;
    private volatile double percentageOfMemoryUsed;

    private volatile boolean memoryTooHigh = false;

    private int backToNormalMemoryThreshold;

    private int memoryThreshold;

    public MemoryCongestionMonitor()
    {
        maxMemory = Runtime.getRuntime().maxMemory() / (double) 1024;
    }

    /**
     */
    public void setBackToNormalMemoryThreshold(int backToNormalMemoryThreshold)
    {
        this.backToNormalMemoryThreshold = backToNormalMemoryThreshold;
        if (logger.isInfoEnabled())
        {
            logger.info("Back To Normal Memory threshold set to " + backToNormalMemoryThreshold + "%");
        }
    }

    /**
     * @return the backToNormalPercentageOfMemoryUsed
     */
    public int getBackToNormalMemoryThreshold()
    {
        return backToNormalMemoryThreshold;
    }

    /**
     * @param memoryThreshold the memoryThreshold to set
     */
    public void setMemoryThreshold(int memoryThreshold)
    {
        this.memoryThreshold = memoryThreshold;
        if (logger.isInfoEnabled())
        {
            logger.info("Memory threshold set to " + this.memoryThreshold + "%");
        }
    }

    /**
     * @return the memoryThreshold
     */
    public int getMemoryThreshold()
    {
        return memoryThreshold;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.ss7.cap.api.congestion.CongestionMonitor#monitor()
     */
    @Override
    public void monitor()
    {
        Runtime runtime = Runtime.getRuntime();

        double allocatedMemory = runtime.totalMemory() / (double) 1024;
        double freeMemory = runtime.freeMemory() / (double) 1024;

        double totalFreeMemory = freeMemory + (maxMemory - allocatedMemory);

        this.percentageOfMemoryUsed = (((double) 100) - ((totalFreeMemory / maxMemory) * ((double) 100)));

        if (this.memoryTooHigh)
        {
            if (this.percentageOfMemoryUsed < this.backToNormalMemoryThreshold)
            {
                logger.warn("Memory used: " + percentageOfMemoryUsed + "% < to the back to normal memory threshold : "
                        + this.backToNormalMemoryThreshold);
                this.memoryTooHigh = false;

                // Lets notify the listeners
                for (CongestionListener listener : listeners)
                {

                    listener.onCongestionFinish(SOURCE);
                }
            }
        } else
        {
            if (this.percentageOfMemoryUsed > memoryThreshold)
            {
                logger.warn("Memory used: " + percentageOfMemoryUsed + "% > to the memory threshold : " + this
                        .memoryThreshold);
                this.memoryTooHigh = true;

                // Lets notify the listeners
                for (CongestionListener listener : listeners)
                {

                    listener.onCongestionStart(SOURCE);
                }
            }
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.ss7.cap.api.congestion.CongestionMonitor#addCongestionListener(
     * org.mobicents.protocols.ss7.cap.api.congestion.CongestionListener)
     */
    @Override
    public void addCongestionListener(CongestionListener listener)
    {
        this.listeners.add(listener);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.ss7.cap.api.congestion.CongestionMonitor#removeCongestionListener
     * (org.mobicents.protocols.ss7.cap.api.congestion.CongestionListener)
     */
    @Override
    public void removeCongestionListener(CongestionListener listener)
    {
        this.listeners.remove(listener);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.ss7.cap.api.congestion.CongestionMonitor#getSource()
     */
    @Override
    public String getSource()
    {
        return SOURCE;
    }

}
