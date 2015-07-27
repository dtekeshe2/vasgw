package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THPeerAsActToPen
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THPeerAsActToPen.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THPeerAsActToPen(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        AspImpl causeAsp = (AspImpl) this.fsm.getAttribute(AsImpl.ATTRIBUTE_ASP);

        // check if there is atleast one other ASP in ACTIVE state. If
        // yes this AS remains in ACTIVE state else goes in PENDING state.

        for (Asp asp : this.asImpl.applicationServerProcesses)
        {

            AspImpl aspImpl = (AspImpl) asp;
            FSM aspLocalFSM = aspImpl.getLocalFSM();
            AspState aspState = AspState.getState(aspLocalFSM.getState().getName());

            if (aspImpl != causeAsp && aspState == AspState.ACTIVE)
            {
                return false;
            }
        }
        return true;
    }

}
