/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * ist-Command OPERATION::= { --Timer m ARGUMENT IST-CommandArg RESULT IST-CommandRes -- optional ERRORS { unexpectedDataValue |
 * resourceLimitation | unknownSubscriber | systemFailure | facilityNotSupported} CODE local:88 }
 *
 * IST-CommandArg ::= SEQUENCE{ imsi [0] IMSI, extensionContainer [1] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface IstCommandRequest extends Serializable {

     IMSI getImsi();

     MAPExtensionContainer getExtensionContainer();

}
