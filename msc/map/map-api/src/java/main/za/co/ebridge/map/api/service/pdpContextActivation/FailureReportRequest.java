/* eBridge SS7 */

package za.co.ebridge.map.api.service.pdpContextActivation;

import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * failureReport OPERATION ::= { --Timer m ARGUMENT FailureReportArg RESULT FailureReportRes -- optional ERRORS { systemFailure
 * | dataMissing | unexpectedDataValue | unknownSubscriber} CODE local:25 }
 *
 * FailureReportArg ::= SEQUENCE { imsi [0] IMSI, ggsn-Number [1] ISDN-AddressString , ggsn-Address [2] GSN-Address OPTIONAL,
 * extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface FailureReportRequest extends PdpContextActivationMessage {

    IMSI getImsi();

    ISDNAddressString getGgsnNumber();

    GSNAddress getGgsnAddress();

    MAPExtensionContainer getExtensionContainer();

}
