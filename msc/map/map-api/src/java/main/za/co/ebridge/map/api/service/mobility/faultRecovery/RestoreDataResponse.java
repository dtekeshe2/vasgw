/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.faultRecovery;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: RestoreDataRes ::= SEQUENCE { hlr-Number ISDN-AddressString, msNotReachable NULL OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 * MAP V2: RestoreDataRes ::= SEQUENCE { hlr-Number ISDN-AddressString, msNotReachable NULL OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RestoreDataResponse extends MobilityMessage {

    ISDNAddressString getHlrNumber();

    boolean getMsNotReachable();

    MAPExtensionContainer getExtensionContainer();

}
