/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 * The MAP ReturnError message: MessageSMDeliveryFailure with parameters
 *
 * sm-DeliveryFailure ERROR ::= { PARAMETER SM-DeliveryFailureCause CODE local:32 }
 *
 *
 *
 * SM-DeliveryFailureCause ::= SEQUENCE { sm-EnumeratedDeliveryFailureCause SM-EnumeratedDeliveryFailureCause, diagnosticInfo
 * SignalInfo OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageSMDeliveryFailure extends MAPErrorMessage {

    SMEnumeratedDeliveryFailureCause getSMEnumeratedDeliveryFailureCause();

    byte[] getSignalInfo();

    MAPExtensionContainer getExtensionContainer();

    void setSMEnumeratedDeliveryFailureCause(SMEnumeratedDeliveryFailureCause sMEnumeratedDeliveryFailureCause);

    void setSignalInfo(byte[] signalInfo);

    void setExtensionContainer(MAPExtensionContainer extensionContainer);
}
