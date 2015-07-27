/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;

/**
 *
 CCBS-Feature ::= SEQUENCE { ccbs-Index [0] CCBS-Index OPTIONAL, b-subscriberNumber [1] ISDN-AddressString OPTIONAL,
 * b-subscriberSubaddress [2] ISDN-SubaddressString OPTIONAL, basicServiceGroup [3] BasicServiceCode OPTIONAL, ...}
 *
 * CCBS-Index ::= INTEGER (1..5)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CCBSFeature extends Serializable {

    Integer getCcbsIndex();

    ISDNAddressString getBSubscriberNumber();

    ISDNAddressString getBSubscriberSubaddress();

    BasicServiceCode getBasicServiceCode();

}
