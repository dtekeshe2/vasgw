/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalInfo;

/**
 *
 MAP V3:
 *
 * sendGroupCallEndSignal OPERATION ::= { --Timer l ARGUMENT SendGroupCallEndSignalArg RESULT SendGroupCallEndSignalRes CODE
 * local:40 }
 *
 * SendGroupCallEndSignalArg ::= SEQUENCE { imsi IMSI OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ...,
 * talkerPriority [0]TalkerPriority OPTIONAL, additionalInfo [1]AdditionalInfo OPTIONAL }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendGroupCallEndSignalRequest extends CallHandlingMessage {

     IMSI getImsi();

     MAPExtensionContainer getExtensionContainer();

     TalkerPriority getTalkerPriority();

     AdditionalInfo getAdditionalInfo();

}
