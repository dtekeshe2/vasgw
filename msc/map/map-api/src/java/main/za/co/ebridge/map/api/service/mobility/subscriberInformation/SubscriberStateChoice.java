/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

/**
 *
 SubscriberState ::= CHOICE { assumedIdle [0] NULL, camelBusy [1] NULL, netDetNotReachable NotReachableReason,
 * notProvidedFromVLR [2] NULL}
 *
 * @author david@tekeshe.com
 *
 */
public enum SubscriberStateChoice {
    assumedIdle, camelBusy, netDetNotReachable, notProvidedFromVLR;
}
