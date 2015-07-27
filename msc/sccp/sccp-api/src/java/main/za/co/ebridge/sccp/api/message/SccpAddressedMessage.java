package za.co.ebridge.sccp.api.message;

import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

/**
 * This interface represents a SCCP message that addressed with Called/CallingPartyAddresses
 */
public interface SccpAddressedMessage
        extends SccpMessage
{

    SccpAddress getCalledPartyAddress();

    SccpAddress getCallingPartyAddress();

    boolean getReturnMessageOnError();

    void clearReturnMessageOnError();

    boolean getSccpCreatesSls();

    HopCounter getHopCounter();

    void setCalledPartyAddress(SccpAddress v);

    void setCallingPartyAddress(SccpAddress v);

    void setHopCounter(HopCounter hopCounter);

    boolean reduceHopCounter();

}
