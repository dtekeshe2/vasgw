/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 PrepareGroupCallRes ::= SEQUENCE { groupCallNumber ISDN-AddressString, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PrepareGroupCallResponse extends CallHandlingMessage {

     ISDNAddressString getGroupCallNumber();

     MAPExtensionContainer getExtensionContainer();

}
