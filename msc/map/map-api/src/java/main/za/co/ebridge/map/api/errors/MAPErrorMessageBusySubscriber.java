/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 busySubscriber ERROR ::= { PARAMETER BusySubscriberParam -- optional CODE local:45 }
 *
 * BusySubscriberParam ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ..., ccbs-Possible [0] NULL OPTIONAL,
 * ccbs-Busy [1] NULL OPTIONAL}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageBusySubscriber extends MAPErrorMessage {

    MAPExtensionContainer getExtensionContainer();

    boolean getCcbsPossible();

    boolean getCcbsBusy();

    void setExtensionContainer(MAPExtensionContainer val);

    void setCcbsPossible(boolean val);

    void setCcbsBusy(boolean val);

}
