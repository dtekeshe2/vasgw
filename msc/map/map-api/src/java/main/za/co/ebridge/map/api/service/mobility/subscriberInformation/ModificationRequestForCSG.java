/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ModificationRequestFor-CSG ::= SEQUENCE { modifyNotificationToCSE [0] ModificationInstruction OPTIONAL, extensionContainer
 * [1] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCSG extends Serializable {

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
