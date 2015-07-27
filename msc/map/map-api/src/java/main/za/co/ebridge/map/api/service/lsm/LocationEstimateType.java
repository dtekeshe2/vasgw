/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

/**
 *
 * LocationEstimateType ::= ENUMERATED { currentLocation (0), currentOrLastKnownLocation (1), initialLocation (2), ...,
 * activateDeferredLocation (3), cancelDeferredLocation (4) } -- exception handling: -- a ProvideSubscriberLocation-Arg
 * containing an unrecognized LocationEstimateType -- shall be rejected by the receiver with a return error cause of unexpected
 * data value
 *
 * @author amit bhayani
 *
 */
public enum LocationEstimateType {

    currentLocation(0), currentOrLastKnownLocation(1), initialLocation(2), activateDeferredLocation(3), cancelDeferredLocation(
            4);

    private final int type;

    private LocationEstimateType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public static LocationEstimateType getLocationEstimateType(int type) {
        switch (type) {
            case 0:
                return currentLocation;
            case 1:
                return currentOrLastKnownLocation;
            case 2:
                return initialLocation;
            case 3:
                return activateDeferredLocation;
            case 4:
                return cancelDeferredLocation;
            default:
                return null;
        }
    }
}
