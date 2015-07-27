/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 LSAData ::= SEQUENCE { lsaIdentity [0] LSAIdentity, lsaAttributes [1] LSAAttributes, lsaActiveModeIndicator [2] NULL
 * OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LSAData extends Serializable {

    LSAIdentity getLSAIdentity();

    LSAAttributes getLSAAttributes();

    boolean getLsaActiveModeIndicator();

    MAPExtensionContainer getExtensionContainer();

}
