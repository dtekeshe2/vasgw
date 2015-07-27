/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3: DeactivateTraceModeRes ::= SEQUENCE { extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface DeactivateTraceModeResponse extends OamMessage {

    MAPExtensionContainer getExtensionContainer();

}
