/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.map.api.service.lsm.UtranPositioningDataInfo;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class UtranPositioningDataInfoImpl extends OctetStringBase implements UtranPositioningDataInfo {

    public UtranPositioningDataInfoImpl() {
        super(3, 11, "UtranPositioningDataInfo");
    }

    public UtranPositioningDataInfoImpl(byte[] data) {
        super(3, 11, "UtranPositioningDataInfo", data);
    }

    public byte[] getData() {
        return data;
    }

}
