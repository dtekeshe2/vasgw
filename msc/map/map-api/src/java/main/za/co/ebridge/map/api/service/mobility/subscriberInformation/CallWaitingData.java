/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 CallWaitingData ::= SEQUENCE { cwFeatureList [1] Ext-CwFeatureList, notificationToCSE [2] NULL OPTIONAL, ... }
 *
 * Ext-CwFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-CwFeature
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallWaitingData extends Serializable {

    ArrayList<ExtCwFeature> getCwFeatureList();

    boolean getNotificationToCSE();

}
