/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 DP-AnalysedInfoCriterium ::= SEQUENCE { dialledNumber ISDN-AddressString, serviceKey ServiceKey, gsmSCF-Address
 * ISDN-AddressString, defaultCallHandling DefaultCallHandling, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 * ServiceKey ::= INTEGER (0..2147483647)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface DPAnalysedInfoCriterium extends Serializable {

    ISDNAddressString getDialledNumber();

    long getServiceKey();

    ISDNAddressString getGsmSCFAddress();

    DefaultCallHandling getDefaultCallHandling();

    MAPExtensionContainer getExtensionContainer();

}
