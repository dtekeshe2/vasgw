/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 RESULT Password
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RegisterPasswordResponse extends SupplementaryMessage {

    Password getPassword();

}