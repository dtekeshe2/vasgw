/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 Ext-CallBarInfo ::= SEQUENCE { ss-Code SS-Code, callBarringFeatureList Ext-CallBarFeatureList, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 * Ext-CallBarFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-CallBarringFeature
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtCallBarInfo extends Serializable {

    SSCode getSsCode();

    ArrayList<ExtCallBarringFeature> getCallBarringFeatureList();

    MAPExtensionContainer getExtensionContainer();

}
