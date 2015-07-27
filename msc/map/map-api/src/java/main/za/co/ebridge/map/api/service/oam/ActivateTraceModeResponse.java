/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3: ActivateTraceModeRes ::= SEQUENCE { extensionContainer [0] ExtensionContainer OPTIONAL, ..., traceSupportIndicator
 * [1] NULL OPTIONAL }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ActivateTraceModeResponse extends OamMessage {

    MAPExtensionContainer getExtensionContainer();

    boolean getTraceSupportIndicator();

}
