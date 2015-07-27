/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

import za.co.ebridge.isup.api.message.parameter.LocationNumber;
import za.co.ebridge.map.api.MAPException;

/**
 *
 LocationNumber ::= OCTET STRING (SIZE (2..10)) -- the internal structure is defined in ITU-T Rec Q.763
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LocationNumberMap extends Serializable {

    byte[] getData();

    LocationNumber getLocationNumber() throws MAPException;

}
