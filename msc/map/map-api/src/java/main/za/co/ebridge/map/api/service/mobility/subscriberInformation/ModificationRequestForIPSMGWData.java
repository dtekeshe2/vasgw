/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ModificationRequestFor-IP-SM-GW-Data ::= SEQUENCE { modifyRegistrationStatus [0] ModificationInstruction OPTIONAL,
 * extensionContainer [1] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForIPSMGWData extends Serializable {

    ModificationInstruction getModifyRegistrationStatus();

    MAPExtensionContainer getExtensionContainer();

}
