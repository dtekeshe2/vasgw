package za.co.ebridge.tcap.api.api;

public interface TCAPStack
{

    /**
     * Returns the name of this stack
     *
     * @return
     */
    String getName();

    /**
     * Returns stack provider.
     *
     * @return
     */
    TCAPProvider getProvider();

    TCAPCounterProvider getCounterProvider();

    /**
     * Stops this stack and transport layer(SCCP)
     */
    void stop();

    /**
     * Start stack and transport layer(SCCP)
     *
     * @throws IllegalStateException - if stack is already running or not configured
     * @throws StartFailedException
     */
    void start()
            throws
            Exception;


    boolean isStarted();

    /**
     * Sets millisecond value for dialog timeout. It specifies how long dialog can be idle - not receive/send any
     * messages.
     *
     * @param l
     */
    void setDialogIdleTimeout(long l);

    long getDialogIdleTimeout();

    void setInvokeTimeout(long v);

    long getInvokeTimeout();

    /**
     * Sets the maximum number of dialogs allowed to be alive at a given time. If not set, a default value of 5000
     * dialogs will
     * be used.
     * <p/>
     * Important a: Default value may vary depending on the future implementations or changes to current implementation.
     * <p/>
     * Important b: If stack ranges provided, maximum number dialogs naturally cannot be greater than the provided
     * range, thus,
     * it will be normalized to range delta (end - start).
     *
     * @param v number of dialogs
     */
    void setMaxDialogs(int v);

    /**
     * @return Maximum number of allowed concurrent dialogs.
     */
    int getMaxDialogs();

    /**
     * Sets the start of the range of the generated dialog ids.
     */
    void setDialogIdRangeStart(long val);

    /**
     * Sets the start of the range of the generated dialog ids.
     */
    void setDialogIdRangeEnd(long val);

    /**
     * @return starting dialog id within the range
     */
    long getDialogIdRangeStart();

    /**
     * @return ending dialog id within the range
     */
    long getDialogIdRangeEnd();

    /**
     * previewMode is needed for special processing mode When PreviewMode in TCAP level we have: - we only listern
     * incoming
     * messages and sends nothing. send(), close(), sendComponent() and other such methods do nothing. - A TCAP
     * Dialog is
     * temporary. TCAP Dialog is discarded after any icoming message like TC-BEGIN or TC-CONTINUE has been processed
     * - for any
     * incoming messages (including TC-CONTINUE, TC-END, TC-ABORT) a new TCAP Dialog is created (end then deleted). -
     * no timers
     * and timeouts
     * <p/>
     * default state: no previewMode
     */
    void setPreviewMode(boolean val);

    /**
     * @return if areviewMode is active
     */
    boolean getPreviewMode();

    void setDoNotSendProtocolVersion(boolean val);

    boolean getDoNotSendProtocolVersion();

    void setStatisticsEnabled(boolean val);

    boolean getStatisticsEnabled();

}
