/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;
import za.co.ebridge.map.api.service.supplementary.CliRestrictionOption;

/**
 *
 ModificationRequestFor-CLIR-Info ::= SEQUENCE { ss-Status [0] Ext-SS-Status OPTIONAL, cliRestrictionOption [1]
 * CliRestrictionOption OPTIONAL, modifyNotificationToCSE [2] ModificationInstruction OPTIONAL, extensionContainer [3]
 * ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCLIRInfo extends Serializable {

    ExtSSStatus getSsStatus();

    CliRestrictionOption getCliRestrictionOption();

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
