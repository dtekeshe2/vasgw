/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.map.api.service.lsm.PositioningDataInformation;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class PositioningDataInformationImpl extends OctetStringBase implements PositioningDataInformation {

    public PositioningDataInformationImpl() {
        super(2, 10, "PositioningDataInformation");
    }

    public PositioningDataInformationImpl(byte[] data) {
        super(2, 10, "PositioningDataInformation", data);
    }

    public byte[] getData() {
        return data;
    }

}
