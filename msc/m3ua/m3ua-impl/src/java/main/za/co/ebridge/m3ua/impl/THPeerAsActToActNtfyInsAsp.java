/* eBridge SS7 */
package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;
import za.co.ebridge.m3ua.impl.fsm.UnknownTransitionException;

/**
 * NTFY is received stating that there are insufficient ASP in ACTIVE state.
 * Hence check if AS has more ASP's in INACTIVE state.
 * If found make them ACTIVE
 */
public class THPeerAsActToActNtfyInsAsp
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THPeerAsActToActNtfyInsAsp.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THPeerAsActToActNtfyInsAsp(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        // Iterate through all the ASP for this AS and activate if they are
        // inactive
        for (Asp asp : this.asImpl.applicationServerProcesses)
        {

            AspImpl aspTemp = (AspImpl) asp;
            AspFactoryImpl factory = aspTemp.getAspFactory();

            FSM aspLocalFSM = aspTemp.getLocalFSM();
            AspState aspState = AspState.getState(aspLocalFSM.getState().getName());

            if (aspState == AspState.INACTIVE && factory.getStatus())
            {
                factory.sendAspActive(this.asImpl);
                try
                {
                    aspLocalFSM.signal(TransitionState.ASP_ACTIVE_SENT);
                }
                catch (UnknownTransitionException e)
                {
                    logger.error(e.getMessage(), e);
                }
            }
        }

        return true;
    }
}
