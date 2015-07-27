/* eBridge SS7 */
package za.co.ebridge.m3ua.impl;

import javolution.util.FastSet;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.api.ExchangeType;
import za.co.ebridge.m3ua.api.Functionality;
import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.mgmt.Notify;
import za.co.ebridge.m3ua.api.parameter.Status;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THLocalAsInactToAct
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THLocalAsInactToAct.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    private int lbCount = 0;

    public THLocalAsInactToAct(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        try
        {

            if (this.asImpl.getTrafficModeType().getMode() == TrafficModeType.Broadcast)
            {
                // We don't handle this
                return false;
            }

            // For Traffic Mode Type = load-balancing, need to check policy to
            // have 'minAspActiveForLb' ASP's ACTIVE before AS_ACTIVE NOTIFY is
            // sent.
            if (this.asImpl.getTrafficModeType().getMode() == TrafficModeType.Loadshare)
            {
                lbCount = this.asImpl.getMinAspActiveForLb();

                // Find out how many ASP's are ACTIVE now
                for (Asp asp : this.asImpl.applicationServerProcesses)
                {

                    AspImpl remAspImpl = (AspImpl) asp;
                    FSM aspPeerFSM = remAspImpl.getPeerFSM();
                    AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                    if (aspState == AspState.ACTIVE)
                    {
                        lbCount--;
                    }
                }

                if (lbCount > 0)
                {
                    // We still need more ASP ACTIVE before AS is ACTIVE
                    return false;
                }
            }

            // Iterate through ASP's and send AS_ACTIVE to ASP's who
            // are INACTIVE or ACTIVE
            if (asImpl.getFunctionality() != Functionality.IPSP)
            {
                // Send Notify only for ASP or SGW

                for (Asp remAsp : this.asImpl.applicationServerProcesses)
                {

                    AspImpl remAspImpl = (AspImpl) remAsp;

                    FSM aspPeerFSM = remAspImpl.getPeerFSM();
                    AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                    if (aspState == AspState.INACTIVE || aspState == AspState.ACTIVE)
                    {
                        Notify msg = createNotify(remAspImpl);
                        remAspImpl.getAspFactory().write(msg);
                    }
                }
            }

            // We want to pass MTP3 RESUME only for SE. If its DE the peer transition handler will take care of MTP3 RESUME
            if (asImpl.getExchangeType() == ExchangeType.SE)
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
            }

            return true;
        }
        catch (Exception e)
        {
            logger.error(String.format("Error while translating Rem AS to INACTIVE. %s", this.fsm.toString()), e);
        }
        // something wrong
        return false;
    }

    private Notify createNotify(AspImpl remAsp)
    {
        Notify msg = (Notify) this.asImpl.getMessageFactory().createMessage(MessageClass.MANAGEMENT, MessageType.NOTIFY);

        Status status = this.asImpl.getParameterFactory().createStatus(Status.STATUS_AS_State_Change, Status.INFO_AS_ACTIVE);
        msg.setStatus(status);

        if (remAsp.getASPIdentifier() != null)
        {
            msg.setASPIdentifier(remAsp.getASPIdentifier());
        }

        if (this.asImpl.getRoutingContext() != null)
        {
            msg.setRoutingContext(this.asImpl.getRoutingContext());
        }

        return msg;
    }

}
