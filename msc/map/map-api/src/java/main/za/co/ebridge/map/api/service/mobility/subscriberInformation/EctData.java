/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;

/**
 *
 EctData ::= SEQUENCE { ss-Status [1] Ext-SS-Status, notificationToCSE [2] NULL OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EctData extends Serializable {

    ExtSSStatus getSsStatus();

    boolean getNotificationToCSE();

}
