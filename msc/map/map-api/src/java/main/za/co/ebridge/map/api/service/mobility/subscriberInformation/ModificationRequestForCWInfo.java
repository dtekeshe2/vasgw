/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBasicServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;

/**
 *
 ModificationRequestFor-CW-Info ::= SEQUENCE { basicService [0] Ext-BasicServiceCode OPTIONAL, ss-Status [1] Ext-SS-Status
 * OPTIONAL, modifyNotificationToCSE [2] ModificationInstruction OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL,
 * ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCWInfo extends Serializable {

    ExtBasicServiceCode getBasicService();

    ExtSSStatus getSsStatus();

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
