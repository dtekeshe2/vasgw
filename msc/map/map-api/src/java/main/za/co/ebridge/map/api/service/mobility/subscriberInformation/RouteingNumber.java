/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 * RouteingNumber ::= TBCD-STRING (SIZE (1..5))
 *
 * @author amit bhayani
 *
 */
public interface RouteingNumber extends Serializable {
    String getRouteingNumber();
}
