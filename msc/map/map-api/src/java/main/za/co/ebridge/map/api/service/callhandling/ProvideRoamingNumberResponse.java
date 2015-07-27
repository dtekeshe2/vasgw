/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3: ProvideRoamingNumberRes ::= SEQUENCE { roamingNumber ISDN-AddressString, extensionContainer ExtensionContainer
 * OPTIONAL, ..., releaseResourcesSupported NULL OPTIONAL, vmsc-Address ISDN-AddressString OPTIONAL }
 *
 * MAP V2: RESULT roamingNumberISDN-AddressString
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ProvideRoamingNumberResponse extends CallHandlingMessage {

     ISDNAddressString getRoamingNumber();

     MAPExtensionContainer getExtensionContainer();

     boolean getReleaseResourcesSupported();

     ISDNAddressString getVmscAddress();

     long getMapProtocolVersion();

}
