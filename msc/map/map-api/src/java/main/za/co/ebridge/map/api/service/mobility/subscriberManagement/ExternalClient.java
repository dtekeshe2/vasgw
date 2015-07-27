/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.lsm.LCSClientExternalID;

/**
 *
 ExternalClient ::= SEQUENCE { clientIdentity LCSClientExternalID, gmlc-Restriction [0] GMLC-Restriction OPTIONAL,
 * notificationToMSUser [1] NotificationToMSUser OPTIONAL, -- If notificationToMSUser is not received, the default value
 * according to -- 3GPP TS 23.271 shall be assumed. extensionContainer [2] ExtensionContainer OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExternalClient extends Serializable {

    LCSClientExternalID getClientIdentity();

    GMLCRestriction getGMLCRestriction();

    NotificationToMSUser getNotificationToMSUser();

    MAPExtensionContainer getExtensionContainer();

}
