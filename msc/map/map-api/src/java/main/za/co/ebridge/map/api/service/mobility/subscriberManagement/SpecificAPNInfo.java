/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SpecificAPNInfo ::= SEQUENCE { apn [0] APN, pdn-gw-Identity [1] PDN-GW-Identity, extensionContainer [2] ExtensionContainer
 * OPTIONAL, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SpecificAPNInfo extends Serializable {

    APN getAPN();

    PDNGWIdentity getPdnGwIdentity();

    MAPExtensionContainer getExtensionContainer();

}
