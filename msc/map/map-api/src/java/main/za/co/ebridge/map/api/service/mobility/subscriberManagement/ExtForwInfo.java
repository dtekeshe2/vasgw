/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 Ext-ForwInfo ::= SEQUENCE { ss-Code SS-Code, forwardingFeatureList Ext-ForwFeatureList, extensionContainer [0]
 * ExtensionContainer OPTIONAL, ...}
 *
 * Ext-ForwFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-ForwFeature
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtForwInfo extends Serializable {

    SSCode getSsCode();

    ArrayList<ExtForwFeature> getForwardingFeatureList();

    MAPExtensionContainer getExtensionContainer();

}
