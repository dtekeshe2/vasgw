package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.M3UAManagementEventListener;
import za.co.ebridge.m3ua.api.State;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.FSMStateEventHandler;

import java.util.List;

public abstract class SEHAsStateEnterPen
        implements FSMStateEventHandler
{

    private static final Logger logger = Logger.getLogger(SEHAsStateEnterPen.class);

    protected AsImpl asImpl = null;
    private FSM fsm;

    public SEHAsStateEnterPen(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public void onEvent(FSMState state)
    {
        if (logger.isDebugEnabled())
        {
            logger.debug(String.format("Entered in PENDING state for As=%s", asImpl.getName()));
        }

        if (!this.asImpl.state.getName().equals(State.STATE_PENDING))
        {
            AsState oldState = AsState.getState(this.asImpl.state.getName());
            this.asImpl.state = AsState.PENDING;

            List<M3UAManagementEventListener> managementEventListenersTmp = this.asImpl.m3UAManagementImpl.managementEventListeners;

            for (M3UAManagementEventListener m3uaManagementEventListener : managementEventListenersTmp)
            {

                try
                {
                    m3uaManagementEventListener.onAsPending(this.asImpl, oldState);
                }
                catch (Throwable ee)
                {
                    logger.error("Exception while invoking onAsPending", ee);
                }
            }
        }
    }
}
