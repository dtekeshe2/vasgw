/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 SGW-EventList ::= BIT STRING { pdn-connectionCreation (0), pdn-connectionTermination (1),
 * bearerActivationModificationDeletion (2)} (SIZE (3..8)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SGWEventList extends Serializable {

    boolean getPdnConnectionCreation();

    boolean getPdnConnectionTermination();

    boolean getBearerActivationModificationDeletion();

}
