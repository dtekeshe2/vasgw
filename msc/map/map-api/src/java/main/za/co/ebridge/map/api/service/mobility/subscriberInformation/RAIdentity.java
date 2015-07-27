/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 * RAIdentity ::= OCTET STRING (SIZE (6)) -- Routing Area Identity is coded in accordance with 3GPP TS 29.060 [105]. -- It shall
 * contain the value part defined in 3GPP TS 29.060 only. I.e. the 3GPP TS 29.060 -- type identifier octet shall not be
 * included.
 *
 * @author amit bhayani
 *
 */
public interface RAIdentity extends Serializable {
    byte[] getData();
}
