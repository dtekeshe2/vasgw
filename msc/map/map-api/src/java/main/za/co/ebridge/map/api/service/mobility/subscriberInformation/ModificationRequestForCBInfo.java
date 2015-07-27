/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBasicServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;
import za.co.ebridge.map.api.service.supplementary.Password;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 ModificationRequestFor-CB-Info ::= SEQUENCE { ss-Code [0] SS-Code, basicService [1] Ext-BasicServiceCode OPTIONAL, ss-Status
 * [2] Ext-SS-Status OPTIONAL, password [3] Password OPTIONAL, wrongPasswordAttemptsCounter [4] WrongPasswordAttemptsCounter
 * OPTIONAL, modifyNotificationToCSE [5] ModificationInstruction OPTIONAL, extensionContainer [6] ExtensionContainer OPTIONAL,
 * ...}
 *
 * WrongPasswordAttemptsCounter ::= INTEGER (0..4)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCBInfo extends Serializable {

    SSCode getSsCode();

    ExtBasicServiceCode getBasicService();

    ExtSSStatus getSsStatus();

    Password getPassword();

    Integer getWrongPasswordAttemptsCounter();

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
