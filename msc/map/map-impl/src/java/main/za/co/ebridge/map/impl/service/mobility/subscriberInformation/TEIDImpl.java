/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.TEID;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class TEIDImpl extends OctetStringBase implements TEID {

    public TEIDImpl() {
        super(4, 4, "TEID");
    }

    public TEIDImpl(byte[] data) {
        super(4, 4, "TEID", data);
    }

    public byte[] getData() {
        return data;
    }
}
