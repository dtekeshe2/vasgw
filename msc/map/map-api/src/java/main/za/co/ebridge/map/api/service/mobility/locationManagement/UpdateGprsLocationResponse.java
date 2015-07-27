/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: UpdateGprsLocationRes ::= SEQUENCE { hlr-Number ISDN-AddressString, extensionContainer ExtensionContainer OPTIONAL,
 * ..., add-Capability NULL OPTIONAL, sgsn-mmeSeparationSupported [0] NULL OPTIONAL }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface UpdateGprsLocationResponse extends MobilityMessage {

    ISDNAddressString getHlrNumber();

    MAPExtensionContainer getExtensionContainer();

    boolean getAddCapability();

    boolean getSgsnMmeSeparationSupported();

}
