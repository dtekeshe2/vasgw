package za.co.ebridge.sccp.impl.message;

import java.io.IOException;

import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sccp.impl.parameter.AbstractParameter;
import za.co.ebridge.sccp.impl.parameter.ProtocolClassImpl;
import za.co.ebridge.sccp.api.message.SccpDataMessage;
import za.co.ebridge.sccp.api.message.SccpMessage;
import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.ProtocolClass;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

/**
 * This class represents a SCCP message for connectionless data transfer (UDT, XUDT and LUDT)
 */
public class SccpDataMessageImpl
        extends SccpDataNoticeTemplateMessageImpl
        implements SccpDataMessage
{

    protected ProtocolClass protocolClass;

    /**
     * Create a SCCP-User originated message
     *
     * @param protocolClass
     * @param outgoingSls
     * @param calledParty
     * @param callingParty
     * @param data
     * @param hopCounter    This parameter may be null if you use the max value
     * @param importance    This parameter may be null if you use the default value
     */
    protected SccpDataMessageImpl(
            SccpStackImpl sccpStackImpl,
            ProtocolClass protocolClass,
            int outgoingSls,
            int localSsn,
            SccpAddress calledParty,
            SccpAddress callingParty,
            byte[] data,
            HopCounter hopCounter,
            Importance importance)
    {
        super(sccpStackImpl, SccpMessage.MESSAGE_TYPE_UNDEFINED, outgoingSls, localSsn, calledParty, callingParty, data,
                hopCounter, importance);

        this.protocolClass = protocolClass;
    }

    /**
     * Create a MTP3 originated message
     *
     * @param incomingOpc
     * @param incomingDpc
     * @param incomingSls
     */
    protected SccpDataMessageImpl(
            SccpStackImpl sccpStackImpl,
            int type,
            int incomingOpc,
            int incomingDpc,
            int incomingSls)
    {
        super(sccpStackImpl, type, incomingOpc, incomingDpc, incomingSls);
    }

    public ProtocolClass getProtocolClass()
    {
        return protocolClass;
    }

    public void setProtocolClass(ProtocolClass protocolClass)
    {
        this.protocolClass = protocolClass;
    }

    public boolean getReturnMessageOnError()
    {
        if (this.protocolClass != null)
            return this.protocolClass.getReturnMessageOnError();
        else
            return false;
    }

    public void clearReturnMessageOnError()
    {
        if (this.protocolClass != null)
            this.protocolClass.clearReturnMessageOnError();
    }

    public boolean getSccpCreatesSls()
    {
        if (this.protocolClass == null || this.protocolClass.getProtocolClass() == 0)
            return true;
        else
            return false;
    }

    @Override
    protected boolean getSecondParamaterPresent()
    {
        return protocolClass != null;
    }

    @Override
    protected byte[] getSecondParamaterData()
            throws
            IOException
    {
        return ((AbstractParameter) protocolClass).encode();
    }

    @Override
    protected void setSecondParamaterData(int data)
            throws
            IOException
    {
        protocolClass = new ProtocolClassImpl();
        ((AbstractParameter) protocolClass).decode(new byte[]{(byte) data});
    }

    @Override
    protected boolean getIsProtocolClass1()
    {
        return this.protocolClass.getProtocolClass() != 0;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Sccp Msg [Type=");
        switch (this.type)
        {
            case SccpMessage.MESSAGE_TYPE_UDT:
                sb.append("UDT");
                break;
            case SccpMessage.MESSAGE_TYPE_XUDT:
                sb.append("XUDT");
                break;
            case SccpMessage.MESSAGE_TYPE_LUDT:
                sb.append("LUDT");
                break;
        }
        sb.append(" sls=").append(this.sls).append(" incomingOpc=").append(this.incomingOpc).append(" incomingDpc=")
                .append(this.incomingDpc).append(" outgoingDpc=").append(this.outgoingDpc).append(" CallingAddress(")
                .append(this.callingParty).append(") CalledParty(").append(this.calledParty).append(")");
        if (this.importance != null)
        {
            sb.append(" importance=");
            sb.append(this.importance.getValue());
        }
        if (this.hopCounter != null)
        {
            sb.append(" hopCounter=");
            sb.append(this.hopCounter.getValue());
        }
        if (this.segmentation != null)
        {
            sb.append(" segmentation=");
            sb.append(this.segmentation.toString());
        }
        sb.append(" DataLen=");
        if (this.data != null)
            sb.append(this.data.length);
        sb.append("]");
        return sb.toString();
    }
}
