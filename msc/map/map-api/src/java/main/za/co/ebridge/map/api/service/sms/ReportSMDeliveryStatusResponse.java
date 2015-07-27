/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3: ReportSM-DeliveryStatusRes ::= SEQUENCE { storedMSISDN ISDN-AddressString OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 * MAP V2: RESULT storedMSISDN ISDN-AddressString -- optional -- storedMSISDN must be absent in version 1 -- storedMSISDN must
 * be present in version greater 1
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReportSMDeliveryStatusResponse extends SmsMessage {

    ISDNAddressString getStoredMSISDN();

    MAPExtensionContainer getExtensionContainer();

}
