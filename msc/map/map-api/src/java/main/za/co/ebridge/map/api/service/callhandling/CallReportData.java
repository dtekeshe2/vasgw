/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 CallReportData ::= SEQUENCE{ monitoringMode [0] MonitoringMode OPTIONAL, callOutcome [1] CallOutcome OPTIONAL,
 * extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallReportData extends Serializable {

    MonitoringMode getMonitoringMode();

    CallOutcome getCallOutcome();

    MAPExtensionContainer getExtensionContainer();

}
