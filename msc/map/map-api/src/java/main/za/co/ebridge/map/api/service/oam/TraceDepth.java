/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

/**
 *
 TraceDepth ::= ENUMERATED { minimum (0), medium (1), maximum (2), ...} -- The value medium is applicable only for RNC. For
 * other network elements, if value medium -- is received, value minimum shall be applied.
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum TraceDepth {
    minimum(0), medium(1), maximum(2);

    private int code;

    private TraceDepth(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static TraceDepth getInstance(int code) {
        switch (code) {
            case 0:
                return TraceDepth.minimum;
            case 1:
                return TraceDepth.medium;
            case 2:
                return TraceDepth.maximum;
            default:
                return null;
        }
    }
}
