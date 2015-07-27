/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 StatusReportRes ::= SEQUENCE { extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface StatusReportResponse extends CallHandlingMessage {

    MAPExtensionContainer getExtensionContainer();

}
