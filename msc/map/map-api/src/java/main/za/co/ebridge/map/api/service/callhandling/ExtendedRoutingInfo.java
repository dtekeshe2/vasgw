/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

/**
 * ExtendedRoutingInfo ::= CHOICE { routingInfo RoutingInfo, camelRoutingInfo [8] CamelRoutingInfo}
 *
 * @author cristian veliscu
 *
 */
public interface ExtendedRoutingInfo extends Serializable {
    RoutingInfo getRoutingInfo();

     CamelRoutingInfo getCamelRoutingInfo();
}