/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSNetworkCapability;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class MSNetworkCapabilityImpl extends OctetStringBase implements MSNetworkCapability {

    public MSNetworkCapabilityImpl() {
        super(1, 8, "MSNetworkCapability");
    }

    public MSNetworkCapabilityImpl(byte[] data) {
        super(1, 8, "MSNetworkCapability", data);
    }

    public byte[] getData() {
        return data;
    }
}
