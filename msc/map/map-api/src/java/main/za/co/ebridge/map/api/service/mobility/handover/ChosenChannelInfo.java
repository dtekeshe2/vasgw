/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 ChosenChannelInfo ::= OCTET STRING (SIZE (1)) -- Octets are coded according the Chosen Channel information element in 3GPP TS
 * 48.008
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ChosenChannelInfo extends Serializable {

    int getData();

}
