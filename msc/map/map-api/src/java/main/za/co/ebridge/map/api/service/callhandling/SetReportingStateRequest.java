/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * setReportingState OPERATION ::= { --Timer m ARGUMENT SetReportingStateArg RESULT SetReportingStateRes -- optional ERRORS {
 * systemFailure | unidentifiedSubscriber | unexpectedDataValue | dataMissing | resourceLimitation | facilityNotSupported} CODE
 * local:73 }
 *
 * SetReportingStateArg ::= SEQUENCE { imsi [0] IMSI OPTIONAL, lmsi [1] LMSI OPTIONAL, ccbs-Monitoring [2] ReportingState
 * OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SetReportingStateRequest extends Serializable {

    IMSI getImsi();

    LMSI getLmsi();

    ReportingState getCcbsMonitoring();

    MAPExtensionContainer getExtensionContainer();

}
