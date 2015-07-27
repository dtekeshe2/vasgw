/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 * MSNetworkCapability ::= OCTET STRING (SIZE (1..8)) -- This parameter carries the value part of the MS Network Capability IE
 * defined in -- 3GPP TS 24.008 [35].
 *
 * @author amit bhayani
 *
 */
public interface MSNetworkCapability extends Serializable {
    byte[] getData();
}
