/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SS-InvocationNotificationRes ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSInvocationNotificationResponse extends SupplementaryMessage {

    MAPExtensionContainer getExtensionContainer();

}