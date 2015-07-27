/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 APN ::= OCTET STRING (SIZE (2..63)) -- Octets are coded according to TS 3GPP TS 23.003 [17]
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface APN extends Serializable {

    byte[] getData();

}
