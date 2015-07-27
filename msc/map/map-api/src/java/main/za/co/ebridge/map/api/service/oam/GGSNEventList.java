/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 GGSN-EventList ::= BIT STRING { pdpContext (0), mbmsContext (1)} (SIZE (2..8)) -- Other bits than listed above shall be
 * discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface GGSNEventList extends Serializable {

    boolean getPdpContext();

    boolean getMbmsContext();

}
