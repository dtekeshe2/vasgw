/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 TraceRecordingSessionReference ::= OCTET STRING (SIZE (2))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceRecordingSessionReference extends Serializable {

    byte[] getData();

}
