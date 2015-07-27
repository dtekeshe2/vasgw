/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;

/**
 *
 NAEA-PreferredCI ::= SEQUENCE { naea-PreferredCIC [0] NAEA-CIC, extensionContainer [1] ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface NAEAPreferredCI extends Serializable {

    NAEACIC getNaeaPreferredCIC();

    MAPExtensionContainer getExtensionContainer();

}
