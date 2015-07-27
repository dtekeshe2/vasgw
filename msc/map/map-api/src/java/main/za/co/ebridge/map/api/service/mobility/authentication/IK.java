/* eBridge SS7 */
package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 *
 IK ::= OCTET STRING (SIZE (16))
 *
 *
 * @author Lasith Waruna Perera
 *
 */
public interface IK extends Serializable {
    byte[] getData();
}
