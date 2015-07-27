/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;

/**
 *
 EPS-Info ::= CHOICE{ pdn-gw-update [0] PDN-GW-Update, isr-Information [1] ISR-Information }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EPSInfo extends Serializable {

    PDNGWUpdate getPndGwUpdate();

    ISRInformation getIsrInformation();

}
