/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * PS-SubscriberState ::= CHOICE { notProvidedFromSGSNorMME [0] NULL, ps-Detached [1] NULL, ps-AttachedNotReachableForPaging [2]
 * NULL, ps-AttachedReachableForPaging [3] NULL, ps-PDP-ActiveNotReachableForPaging [4] PDP-ContextInfoList,
 * ps-PDP-ActiveReachableForPaging [5] PDP-ContextInfoList, netDetNotReachable NotReachableReason }
 *
 * PDP-ContextInfoList ::= SEQUENCE SIZE (1..50) OF PDP-ContextInfo
 *
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public interface PSSubscriberState extends Serializable {

    PSSubscriberStateChoice getChoice();

    ArrayList<PDPContextInfo> getPDPContextInfoList();

    NotReachableReason getNetDetNotReachable();

}
