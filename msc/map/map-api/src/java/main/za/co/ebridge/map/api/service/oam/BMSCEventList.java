/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 BMSC-EventList ::= BIT STRING { mbmsMulticastServiceActivation (0)} (SIZE (1..8)) -- Other bits than listed above shall be
 * discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface BMSCEventList extends Serializable {

    boolean getMbmsMulticastServiceActivation();

}
