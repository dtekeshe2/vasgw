/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Category ::= OCTET STRING (SIZE (1)) -- The internal structure is defined in ITU-T Rec Q.763.
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface Category extends Serializable {

    int getData();

}
