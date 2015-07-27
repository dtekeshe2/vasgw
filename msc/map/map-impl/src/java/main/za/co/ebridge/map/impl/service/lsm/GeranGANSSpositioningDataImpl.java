/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.map.api.service.lsm.GeranGANSSpositioningData;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class GeranGANSSpositioningDataImpl extends OctetStringBase implements GeranGANSSpositioningData {

    public GeranGANSSpositioningDataImpl() {
        super(2, 10, "GeranGANSSpositioningData");
    }

    public GeranGANSSpositioningDataImpl(byte[] data) {
        super(2, 10, "GeranGANSSpositioningData", data);
    }

    public byte[] getData() {
        return data;
    }

}
