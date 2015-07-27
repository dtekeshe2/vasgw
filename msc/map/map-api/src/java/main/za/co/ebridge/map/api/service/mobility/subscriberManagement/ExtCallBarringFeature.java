/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 Ext-CallBarringFeature ::= SEQUENCE { basicService Ext-BasicServiceCode OPTIONAL, ss-Status [4] Ext-SS-Status,
 * extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtCallBarringFeature extends Serializable {

    ExtBasicServiceCode getBasicService();

    ExtSSStatus getSsStatus();

    MAPExtensionContainer getExtensionContainer();

}
