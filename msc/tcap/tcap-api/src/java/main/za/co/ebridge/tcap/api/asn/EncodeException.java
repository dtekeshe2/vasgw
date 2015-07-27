package za.co.ebridge.tcap.api.asn;

/**
 * Thrown to indicate problems at encode time.
 */
public class EncodeException
        extends Exception
{

    public EncodeException()
    {
    }

    public EncodeException(String message)
    {
        super(message);
    }

    public EncodeException(Throwable cause)
    {
        super(cause);
    }

    public EncodeException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
