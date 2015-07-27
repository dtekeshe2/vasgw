/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 M-CSI ::= SEQUENCE { mobilityTriggers MobilityTriggers, serviceKey ServiceKey, gsmSCF-Address [0] ISDN-AddressString,
 * extensionContainer [1] ExtensionContainer OPTIONAL, notificationToCSE [2] NULL OPTIONAL, csi-Active [3] NULL OPTIONAL, ...}
 * -- notificationToCSE and csi-Active shall not be present when M-CSI is sent to VLR. -- They may only be included in ATSI/ATM
 * ack/NSDC message.
 *
 * MobilityTriggers ::= SEQUENCE SIZE (1..10) OF MM-Code
 *
 * ServiceKey ::= INTEGER (0..2147483647)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MCSI extends Serializable {

    ArrayList<MMCode> getMobilityTriggers();

    long getServiceKey();

    ISDNAddressString getGsmSCFAddress();

    MAPExtensionContainer getExtensionContainer();

    boolean getNotificationToCSE();

    boolean getCsiActive();

}
