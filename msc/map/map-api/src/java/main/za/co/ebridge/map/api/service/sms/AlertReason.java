/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

/**
 *
 AlertReason ::= ENUMERATED { ms-Present (0), memoryAvailable (1)}
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum AlertReason {
    msPresent(0), memoryAvailable(1);

    private int code;

    private AlertReason(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static AlertReason getInstance(int code) {
        switch (code) {
            case 0:
                return AlertReason.msPresent;
            case 1:
                return AlertReason.memoryAvailable;
            default:
                return null;
        }
    }
}
