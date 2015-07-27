package za.co.ebridge.asn.impl;

public class AsnException
        extends Exception
{

    public AsnException()
    {
    }

    public AsnException(String message)
    {
        super(message);
    }

    public AsnException(Throwable cause)
    {
        super(cause);
    }

    public AsnException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
