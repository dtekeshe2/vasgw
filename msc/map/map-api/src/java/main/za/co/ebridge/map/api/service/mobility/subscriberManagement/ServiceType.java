/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ServiceType ::= SEQUENCE { serviceTypeIdentity LCSServiceTypeID, gmlc-Restriction [0] GMLC-Restriction OPTIONAL,
 * notificationToMSUser [1] NotificationToMSUser OPTIONAL, -- If notificationToMSUser is not received, the default value
 * according to -- 3GPP TS 23.271 shall be assumed. extensionContainer [2] ExtensionContainer OPTIONAL, ... }
 *
 * LCSServiceTypeID ::= INTEGER (0..127) -- the integer values 0-63 are reserved for Standard LCS service types -- the integer
 * values 64-127 are reserved for Non Standard LCS service types
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ServiceType extends Serializable {

    int getServiceTypeIdentity();

    GMLCRestriction getGMLCRestriction();

    NotificationToMSUser getNotificationToMSUser();

    MAPExtensionContainer getExtensionContainer();

}
