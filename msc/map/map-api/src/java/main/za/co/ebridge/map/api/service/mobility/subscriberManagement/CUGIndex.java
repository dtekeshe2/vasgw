/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 CUG-Index ::= INTEGER (0..32767) -- The internal structure is defined in ETS 300 138.
 *
 * @author david@tekeshe.com
 *
 */
public interface CUGIndex extends Serializable {

    int getData();

}
