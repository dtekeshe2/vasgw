/* eBridge SS7 */
package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 *
 Kc ::= OCTET STRING (SIZE (8))
 *
 *
 * @author Lasith Waruna Perera
 *
 */
public interface Kc extends Serializable {
    byte[] getData();
}
