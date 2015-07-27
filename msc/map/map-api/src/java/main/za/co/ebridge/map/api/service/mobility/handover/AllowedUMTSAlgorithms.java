/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 AllowedUMTS-Algorithms ::= SEQUENCE { integrityProtectionAlgorithms [0] PermittedIntegrityProtectionAlgorithms OPTIONAL,
 * encryptionAlgorithms [1] PermittedEncryptionAlgorithms OPTIONAL, extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AllowedUMTSAlgorithms extends Serializable {

    PermittedIntegrityProtectionAlgorithms getIntegrityProtectionAlgorithms();

    PermittedEncryptionAlgorithms getEncryptionAlgorithms();

    MAPExtensionContainer getExtensionContainer();

}
