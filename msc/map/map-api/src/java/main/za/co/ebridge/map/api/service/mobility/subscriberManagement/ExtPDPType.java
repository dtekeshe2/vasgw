/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext-PDP-Type ::= OCTET STRING (SIZE (2)) -- Octets are coded, similarly to PDP-Type, according to TS 3GPP TS 29.060 [105]. --
 * Only the value IPv4v6 is allowed for this parameter.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtPDPType extends Serializable {

    byte[] getData();

}
