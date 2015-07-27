/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * statusReport OPERATION ::= { --Timer m ARGUMENT StatusReportArg RESULT StatusReportRes -- optional ERRORS { unknownSubscriber
 * | systemFailure | unexpectedDataValue | dataMissing} CODE local:74 }
 *
 * StatusReportArg ::= SEQUENCE{ imsi [0] IMSI, eventReportData [1] EventReportData OPTIONAL, callReportdata [2] CallReportData
 * OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface StatusReportRequest extends CallHandlingMessage {

    IMSI getImsi();

    EventReportData getEventReportData();

    CallReportData getCallReportData();

    MAPExtensionContainer getExtensionContainer();

}
