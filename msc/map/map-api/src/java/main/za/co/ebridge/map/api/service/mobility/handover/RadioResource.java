/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 RadioResource ::= SEQUENCE { radioResourceInformation RadioResourceInformation, rab-Id RAB-Id, -- RAB Identity is needed to
 * relate the radio resources with the radio access bearers. ...}
 *
 * RAB-Id ::= INTEGER (1..255)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RadioResource extends Serializable {

    RadioResourceInformation getRadioResourceInformation();

    int getRABId();

}
