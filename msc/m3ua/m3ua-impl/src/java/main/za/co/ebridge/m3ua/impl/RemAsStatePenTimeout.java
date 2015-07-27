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
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.FSMStateEventHandler;
import za.co.ebridge.m3ua.impl.fsm.UnknownTransitionException;

/**
 * {@link RemAsStatePenTimeout#onEvent(FSMState)} is called when the pending timer T(r) expires.
 */
public class RemAsStatePenTimeout
        implements FSMStateEventHandler
{

    private AsImpl asImpl;
    private FSM fsm;
    private static final Logger logger = Logger.getLogger(RemAsStatePenTimeout.class);

    boolean inactive = false;

    public RemAsStatePenTimeout(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    /**
     * <p>
     * An active ASP has transitioned to ASP-INACTIVE or ASP DOWN and it was the last remaining active ASP in the AS. A recovery
     * timer T(r) SHOULD be started, and all incoming signalling messages SHOULD be queued by the SGP. If an ASP becomes
     * ASP-ACTIVE before T(r) expires, the AS is moved to the AS-ACTIVE state, and all the queued messages will be sent to the
     * ASP.
     * </p>
     * <p>
     * If T(r) expires before an ASP becomes ASP-ACTIVE, and the SGP has no alternative, the SGP may stop queuing messages and
     * discard all previously queued messages. The AS will move to the AS-INACTIVE state if at least one ASP is in ASP-INACTIVE;
     * otherwise, it will move to AS-DOWN state.
     * </p>
     */
    public void onEvent(FSMState state)
    {
        this.inactive = false;

        // Clear the Pending Queue for this As
        this.asImpl.clearPendingQueue();

        // check if there are any ASP's who are INACTIVE, transition to
        // INACTIVE else DOWN

        for (Asp asp : this.asImpl.applicationServerProcesses)
        {

            AspImpl remAspImpl = (AspImpl) asp;

            FSM aspPeerFSM = remAspImpl.getPeerFSM();
            AspState aspState = AspState.getState(aspPeerFSM.getState().getName());

            if (aspState == AspState.INACTIVE)
            {
                try
                {

                    if (!this.inactive)
                    {
                        this.fsm.signal(TransitionState.AS_INACTIVE);
                        inactive = true;
                    }

                    if (this.asImpl.getFunctionality() != Functionality.IPSP)
                    {
                        Notify msg = createNotify(remAspImpl);
                        remAspImpl.getAspFactory().write(msg);
                    }
                }
                catch (UnknownTransitionException e)
                {
                    logger.error(String.format("Error while translating Rem AS to INACTIVE. %s", this.fsm.toString()), e);
                }

            }// if (remAspImpl.getState() == AspState.INACTIVE)
        }// for

        if (!this.inactive)
        {
            // else transition to DOWN
            try
            {
                this.fsm.signal(TransitionState.AS_DOWN);
                inactive = true;
            }
            catch (UnknownTransitionException e)
            {
                logger.error(String.format("Error while translating Rem AS to DOWN. %s", this.fsm.toString()), e);
            }
        }

        // We want to pass MTP3 PAUSE only for SE. If its DE the peer transition handler will take care of MTP3 PAUSE
        if (asImpl.getExchangeType() == ExchangeType.SE)
        {
            FastSet<AsStateListener> asStateListeners = this.asImpl.getAsStateListeners();

            for (AsStateListener asAsStateListener : asStateListeners)
            {
                try
                {
                    asAsStateListener.onAsInActive(this.asImpl);
                }
                catch (Exception e)
                {
                    logger.error(String.format("Error while calling AsStateListener=%s onAsInActive method for As=%s",
                            asAsStateListener, this.asImpl));
                }
            }
        }
    }

    private Notify createNotify(AspImpl remAsp)
    {
        Notify msg = (Notify) this.asImpl.getMessageFactory().createMessage(MessageClass.MANAGEMENT, MessageType.NOTIFY);

        Status status = this.asImpl.getParameterFactory().createStatus(Status.STATUS_AS_State_Change, Status.INFO_AS_INACTIVE);
        msg.setStatus(status);

        if (remAsp.getASPIdentifier() != null)
        {
            msg.setASPIdentifier(remAsp.getASPIdentifier());
        }

        msg.setRoutingContext(this.asImpl.getRoutingContext());

        return msg;
    }

}
