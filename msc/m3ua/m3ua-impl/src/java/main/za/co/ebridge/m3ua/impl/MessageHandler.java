package za.co.ebridge.m3ua.impl;

import za.co.ebridge.m3ua.api.ExchangeType;
import za.co.ebridge.m3ua.api.Functionality;
import za.co.ebridge.m3ua.api.IPSPType;
import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.mgmt.Error;
import za.co.ebridge.m3ua.api.parameter.ErrorCode;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.fsm.FSM;

public abstract class MessageHandler
{
    protected AspFactoryImpl aspFactoryImpl = null;

    public MessageHandler(AspFactoryImpl aspFactoryImpl)
    {
        this.aspFactoryImpl = aspFactoryImpl;
    }

    protected void sendError(RoutingContext rc, ErrorCode errorCode)
    {
        Error error = (Error)
                this.aspFactoryImpl.messageFactory.createMessage(MessageClass.MANAGEMENT, MessageType.ERROR);
        error.setErrorCode(errorCode);
        if (rc != null)
        {
            error.setRoutingContext(rc);
        }
        this.aspFactoryImpl.write(error);
    }

    /**
     * Get's the ASP for any ASP Traffic Maintenance, Management, Signalling Network Management
     * and Transfer m3ua message's received which has null Routing Context
     */
    protected AspImpl getAspForNullRc()
    {
        // We know if null RC, ASP cannot be shared and AspFactory will
        // have only one ASP

        AspImpl aspImpl = (AspImpl) this.aspFactoryImpl.aspList.get(0);

        if (this.aspFactoryImpl.aspList.size() > 1)
        {
            // verify that AS to which this ASP is added is also having null
            // RC or this asp is not shared by any other AS in which case we
            // know messages are intended for same AS

            ErrorCode errorCodeObj
                    = this.aspFactoryImpl.parameterFactory.createErrorCode(ErrorCode.Invalid_Routing_Context);
            sendError(null, errorCodeObj);
            return null;
        }

        return aspImpl;
    }

    protected FSM getAspFSMForRxPayload(AspImpl aspImpl)
    {
        FSM fsm = null;
        if (aspFactoryImpl.getFunctionality() == Functionality.AS
                || (aspFactoryImpl.getFunctionality() == Functionality.SGW
                        && aspFactoryImpl.getExchangeType() == ExchangeType.DE)
                || (aspFactoryImpl.getFunctionality() == Functionality.IPSP
                        && aspFactoryImpl.getExchangeType() == ExchangeType.DE)
                || (aspFactoryImpl.getFunctionality() == Functionality.IPSP
                        && aspFactoryImpl.getExchangeType() == ExchangeType.SE
                        && aspFactoryImpl.getIpspType() == IPSPType.CLIENT)) {
            fsm = aspImpl.getLocalFSM();

        }
        else
        {
            fsm = aspImpl.getPeerFSM();
        }

        return fsm;
    }
}
