/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGInterlock;

/**
 *
 CUG-CheckInfo ::= SEQUENCE { cug-Interlock CUG-Interlock, cug-OutgoingAccess NULL OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author cristian veliscu
 *
 */
public interface CUGCheckInfo extends Serializable {
     CUGInterlock getCUGInterlock();

     boolean getCUGOutgoingAccess();

     MAPExtensionContainer getExtensionContainer();
}