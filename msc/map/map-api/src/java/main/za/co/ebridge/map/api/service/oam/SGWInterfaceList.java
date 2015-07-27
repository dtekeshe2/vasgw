/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 SGW-InterfaceList ::= BIT STRING { s4 (0), s5 (1), s8b (2), s11 (3), gxc (4)} (SIZE (5..8)) -- Other bits than listed above
 * shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SGWInterfaceList extends Serializable {

    boolean gets4();

    boolean gets5();

    boolean gets8b();

    boolean gets11();

    boolean getgxc();

}
