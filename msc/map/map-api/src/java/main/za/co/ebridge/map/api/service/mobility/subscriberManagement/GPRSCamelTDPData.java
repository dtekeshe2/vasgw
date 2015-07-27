/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 GPRS-CamelTDPData ::= SEQUENCE { gprs-TriggerDetectionPoint [0] GPRS-TriggerDetectionPoint, serviceKey [1] ServiceKey,
 * gsmSCF-Address [2] ISDN-AddressString, defaultSessionHandling [3] DefaultGPRS-Handling, extensionContainer [4]
 * ExtensionContainer OPTIONAL, ... }
 *
 * ServiceKey ::= INTEGER (0..2147483647)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface GPRSCamelTDPData extends Serializable {

    GPRSTriggerDetectionPoint getGPRSTriggerDetectionPoint();

    long getServiceKey();

    ISDNAddressString getGsmSCFAddress();

    DefaultGPRSHandling getDefaultSessionHandling();

    MAPExtensionContainer getExtensionContainer();

}
