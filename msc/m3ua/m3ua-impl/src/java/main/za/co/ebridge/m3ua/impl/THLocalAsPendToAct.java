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
 * <p>
 * Transition's the { RemAsImpl} from {@link AsState#PENDING} to
 * {@link AsState#ACTIVE}. Send's AS_ACTIVE notification to all {@link AspImpl} within
 * this As that are {@link AspState#ACTIVE}
 * </p>
 * <p/>
 * <p>
 * Also initiates sending of PayloadData from the pending queue of this As.
 * </p>
 */
public class THLocalAsPendToAct
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THLocalAsPendToAct.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THLocalAsPendToAct(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {

        if (this.asImpl.getTrafficModeType().getMode() == TrafficModeType.Broadcast)
        {
            // We don't handle this
            return false;
        }

        try
        {

            if (asImpl.getFunctionality() != Functionality.IPSP)
            {
                // Send Notify only for ASP or SGW

                // Iterate through ASP's and send AS_ACTIVE to ASP's who
                // are INACTIVE or ACTIVE
                for (Asp asp : this.asImpl.applicationServerProcesses)
                {

                    AspImpl remAspImpl = (AspImpl) asp;

                    FSM aspPeerFSM = remAspImpl.getPeerFSM();
                    AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

                    if (aspState == AspState.INACTIVE || aspState == AspState.ACTIVE)
                    {
                        Notify msg = createNotify(remAspImpl);
                        remAspImpl.getAspFactory().write(msg);
                    }
                }// end of for
            }

            // Send the PayloadData (if any) from pending queue to other side
            AspImpl causeAsp = (AspImpl) this.fsm.getAttribute(AsImpl.ATTRIBUTE_ASP);
            this.asImpl.sendPendingPayloadData(causeAsp);

            return true;
        }
        catch (Exception e)
        {
            logger.error(String.format("Error while translating Rem AS to INACTIVE message. %s", this.fsm.toString()), e);
        }
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
