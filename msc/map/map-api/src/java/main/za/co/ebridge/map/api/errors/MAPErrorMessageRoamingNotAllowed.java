/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 roamingNotAllowed ERROR ::= { PARAMETER RoamingNotAllowedParam CODE local:8 }
 *
 * RoamingNotAllowedParam ::= SEQUENCE { roamingNotAllowedCause RoamingNotAllowedCause, extensionContainer ExtensionContainer
 * OPTIONAL, ..., additionalRoamingNotAllowedCause [0] AdditionalRoamingNotAllowedCause OPTIONAL }
 *
 * -- if the additionalRoamingNotallowedCause is received by the MSC/VLR or SGSN then the -- roamingNotAllowedCause shall be
 * discarded.
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageRoamingNotAllowed extends MAPErrorMessage {

    RoamingNotAllowedCause getRoamingNotAllowedCause();

    MAPExtensionContainer getExtensionContainer();

    AdditionalRoamingNotAllowedCause getAdditionalRoamingNotAllowedCause();

    void setRoamingNotAllowedCause(RoamingNotAllowedCause val);

    void setExtensionContainer(MAPExtensionContainer val);

    void setAdditionalRoamingNotAllowedCause(AdditionalRoamingNotAllowedCause val);

}
