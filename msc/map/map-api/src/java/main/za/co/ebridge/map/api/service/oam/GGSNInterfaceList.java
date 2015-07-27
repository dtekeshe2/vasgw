/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 GGSN-InterfaceList ::= BIT STRING { gn (0), gi (1), gmb (2)} (SIZE (3..8)) -- Other bits than listed above shall be
 * discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface GGSNInterfaceList extends Serializable {

    boolean getGn();

    boolean getGi();

    boolean getGmb();

}
