/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;

/**
 *
 IMSI-WithLMSI ::= SEQUENCE { imsi IMSI, lmsi LMSI, -- a special value 00000000 indicates that the LMSI is not in use ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface IMSIWithLMSI extends Serializable {

    IMSI getImsi();

    LMSI getLmsi();

}
