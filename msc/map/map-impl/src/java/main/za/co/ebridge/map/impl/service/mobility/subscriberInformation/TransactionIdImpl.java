/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.TransactionId;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class TransactionIdImpl extends OctetStringBase implements TransactionId {

    public TransactionIdImpl() {
        super(1, 2, "TransactionId");
    }

    public TransactionIdImpl(byte[] data) {
        super(1, 2, "TransactionId", data);
    }

    public byte[] getData() {
        return data;
    }
}
