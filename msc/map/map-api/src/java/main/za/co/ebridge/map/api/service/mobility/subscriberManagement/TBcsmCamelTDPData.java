/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 T-BcsmCamelTDPData ::= SEQUENCE { t-BcsmTriggerDetectionPoint T-BcsmTriggerDetectionPoint, serviceKey ServiceKey,
 * gsmSCF-Address [0] ISDN-AddressString, defaultCallHandling [1] DefaultCallHandling, extensionContainer [2] ExtensionContainer
 * OPTIONAL, ... }
 *
 * ServiceKey ::= INTEGER (0..2147483647)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TBcsmCamelTDPData extends Serializable {

    TBcsmTriggerDetectionPoint getTBcsmTriggerDetectionPoint();

    long getServiceKey();

    ISDNAddressString getGsmSCFAddress();

    DefaultCallHandling getDefaultCallHandling();

    MAPExtensionContainer getExtensionContainer();

}
