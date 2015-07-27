/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 * CamelRoutingInfo ::= SEQUENCE { forwardingData ForwardingData OPTIONAL, gmscCamelSubscriptionInfo [0]
 * GmscCamelSubscriptionInfo, extensionContainer [1] ExtensionContainer OPTIONAL, ...}
 *
 * @author cristian veliscu
 *
 */
public interface CamelRoutingInfo {
    ForwardingData getForwardingData();

    GmscCamelSubscriptionInfo getGmscCamelSubscriptionInfo();

    MAPExtensionContainer getExtensionContainer();
}
