/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 * CCBS-Indicators ::= SEQUENCE { ccbs-Possible [0] NULL OPTIONAL, keepCCBS-CallIndicator [1] NULL OPTIONAL, extensionContainer
 * [2] ExtensionContainer OPTIONAL, ...}
 *
 * @author cristian veliscu
 *
 */
public interface CCBSIndicators {
    boolean getCCBSPossible();

    boolean getKeepCCBSCallIndicator();

    MAPExtensionContainer getMAPExtensionContainer();
}