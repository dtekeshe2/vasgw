/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

/**
 *
 TalkerPriority ::= ENUMERATED { normal (0), privileged (1), emergency (2)}
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum TalkerPriority {
    normal(0), privileged(1), emergency(2);

    private int code;

    private TalkerPriority(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static TalkerPriority getInstance(int code) {
        switch (code) {
            case 0:
                return TalkerPriority.normal;
            case 1:
                return TalkerPriority.privileged;
            case 2:
                return TalkerPriority.emergency;
            default:
                return null;
        }
    }
}
