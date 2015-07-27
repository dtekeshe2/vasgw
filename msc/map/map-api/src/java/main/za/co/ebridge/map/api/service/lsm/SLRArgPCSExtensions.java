/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

/**
 *
 SLR-Arg-PCS-Extensions ::= SEQUENCE { ..., na-ESRK-Request [0] NULL OPTIONAL }
 *
 * @author david@tekeshe.com
 *
 */
public interface SLRArgPCSExtensions {

    boolean getNaEsrkRequest();

}
