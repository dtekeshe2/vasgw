/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * ist-Alert OPERATION ::= { --Timer m ARGUMENT IST-AlertArg RESULT IST-AlertRes -- optional ERRORS { unexpectedDataValue |
 * resourceLimitation | unknownSubscriber | systemFailure | facilityNotSupported} CODE local:87 }
 *
 * IST-AlertArg ::= SEQUENCE{ imsi [0] IMSI, extensionContainer [1] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface IstAlertRequest extends CallHandlingMessage {

     IMSI getImsi();

     MAPExtensionContainer getExtensionContainer();

}
