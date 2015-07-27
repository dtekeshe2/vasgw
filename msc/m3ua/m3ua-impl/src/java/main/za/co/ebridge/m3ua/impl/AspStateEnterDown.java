package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.M3UAManagementEventListener;
import za.co.ebridge.m3ua.api.State;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.FSMStateEventHandler;

import java.util.List;

public class AspStateEnterDown
        implements FSMStateEventHandler
{

    private static final Logger logger = Logger.getLogger(AspStateEnterDown.class);

    private final AspImpl aspImpl;

    public AspStateEnterDown(AspImpl aspImpl)
    {
        this.aspImpl = aspImpl;
    }

    @Override
    public void onEvent(FSMState state)
    {

        // Call listener and indicate of state change only if not already done
        if (!this.aspImpl.state.getName().equals(State.STATE_DOWN))
        {
            AspState oldState = AspState.getState(this.aspImpl.state.getName());
            this.aspImpl.state = AspState.DOWN;

            List<M3UAManagementEventListener> managementEventListenersTmp
                    = this.aspImpl.aspFactoryImpl.m3UAManagementImpl.managementEventListeners;

            for (M3UAManagementEventListener m3uaManagementEventListener : managementEventListenersTmp)
            {

                try
                {
                    m3uaManagementEventListener.onAspDown(this.aspImpl, oldState);
                } catch (Throwable ee)
                {
                    logger.error("Exception while invoking onAspDown", ee);
                }
            }
        }
    }
}
