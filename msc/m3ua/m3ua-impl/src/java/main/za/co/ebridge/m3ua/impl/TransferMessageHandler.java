package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.message.transfer.PayloadData;
import za.co.ebridge.m3ua.api.parameter.ErrorCode;
import za.co.ebridge.m3ua.api.parameter.ProtocolData;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.fsm.FSM;
import za.co.ebridge.mtp.api.Mtp3TransferPrimitive;
import za.co.ebridge.mtp.api.Mtp3TransferPrimitiveFactory;

public class TransferMessageHandler
        extends MessageHandler
{
    private static final Logger logger = Logger.getLogger(TransferMessageHandler.class);

    private Mtp3TransferPrimitiveFactory mtp3TransferPrimitiveFactory = null;

    public TransferMessageHandler(AspFactoryImpl aspFactoryImpl)
    {
        super(aspFactoryImpl);
    }

    protected void setM3UAManagement(M3UAManagementImpl m3uaManagement)
    {
        this.mtp3TransferPrimitiveFactory = m3uaManagement.getMtp3TransferPrimitiveFactory();
    }

    public void handlePayload(PayloadData payload)
    {
        RoutingContext rc = payload.getRoutingContext();

        if (rc == null)
        {
            AspImpl aspImpl = this.getAspForNullRc();

            if (aspImpl == null)
            {
                // Error condition
                logger.error(String
                        .format("Rx : PayloadData=%s with null RC for Aspfactory=%s. But no ASP configured for null RC. Sending back Error",
                                payload, this.aspFactoryImpl.getName()));
                return;
            }

            FSM fsm = getAspFSMForRxPayload(aspImpl);
            AspState aspState = AspState.getState(fsm.getState().getName());

            if (aspState == AspState.ACTIVE)
            {
                ProtocolData protocolData = payload.getData();
                Mtp3TransferPrimitive mtp3TransferPrimitive
                        = this.mtp3TransferPrimitiveFactory
                                .createMtp3TransferPrimitive(
                                        protocolData.getSI(),
                                        protocolData.getNI(),
                                        protocolData.getMP(),
                                        protocolData.getOpc(),
                                        protocolData.getDpc(),
                                        protocolData.getSLS(),
                                        protocolData.getData());

                ((AsImpl) aspImpl.getAs())
                        .getM3UAManagement()
                        .sendTransferMessageToLocalUser(
                                    mtp3TransferPrimitive,
                                    payload.getData().getSLS());
            }
            else
            {
                logger.error(
                        String.format(
                                    "Rx : PayloadData for Aspfactory=%s with null RoutingContext. But ASP State=%s. " +
                                            "Message=%s", this.aspFactoryImpl.getName(), aspState, payload));
            }

        }
        else
        {
            // Payload is always for single AS
            long rcl = payload.getRoutingContext().getRoutingContexts()[0];
            AspImpl aspImpl = this.aspFactoryImpl.getAsp(rcl);

            if (aspImpl == null)
            {
                // this is error. Send back error
                RoutingContext rcObj = this.aspFactoryImpl.parameterFactory.createRoutingContext(new long[] { rcl });
                ErrorCode errorCodeObj = this.aspFactoryImpl.parameterFactory
                        .createErrorCode(ErrorCode.Invalid_Routing_Context);
                sendError(rcObj, errorCodeObj);
                logger.error(
                        String.format(
                            "Rx : Payload=%s with RC=%d for Aspfactory=%s. " +
                                    "But no ASP configured for this RC. Sending back Error",
                            payload, rcl, this.aspFactoryImpl.getName()));
                return;
            }

            FSM fsm = getAspFSMForRxPayload(aspImpl);
            AspState aspState = AspState.getState(fsm.getState().getName());

            if (aspState == AspState.ACTIVE)
            {
                ProtocolData protocolData = payload.getData();
                Mtp3TransferPrimitive mtp3TransferPrimitive
                        = this.mtp3TransferPrimitiveFactory.createMtp3TransferPrimitive(
                                                                protocolData.getSI(),
                                                                protocolData.getNI(),
                                                                protocolData.getMP(),
                                                                protocolData.getOpc(),
                                                                protocolData.getDpc(),
                                                                protocolData.getSLS(),
                                                                protocolData.getData());
                ((AsImpl) aspImpl.getAs())
                        .getM3UAManagement()
                        .sendTransferMessageToLocalUser( mtp3TransferPrimitive, payload.getData().getSLS());
            }
            else
            {
                logger.error(
                        String.format(
                                    "Rx : PayloadData for Aspfactory=%s for RoutingContext=%s. But ASP State=%s. " +
                                            "Message=%s", this.aspFactoryImpl.getName(), rc, aspState, payload));
            }
        }
    }
}
