/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.map.api.service.lsm.UtranGANSSpositioningData;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class UtranGANSSpositioningDataImpl extends OctetStringBase implements UtranGANSSpositioningData {

    public UtranGANSSpositioningDataImpl() {
        super(1, 9, "UtranGANSSpositioningData");
    }

    public UtranGANSSpositioningDataImpl(byte[] data) {
        super(1, 9, "UtranGANSSpositioningData", data);
    }

    public byte[] getData() {
        return data;
    }

}
