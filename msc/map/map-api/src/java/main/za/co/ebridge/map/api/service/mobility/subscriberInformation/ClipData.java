/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;
import za.co.ebridge.map.api.service.supplementary.OverrideCategory;

/**
 *
 ClipData ::= SEQUENCE { ss-Status [1] Ext-SS-Status, overrideCategory [2] OverrideCategory, notificationToCSE [3] NULL
 * OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ClipData extends Serializable {

    ExtSSStatus getSsStatus();

    OverrideCategory getOverrideCategory();

    boolean getNotificationToCSE();

}
