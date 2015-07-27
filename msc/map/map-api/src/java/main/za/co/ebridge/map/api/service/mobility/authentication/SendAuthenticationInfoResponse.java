/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: SendAuthenticationInfoRes ::= [3] SEQUENCE { authenticationSetList AuthenticationSetList OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ..., eps-AuthenticationSetList [2] EPS-AuthenticationSetList OPTIONAL }
 *
 * MAP V2: SendAuthenticationInfoRes ::= AuthenticationSetList
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendAuthenticationInfoResponse extends MobilityMessage {

    AuthenticationSetList getAuthenticationSetList();

    MAPExtensionContainer getExtensionContainer();

    EpsAuthenticationSetList getEpsAuthenticationSetList();

    long getMapProtocolVersion();

}
