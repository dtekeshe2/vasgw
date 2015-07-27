/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 cug-Reject ERROR ::= { PARAMETER CUG-RejectParam -- optional CODE local:15 }
 *
 * CUG-RejectParam ::= SEQUENCE { cug-RejectCause CUG-RejectCause OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageCUGReject extends MAPErrorMessage {

    CUGRejectCause getCUGRejectCause();

    MAPExtensionContainer getExtensionContainer();

    void setCUGRejectCause(CUGRejectCause val);

    void setExtensionContainer(MAPExtensionContainer val);

}
