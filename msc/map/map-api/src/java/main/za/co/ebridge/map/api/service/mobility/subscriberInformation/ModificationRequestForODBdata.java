/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBData;

/**
 *
 ModificationRequestFor-ODB-data ::= SEQUENCE { odb-data [0] ODB-Data OPTIONAL, modifyNotificationToCSE [1]
 * ModificationInstruction OPTIONAL, extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ModificationRequestForODBdata extends Serializable {

    ODBData getOdbData();

    ModificationInstruction getModifyNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}
