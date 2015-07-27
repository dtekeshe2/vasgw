/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 MOLR-Class ::= SEQUENCE { ss-Code SS-Code, ss-Status Ext-SS-Status, extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MOLRClass extends Serializable {

    SSCode getSsCode();

    ExtSSStatus getSsStatus();

    MAPExtensionContainer getExtensionContainer();

}
