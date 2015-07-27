/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

/**
 *
 RAN-Technology ::= ENUMERATED { gsm (0), umts (1), ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum RANTechnology {
    gsm(0), umts(1);

    private int code;

    private RANTechnology(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static RANTechnology getInstance(int code) {
        switch (code) {
            case 0:
                return RANTechnology.gsm;
            case 1:
                return RANTechnology.umts;
            default:
                return null;
        }
    }
}
