/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationSetList;
import za.co.ebridge.map.api.service.mobility.authentication.CurrentSecurityContext;

/**
 *
 MAP V3: SendIdentificationRes ::= [3] SEQUENCE { imsi IMSI OPTIONAL, -- IMSI shall be present in the first (or only) service
 * response of a dialogue. -- If multiple service requests are present in a dialogue then IMSI -- shall not be present in any
 * service response other than the first one. authenticationSetList AuthenticationSetList OPTIONAL, currentSecurityContext
 * [2]CurrentSecurityContext OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 * MAP V2: SendIdentificationRes ::= SEQUENCE { imsi IMSI authenticationSetList AuthenticationSetList OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendIdentificationResponse extends MobilityMessage {

    IMSI getImsi();

    AuthenticationSetList getAuthenticationSetList();

    CurrentSecurityContext getCurrentSecurityContext();

    MAPExtensionContainer getExtensionContainer();

}
