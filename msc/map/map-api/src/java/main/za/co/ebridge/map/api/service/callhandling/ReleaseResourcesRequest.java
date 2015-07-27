/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * releaseResources OPERATION::= { --Timer m ARGUMENT ReleaseResourcesArg RESULT ReleaseResourcesRes -- optional ERRORS {
 * unexpectedDataValue | systemFailure } CODE local:20 }
 *
 * ReleaseResourcesArg ::= SEQUENCE{ msrn ISDN-AddressString, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReleaseResourcesRequest extends Serializable {

     ISDNAddressString getMsrn();

     MAPExtensionContainer getExtensionContainer();

}
