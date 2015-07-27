/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 *
 UMTS-SecurityContextData ::= SEQUENCE { ck CK, ik IK, ksi KSI, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface UMTSSecurityContextData extends Serializable {

    CK getCK();

    IK getIK();

    KSI getKSI();

}
