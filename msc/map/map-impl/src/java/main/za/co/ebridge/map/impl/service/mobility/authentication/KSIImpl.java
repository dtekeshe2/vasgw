/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.authentication;

import za.co.ebridge.map.api.service.mobility.authentication.KSI;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

/**
 *
 * @author Lasith Waruna Perera
 *
 */
public class KSIImpl extends OctetStringLength1Base implements KSI {

    public KSIImpl() {
        super("KSI");
    }

    public KSIImpl(int data) {
        super("KSI", data);
    }

    @Override
    public int getData() {
        return this.data;
    }

}
