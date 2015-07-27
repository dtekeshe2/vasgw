/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 MGW-InterfaceList ::= BIT STRING { mc (0), nb-up (1), iu-up (2)} (SIZE (3..8)) -- Other bits than listed above shall be
 * discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MGWInterfaceList extends Serializable {

    boolean getMc();

    boolean getNbUp();

    boolean getIuUp();

}
