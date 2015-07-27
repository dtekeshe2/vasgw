/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 IST-AlertRes ::= SEQUENCE{ istAlertTimer [0] IST-AlertTimerValue OPTIONAL, istInformationWithdraw [1] NULL OPTIONAL,
 * callTerminationIndicator [2] CallTerminationIndicator OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 * IST-AlertTimerValue ::= INTEGER (15..255)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface IstAlertResponse extends CallHandlingMessage {

     Integer getIstAlertTimer();

     boolean getIstInformationWithdraw();

     CallTerminationIndicator getCallTerminationIndicator();

     MAPExtensionContainer getExtensionContainer();

}
