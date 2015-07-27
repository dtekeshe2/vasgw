/* eBridge SS7 */

package za.co.ebridge.map.api.service.pdpContextActivation;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 NoteMsPresentForGprsRes ::= SEQUENCE { extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface NoteMsPresentForGprsResponse extends PdpContextActivationMessage {

    MAPExtensionContainer getExtensionContainer();

}
