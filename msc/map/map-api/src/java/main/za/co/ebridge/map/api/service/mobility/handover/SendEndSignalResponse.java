/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: SendEndSignal-Res ::= SEQUENCE { extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendEndSignalResponse extends MobilityMessage {

    MAPExtensionContainer getExtensionContainer();

}
