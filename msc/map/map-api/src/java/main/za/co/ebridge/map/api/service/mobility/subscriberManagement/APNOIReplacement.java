/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 APN-OI-Replacement ::= OCTET STRING (SIZE (9..100)) -- Octets are coded as APN Operator Identifier according to TS 3GPP TS
 * 23.003 [17]
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface APNOIReplacement extends Serializable {

    byte[] getData();

}
