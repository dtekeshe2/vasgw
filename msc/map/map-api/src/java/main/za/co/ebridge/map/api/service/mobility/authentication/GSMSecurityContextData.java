/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 *
 GSM-SecurityContextData ::= SEQUENCE { kc Kc, cksn Cksn, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface GSMSecurityContextData extends Serializable {

    Kc getKc();

    Cksn getCksn();

}
