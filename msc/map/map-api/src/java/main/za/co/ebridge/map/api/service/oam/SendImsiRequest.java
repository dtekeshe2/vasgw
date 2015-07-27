/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 MAP V2: sendIMSI OPERATION ::= { --Timer m ARGUMENT ISDN-AddressString RESULT IMSI ERRORS { dataMissing | unexpectedDataValue
 * | unknownSubscriber} CODE local:58 }
 *
 * ARGUMENT ISDN-AddressString
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendImsiRequest extends OamMessage {

    ISDNAddressString getMsisdn();

}
