package za.co.ebridge.m3ua.impl.fsm;

public interface TransitionHandler
{
    boolean process(FSMState state);
}
