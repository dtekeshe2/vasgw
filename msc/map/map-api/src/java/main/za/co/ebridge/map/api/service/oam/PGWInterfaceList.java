/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 PGW-InterfaceList ::= BIT STRING { s2a (0), s2b (1), s2c (2), s5 (3), s6b (4), gx (5), s8b (6), sgi (7)} (SIZE (8..16)) --
 * Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PGWInterfaceList extends Serializable {

    boolean getS2a();

    boolean getS2b();

    boolean getS2c();

    boolean getS5();

    boolean getS6b();

    boolean getGx();

    boolean getS8b();

    boolean getSgi();

}
