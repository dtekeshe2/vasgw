/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.FTNAddressString;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.ISDNSubaddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.ForwardingOptions;

/**
 * ForwardingData ::= SEQUENCE { forwardedToNumber [5] ISDN-AddressString OPTIONAL, forwardedToSubaddress [4]
 * ISDN-SubaddressString OPTIONAL, forwardingOptions [6] ForwardingOptions OPTIONAL, extensionContainer [7] ExtensionContainer
 * OPTIONAL, ..., longForwardedToNumber [8] FTN-AddressString OPTIONAL}
 *
 * @author cristian veliscu
 *
 */
public interface ForwardingData extends Serializable {
     ISDNAddressString getForwardedToNumber();

     ISDNSubaddressString getForwardedToSubaddress(); // TODO: ISDNSubaddressString

     ForwardingOptions getForwardingOptions();

     MAPExtensionContainer getExtensionContainer();

     FTNAddressString getLongForwardedToNumber();
}