/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 * The MAP ReturnError message: with a single parameter - ExtensionContainer
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageExtensionContainer extends MAPErrorMessage {

    Long getErrorCode();

    MAPExtensionContainer getExtensionContainer();

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

}
