/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBasicServiceCode;

/**
 *
 MSISDN-BS ::= SEQUENCE { msisdn ISDN-AddressString, basicServiceList [0] BasicServiceList OPTIONAL, extensionContainer [1]
 * ExtensionContainer OPTIONAL, ...}
 *
 * BasicServiceList ::= SEQUENCE SIZE (1..70) OF Ext-BasicServiceCode
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MSISDNBS extends Serializable {

    ISDNAddressString getMsisdn();

    ArrayList<ExtBasicServiceCode> getBasicServiceList();

    MAPExtensionContainer getExtensionContainer();

}
