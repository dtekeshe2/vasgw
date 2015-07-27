/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 QoS-Subscribed ::= OCTET STRING (SIZE (3)) -- Octets are coded according to TS 3GPP TS 24.008 [35] Quality of Service Octets
 * -- 3-5.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface QoSSubscribed extends Serializable {

    byte[] getData();

}
