/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ModificationRequestFor-CSI ::= SEQUENCE { requestedCamel-SubscriptionInfo [0] RequestedCAMEL-SubscriptionInfo,
 * modifyNotificationToCSE [1] ModificationInstruction OPTIONAL, modifyCSI-State [2] ModificationInstruction OPTIONAL,
 * extensionContainer [3] ExtensionContainer OPTIONAL, ..., additionalRequestedCAMEL-SubscriptionInfo [4]
 * AdditionalRequestedCAMEL-SubscriptionInfo OPTIONAL } -- requestedCamel-SubscriptionInfo shall be discarded if --
 * additionalRequestedCAMEL-SubscriptionInfo is received
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForCSI extends Serializable {

    RequestedCAMELSubscriptionInfo getRequestedCamelSubscriptionInfo();

    ModificationInstruction getModifyNotificationToCSE();

    ModificationInstruction getModifyCSIState();

    MAPExtensionContainer getExtensionContainer();

    AdditionalRequestedCAMELSubscriptionInfo getAdditionalRequestedCamelSubscriptionInfo();

}
