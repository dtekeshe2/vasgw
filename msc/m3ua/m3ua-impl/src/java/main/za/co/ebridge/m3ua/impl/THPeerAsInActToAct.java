package za.co.ebridge.m3ua.impl;

import javolution.util.FastSet;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THPeerAsInActToAct
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THPeerAsInActToAct.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    THPeerAsInActToAct(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    @Override
    public boolean process(FSMState state)
    {
        FastSet<AsStateListener> asStateListeners = this.asImpl.getAsStateListeners();

        for (AsStateListener asAsStateListener : asStateListeners)
        {

            try
            {
                asAsStateListener.onAsActive(this.asImpl);
            }
            catch (Exception e)
            {
                logger.error(String.format("Error while calling AsStateListener=%s onAsActive method for As=%s",
                        asAsStateListener, this.asImpl));
            }
        }
        return true;
    }
}
