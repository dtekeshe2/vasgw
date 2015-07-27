/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SMS-CAMEL-TDP-Data ::= SEQUENCE { sms-TriggerDetectionPoint [0] SMS-TriggerDetectionPoint, serviceKey [1] ServiceKey,
 * gsmSCF-Address [2] ISDN-AddressString, defaultSMS-Handling [3] DefaultSMS-Handling, extensionContainer [4] ExtensionContainer
 * OPTIONAL, ... }
 *
 * ServiceKey ::= INTEGER (0..2147483647)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SMSCAMELTDPData extends Serializable {

    SMSTriggerDetectionPoint getSMSTriggerDetectionPoint();

    long getServiceKey();

    ISDNAddressString getGsmSCFAddress();

    DefaultSMSHandling getDefaultSMSHandling();

    MAPExtensionContainer getExtensionContainer();

}
