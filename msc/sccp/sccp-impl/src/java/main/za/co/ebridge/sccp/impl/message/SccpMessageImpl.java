package za.co.ebridge.sccp.impl.message;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import za.co.ebridge.sccp.api.LongMessageRuleType;
import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sccp.api.message.SccpMessage;

public abstract class SccpMessageImpl
        implements SccpMessage
{

    protected boolean isMtpOriginated;
    protected int type;
    protected int localOriginSsn = -1;
    protected SccpStackImpl sccpStackImpl;

    // These are MTP3 signaling information set when message is received from MTP3
    protected int incomingOpc;
    protected int incomingDpc;
    protected int sls;
    // These are MTP3 signaling information that will be set into a MTP3 message when sending to MTP3
    protected int outgoingDpc = -1;

    protected SccpMessageImpl(SccpStackImpl sccpStackImpl, int type, int sls, int localSsn)
    {
        this.isMtpOriginated = false;
        this.sccpStackImpl = sccpStackImpl;
        this.type = type;
        this.localOriginSsn = localSsn;
        this.incomingOpc = -1;
        this.incomingDpc = -1;
        this.sls = sls;
    }

    protected SccpMessageImpl(SccpStackImpl sccpStackImpl, int type, int incomingOpc, int incomingDpc, int incomingSls)
    {
        this.isMtpOriginated = true;
        this.sccpStackImpl = sccpStackImpl;
        this.type = type;
        this.incomingOpc = incomingOpc;
        this.incomingDpc = incomingDpc;
        this.sls = incomingSls;
    }

    public int getSls()
    {
        return sls;
    }

    public void setSls(int sls)
    {
        this.sls = sls;
    }

    public int getIncomingOpc()
    {
        return incomingOpc;
    }

    public void setIncomingOpc(int opc)
    {
        this.incomingOpc = opc;
    }

    public int getIncomingDpc()
    {
        return incomingDpc;
    }

    public int getOutgoingDpc()
    {
        return outgoingDpc;
    }

    public void setIncomingDpc(int dpc)
    {
        this.incomingDpc = dpc;
    }

    public void setOutgoingDpc(int dpc)
    {
        this.outgoingDpc = dpc;
    }

    public int getType()
    {
        return type;
    }

    public boolean getIsMtpOriginated()
    {
        return isMtpOriginated;
    }

    public int getOriginLocalSsn()
    {
        return localOriginSsn;
    }

    public abstract void decode(InputStream in)
            throws
            IOException;

    public abstract EncodingResultData encode(
            LongMessageRuleType longMessageRuleType,
            int maxMtp3UserDataLength,
            Logger logger)
            throws
            IOException;

}
