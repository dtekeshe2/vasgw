/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 * MSRadioAccessCapability ::= OCTET STRING (SIZE (1..50)) -- This parameter carries the value part of the MS Radio Access
 * Capability IE defined in -- 3GPP TS 24.008 [35].
 *
 * @author amit bhayani
 *
 */
public interface MSRadioAccessCapability extends Serializable {
    byte[] getData();
}
