/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSClassmark2;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class MSClassmark2Impl extends OctetStringBase implements MSClassmark2 {

    public MSClassmark2Impl() {
        super(3, 3, "MSClassmark2");
    }

    public MSClassmark2Impl(byte[] data) {
        super(3, 3, "MSClassmark2", data);
    }

    public byte[] getData() {
        return data;
    }
}
