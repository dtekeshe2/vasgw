/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.RAIdentity;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 * @author amit bhayani
 *
 */
public class RAIdentityImpl extends OctetStringBase implements RAIdentity {

    public RAIdentityImpl() {
        super(6, 6, "RAIdentity");
    }

    public RAIdentityImpl(byte[] data) {
        super(6, 6, "RAIdentity", data);
    }

    public byte[] getData() {
        return data;
    }
}
