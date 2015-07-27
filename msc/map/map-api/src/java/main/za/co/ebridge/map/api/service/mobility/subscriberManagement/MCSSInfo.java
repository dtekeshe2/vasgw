/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 MC-SS-Info ::= SEQUENCE { ss-Code [0] SS-Code, ss-Status [1] Ext-SS-Status, nbrSB [2] MaxMC-Bearers, nbrUser [3] MC-Bearers,
 * extensionContainer [4] ExtensionContainer OPTIONAL, ...}
 *
 * MaxMC-Bearers ::= INTEGER (2..7)
 *
 * MC-Bearers ::= INTEGER (1..7)
 *
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MCSSInfo extends Serializable {

    SSCode getSSCode();

    ExtSSStatus getSSStatus();

    int getNbrSB();

    int getNbrUser();

    MAPExtensionContainer getExtensionContainer();

}
