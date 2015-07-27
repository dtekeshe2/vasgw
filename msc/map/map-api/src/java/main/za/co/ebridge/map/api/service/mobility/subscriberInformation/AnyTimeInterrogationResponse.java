/* eBridge SS7 */
package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 * AnyTimeInterrogationRes ::= SEQUENCE { subscriberInfo SubscriberInfo, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 * @author abhayani
 *
 */
public interface AnyTimeInterrogationResponse extends MobilityMessage {
    SubscriberInfo getSubscriberInfo();

    MAPExtensionContainer getExtensionContainer();
}
