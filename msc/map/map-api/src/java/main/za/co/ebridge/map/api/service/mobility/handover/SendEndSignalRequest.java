/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.AccessNetworkSignalInfo;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V1-2-3:
 *
 * MAP V3: sendEndSignal OPERATION ::= { --Timer l ARGUMENT SendEndSignal-Arg RESULT SendEndSignal-Res CODE local:29 }
 *
 * MAP V2: SendEndSignal ::= OPERATION --Timer l ARGUMENT bss-APDU ExternalSignalInfo -- optional -- bss-APDU must be absent in
 * version 1 -- bss-APDU must be present in version greater 1 RESULT
 *
 *
 * MAP V3: SendEndSignal-Arg ::= [3] SEQUENCE { an-APDU AccessNetworkSignalInfo, extensionContainer [0] ExtensionContainer
 * OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendEndSignalRequest extends MobilityMessage {

    AccessNetworkSignalInfo getAnAPDU();

    MAPExtensionContainer getExtensionContainer();

    // this parameter is for MAP V2
    ExternalSignalInfo getBssAPDU();

}
