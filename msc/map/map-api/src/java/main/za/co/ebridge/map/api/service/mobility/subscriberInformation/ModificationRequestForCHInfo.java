/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;

/**
 *
 ModificationRequestFor-CH-Info ::= SEQUENCE { ss-Status [0] Ext-SS-Status OPTIONAL, modifyNotificationToCSE [1]
 * ModificationInstruction OPTIONAL, extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCHInfo extends Serializable {

    ExtSSStatus getSsStatus();

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
