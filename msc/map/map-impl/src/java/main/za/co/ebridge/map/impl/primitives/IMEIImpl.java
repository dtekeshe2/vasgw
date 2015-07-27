/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.primitives.IMEI;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class IMEIImpl extends TbcdString implements IMEI {

    public IMEIImpl() {
        // There are some fake mobiles that IMEI length != 15
        super(1, 8, "IMEI");
    }

    public IMEIImpl(String data) {
        // There are some fake mobiles that IMEI length != 15
        super(1, 8, "IMEI", data);
    }

    public String getIMEI() {
        return this.data;
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {
        if (this.data == null)
            throw new MAPException("Error while encoding the IMEI: IMEI must not be null");

        super.encodeData(asnOs);
    }
}
