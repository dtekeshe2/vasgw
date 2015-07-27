/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext-BearerServiceCode ::= OCTET STRING (SIZE (1..5)) -- This type is used to represent the code identifying a single --
 * bearer service, a group of bearer services, or all bearer -- services. The services are defined in TS 3GPP TS 22.002 [3]. --
 * The internal structure is defined as follows: -- -- OCTET 1: -- plmn-specific bearer services: -- bits 87654321: defined by
 * the HPLMN operator -- -- rest of bearer services: -- bit 8: 0 (unused) -- bits 7654321: group (bits 7654), and rate, if
 * applicable -- (bits 321)
 *
 * -- OCTETS 2-5: reserved for future use. If received the -- Ext-TeleserviceCode shall be -- treated according to the exception
 * handling defined for the -- operation that uses this type.
 *
 *
 * -- Ext-BearerServiceCode includes all values defined for BearerServiceCode.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtBearerServiceCode extends Serializable {

    byte[] getData();

    BearerServiceCodeValue getBearerServiceCodeValue();

}
