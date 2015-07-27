/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

/**
 *
 MatchType ::= ENUMERATED { inhibiting (0), enabling (1)}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum MatchType {
    inhibiting(0), enabling(1);

    private int code;

    private MatchType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static MatchType getInstance(int code) {
        switch (code) {
            case 0:
                return MatchType.inhibiting;
            case 1:
                return MatchType.enabling;
            default:
                return null;
        }
    }
}
