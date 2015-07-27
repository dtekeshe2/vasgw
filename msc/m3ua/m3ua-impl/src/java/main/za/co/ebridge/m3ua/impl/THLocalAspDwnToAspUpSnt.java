package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THLocalAspDwnToAspUpSnt
        implements TransitionHandler
{

    private AspImpl aspImpl;
    private FSM fsm;
    private static final Logger logger = Logger.getLogger(THLocalAspDwnToAspUpSnt.class);

    public THLocalAspDwnToAspUpSnt(AspImpl aspImpl, FSM fsm)
    {
        this.aspImpl = aspImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        this.aspImpl.getAspFactory().sendAspUp();
        return true;
    }

}
