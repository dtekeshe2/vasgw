/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 * RoutingInfo ::= CHOICE { roamingNumber ISDN-AddressString, forwardingData ForwardingData}
 *
 * @author cristian veliscu
 *
 */
public interface RoutingInfo extends Serializable {
     ISDNAddressString getRoamingNumber();

     ForwardingData getForwardingData();
}