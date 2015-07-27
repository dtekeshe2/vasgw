/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.AccessNetworkSignalInfo;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: PrepareSubsequentHO-Res ::= [3] SEQUENCE { an-APDU AccessNetworkSignalInfo, extensionContainer [0] ExtensionContainer
 * OPTIONAL, ...}
 *
 * MAP V2: RESULT bss-APDU ExternalSignalInfo
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PrepareSubsequentHandoverResponse extends MobilityMessage {

    AccessNetworkSignalInfo getAnAPDU();

    MAPExtensionContainer getExtensionContainer();

    // MAP V2
    ExternalSignalInfo getBssAPDU();

}
