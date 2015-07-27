/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtCallBarringFeature;
import za.co.ebridge.map.api.service.supplementary.Password;

/**
 *
 CallBarringData ::= SEQUENCE { callBarringFeatureList Ext-CallBarFeatureList, password Password OPTIONAL,
 * wrongPasswordAttemptsCounter WrongPasswordAttemptsCounter OPTIONAL, notificationToCSE NULL OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 * Ext-CallBarFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-CallBarringFeature
 *
 * WrongPasswordAttemptsCounter ::= INTEGER (0..4)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallBarringData extends Serializable {

    ArrayList<ExtCallBarringFeature> getCallBarringFeatureList();

    Password getPassword();

    Integer getWrongPasswordAttemptsCounter();

    boolean getNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
