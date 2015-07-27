/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.IMEI;

/**
 *
 ADD-Info ::= SEQUENCE { imeisv [0] IMEI, skipSubscriberDataUpdate [1] NULL OPTIONAL, -- The skipSubscriberDataUpdate
 * parameter in the UpdateLocationArg and the ADD-Info -- structures carry the same semantic. ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ADDInfo extends Serializable {

    IMEI getImeisv();

    boolean getSkipSubscriberDataUpdate();

}
