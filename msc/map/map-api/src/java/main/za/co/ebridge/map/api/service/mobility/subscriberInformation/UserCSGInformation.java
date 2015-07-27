/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSGId;

/**
 *
 UserCSGInformation ::= SEQUENCE { csg-Id [0] CSG-Id, extensionContainer [1] ExtensionContainer OPTIONAL, ..., accessMode [2]
 * OCTET STRING (SIZE(1)) OPTIONAL, cmi [3] OCTET STRING (SIZE(1)) OPTIONAL } -- The encoding of the accessMode and cmi
 * parameters are as defined in 3GPP TS 29.060 [105].
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface UserCSGInformation extends Serializable {

    CSGId getCSGId();

    MAPExtensionContainer getExtensionContainer();

    Integer getAccessMode();

    Integer getCmi();

}
