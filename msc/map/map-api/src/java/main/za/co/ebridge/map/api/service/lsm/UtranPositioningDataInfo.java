/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

/**
 *
 UtranPositioningDataInfo ::= OCTET STRING (SIZE (3..11)) -- Refers to the Position Data defined in 3GPP TS 25.413. -- This is
 * composed of the positioningDataDiscriminator and the positioningDataSet -- included in positionData as defined in 3GPP TS
 * 25.413.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface UtranPositioningDataInfo extends Serializable {

    byte[] getData();

}
