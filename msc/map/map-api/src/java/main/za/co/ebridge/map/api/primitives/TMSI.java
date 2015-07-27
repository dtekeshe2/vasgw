/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;

/**
 *
 TMSI ::= OCTET STRING (SIZE (1..4))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TMSI extends Serializable {

    byte[] getData();

}
