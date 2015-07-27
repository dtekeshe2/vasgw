/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;
import za.co.ebridge.map.api.service.supplementary.CliRestrictionOption;

/**
 *
 ClirData ::= SEQUENCE { ss-Status [1] Ext-SS-Status, cliRestrictionOption [2] CliRestrictionOption OPTIONAL,
 * notificationToCSE [3] NULL OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ClirData extends Serializable {

    ExtSSStatus getSsStatus();

    CliRestrictionOption getCliRestrictionOption();

    boolean getNotificationToCSE();

}
