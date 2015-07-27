/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 TransactionId ::= OCTET STRING (SIZE (1..2)) -- This type carries the value part of the transaction identifier which is used
 * in the -- session management messages on the access interface. The encoding is defined in -- 3GPP TS 24.008
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TransactionId extends Serializable {

    byte[] getData();

}
