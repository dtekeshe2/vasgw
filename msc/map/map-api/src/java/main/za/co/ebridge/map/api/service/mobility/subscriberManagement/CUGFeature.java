/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 CUG-Feature ::= SEQUENCE { basicService Ext-BasicServiceCode OPTIONAL, preferentialCUG-Indicator CUG-Index OPTIONAL,
 * interCUG-Restrictions InterCUG-Restrictions, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 * CUG-Index ::= INTEGER (0..32767) -- The internal structure is defined in ETS 300 138.
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CUGFeature extends Serializable {

    ExtBasicServiceCode getBasicService();

    Integer getPreferentialCugIndicator();

    InterCUGRestrictions getInterCugRestrictions();

    MAPExtensionContainer getExtensionContainer();

}
