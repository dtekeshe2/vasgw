/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.rkm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.DeregistrationResult;

/**
 * The Deregistration Response (DEREG RSP) message is used as a response to the DEREG REQ message from a remote M3UA peer.
 *
 * TODO : The message only supports single DeregistrationResult.
 *
 * @author amit bhayani
 *
 */
public interface DeregistrationResponse extends M3UAMessage {

    DeregistrationResult getDeregistrationResult();

    void setDeregistrationResult(DeregistrationResult result);

}
