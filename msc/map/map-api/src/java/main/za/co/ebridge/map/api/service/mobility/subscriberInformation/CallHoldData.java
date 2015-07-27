/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;

/**
 *
 CallHoldData ::= SEQUENCE { ss-Status [1] Ext-SS-Status, notificationToCSE [2] NULL OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallHoldData extends Serializable {

    ExtSSStatus getSsStatus();

    boolean getNotificationToCSE();

}
