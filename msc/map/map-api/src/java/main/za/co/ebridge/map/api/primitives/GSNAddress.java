/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;

/**
 *
 GSN-Address ::= OCTET STRING (SIZE (5..17)) -- Octets are coded according to TS 3GPP TS 23.003 [17]
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface GSNAddress extends Serializable {

    byte[] getData();

}
