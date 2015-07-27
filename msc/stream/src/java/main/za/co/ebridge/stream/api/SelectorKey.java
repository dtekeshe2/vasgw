package za.co.ebridge.stream.api;

/**
 * SelectorKey. Implementation represents stream inside selector.
 */
public interface SelectorKey
{
    /**
     * Attach application specific object to this key. When underlying stream is
     * ready for IO and key is returned, this attachment will be accessible.
     *
     * @param obj
     */
    public void attach(Object obj);

    /**
     * Gets attachemnt.
     *
     * @return
     */
    public Object attachment();

    /**
     * Returns validity indicator.
     *
     * @return
     */
    public boolean isValid();

    /**
     * Indicates if underlying stream is ready to read.
     *
     * @return
     */
    public boolean isReadable();

    /**
     * Indicates if underlying stream is ready to write.
     *
     * @return
     */
    public boolean isWriteable();

    /**
     * Returns stream associated with this key
     *
     * @return
     */
    public Stream getStream();

    /**
     * Get selector for this key.
     *
     * @return
     */
    public StreamSelector getStreamSelector();

    /**
     * Cancels this key. Equals deregistration of stream
     */
    public void cancel(); // Oleg verify this.
}
