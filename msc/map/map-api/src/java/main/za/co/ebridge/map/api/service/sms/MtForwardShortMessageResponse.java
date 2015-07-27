/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MT-ForwardSM-Res ::= SEQUENCE { sm-RP-UI SignalInfo OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MtForwardShortMessageResponse extends SmsMessage {

    SmsSignalInfo getSM_RP_UI();

    MAPExtensionContainer getExtensionContainer();

}
