/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;

/**
 *
 AgeIndicator ::= OCTET STRING (SIZE (1..6)) -- The internal structure of this parameter is implementation specific.
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AgeIndicator extends Serializable {

    byte[] getData();

}
