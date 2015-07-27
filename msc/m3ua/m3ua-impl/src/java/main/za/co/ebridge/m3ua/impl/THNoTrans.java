package za.co.ebridge.m3ua.impl;

import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

/**
 * Transition handler that doesn't cause State change
 */
public class THNoTrans
        implements TransitionHandler
{

    public THNoTrans()
    {
    }

    @Override
    public boolean process(FSMState state)
    {
        return false;
    }

}
