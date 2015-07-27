/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: DeleteSubscriberDataRes ::= SEQUENCE { regionalSubscriptionResponse [0] RegionalSubscriptionResponse OPTIONAL,
 * extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 * MAP V2: DeleteSubscriberDataRes ::= SEQUENCE { regionalSubscriptionResponse [0] RegionalSubscriptionResponse OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface DeleteSubscriberDataResponse extends MobilityMessage {

    RegionalSubscriptionResponse getRegionalSubscriptionResponse();

    MAPExtensionContainer getExtensionContainer();

}
