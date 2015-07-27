package za.co.ebridge.isup.api;

public class ParameterException
        extends Exception
{

    // TODO: add more info here.
    // private int paramCode;
    // private int msgCode;

    /**
     *
     */
    private static final long serialVersionUID = 8747311560315513861L;

    public ParameterException()
    {
        super();

    }

    public ParameterException(String message, Throwable cause)
    {
        super(message, cause);

    }

    public ParameterException(String message)
    {
        super(message);

    }

    public ParameterException(Throwable cause)
    {
        super(cause);

    }

}
