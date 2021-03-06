/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ResumeCallHandlingRes ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ResumeCallHandlingResponse extends CallHandlingMessage {

    MAPExtensionContainer getExtensionContainer();

}
