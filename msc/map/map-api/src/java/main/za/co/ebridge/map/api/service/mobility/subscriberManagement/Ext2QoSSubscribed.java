/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext2-QoS-Subscribed ::= OCTET STRING (SIZE (1..3)) -- Octets 1-3 are coded according to 3GPP TS 24.008 [35] Quality of
 * Service Octets 14-16. -- If Quality of Service information is structured with 14 octet length, then -- Octet 1 is coded
 * according to 3GPP TS 24.008 [35] Quality of Service Octet 14.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface Ext2QoSSubscribed extends Serializable {

    byte[] getData();

}
