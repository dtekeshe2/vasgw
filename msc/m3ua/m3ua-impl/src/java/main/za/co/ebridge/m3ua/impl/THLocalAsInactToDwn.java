/* eBridge SS7 */
package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THLocalAsInactToDwn
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THLocalAsInactToDwn.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THLocalAsInactToDwn(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    int inactCount = 0;

    public boolean process(FSMState state)
    {
        inactCount = 0;

        try
        {

            for (Asp asp : this.asImpl.applicationServerProcesses)
            {

                AspImpl remAspImpl = (AspImpl) asp;

                FSM aspPeerFSM = remAspImpl.getPeerFSM();
                AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                if (aspState == AspState.INACTIVE)
                {
                    inactCount++;
                }
            }

            if (inactCount > 0)
            {
                // We have atleast one more ASP in INACTIVE state, the AS should
                // remain INACTIVE
                return false;
            }

            return true;
        }
        catch (Exception e)
        {
            logger.error(String.format("Error while translating Rem AS to DOWN. %s", this.fsm.toString()), e);
        }
        // something wrong
        return false;

    }
}
