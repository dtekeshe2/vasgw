/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.authentication;

import za.co.ebridge.map.api.service.mobility.authentication.Kc;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author Lasith Waruna Perera
 *
 */
public class KcImpl extends OctetStringBase implements Kc {

    public KcImpl(byte[] data) {
        super(8, 8, "Kc", data);
    }

    public KcImpl() {
        super(8, 8, "Kc");
    }

    @Override
    public byte[] getData() {
        return this.data;
    }

}
