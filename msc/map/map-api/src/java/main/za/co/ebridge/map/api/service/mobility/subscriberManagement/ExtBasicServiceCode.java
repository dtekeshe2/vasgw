/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext-BasicServiceCode ::= CHOICE { ext-BearerService [2] Ext-BearerServiceCode, ext-Teleservice [3] Ext-TeleserviceCode}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtBasicServiceCode extends Serializable {

    ExtBearerServiceCode getExtBearerService();

    ExtTeleserviceCode getExtTeleservice();

}
