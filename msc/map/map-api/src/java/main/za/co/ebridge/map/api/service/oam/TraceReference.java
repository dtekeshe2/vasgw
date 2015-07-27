/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 TraceReference ::= OCTET STRING (SIZE (1..2))
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceReference extends Serializable {

    byte[] getData();

}
