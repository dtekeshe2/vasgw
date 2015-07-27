/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: CancelLocationRes ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CancelLocationResponse extends MobilityMessage {

    MAPExtensionContainer getExtensionContainer();

}
