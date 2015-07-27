/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 ListOfMeasurements ::= OCTET STRING (SIZE (4)) -- Octets are coded as described in 3GPP TS 32.422.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ListOfMeasurements extends Serializable {

    byte[] getData();

}
