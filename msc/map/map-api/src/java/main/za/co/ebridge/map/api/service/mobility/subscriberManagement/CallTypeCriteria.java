/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

/**
 *
 CallTypeCriteria ::= ENUMERATED { forwarded (0), notForwarded (1)}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum CallTypeCriteria {
    forwarded(0), notForwarded(1);

    private int code;

    private CallTypeCriteria(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static CallTypeCriteria getInstance(int code) {
        switch (code) {
            case 0:
                return CallTypeCriteria.forwarded;
            case 1:
                return CallTypeCriteria.notForwarded;
            default:
                return null;
        }
    }
}
