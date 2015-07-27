/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext3-QoS-Subscribed ::= OCTET STRING (SIZE (1..2)) -- Octets 1-2 are coded according to 3GPP TS 24.008 [35] Quality of
 * Service Octets 17-18.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface Ext3QoSSubscribed extends Serializable {

    byte[] getData();

}
