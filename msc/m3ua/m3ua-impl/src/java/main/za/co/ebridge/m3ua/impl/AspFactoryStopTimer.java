package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.impl.scheduler.M3UATask;

public class AspFactoryStopTimer
        extends M3UATask
{
    private static Logger logger = Logger.getLogger(AspFactoryStopTimer.class);

    private int STOP_TIMER_TIMEOUT = 3000;

    private AspFactoryImpl aspFactoryImpl = null;

    private long initiatedTime = 0L;

    public AspFactoryStopTimer(AspFactoryImpl aspFactoryImpl)
    {
        super();
        this.aspFactoryImpl = aspFactoryImpl;
        this.initiatedTime = System.currentTimeMillis();
    }

    @Override
    public void tick(long now)
    {
        if (now - this.initiatedTime >= STOP_TIMER_TIMEOUT)
        {
            if (this.aspFactoryImpl.association.isConnected())
            {
                logger.warn(String
                        .format("Asp=%s was stopped but underlying Association=%s was not stopped after TIMEOUT=%d ms." +
                                        " Forcing stop now",
                                this.aspFactoryImpl.getName(), this.aspFactoryImpl.association.getName(),
                                STOP_TIMER_TIMEOUT));
                try
                {
                    this.aspFactoryImpl.transportManagement.stopAssociation(this.aspFactoryImpl.association.getName());
                }
                catch (Exception e)
                {
                    logger.error(String.format("Exception while trying to stop Association=%s",
                            this.aspFactoryImpl.association.getName()));
                }
            }
            this.cancel();
        }
    }
}
