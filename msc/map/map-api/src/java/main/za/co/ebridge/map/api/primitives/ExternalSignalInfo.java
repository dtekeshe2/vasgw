/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;

/**
 * ExternalSignalInfo ::= SEQUENCE { protocolId ProtocolId, signalInfo SignalInfo, extensionContainer ExtensionContainer
 * OPTIONAL, -- extensionContainer must not be used in version 2 ...}
 *
 * @author cristian veliscu
 *
 */
public interface ExternalSignalInfo extends Serializable {

    ProtocolId getProtocolId();

    SignalInfo getSignalInfo();

    MAPExtensionContainer getExtensionContainer();

}