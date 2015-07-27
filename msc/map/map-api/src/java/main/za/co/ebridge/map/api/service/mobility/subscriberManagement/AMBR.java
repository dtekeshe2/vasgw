/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 AMBR ::= SEQUENCE { max-RequestedBandwidth-UL [0] Bandwidth, max-RequestedBandwidth-DL [1] Bandwidth, extensionContainer [2]
 * ExtensionContainer OPTIONAL, ... }
 *
 * Bandwidth ::= INTEGER -- bits per second
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AMBR extends Serializable {

    int getMaxRequestedBandwidthUL();

    int getMaxRequestedBandwidthDL();

    MAPExtensionContainer getExtensionContainer();

}
