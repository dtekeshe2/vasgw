/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 GeographicalInformation ::= OCTET STRING (SIZE (8))
 -- Refers to geographical Information defined in 3GPP TS 23.032. -- Only the description of an ellipsoid point with uncertainty circle
 -- as specified in 3GPP TS 23.032 is allowed to be used
 -- The internal structure according to 3GPP TS 23.032 is as follows:
 -- Type of shape (ellipsoid point with uncertainty circle) 1 octet
 -- Degrees of Latitude 3 octets
 -- Degrees of Longitude 3 octets
 -- Uncertainty code 1 octet
 *
 * @author david@tekeshe.com
 *
 */
public interface GeographicalInformation extends Serializable {

    byte[] getData();

    TypeOfShape getTypeOfShape();

    /**
     * @return Latitude value in degrees (-90 ... 90)
     */
    double getLatitude();

    /**
     * @return Longitude value in degrees (-180 ... 180)
     */
    double getLongitude();

    /**
     * @return Uncertainty value in meters
     */
    double getUncertainty();

}
