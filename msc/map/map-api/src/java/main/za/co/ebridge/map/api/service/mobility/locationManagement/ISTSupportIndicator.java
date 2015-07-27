/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

/**
 *
 * IST-SupportIndicator ::= ENUMERATED { basicISTSupported (0), istCommandSupported (1), ...} -- exception handling: --
 * reception of values > 1 shall be mapped to ' istCommandSupported '
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum ISTSupportIndicator {
    basicISTSupported(0), istCommandSupported(1);

    private int code;

    private ISTSupportIndicator(int code) {
        this.code = code;
    }

    public static ISTSupportIndicator getInstance(int code) {
        switch (code) {
            case 0:
                return ISTSupportIndicator.basicISTSupported;
            case 1:
                return ISTSupportIndicator.istCommandSupported;
            default:
                return null;
        }
    }

    public int getCode() {
        return this.code;
    }
}
