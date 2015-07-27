/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;

/**
 * SubscriberIdentity ::= CHOICE { imsi [0] IMSI, msisdn [1] ISDN-AddressString }
 *
 * @author amit bhayani
 *
 */
public interface SubscriberIdentity extends Serializable {

    IMSI getIMSI();

    ISDNAddressString getMSISDN();

}
