/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

/**
 *
 NotReachableReason ::= ENUMERATED { msPurged (0), imsiDetached (1), restrictedArea (2), notRegistered (3)}
 *
 * @author david@tekeshe.com
 *
 */
public enum NotReachableReason {
    msPurged(0), imsiDetached(1), restrictedArea(2), notRegistered(3);

    private int code;

    private NotReachableReason(int code) {
        this.code = code;
    }

    public static NotReachableReason getInstance(int code) {
        switch (code) {
            case 0:
                return NotReachableReason.msPurged;
            case 1:
                return NotReachableReason.imsiDetached;
            case 2:
                return NotReachableReason.restrictedArea;
            case 3:
                return NotReachableReason.notRegistered;
            default:
                return null;
        }
    }

    public int getCode() {
        return this.code;
    }
}
