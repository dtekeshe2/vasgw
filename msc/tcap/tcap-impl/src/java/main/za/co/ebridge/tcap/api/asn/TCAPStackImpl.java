package za.co.ebridge.tcap.api.asn;

import org.apache.log4j.Logger;
import za.co.ebridge.sccp.api.SccpProvider;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.TCAPCounterProvider;
import za.co.ebridge.tcap.api.api.TCAPProvider;
import za.co.ebridge.tcap.api.api.TCAPStack;

public class TCAPStackImpl
        implements TCAPStack
{

    private static final Logger logger =  Logger.getLogger("TCAPStackImpl.class");

    // default value of idle timeout and after TC_END remove of task.
    public static final long _DIALOG_TIMEOUT = 3600000;
    public static final long _INVOKE_TIMEOUT = 30000;
    public static final int _MAX_DIALOGS = 5000;
    public static final long _EMPTY_INVOKE_TIMEOUT = -1;
    // TCAP state data, it is used ONLY on client side
    protected TCAPProviderImpl tcapProvider;
    protected TCAPCounterProviderImpl tcapCounterProvider;
    private SccpProvider sccpProvider;
    private SccpAddress address;

    private final String name;

    private volatile boolean started = false;

    private long dialogTimeout = _DIALOG_TIMEOUT;
    private long invokeTimeout = _INVOKE_TIMEOUT;
    // TODO: make this configurable
    protected int maxDialogs = _MAX_DIALOGS;

    // TODO: make this configurable
    private long dialogIdRangeStart = 1;
    private long dialogIdRangeEnd = Integer.MAX_VALUE;
    private boolean previewMode = false;
    private boolean doNotSendProtocolVersion = false;
    private boolean statisticsEnabled = false;

    public TCAPStackImpl(String name)
    {
        super();
        this.name = name;
    }

    public TCAPStackImpl(String name, SccpProvider sccpProvider, Integer ... ssn)
    {
        this.logger.debug("TCAPStackImpl(" + ssn + ")");
        this.name = name;

        this.sccpProvider = sccpProvider;
        this.tcapProvider = new TCAPProviderImpl(sccpProvider, this, ssn);
        logger.debug("this.tcapProvider : " + this.tcapProvider);
        this.tcapCounterProvider = null; // new TCAPCounterProviderImpl(this.tcapProvider);
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void start()
            throws
            Exception
    {
        logger.info("Starting ..." + tcapProvider);

        if (this.getDialogIdRangeStart() >= this.getDialogIdRangeEnd())
            throw new IllegalArgumentException("Range start value cannot be equal/greater than Range end value");
        if (this.getDialogIdRangeStart() < 1)
            throw new IllegalArgumentException("Range start value must be greater or equal 1");
        if (this.getDialogIdRangeEnd() > Integer.MAX_VALUE)
            throw new IllegalArgumentException("Range end value must be less or equal " + Integer.MAX_VALUE);
        if ((this.getDialogIdRangeEnd() - this.getDialogIdRangeStart()) < 10000)
            throw new IllegalArgumentException("Range \"end - start\" must has at least 10000 possible dialogs");
        if ((this.getDialogIdRangeEnd() - this.getDialogIdRangeStart()) <= this.maxDialogs)
            throw new IllegalArgumentException("MaxDialog must be less than DialogIdRange");

        if (this.dialogTimeout < 0)
        {
            throw new IllegalArgumentException("DialogIdleTimeout value must be greater or equal to zero.");
        }

        if (this.dialogTimeout < this.invokeTimeout)
        {
            throw new IllegalArgumentException("DialogIdleTimeout value must be greater or equal to invoke timeout.");
        }

        if (this.invokeTimeout < 0)
        {
            throw new IllegalArgumentException("InvokeTimeout value must be greater or equal to zero.");
        }

        // this.tcapCounterProvider = new TCAPCounterProviderImpl(this.tcapProvider);
        tcapProvider.start();

        this.started = true;
    }

    public void stop()
    {
        this.tcapProvider.stop();
        this.started = false;
    }

    /**
     * @return the started
     */
    public boolean isStarted()
    {
        return this.started;
    }


    public TCAPProvider getProvider()
    {

        return tcapProvider;
    }

    @Override
    public TCAPCounterProvider getCounterProvider()
    {
        return tcapCounterProvider;
    }

    public TCAPCounterProviderImpl getCounterProviderImpl()
    {
        return tcapCounterProvider;
    }

    public void setDialogIdleTimeout(long v)
    {

        if (this.isStarted())
        {
            if (v < 0)
            {
                throw new IllegalArgumentException("DialogIdleTimeout value must be greater or equal to zero.");
            }
            if (v < this.invokeTimeout)
            {
                throw new IllegalArgumentException("DialogIdleTimeout value must be greater or equal to invoke " +
                        "timeout.");
            }
        }

        this.dialogTimeout = v;
    }

    public long getDialogIdleTimeout()
    {
        return this.dialogTimeout;
    }

    public void setInvokeTimeout(long v)
    {
        if (this.isStarted())
        {
            if (v < 0)
            {
                throw new IllegalArgumentException("InvokeTimeout value must be greater or equal to zero.");
            }
            if (v > this.dialogTimeout)
            {
                throw new IllegalArgumentException("InvokeTimeout value must be smaller or equal to dialog timeout.");
            }
        }
        this.invokeTimeout = v;
    }

    public long getInvokeTimeout()
    {
        return this.invokeTimeout;
    }

    public void setMaxDialogs(int v)
    {
        if (v < 1)
            throw new IllegalArgumentException("At least one Dialog must be accepted");
        if (v >= dialogIdRangeEnd - dialogIdRangeStart)
            throw new IllegalArgumentException("MaxDialog must be less than DialogIdRange");

        maxDialogs = v;
    }

    public int getMaxDialogs()
    {
        return maxDialogs;
    }

    public void setDialogIdRangeStart(long val)
    {
        dialogIdRangeStart = val;
    }

    public void setDialogIdRangeEnd(long val)
    {
        dialogIdRangeEnd = val;
    }

    public long getDialogIdRangeStart()
    {
        return dialogIdRangeStart;
    }

    public long getDialogIdRangeEnd()
    {
        return dialogIdRangeEnd;
    }

    public void setPreviewMode(boolean val)
    {
        previewMode = val;
    }

    public boolean getPreviewMode()
    {
        return previewMode;
    }

    @Override
    public void setDoNotSendProtocolVersion(boolean val)
    {
        doNotSendProtocolVersion = val;
    }

    @Override
    public boolean getDoNotSendProtocolVersion()
    {
        return doNotSendProtocolVersion;
    }

    @Override
    public void setStatisticsEnabled(boolean val)
    {
//        if (started)
//        {
//            this.tcapCounterProvider = new TCAPCounterProviderImpl(this.tcapProvider);
//        }
//        statisticsEnabled = val;
        statisticsEnabled = false;
    }

    @Override
    public boolean getStatisticsEnabled()
    {
        return statisticsEnabled;
    }

}
