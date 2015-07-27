/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 RemoteUserFreeRes ::= SEQUENCE{ ruf-Outcome [0] RUF-Outcome, extensionContainer [1] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RemoteUserFreeResponse extends CallHandlingMessage {

     RUFOutcome getRufOutcome();

     MAPExtensionContainer getExtensionContainer();

}
