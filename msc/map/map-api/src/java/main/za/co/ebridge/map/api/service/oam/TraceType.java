/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 TraceType ::= INTEGER (0..255) -- Trace types are fully defined in 3GPP TS 52.008. [61]
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceType extends Serializable {

    int getData();

}
