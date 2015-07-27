/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 EMLPP-Info ::= SEQUENCE { maximumentitledPriority EMLPP-Priority, defaultPriority EMLPP-Priority, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 * EMLPP-Priority ::= INTEGER (0..15) -- The mapping from the values A,B,0,1,2,3,4 to the integer-value is -- specified as
 * follows where A is the highest and 4 is the lowest -- priority level -- the integer values 7-15 are spare and shall be mapped
 * to value 4
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EMLPPInfo extends Serializable {

    int getMaximumentitledPriority();

    int getDefaultPriority();

    MAPExtensionContainer getExtensionContainer();

}
