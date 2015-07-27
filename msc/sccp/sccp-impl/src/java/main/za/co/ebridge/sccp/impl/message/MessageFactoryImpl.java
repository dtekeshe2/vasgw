package za.co.ebridge.sccp.impl.message;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sccp.impl.parameter.ProtocolClassImpl;
import za.co.ebridge.sccp.api.message.MessageFactory;
import za.co.ebridge.sccp.api.message.SccpDataMessage;
import za.co.ebridge.sccp.api.message.SccpMessage;
import za.co.ebridge.sccp.api.message.SccpNoticeMessage;
import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.ReturnCause;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public class MessageFactoryImpl
        implements MessageFactory
{
    private static final Logger logger = Logger.getLogger(MessageFactoryImpl.class);

    private transient SccpStackImpl sccpStackImpl;

    public MessageFactoryImpl(SccpStackImpl sccpStackImpl)
    {
        this.sccpStackImpl = sccpStackImpl;
    }

    public SccpDataMessage createDataMessageClass0(
            SccpAddress calledParty, SccpAddress callingParty, byte[] data,
            int localSsn, boolean returnMessageOnError, HopCounter hopCounter, Importance importance)
    {
        return new SccpDataMessageImpl(this.sccpStackImpl, new ProtocolClassImpl(0, returnMessageOnError),
                sccpStackImpl.newSls(), localSsn, calledParty, callingParty, data, hopCounter, importance);
    }

    public SccpDataMessage createDataMessageClass1(
            SccpAddress calledParty, SccpAddress callingParty, byte[] data, int sls,
            int localSsn, boolean returnMessageOnError, HopCounter hopCounter, Importance importance)
    {
        return new SccpDataMessageImpl(this.sccpStackImpl, new ProtocolClassImpl(1, returnMessageOnError), sls,
                localSsn,
                calledParty, callingParty, data, hopCounter, importance);
    }

    public SccpNoticeMessage createNoticeMessage(
            int origMsgType, ReturnCause returnCause, SccpAddress calledParty,
            SccpAddress callingParty, byte[] data, HopCounter hopCounter, Importance importance)
    {
        int type = SccpMessage.MESSAGE_TYPE_UNDEFINED;
        switch (origMsgType)
        {
            case SccpMessage.MESSAGE_TYPE_UDT:
                type = SccpMessage.MESSAGE_TYPE_UDTS;
                break;
            case SccpMessage.MESSAGE_TYPE_XUDT:
                type = SccpMessage.MESSAGE_TYPE_XUDTS;
                break;
            case SccpMessage.MESSAGE_TYPE_LUDT:
                type = SccpMessage.MESSAGE_TYPE_LUDTS;
                break;
        }

        return new SccpNoticeMessageImpl(this.sccpStackImpl, type, returnCause, calledParty, callingParty, data,
                hopCounter,
                importance);
    }

    public SccpMessageImpl createMessage(int type, int opc, int dpc, int sls, InputStream in)
            throws
            IOException
    {
        SccpMessageImpl msg = null;
        switch (type)
        {
            case SccpMessage.MESSAGE_TYPE_UDT:
            case SccpMessage.MESSAGE_TYPE_XUDT:
            case SccpMessage.MESSAGE_TYPE_LUDT:
                msg = new SccpDataMessageImpl(this.sccpStackImpl, type, opc, dpc, sls);
                break;

            case SccpMessage.MESSAGE_TYPE_UDTS:
            case SccpMessage.MESSAGE_TYPE_XUDTS:
            case SccpMessage.MESSAGE_TYPE_LUDTS:
                msg = new SccpNoticeMessageImpl(this.sccpStackImpl, type, opc, dpc, sls);
                break;
        }

        if (msg != null)
        {
            msg.decode(in);
        } else if (logger.isEnabledFor(Level.WARN))
        {
            logger.warn("No message implementation for MT: " + type);
        }
        return msg;
    }
}
