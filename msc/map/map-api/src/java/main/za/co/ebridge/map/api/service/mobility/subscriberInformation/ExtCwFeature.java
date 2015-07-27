/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBasicServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;

/**
 *
 Ext-CwFeature ::= SEQUENCE { basicService [1] Ext-BasicServiceCode, ss-Status [2] Ext-SS-Status, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtCwFeature extends Serializable {

    ExtBasicServiceCode getBasicService();

    ExtSSStatus getSsStatus();

}
