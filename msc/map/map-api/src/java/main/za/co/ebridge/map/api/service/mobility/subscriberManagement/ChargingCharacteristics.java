/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 ChargingCharacteristics ::= OCTET STRING (SIZE (2)) -- Octets are coded according to 3GPP TS 32.215.
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ChargingCharacteristics extends Serializable {

    byte[] getData();

}
