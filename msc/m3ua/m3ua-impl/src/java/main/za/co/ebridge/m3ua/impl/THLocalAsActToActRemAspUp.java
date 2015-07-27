package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.mgmt.Notify;
import za.co.ebridge.m3ua.api.parameter.Status;
import za.co.ebridge.m3ua.impl.fsm.FSMState;
import za.co.ebridge.m3ua.impl.fsm.TransitionHandler;

public class THLocalAsActToActRemAspUp
        implements TransitionHandler
{

    private static final Logger logger = Logger.getLogger(THLocalAsActToActRemAspUp.class);

    private AsImpl asImpl = null;
    private FSM fsm;

    public THLocalAsActToActRemAspUp(AsImpl asImpl, FSM fsm)
    {
        this.asImpl = asImpl;
        this.fsm = fsm;
    }

    public boolean process(FSMState state)
    {
        try
        {

            AspImpl remAsp = (AspImpl) this.fsm.getAttribute(AsImpl.ATTRIBUTE_ASP);

            if (remAsp == null)
            {
                logger.error(String.format("No ASP found. %s", this.fsm.toString()));
                return false;
            }

            // Send AS is ACTIVE notify
            Notify msg = createNotify(remAsp);
            remAsp.getAspFactory().write(msg);
            return true;
        }
        catch (Exception e)
        {
            logger.error(String.format("Error while translating Rem AS to INACTIVE message. %s", this.fsm.toString())
                    , e);
        }
        return false;
    }

    private Notify createNotify(AspImpl remAsp)
    {
        Notify msg = (Notify) this.asImpl.getMessageFactory().createMessage(MessageClass.MANAGEMENT, MessageType
                .NOTIFY);

        Status status = this.asImpl.getParameterFactory().createStatus(Status.STATUS_AS_State_Change, Status
                .INFO_AS_ACTIVE);
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
