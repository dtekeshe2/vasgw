/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSRadioAccessCapability;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class MSRadioAccessCapabilityImpl extends OctetStringBase implements MSRadioAccessCapability {

    public MSRadioAccessCapabilityImpl() {
        super(1, 50, "MSRadioAccessCapability");
    }

    public MSRadioAccessCapabilityImpl(byte[] data) {
        super(1, 50, "MSRadioAccessCapability", data);
    }

    public byte[] getData() {
        return data;
    }
}
