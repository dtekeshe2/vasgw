/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * ExtensibleCallBarredParam ::= SEQUENCE { callBarringCause CallBarringCause OPTIONAL, extensionContainer ExtensionContainer
 * OPTIONAL, ... , unauthorisedMessageOriginator [1] NULL OPTIONAL }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtensibleCallBarredParam extends Serializable {

    CallBarringCause getCallBarringCause();

    MAPExtensionContainer getExtensionContainer();

    Boolean getUnauthorisedMessageOriginator();

}
