/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * unauthorizedLCSClient ERROR ::= { PARAMETER UnauthorizedLCSClient-Param -- optional CODE local:53 }
 *
 * UnauthorizedLCSClient-Param ::= SEQUENCE { unauthorizedLCSClient-Diagnostic [0] UnauthorizedLCSClient-Diagnostic OPTIONAL,
 * extensionContainer [1] ExtensionContainer OPTIONAL, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageUnauthorizedLCSClient extends MAPErrorMessage {

    UnauthorizedLCSClientDiagnostic getUnauthorizedLCSClientDiagnostic();

    MAPExtensionContainer getExtensionContainer();

    void setUnauthorizedLCSClientDiagnostic(UnauthorizedLCSClientDiagnostic unauthorizedLCSClientDiagnostic);

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

}
