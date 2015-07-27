/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.FTNAddressString;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;

/**
 *
 ForwardingFeature ::= SEQUENCE { basicService BasicServiceCode OPTIONAL, ss-Status [4] SS-Status OPTIONAL, forwardedToNumber
 * [5] ISDN-AddressString OPTIONAL, forwardedToSubaddress [8] ISDN-SubaddressString OPTIONAL, forwardingOptions [6]
 * ForwardingOptions OPTIONAL, noReplyConditionTime [7] NoReplyConditionTime OPTIONAL, ..., longForwardedToNumber [9]
 * FTN-AddressString OPTIONAL }
 *
 * NoReplyConditionTime ::= INTEGER (5..30)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ForwardingFeature extends Serializable {

    BasicServiceCode getBasicService();

    SSStatus getSsStatus();

    ISDNAddressString getForwardedToNumber();

    ISDNAddressString getForwardedToSubaddress();

    ForwardingOptions getForwardingOptions();

    Integer getNoReplyConditionTime();

    FTNAddressString getLongForwardedToNumber();

}
