/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 PDP-Type ::= OCTET STRING (SIZE (2)) -- Octets are coded according to TS 3GPP TS 29.060 [105] -- Only the values PPP, IPv4
 * and IPv6 are allowed for this parameter.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PDPType extends Serializable {

    byte[] getData();

}
