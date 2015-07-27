package za.co.ebridge.sccp.api;

import java.io.Serializable;

import za.co.ebridge.sccp.api.message.SccpDataMessage;
import za.co.ebridge.sccp.api.message.SccpNoticeMessage;

public interface SccpListener
        extends Serializable
{

    /**
     * Called when proper data is received, it is partially decoded. This method is called with message payload.
     *
     * @param message Message received
     */
    void onMessage(SccpDataMessage message);

    /**
     * Called when N-NOTICE indication (on receiving UDTS, XUDTS or LUDTS) N-NOTICE indication is the means by which the SCCP
     * returns to the originating user a SCCP-SDU which could not reach the final destination.
     *
     * @param message Message received
     */
    void onNotice(SccpNoticeMessage message);

    /**
     * Indication of N-COORD request
     *
     * @param dpc
     * @param ssn
     * @param multiplicityIndicator
     */
    void onCoordRequest(int dpc, int ssn, int multiplicityIndicator);

    /**
     * Indication of N-COORD response
     *
     * @param dpc
     * @param ssn
     * @param multiplicityIndicator
     */
    void onCoordResponse(int dpc, int ssn, int multiplicityIndicator);

    /**
     * Indication of N-STATE (subsystem state)
     *
     * @param dpc
     * @param ssn
     * @param inService
     * @param multiplicityIndicator
     */
    void onState(int dpc, int ssn, boolean inService, int multiplicityIndicator);

    /**
     * Indication of N-PCSTATE (pointcode state)
     *
     * @param dpc
     * @param status
     * @param restrictedImportanceLevel
     * @param remoteSccpStatus
     */
    void onPcState(
            int dpc, SignallingPointStatus status, int restrictedImportanceLevel,
            RemoteSccpStatus remoteSccpStatus);

}
