/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 * MAP V3: UpdateLocationRes ::= SEQUENCE { hlr-Number ISDN-AddressString, extensionContainer ExtensionContainer OPTIONAL, ...,
 * add-Capability NULL OPTIONAL, pagingArea-Capability [0]NULL OPTIONAL }
 *
 * MAP V2: UpdateLocationRes ::= CHOICE { hlr-Number ISDN-AddressString, -- hlr-Number must not be used in version greater 1
 * extensibleUpdateLocationRes ExtensibleUpdateLocationRes} -- extensibleUpdateLocationRes must not be used in version 1
 *
 * ExtensibleUpdateLocationRes ::= SEQUENCE { hlr-Number ISDN-AddressString, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface UpdateLocationResponse extends MobilityMessage {

    ISDNAddressString getHlrNumber();

    MAPExtensionContainer getExtensionContainer();

    boolean getAddCapability();

    boolean getPagingAreaCapability();

    long getMapProtocolVersion();

}
