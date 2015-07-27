/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SelectedUMTS-Algorithms ::= SEQUENCE { integrityProtectionAlgorithm [0] ChosenIntegrityProtectionAlgorithm OPTIONAL,
 * encryptionAlgorithm [1] ChosenEncryptionAlgorithm OPTIONAL, extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SelectedUMTSAlgorithms extends Serializable {

    ChosenIntegrityProtectionAlgorithm getIntegrityProtectionAlgorithm();

    ChosenEncryptionAlgorithm getEncryptionAlgorithm();

    MAPExtensionContainer getExtensionContainer();

}
