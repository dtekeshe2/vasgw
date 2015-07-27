/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 MME-InterfaceList ::= BIT STRING { s1-mme (0), s3 (1), s6a (2), s10 (3), s11 (4)} (SIZE (5..8)) -- Other bits than listed
 * above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MMEInterfaceList extends Serializable {

    boolean getS1Mme();

    boolean getS3();

    boolean getS6a();

    boolean getS10();

    boolean getS11();

}
