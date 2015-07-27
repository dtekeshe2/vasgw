/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * subscriberBusyForMT-SMS ERROR ::= { PARAMETER SubBusyForMT-SMS-Param -- optional CODE local:31 }
 *
 *
 * SubBusyForMT-SMS-Param ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ... , gprsConnectionSuspended NULL
 * OPTIONAL } -- If GprsConnectionSuspended is not understood it shall -- be discarded
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageSubscriberBusyForMtSms extends MAPErrorMessage {

    MAPExtensionContainer getExtensionContainer();

    Boolean getGprsConnectionSuspended();

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

    void setGprsConnectionSuspended(Boolean gprsConnectionSuspended);

}
