/* eBridge SS7 */
package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.ExchangeType;
import za.co.ebridge.m3ua.api.Functionality;
import za.co.ebridge.m3ua.api.IPSPType;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.m3ua.impl.fsm.UnknownTransitionException;
import za.co.ebridge.m3ua.api.message.mgmt.Error;
import za.co.ebridge.m3ua.api.message.mgmt.Notify;
import za.co.ebridge.m3ua.api.parameter.ErrorCode;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

/**
 *
 * @author amit bhayani
 *
 */
public class ManagementMessageHandler extends MessageHandler {

    private static final Logger logger = Logger.getLogger(ManagementMessageHandler.class);

    public ManagementMessageHandler(AspFactoryImpl aspFactoryImpl) {
        super(aspFactoryImpl);
    }

    public void handleNotify(Notify notify) {

        RoutingContext rc = notify.getRoutingContext();

        if (aspFactoryImpl.getFunctionality() == Functionality.AS
                || (aspFactoryImpl.getFunctionality() == Functionality.SGW && aspFactoryImpl.getExchangeType() == ExchangeType.DE)
                || (aspFactoryImpl.getFunctionality() == Functionality.IPSP && aspFactoryImpl.getExchangeType() == ExchangeType.DE)
                || (aspFactoryImpl.getFunctionality() == Functionality.IPSP
                        && aspFactoryImpl.getExchangeType() == ExchangeType.SE && aspFactoryImpl.getIpspType() == IPSPType.CLIENT)) {

            if (rc == null) {

                AspImpl aspImpl = this.getAspForNullRc();
                if (aspImpl == null) {
                    logger.error(String
                            .format("Rx : NTFY=%s with null RC for Aspfactory=%s. But no ASP configured for null RC. Sending back Error",
                                    notify, this.aspFactoryImpl.getName()));
                    return;
                }

                try {
                    // Received NTFY, so peer FSM has to be used.
                    FSM fsm = ((AsImpl) aspImpl.getAs()).getPeerFSM();

                    if (fsm == null) {
                        logger.error(String.format("Received NTFY=%s for ASP=%s. But Peer FSM is null.", notify,
                                this.aspFactoryImpl.getName()));
                        return;
                    }
                    fsm.setAttribute(AsImpl.ATTRIBUTE_ASP, aspImpl);
                    fsm.signal(TransitionState.getTransition(notify));
                } catch (UnknownTransitionException e) {
                    logger.error(e.getMessage(), e);
                }
            } else {
                long[] rcs = notify.getRoutingContext().getRoutingContexts();
                for (int count = 0; count < rcs.length; count++) {
                    AspImpl aspImpl = this.aspFactoryImpl.getAsp(rcs[count]);

                    if (aspImpl == null) {
                        // this is error. Send back error
                        RoutingContext rcObj = this.aspFactoryImpl.parameterFactory
                                .createRoutingContext(new long[] { rcs[count] });
                        ErrorCode errorCodeObj = this.aspFactoryImpl.parameterFactory
                                .createErrorCode(ErrorCode.Invalid_Routing_Context);
                        sendError(rcObj, errorCodeObj);
                        logger.error(String
                                .format("Rx : NTFY=%s with RC=%d for Aspfactory=%s. But no ASP configured for this RC. Sending back Error",
                                        notify, rcs[count], this.aspFactoryImpl.getName()));
                        continue;
                    }

                    try {
                        // Received NTFY, so peer FSM has to be set.
                        FSM fsm = ((AsImpl) aspImpl.getAs()).getPeerFSM();

                        if (fsm == null) {
                            logger.error(String.format("Received NTFY=%s for ASP=%s. But Peer FSM is null.", notify,
                                    this.aspFactoryImpl.getName()));
                            return;
                        }
                        fsm.setAttribute(AsImpl.ATTRIBUTE_ASP, aspImpl);
                        fsm.signal(TransitionState.getTransition(notify));
                    } catch (UnknownTransitionException e) {
                        logger.error(e.getMessage(), e);
                    }
                }// end of for
            }// if (rc == null) {
        } else {
            // NTFY is unexpected in this state
            ErrorCode errorCodeObj = this.aspFactoryImpl.parameterFactory.createErrorCode(ErrorCode.Unexpected_Message);
            sendError(rc, errorCodeObj);
        }

    }

    public void handleError(Error error) {
        logger.error(error);
    }

}
