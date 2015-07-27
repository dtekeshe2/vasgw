package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.Asp;
import za.co.ebridge.m3ua.api.Functionality;
import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.mgmt.Notify;
import za.co.ebridge.m3ua.api.parameter.Status;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

/**
 * Transitions the { RemAsImpl} from { AsState.ACTIVE} to { AsState.PENDING}. The transition depends on
 * { TrafficModeType} defined for this { RemAsImpl} and { AspState} of enclosed { RemAsImpl}
 * If the { TrafficModeType} for this { RemAsImpl} is Loadshare and there are { RemAsImpl} that are still
 * { AspState.ACTIVE}, { RemAsImpl} remains { AsState.ACTIVE}. If number of { RemAsImpl} in
 * { AspState.ACTIVE} is greater than minimum Asp required for load balancing, it just returns false and transition doesn't
 * happen. However if number of { RemAsImpl} in { AspState.ACTIVE} is less than minimum Asp required for load
 * balancing, it sends { Status.INFO_Insufficient_ASP_Resources_Active} { Notify} to remote ASP who are
 * { AspState.INACTIVE} and transition doesn't happen.
 * If there are no { RemAsImpl} in { AspState.ACTIVE}, it transitions to { AsState.PENDIING} and sends
 * { Status.INFO_AS_PENDING} { Notify} to remote ASP who are { AspState.INACTIVE}.
 * If the { TrafficModeType} for this { RemAsImpl} is Override it transitions to { AsState.PENDIING} and sends
 * { Status.INFO_AS_PENDING} { Notify} to remote ASP who are { AspState.INACTIVE}.
 */
public class THLocalAsActToPendRemAspInac
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THLocalAsActToPendRemAspInac.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    private int lbCount = 0;

    public THLocalAsActToPendRemAspInac(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        try
        {
            AspImpl remAsp = (AspImpl) this.fsm.getAttribute(AsImpl.ATTRIBUTE_ASP);

            if (this.asImpl.getTrafficModeType().getMode() == TrafficModeType.Broadcast)
            {
                // We don't support this
                return false;

            }

            if (this.asImpl.getTrafficModeType().getMode() == TrafficModeType.Loadshare)
            {
                this.lbCount = 0;

                for (Asp asp : this.asImpl.applicationServerProcesses)
                {

                    AspImpl remAspImpl = (AspImpl) asp;

                    FSM aspPeerFSM = remAspImpl.getPeerFSM();
                    AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                    if (aspState == AspState.ACTIVE)
                    {
                        this.lbCount++;
                    }
                }// for

                if (this.lbCount >= this.asImpl.getMinAspActiveForLb())
                {
                    // we still have more ASP's ACTIVE for lb. Don't change
                    // state
                    return false;
                }

                // We are below minAspActiveForLb required for LB
                if (this.lbCount > 0)
                {
                    // But In any case if we have at least one ASP that can take
                    // care of traffic, don't change state but send the "Ins.
                    // ASPs" to INACTIVE ASP's

                    if (asImpl.getFunctionality() != Functionality.IPSP)
                    {
                        // In any case send Notify only for ASP or SGW

                        for (Asp asp : this.asImpl.applicationServerProcesses)
                        {

                            remAsp = (AspImpl) asp;

                            FSM aspPeerFSM = remAsp.getPeerFSM();
                            AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                            if (aspState == AspState.INACTIVE)
                            {
                                Notify notify = this.createNotify(remAsp, Status.STATUS_Other,
                                        Status.INFO_Insufficient_ASP_Resources_Active);
                                remAsp.getAspFactory().write(notify);
                            }
                        }
                    }

                    return false;
                }
            }// If Loadshare

            // We have reached here means AS is transitioning to be PENDING.
            // Send new AS STATUS to all INACTIVE APS's

            if (asImpl.getFunctionality() != Functionality.IPSP)
            {
                // Send Notify only for ASP or SGW

                for (Asp asp : this.asImpl.applicationServerProcesses)
                {

                    remAsp = (AspImpl) asp;

                    FSM aspPeerFSM = remAsp.getPeerFSM();
                    AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                    if (aspState == AspState.INACTIVE)
                    {
                        Notify notify = this.createNotify(remAsp, Status.STATUS_AS_State_Change, Status.INFO_AS_PENDING);
                        remAsp.getAspFactory().write(notify);
                    }
                }
            }
        }
        catch (Exception e)
        {
            logger.error(String.format("Error while translating Rem AS to PENDING. %s", this.fsm.toString()), e);
        }
        return true;
    }

    private Notify createNotify(AspImpl remAsp, int type, int info)
    {
        Notify msg = (Notify) this.asImpl.getMessageFactory().createMessage(MessageClass.MANAGEMENT, MessageType.NOTIFY);

        Status status = this.asImpl.getParameterFactory().createStatus(type, info);
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
