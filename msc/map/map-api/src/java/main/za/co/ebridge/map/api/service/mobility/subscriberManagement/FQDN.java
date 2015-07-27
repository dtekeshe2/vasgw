/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 FQDN ::= OCTET STRING (SIZE (9..255))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface FQDN extends Serializable {

    byte[] getData();

}
