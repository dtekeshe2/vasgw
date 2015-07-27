/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 HandoverPriority ::= octet STRING (SIZE (1)) -- The internal structure is defined in TS GSM 08.08.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface HandoverPriority extends Serializable {

    int getData();

}
