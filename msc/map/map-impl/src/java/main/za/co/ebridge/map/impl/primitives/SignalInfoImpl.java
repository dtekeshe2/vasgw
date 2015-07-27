/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.map.api.primitives.SignalInfo;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class SignalInfoImpl extends OctetStringBase implements SignalInfo {

    public SignalInfoImpl() {
        super(1, 200, "SignalInfo");
    }

    public SignalInfoImpl(byte[] data) {
        super(1, 200, "SignalInfo", data);
    }

    public byte[] getData() {
        return data;
    }

}
