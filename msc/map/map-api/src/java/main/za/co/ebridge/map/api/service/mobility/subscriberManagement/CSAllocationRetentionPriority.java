/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 CS-AllocationRetentionPriority ::= OCTET STRING (SIZE (1)) -- This data type encodes each priority level defined in TS 23.107
 * as the binary value -- of the priority level.
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CSAllocationRetentionPriority extends Serializable {

    int getData();

}
