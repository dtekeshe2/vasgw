/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 ReportingTrigger ::= OCTET STRING (SIZE (1)) -- Octet is coded as described in 3GPP TS 32.422.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReportingTrigger extends Serializable {

    int getData();

}
