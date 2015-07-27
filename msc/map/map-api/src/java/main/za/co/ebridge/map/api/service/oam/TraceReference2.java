/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 TraceReference2 ::= OCTET STRING (SIZE (3))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceReference2 extends Serializable {

    byte[] getData();

}
