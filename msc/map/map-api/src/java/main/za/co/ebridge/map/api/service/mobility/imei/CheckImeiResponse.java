/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.imei;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: CheckIMEIRes ::= SEQUENCE { equipmentStatus EquipmentStatus OPTIONAL, bmuef UESBI-Iu OPTIONAL, extensionContainer [0]
 * ExtensionContainer OPTIONAL, ...}
 *
 * MAP V2: RESULT equipmentStatus EquipmentStatus
 *
 *
 * @author normandes
 *
 */
public interface CheckImeiResponse extends MobilityMessage {

    EquipmentStatus getEquipmentStatus();

    UESBIIu getBmuef();

    MAPExtensionContainer getExtensionContainer();

}
