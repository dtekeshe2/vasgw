/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 * LCSClientExternalID ::= SEQUENCE { externalAddress [0] ISDN-AddressString OPTIONAL, extensionContainer [1] ExtensionContainer
 * OPTIONAL, ... }
 *
 * @author amit bhayani
 *
 */
public interface LCSClientExternalID extends Serializable {

    ISDNAddressString getExternalAddress();

    MAPExtensionContainer getExtensionContainer();
}
