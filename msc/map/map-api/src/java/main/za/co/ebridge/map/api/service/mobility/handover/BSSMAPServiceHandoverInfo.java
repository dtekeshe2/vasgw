/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 BSSMAP-ServiceHandoverInfo ::= SEQUENCE { bssmap-ServiceHandover BSSMAP-ServiceHandover, rab-Id RAB-Id, -- RAB Identity is
 * needed to relate the service handovers with the radio access bearers. ...}
 *
 * RAB-Id ::= INTEGER (1..255)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface BSSMAPServiceHandoverInfo extends Serializable {

    BSSMAPServiceHandover getBSSMAPServiceHandover();

    Integer getRABId();

}
