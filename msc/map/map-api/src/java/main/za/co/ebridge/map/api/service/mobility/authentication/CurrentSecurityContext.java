/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 *
 CurrentSecurityContext ::= CHOICE { gsm-SecurityContextData [0] GSM-SecurityContextData, umts-SecurityContextData [1]
 * UMTS-SecurityContextData }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CurrentSecurityContext extends Serializable {

    GSMSecurityContextData getGSMSecurityContextData();

    UMTSSecurityContextData getUMTSSecurityContextData();

}
