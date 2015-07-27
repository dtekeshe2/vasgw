package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THPeerAsInActToDwn
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THPeerAsActToPen.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THPeerAsInActToDwn(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        AspImpl causeAsp = (AspImpl) this.fsm.getAttribute(AsImpl.ATTRIBUTE_ASP);

        // check if there is atleast one other ASP in INACTIVE state. If
        // yes this AS remains in INACTIVE state else goes in DOWN state.
        for (Asp asp : this.asImpl.applicationServerProcesses)
        {

            AspImpl aspImpl = (AspImpl) asp;

            FSM aspLocalFSM = aspImpl.getLocalFSM();
            AspState aspState = AspState.getState(aspLocalFSM.getState().getName());

            if (aspImpl != causeAsp && aspState == AspState.INACTIVE)
            {
                return false;
            }
        }
        return true;
    }

}
