/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 Ext-SS-InfoFor-CSE ::= CHOICE { forwardingInfoFor-CSE [0] Ext-ForwardingInfoFor-CSE, callBarringInfoFor-CSE [1]
 * Ext-CallBarringInfoFor-CSE }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtSSInfoForCSE extends Serializable {

    ExtForwardingInfoForCSE getForwardingInfoForCSE();

    ExtCallBarringInfoForCSE getCallBarringInfoForCSE();

}
