/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 UU-Data ::= SEQUENCE { uuIndicator [0] UUIndicator OPTIONAL, uui [1] UUI OPTIONAL, uusCFInteraction [2] NULL OPTIONAL,
 * extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface UUData extends Serializable {

    byte[] getUUIndicator(); // TODO: add ISUP data -UserToUserIndicators

    byte[] getUUI(); // TODO: add ISUP data - UserToUserInformation

    boolean getUusCFInteraction();

    MAPExtensionContainer getExtensionContainer();

}
