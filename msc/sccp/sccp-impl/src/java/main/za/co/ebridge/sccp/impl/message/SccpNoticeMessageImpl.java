package za.co.ebridge.sccp.impl.message;

import java.io.IOException;

import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sccp.impl.parameter.AbstractParameter;
import za.co.ebridge.sccp.impl.parameter.ReturnCauseImpl;
import za.co.ebridge.sccp.api.message.SccpMessage;
import za.co.ebridge.sccp.api.message.SccpNoticeMessage;
import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.ReturnCause;
import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

/**
 * This class represents SCCP a connectionless notice message (UDTS, XUDTS and LUDTS)
 */
public class SccpNoticeMessageImpl
        extends SccpDataNoticeTemplateMessageImpl
        implements SccpNoticeMessage
{

    protected ReturnCause returnCause;

    /**
     * Create a SCCP-User originated message
     *
     * @param sccpStackImpl
     * @param type
     * @param returnCause
     * @param calledParty
     * @param callingParty
     * @param data
     * @param hopCounter
     * @param importance
     */
    protected SccpNoticeMessageImpl(
            SccpStackImpl sccpStackImpl, int type, ReturnCause returnCause, SccpAddress calledParty,
            SccpAddress callingParty, byte[] data, HopCounter hopCounter, Importance importance)
    {
        super(sccpStackImpl, type, 0, -1, calledParty, callingParty, data, hopCounter, importance);

        this.returnCause = returnCause;
    }

    /**
     * Create a MTP3 originated message
     *
     * @param sccpStackImpl
     * @param type
     * @param incomingOpc
     * @param incomingDpc
     * @param incomingSls
     */
    protected SccpNoticeMessageImpl(
            SccpStackImpl sccpStackImpl,
            int type,
            int incomingOpc,
            int incomingDpc,
            int incomingSls)
    {
        super(sccpStackImpl, type, incomingOpc, incomingDpc, incomingSls);
    }

    public ReturnCause getReturnCause()
    {
        return returnCause;
    }

    public void setReturnCause(ReturnCause rc)
    {
        this.returnCause = rc;
    }

    public boolean getReturnMessageOnError()
    {
        return false;
    }

    public void clearReturnMessageOnError()
    {
    }

    public boolean getSccpCreatesSls()
    {
        return true;
    }

    @Override
    protected boolean getSecondParamaterPresent()
    {
        return this.returnCause != null;
    }

    @Override
    protected byte[] getSecondParamaterData()
            throws
            IOException
    {
        return ((AbstractParameter) this.returnCause).encode();
    }

    @Override
    protected void setSecondParamaterData(int data)
            throws
            IOException
    {
        this.returnCause = new ReturnCauseImpl(ReturnCauseValue.getInstance(data));
    }

    @Override
    protected boolean getIsProtocolClass1()
    {
        return false;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Sccp Msg [Type=");
        switch (this.type)
        {
            case SccpMessage.MESSAGE_TYPE_UDTS:
                sb.append("UDTS");
                break;
            case SccpMessage.MESSAGE_TYPE_XUDTS:
                sb.append("XUDTS");
                break;
            case SccpMessage.MESSAGE_TYPE_LUDTS:
                sb.append("LUDTS");
                break;
        }
        sb.append(" sls=").append(this.sls).append(" returnCause=").append(this.returnCause).append(" incomingOpc=")
                .append(this.incomingOpc).append(" incomingDpc=").append(this.incomingDpc).append(" outgoingDpc=")
                .append(this.outgoingDpc).append(" CallingAddress(").append(this.callingParty).append(") CalledParty(")
                .append(this.calledParty).append(")");
        sb.append(" DataLen=");
        if (this.data != null)
            sb.append(this.data.length);
        return sb.toString();
    }
}
