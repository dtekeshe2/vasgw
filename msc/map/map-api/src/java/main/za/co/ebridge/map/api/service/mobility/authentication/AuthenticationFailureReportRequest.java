/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: authenticationFailureReport OPERATION ::= { --Timer m ARGUMENT AuthenticationFailureReportArg RESULT
 * AuthenticationFailureReportRes -- optional ERRORS { systemFailure | unexpectedDataValue | unknownSubscriber} CODE local:15 }
 *
 * AuthenticationFailureReportArg ::= SEQUENCE { imsi IMSI, failureCause FailureCause, extensionContainer ExtensionContainer
 * OPTIONAL, ... , re-attempt BOOLEAN OPTIONAL, accessType AccessType OPTIONAL, rand RAND OPTIONAL, vlr-Number [0]
 * ISDN-AddressString OPTIONAL, sgsn-Number [1] ISDN-AddressString OPTIONAL }
 *
 * RAND ::= OCTET STRING (SIZE (16))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AuthenticationFailureReportRequest extends MobilityMessage {

    IMSI getImsi();

    FailureCause getFailureCause();

    MAPExtensionContainer getExtensionContainer();

    boolean getReAttempt();

    AccessType getAccessType();

    byte[] getRand();

    ISDNAddressString getVlrNumber();

    ISDNAddressString getSgsnNumber();

}
