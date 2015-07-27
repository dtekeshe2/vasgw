/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 *
 AuthenticationSet ::= SEQUENCE { rand RAND, sres SRES, kc Kc, ...}
 *
 * RAND ::= octet STRING (SIZE (16)) SRES ::= octet STRING (SIZE (4)) Kc ::= octet STRING (SIZE (8))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AuthenticationSet extends Serializable {

    byte[] getRand();

    byte[] getSres();

    byte[] getKc();

}
