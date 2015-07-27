package za.co.ebridge.stream.api;

import java.io.IOException;
import java.util.List;

public interface StreamSelector
{

    public static final int OP_READ = 0x1;
    public static final int OP_WRITE = 0x2;

    /**
     * Performs query of registeres stream. Returns set of keys pointing to streams ready to perform IO.
     *
     * @param operation - operation which streams are queried. Value is equal to on of OP_X.
     * @param timeout
     * @return
     * @throws IOException
     */
    public List<SelectorKey> selectNow(int operation, int timeout)
            throws
            IOException;

    /**
     * Checks if selector has been closed.
     *
     * @return
     */
    public boolean isClosed();

    /**
     * closeses selector, removes all stream from internal register.
     */
    public void close();

    /**
     * Returns registered streams.
     *
     * @return
     */
    public List<Stream> getRegisteredStreams();
}
