package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;
import za.co.ebridge.m3ua.impl.fsm.UnknownTransitionException;

/**
 * NTFY is received by this ASP stating that other ASP is ACTIVE and corresponding AS is Override traffic mode.
 * Hence this ASP should be moved to INACTIVE state
 */
public class THPeerAsActToActNtfyAltAspAct
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THPeerAsActToActNtfyAltAspAct.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THPeerAsActToActNtfyAltAspAct(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        AspImpl causeAsp = (AspImpl) this.fsm.getAttribute(AsImpl.ATTRIBUTE_ASP);

        try
        {
            FSM aspLocalFSM = causeAsp.getLocalFSM();
            aspLocalFSM.signal(TransitionState.OTHER_ALTERNATE_ASP_ACTIVE);
        }
        catch (UnknownTransitionException e)
        {
            logger.error(e.getMessage(), e);
        }
        return true;
    }

}
