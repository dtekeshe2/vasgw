/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ReleaseResourcesRes ::= SEQUENCE{ extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReleaseResourcesResponse extends Serializable {

    MAPExtensionContainer getExtensionContainer();

}
