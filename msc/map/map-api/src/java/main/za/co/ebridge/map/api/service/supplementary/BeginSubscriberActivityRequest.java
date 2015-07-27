/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 MAP V1: BeginSubscriberActivity ::= OPERATION--Timer m ARGUMENT beginSubscriberActivityArg BeginSubscriberActivityArg
 *
 * BeginSubscriberActivityArg ::= SEQUENCE { imsi IMSI, originatingEntityNumber ISDN-AddressString }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface BeginSubscriberActivityRequest extends SupplementaryMessage {

    IMSI getImsi();

    ISDNAddressString getOriginatingEntityNumber();

}
