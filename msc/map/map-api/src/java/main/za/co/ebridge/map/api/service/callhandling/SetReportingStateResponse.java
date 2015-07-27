/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SetReportingStateRes ::= SEQUENCE{ ccbs-SubscriberStatus [0] CCBS-SubscriberStatus OPTIONAL, extensionContainer [1]
 * ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SetReportingStateResponse extends Serializable {

    CCBSSubscriberStatus getCcbsSubscriberStatus();

    MAPExtensionContainer getExtensionContainer();

}
