/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import java.io.Serializable;

/**
 *
 StateAttributes ::= SEQUENCE { downlinkAttached [5] NULL OPTIONAL, uplinkAttached [6] NULL OPTIONAL, dualCommunication [7]
 * NULL OPTIONAL, callOriginator [8] NULL OPTIONAL }
 *
 * -- Refers to 3GPP TS 44.068 for definitions of StateAttributes fields.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface StateAttributes extends Serializable {

    boolean getDownlinkAttached();

    boolean getUplinkAttached();

    boolean getDualCommunication();

    boolean getCallOriginator();

}
