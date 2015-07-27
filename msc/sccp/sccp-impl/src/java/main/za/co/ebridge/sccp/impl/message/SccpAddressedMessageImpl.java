package za.co.ebridge.sccp.impl.message;

import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sccp.impl.parameter.HopCounterImpl;
import za.co.ebridge.sccp.api.message.SccpAddressedMessage;
import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public abstract class SccpAddressedMessageImpl
        extends SccpMessageImpl
        implements SccpAddressedMessage
{

    protected SccpAddress calledParty;
    protected SccpAddress callingParty;
    protected HopCounterImpl hopCounter;

    protected SccpAddressedMessageImpl(
            SccpStackImpl sccpStackImpl, int type, int outgoingSls, int localSsn,
            SccpAddress calledParty, SccpAddress callingParty, HopCounter hopCounter)
    {
        super(sccpStackImpl, type, outgoingSls, localSsn);

        this.calledParty = calledParty;
        this.callingParty = callingParty;
        this.hopCounter = (HopCounterImpl) hopCounter;
    }

    protected SccpAddressedMessageImpl(
            SccpStackImpl sccpStackImpl,
            int type,
            int incomingOpc,
            int incomingDpc,
            int incomingSls)
    {
        super(sccpStackImpl, type, incomingOpc, incomingDpc, incomingSls);
    }

    public SccpAddress getCalledPartyAddress()
    {
        return calledParty;
    }

    public void setCalledPartyAddress(SccpAddress calledParty)
    {
        this.calledParty = calledParty;
    }

    public SccpAddress getCallingPartyAddress()
    {
        return callingParty;
    }

    public void setCallingPartyAddress(SccpAddress callingParty)
    {
        this.callingParty = callingParty;
    }

    public HopCounter getHopCounter()
    {
        return hopCounter;
    }

    public void setHopCounter(HopCounter hopCounter)
    {
        this.hopCounter = (HopCounterImpl) hopCounter;
    }

    public boolean reduceHopCounter()
    {
        if (this.hopCounter != null)
        {
            int val = this.hopCounter.getValue();
            if (--val <= 0)
            {
                val = 0;
            }
            this.hopCounter.setValue(val);
            if (val == 0)
                return false;
        }
        return true;
    }
}
