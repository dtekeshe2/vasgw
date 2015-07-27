/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 MME-EventList ::= BIT STRING { ue-initiatedPDNconectivityRequest (0), serviceRequestts (1),
 * initialAttachTrackingAreaUpdateDetach (2), ue-initiatedPDNdisconnection (3), bearerActivationModificationDeletion (4),
 * handover (5)} (SIZE (6..8)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MMEEventList extends Serializable {

    boolean getUeInitiatedPDNconectivityRequest();

    boolean getServiceRequestts();

    boolean getInitialAttachTrackingAreaUpdateDetach();

    boolean getUeInitiatedPDNdisconnection();

    boolean getBearerActivationModificationDeletion();

    boolean getHandover();

}
