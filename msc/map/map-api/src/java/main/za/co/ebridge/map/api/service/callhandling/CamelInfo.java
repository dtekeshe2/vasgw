/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OfferedCamel4CSIs;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SupportedCamelPhases;

/**
 * CamelInfo ::= SEQUENCE { supportedCamelPhases SupportedCamelPhases, suppress-T-CSI NULL OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ... , offeredCamel4CSIs [0] OfferedCamel4CSIs OPTIONAL }
 *
 * @author cristian veliscu
 *
 */
public interface CamelInfo extends Serializable {
    SupportedCamelPhases getSupportedCamelPhases();

    boolean getSuppressTCSI();

    MAPExtensionContainer getExtensionContainer();

    OfferedCamel4CSIs getOfferedCamel4CSIs();
}
