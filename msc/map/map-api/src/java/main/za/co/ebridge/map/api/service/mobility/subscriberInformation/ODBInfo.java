/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBData;

/**
 *
 ODB-Info ::= SEQUENCE { odb-Data ODB-Data, notificationToCSE NULL OPTIONAL, extensionContainer ExtensionContainer OPTIONAL,
 * ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ODBInfo extends Serializable {

    ODBData getOdbData();

    boolean getNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
