/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 SubscriberState ::= CHOICE { assumedIdle [0] NULL, camelBusy [1] NULL, netDetNotReachable NotReachableReason,
 * notProvidedFromVLR [2] NULL}
 *
 * @author david@tekeshe.com
 *
 */
public interface SubscriberState extends Serializable {

    SubscriberStateChoice getSubscriberStateChoice();

    // return a value when getSubscriberStateChoice()==SubscriberStateChoice.netDetNotReachable
    NotReachableReason getNotReachableReason();

}
