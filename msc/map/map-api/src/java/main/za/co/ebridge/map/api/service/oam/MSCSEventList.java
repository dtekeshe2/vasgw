/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 MSC-S-EventList ::= BIT STRING { mo-mtCall (0), mo-mt-sms (1), lu-imsiAttach-imsiDetach (2), handovers (3), ss (4)} (SIZE
 * (5..16)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MSCSEventList extends Serializable {

    boolean getMoMtCall();

    boolean getMoMtSms();

    boolean getLuImsiAttachImsiDetach();

    boolean getHandovers();

    boolean getSs();

}
