/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.ASCICallReference;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalSubscriptions;

/**
 *
 SendGroupCallInfoRes ::= SEQUENCE { anchorMSC-Address [0] ISDN-AddressString OPTIONAL, asciCallReference [1]
 * ASCI-CallReference OPTIONAL, imsi [2] IMSI OPTIONAL, additionalInfo [3] AdditionalInfo OPTIONAL, additionalSubscriptions [4]
 * AdditionalSubscriptions OPTIONAL, kc [5] Kc OPTIONAL, extensionContainer [6] ExtensionContainer OPTIONAL, ... }
 *
 * Kc ::= OCTET STRING (SIZE (8))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendGroupCallInfoResponse extends CallHandlingMessage {

     ISDNAddressString getAnchorMscAddress();

     ASCICallReference getAsciCallReference();

     IMSI getImsi();

     AdditionalInfo getAdditionalInfo();

     AdditionalSubscriptions getAdditionalSubscriptions();

     byte[] getKc();

     MAPExtensionContainer getExtensionContainer();

}
