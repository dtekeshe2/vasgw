/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: AuthenticationFailureReportRes ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AuthenticationFailureReportResponse extends MobilityMessage {

    MAPExtensionContainer getExtensionContainer();

}
