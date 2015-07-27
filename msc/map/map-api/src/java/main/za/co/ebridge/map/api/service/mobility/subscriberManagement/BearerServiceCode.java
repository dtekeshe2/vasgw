/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 BearerServiceCode ::= OCTET STRING (SIZE (1)) -- This type is used to represent the code identifying a single -- bearer
 * service, a group of bearer services, or all bearer -- services. The services are defined in TS 3GPP TS 22.002 [3]. -- The
 * internal structure is defined as follows: -- -- plmn-specific bearer services: -- bits 87654321: defined by the HPLMN
 * operator
 *
 * -- rest of bearer services: -- bit 8: 0 (unused) -- bits 7654321: group (bits 7654), and rate, if applicable -- (bits 321)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface BearerServiceCode extends Serializable {

    int getData();

    BearerServiceCodeValue getBearerServiceCodeValue();

}
