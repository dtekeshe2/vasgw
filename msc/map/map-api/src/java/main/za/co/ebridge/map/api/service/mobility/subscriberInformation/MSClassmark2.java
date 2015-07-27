/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 MS-Classmark2 ::= OCTET STRING (SIZE (3)) -- This parameter carries the value part of the MS Classmark 2 IE defined in --
 * 3GPP TS 24.008 [35].
 *
 * }
 *
 * @author david@tekeshe.com
 *
 */
public interface MSClassmark2 extends Serializable {

    byte[] getData();

}
