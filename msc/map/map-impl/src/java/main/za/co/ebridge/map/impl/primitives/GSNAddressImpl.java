/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.map.api.primitives.GSNAddress;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class GSNAddressImpl extends OctetStringBase implements GSNAddress {

    public GSNAddressImpl() {
        super(5, 17, "GSNAddress");
    }

    public GSNAddressImpl(byte[] data) {
        super(5, 17, "GSNAddress", data);
    }

    public byte[] getData() {
        return data;
    }
}
