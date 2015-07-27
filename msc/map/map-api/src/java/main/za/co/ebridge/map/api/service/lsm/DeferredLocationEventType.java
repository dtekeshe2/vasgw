/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

/**
 * DeferredLocationEventType ::= BIT STRING { msAvailable (0) , enteringIntoArea (1), leavingFromArea (2), beingInsideArea (3) }
 * (SIZE (1..16)) -- beingInsideArea is always treated as oneTimeEvent regardless of the possible value -- of occurrenceInfo
 * inside areaEventInfo. -- exception handling: -- a ProvideSubscriberLocation-Arg containing other values than listed above in
 * -- DeferredLocationEventType shall be rejected by the receiver with a return error cause of -- unexpected data value.
 *
 * @author amit bhayani
 *
 */
public interface DeferredLocationEventType extends Serializable {

    boolean getMsAvailable();

    boolean getEnteringIntoArea();

    boolean getLeavingFromArea();

    boolean getBeingInsideArea();

}
