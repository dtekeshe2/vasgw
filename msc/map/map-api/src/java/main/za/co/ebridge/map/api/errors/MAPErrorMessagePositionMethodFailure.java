/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * positionMethodFailure ERROR ::= { PARAMETER PositionMethodFailure-Param -- optional CODE local:54 }
 *
 *
 * PositionMethodFailure-Param ::= SEQUENCE { positionMethodFailure-Diagnostic [0] PositionMethodFailure-Diagnostic OPTIONAL,
 * extensionContainer [1] ExtensionContainer OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessagePositionMethodFailure extends MAPErrorMessage {

    PositionMethodFailureDiagnostic getPositionMethodFailureDiagnostic();

    MAPExtensionContainer getExtensionContainer();

    void setPositionMethodFailureDiagnostic(PositionMethodFailureDiagnostic positionMethodFailureDiagnostic);

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

}
