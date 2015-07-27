/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 BasicServiceCode ::= CHOICE { bearerService [2] BearerServiceCode, teleservice [3] TeleserviceCode}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface BasicServiceCode extends Serializable {

    BearerServiceCode getBearerService();

    TeleserviceCode getTeleservice();

}
