/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.AccessNetworkSignalInfo;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalInfo;

/**
 *
 MAP V3:
 *
 * processGroupCallSignalling OPERATION ::= { --Timer s ARGUMENT ProcessGroupCallSignallingArg CODE local:41 }
 *
 * ProcessGroupCallSignallingArg ::= SEQUENCE { uplinkRequest [0] NULL OPTIONAL, uplinkReleaseIndication [1] NULL OPTIONAL,
 * releaseGroupCall [2] NULL OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ..., talkerPriority [3] TalkerPriority
 * OPTIONAL, additionalInfo [4] AdditionalInfo OPTIONAL, emergencyModeResetCommandFlag [5] NULL OPTIONAL, an-APDU [6]
 * AccessNetworkSignalInfo OPTIONAL }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ProcessGroupCallSignallingRequest extends CallHandlingMessage {

     boolean getUplinkRequest();

     boolean getUplinkReleaseIndication();

     boolean getReleaseGroupCall();

     MAPExtensionContainer getExtensionContainer();

     TalkerPriority getTalkerPriority();

     AdditionalInfo getAdditionalInfo();

     boolean getEmergencyModeResetCommandFlag();

     AccessNetworkSignalInfo getAnAPDU();

}
