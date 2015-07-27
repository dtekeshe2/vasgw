package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.parameter.Parameter;

public abstract class AbstractParameter
        implements Parameter
{ // implement
    // marker
    // interface.

    public abstract void decode(InputStream in)
            throws
            IOException;

    public abstract void encode(OutputStream os)
            throws
            IOException;

    /**
     * Accepts only body for decoding operation, that is leng and tag must be processed.
     *
     * @param b
     * @throws IOException
     */
    public abstract void decode(byte[] b)
            throws
            IOException;

    /**
     * Encodes only body of parameter, tag and len must be encoded.
     *
     * @return
     * @throws IOException
     */
    public abstract byte[] encode()
            throws
            IOException;
}
