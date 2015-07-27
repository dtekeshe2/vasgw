/* eBridge SS7 */

package za.co.ebridge.map.api.service.pdpContextActivation;

import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 FailureReportRes ::= SEQUENCE { ggsn-Address [0] GSN-Address OPTIONAL, extensionContainer [1] ExtensionContainer OPTIONAL,
 * ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface FailureReportResponse extends PdpContextActivationMessage {

    GSNAddress getGgsnAddress();

    MAPExtensionContainer getExtensionContainer();

}
