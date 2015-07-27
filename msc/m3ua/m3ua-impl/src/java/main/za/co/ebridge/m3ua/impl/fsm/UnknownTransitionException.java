package za.co.ebridge.m3ua.impl.fsm;

public class UnknownTransitionException
        extends Exception
{
    public UnknownTransitionException()
    {
    }

    public UnknownTransitionException(String msg)
    {
        super(msg);
    }
}
