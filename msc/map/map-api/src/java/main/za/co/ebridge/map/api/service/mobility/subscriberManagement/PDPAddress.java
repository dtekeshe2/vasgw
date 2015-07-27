/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 PDP-Address ::= OCTET STRING (SIZE (1..16)) -- Octets are coded according to TS 3GPP TS 29.060 [105]
 *
 * -- The possible size values are: -- 1-7 octets X.25 address type -- 4 octets IPv4 address type -- 16 octets Ipv6 address type
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PDPAddress extends Serializable {

    byte[] getData();

}