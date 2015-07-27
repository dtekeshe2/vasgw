/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext-QoS-Subscribed ::= OCTET STRING (SIZE (1..9)) -- OCTET 1: -- Allocation/Retention Priority (This octet encodes each
 * priority level defined in -- 23.107 as the binary value of the priority level, declaration in 29.060) -- Octets 2-9 are coded
 * according to 3GPP TS 24.008 [35] Quality of Service Octets -- 6-13.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtQoSSubscribed extends Serializable {

    byte[] getData();

}
