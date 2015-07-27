package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.M3UAManagementEventListener;
import za.co.ebridge.m3ua.api.State;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.FSMStateEventHandler;

import java.util.List;

public abstract class SEHAsStateEnterActive
        implements FSMStateEventHandler
{

    private static final Logger logger = Logger.getLogger(SEHAsStateEnterActive.class);

    private AsImpl asImpl;

    public SEHAsStateEnterActive(AsImpl asImpl)
    {
        this.asImpl = asImpl;
    }

    @Override
    public void onEvent(FSMState state)
    {
        // Call listener and indicate of state change only if not already done
        if (!this.asImpl.state.getName().equals(State.STATE_ACTIVE))
        {
            AsState oldState = AsState.getState(this.asImpl.state.getName());
            this.asImpl.state = AsState.ACTIVE;

            List<M3UAManagementEventListener> managementEventListenersTmp
                    = this.asImpl.m3UAManagementImpl.managementEventListeners;

            for ( M3UAManagementEventListener m3uaManagementEventListener  : managementEventListenersTmp )
            {
                try
                {
                    m3uaManagementEventListener.onAsActive(this.asImpl, oldState);
                }
                catch (Throwable ee)
                {
                    logger.error("Exception while invoking onAsActive", ee);
                }
            }
        }
    }
}
