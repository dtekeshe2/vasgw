/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.TMSI;

/**
 *
 SubscriberId ::= CHOICE { imsi [0] IMSI, tmsi [1] TMSI}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SubscriberId extends Serializable {

    IMSI getImsi();

    TMSI getTmsi();

}
