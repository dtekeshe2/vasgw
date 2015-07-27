/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 ZoneCode ::= OCTET STRING (SIZE (2)) -- internal structure is defined in TS 3GPP TS 23.003 [17]
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ZoneCode extends Serializable {

    byte[] getData();

    int getValue();

}
