/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.AccessNetworkSignalInfo;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalInfo;
import za.co.ebridge.map.api.service.sms.SmsSignalInfo;

/**
 *
 MAP V3:
 *
 * forwardGroupCallSignalling OPERATION ::= { --Timer s ARGUMENT ForwardGroupCallSignallingArg CODE local:42 }
 *
 * ForwardGroupCallSignallingArg ::= SEQUENCE { imsi IMSI OPTIONAL, uplinkRequestAck [0] NULL OPTIONAL, uplinkReleaseIndication
 * [1] NULL OPTIONAL, uplinkRejectCommand [2] NULL OPTIONAL, uplinkSeizedCommand [3] NULL OPTIONAL, uplinkReleaseCommand [4]
 * NULL OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ..., stateAttributes [5] StateAttributes OPTIONAL,
 * talkerPriority [6] TalkerPriority OPTIONAL, additionalInfo [7] AdditionalInfo OPTIONAL, emergencyModeResetCommandFlag [8]
 * NULL OPTIONAL, sm-RP-UI [9] SignalInfo OPTIONAL, an-APDU [10] AccessNetworkSignalInfo OPTIONAL }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ForwardGroupCallSignallingRequest extends CallHandlingMessage {

     IMSI getImsi();

     boolean getUplinkRequestAck();

     boolean getUplinkReleaseIndication();

     boolean getUplinkRejectCommand();

     boolean getUplinkSeizedCommand();

     boolean getUplinkReleaseCommand();

     MAPExtensionContainer getExtensionContainer();

     StateAttributes getStateAttributes();

     TalkerPriority getTalkerPriority();

     AdditionalInfo getAdditionalInfo();

     boolean getEmergencyModeResetCommandFlag();

     SmsSignalInfo getSmRpUi();

     AccessNetworkSignalInfo getAnApdu();

}
