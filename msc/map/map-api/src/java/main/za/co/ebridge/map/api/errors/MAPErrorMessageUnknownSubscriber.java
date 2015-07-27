/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * UnknownSubscriberParam ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ..., unknownSubscriberDiagnostic
 * UnknownSubscriberDiagnostic OPTIONAL}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageUnknownSubscriber extends MAPErrorMessage {

    MAPExtensionContainer getExtensionContainer();

    UnknownSubscriberDiagnostic getUnknownSubscriberDiagnostic();

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

    void setUnknownSubscriberDiagnostic(UnknownSubscriberDiagnostic unknownSubscriberDiagnostic);

}
