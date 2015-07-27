/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 RESULT SS-Info -- optional
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ActivateSSResponse extends SupplementaryMessage {

    SSInfo getSsInfo();

}
