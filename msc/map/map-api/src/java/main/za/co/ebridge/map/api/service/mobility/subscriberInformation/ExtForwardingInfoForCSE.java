/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtForwFeature;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 Ext-ForwardingInfoFor-CSE ::= SEQUENCE { ss-Code [0] SS-Code, forwardingFeatureList [1] Ext-ForwFeatureList,
 * notificationToCSE [2] NULL OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 * Ext-ForwFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-ForwFeature
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtForwardingInfoForCSE extends Serializable {

    SSCode getSsCode();

    ArrayList<ExtForwFeature> getForwardingFeatureList();

    boolean getNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
