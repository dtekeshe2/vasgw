package za.co.ebridge.sccp.api.message;

import java.io.Serializable;

import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

/**
 * Factory for creating messages.
 */
public interface MessageFactory
        extends Serializable
{

    /**
     * Create a SCCP data transfer message (class 0)
     *
     * @param calledParty
     * @param callingParty
     * @param data
     * @param localSsn
     * @param returnMessageOnError
     * @param hopCounter           This parameter is optional
     * @param importance           This parameter is optional
     * @return
     */
    SccpDataMessage createDataMessageClass0(
            SccpAddress calledParty, SccpAddress callingParty, byte[] data,
            int localSsn, boolean returnMessageOnError, HopCounter hopCounter, Importance importance);

    /**
     * Create a SCCP data transfer message (class 1)
     *
     * @param calledParty
     * @param callingParty
     * @param data
     * @param sls
     * @param localSsn
     * @param returnMessageOnError
     * @param hopCounter           This parameter is optional
     * @param importance           This parameter is optional
     * @return
     */
    SccpDataMessage createDataMessageClass1(
            SccpAddress calledParty, SccpAddress callingParty, byte[] data, int sls,
            int localSsn, boolean returnMessageOnError, HopCounter hopCounter, Importance importance);

    // SccpNoticeMessage createNoticeMessage(ReturnCause returnCause, int outgoingSls, SccpAddress calledParty,
    // SccpAddress callingParty, byte[] data,
    // HopCounter hopCounter, Importance importance);

}
