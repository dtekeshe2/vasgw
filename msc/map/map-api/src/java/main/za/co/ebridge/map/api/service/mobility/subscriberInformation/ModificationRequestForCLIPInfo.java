/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;
import za.co.ebridge.map.api.service.supplementary.OverrideCategory;

/**
 *
 ModificationRequestFor-CLIP-Info ::= SEQUENCE { ss-Status [0] Ext-SS-Status OPTIONAL, overrideCategory [1] OverrideCategory
 * OPTIONAL, modifyNotificationToCSE [2] ModificationInstruction OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL,
 * ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCLIPInfo extends Serializable {

    ExtSSStatus getSsStatus();

    OverrideCategory getOverrideCategory();

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
