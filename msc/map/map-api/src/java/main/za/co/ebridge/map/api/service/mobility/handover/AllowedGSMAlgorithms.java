/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 AllowedGSM-Algorithms ::= OCTET STRING (SIZE (1)) -- internal structure is coded as Algorithm identifier octet from --
 * Permitted Algorithms defined in 3GPP TS 48.008 -- A node shall mark all GSM algorithms that are allowed in MSC-B
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AllowedGSMAlgorithms extends Serializable {

    int getData();

}
