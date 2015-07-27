package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.UnknownTransitionException;

public class SEHPeerAsStateEnterPen
        extends SEHAsStateEnterPen
{

    private static final Logger logger = Logger.getLogger(SEHPeerAsStateEnterPen.class);

    /**
     * @param asImpl
     * @param fsm
     */
    public SEHPeerAsStateEnterPen(AsImpl asImpl, FSM fsm)
    {
        super(asImpl, fsm);
    }

    @Override
    public void onEvent(FSMState state)
    {
        super.onEvent(state);

        // If there is even one ASP in INACTIVE state for this AS, ACTIVATE it
        for (Asp asp : asImpl.applicationServerProcesses)
        {
            AspImpl aspImpl = (AspImpl) asp;

            FSM aspLocalFSM = aspImpl.getLocalFSM();

            if (AspState.getState(aspLocalFSM.getState().getName()) == AspState.INACTIVE)
            {
                AspFactoryImpl aspFactoryImpl = aspImpl.getAspFactory();
                aspFactoryImpl.sendAspActive(this.asImpl);

                // Transition the state of ASP to ACTIVE_SENT
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
    }

}
