/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V1: PerformHO-Res ::= SEQUENCE { handoverNumber ISDN-AddressString, accessSignalInfo ExternalSignalInfo}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PerformHandoverResponse extends MobilityMessage {

    ISDNAddressString getHandoverNumber();

    ExternalSignalInfo getAccessSignalInfo();

}
