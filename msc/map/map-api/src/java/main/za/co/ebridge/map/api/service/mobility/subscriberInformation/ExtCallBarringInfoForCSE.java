/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtCallBarringFeature;
import za.co.ebridge.map.api.service.supplementary.Password;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 Ext-CallBarringInfoFor-CSE ::= SEQUENCE { ss-Code [0] SS-Code, callBarringFeatureList [1] Ext-CallBarFeatureList, password
 * [2] Password OPTIONAL, wrongPasswordAttemptsCounter [3] WrongPasswordAttemptsCounter OPTIONAL, notificationToCSE [4] NULL
 * OPTIONAL, extensionContainer [5] ExtensionContainer OPTIONAL, ...}
 *
 * Ext-CallBarFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-CallBarringFeature
 *
 * WrongPasswordAttemptsCounter ::= INTEGER (0..4)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtCallBarringInfoForCSE extends Serializable {

    SSCode getSsCode();

    ArrayList<ExtCallBarringFeature> getCallBarringFeatureList();

    Password getPassword();

    Integer getWrongPasswordAttemptsCounter();

    boolean getNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
