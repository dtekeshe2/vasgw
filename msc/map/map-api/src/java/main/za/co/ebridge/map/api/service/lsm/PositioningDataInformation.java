/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

/**
 *
 PositioningDataInformation ::= OCTET STRING (SIZE (2..10)) -- Refers to the Positioning Data defined in 3GPP TS 49.031. --
 * This is composed of 2 or more octets with an internal structure according to -- 3GPP TS 49.031.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PositioningDataInformation extends Serializable {

    byte[] getData();

}
