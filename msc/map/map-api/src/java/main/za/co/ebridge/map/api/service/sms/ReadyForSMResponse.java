/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3: ReadyForSM-Res ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReadyForSMResponse extends SmsMessage {

    MAPExtensionContainer getExtensionContainer();

}
