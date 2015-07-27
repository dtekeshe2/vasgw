/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 BMSC-InterfaceList ::= BIT STRING { gmb (0)} (SIZE (1..8)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface BMSCInterfaceList extends Serializable {

    boolean getGmb();

}
