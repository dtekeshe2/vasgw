/* eBridge SS7 */
package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.FQDN;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author Lasith Waruna Perera
 *
 */
public class FQDNImpl extends OctetStringBase implements FQDN {

    public FQDNImpl() {
        super(9, 255, "FQDN");
    }

    public FQDNImpl(byte[] data) {
        super(9, 255, "FQDN", data);
    }

    @Override
    public byte[] getData() {
        return data;
    }

}
