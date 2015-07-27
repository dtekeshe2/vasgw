package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.M3UAManagementEventListener;
import za.co.ebridge.m3ua.api.State;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.FSMStateEventHandler;

import java.util.List;

public abstract class SEHAsStateEnterInactive
        implements FSMStateEventHandler
{

    private static final Logger logger = Logger.getLogger(SEHAsStateEnterInactive.class);

    private AsImpl asImpl;

    public SEHAsStateEnterInactive(AsImpl asImpl)
    {
        this.asImpl = asImpl;
    }

    @Override
    public void onEvent(FSMState state)
    {
        // Call listener and indicate of state change only if not already done
        if (!this.asImpl.state.getName().equals(State.STATE_INACTIVE))
        {
            AsState oldState = AsState.getState(this.asImpl.state.getName());
            this.asImpl.state = AsState.INACTIVE;

            List<M3UAManagementEventListener> managementEventListenersTmp
                    = this.asImpl.m3UAManagementImpl.managementEventListeners;

            for ( M3UAManagementEventListener m3uaManagementEventListener : managementEventListenersTmp )
            {
                try
                {
                    m3uaManagementEventListener.onAsInactive(this.asImpl, oldState);
                }
                catch (Throwable ee)
                {
                    logger.error("Exception while invoking onAsInactive", ee);
                }
            }
        }
    }
}
