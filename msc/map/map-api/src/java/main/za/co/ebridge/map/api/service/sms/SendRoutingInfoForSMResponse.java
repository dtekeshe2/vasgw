/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3: RoutingInfoForSM-Res ::= SEQUENCE { imsi IMSI, locationInfoWithLMSI [0] LocationInfoWithLMSI, extensionContainer [4]
 * ExtensionContainer OPTIONAL, ...}
 *
 * MAP V2: RoutingInfoForSM-Res::= SEQUENCE { imsi IMSI, locationInfoWithLMSI [0] LocationInfoWithLMSI, mwd-Set [2] BOOLEAN
 * OPTIONAL, -- mwd-Set must be absent in version greater 1 ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendRoutingInfoForSMResponse extends SmsMessage {

    IMSI getIMSI();

    LocationInfoWithLMSI getLocationInfoWithLMSI();

    MAPExtensionContainer getExtensionContainer();

    // for MAP V1 only
    Boolean getMwdSet();

}
