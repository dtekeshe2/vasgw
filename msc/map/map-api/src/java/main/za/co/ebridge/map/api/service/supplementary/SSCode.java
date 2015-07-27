/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

/**
 *
 SS-Code ::= OCTET STRING (SIZE (1)) -- This type is used to represent the code identifying a single -- supplementary service,
 * a group of supplementary services, or -- all supplementary services. The services and abbreviations -- used are defined in TS
 * 3GPP TS 22.004 [5]. The internal structure is -- defined as follows: -- -- bits 87654321: group (bits 8765), and specific
 * service -- (bits 4321)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSCode extends Serializable {

    int getData();

    SupplementaryCodeValue getSupplementaryCodeValue();

}