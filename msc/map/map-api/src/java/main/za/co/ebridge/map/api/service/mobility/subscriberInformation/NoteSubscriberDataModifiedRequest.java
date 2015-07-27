/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSGSubscriptionData;

/**
 *
 MAP V3:
 *
 * noteSubscriberDataModified OPERATION ::= { --Timer m ARGUMENT NoteSubscriberDataModifiedArg RESULT
 * NoteSubscriberDataModifiedRes -- optional ERRORS { dataMissing | unexpectedDataValue | unknownSubscriber} CODE local:5 }
 *
 * NoteSubscriberDataModifiedArg ::= SEQUENCE { imsi IMSI, msisdn ISDN-AddressString, forwardingInfoFor-CSE [0]
 * Ext-ForwardingInfoFor-CSE OPTIONAL, callBarringInfoFor-CSE [1] Ext-CallBarringInfoFor-CSE OPTIONAL, odb-Info [2] ODB-Info
 * OPTIONAL, camel-SubscriptionInfo [3] CAMEL-SubscriptionInfo OPTIONAL, allInformationSent [4] NULL OPTIONAL,
 * extensionContainer ExtensionContainer OPTIONAL, ..., ue-reachable [5] ServingNode OPTIONAL, csg-SubscriptionDataList [6]
 * CSG-SubscriptionDataList OPTIONAL, cw-Data [7] CallWaitingData OPTIONAL, ch-Data [8] CallHoldData OPTIONAL, clip-Data [9]
 * ClipData OPTIONAL, clir-Data [10] ClirData OPTIONAL, ect-data [11] EctData OPTIONAL }
 *
 * CSG-SubscriptionDataList ::= SEQUENCE SIZE (1..50) OF CSG-SubscriptionData
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface NoteSubscriberDataModifiedRequest extends MobilityMessage {

    IMSI getImsi();

    ISDNAddressString getMsisdn();

    ExtForwardingInfoForCSE getForwardingInfoForCSE();

    ExtCallBarringInfoForCSE getCallBarringInfoForCSE();

    ODBInfo getOdbInfo();

    CAMELSubscriptionInfo getCamelSubscriptionInfo();

    boolean getAllInformationSent();

    MAPExtensionContainer getExtensionContainer();

    ServingNode getUeReachable();

    ArrayList<CSGSubscriptionData> getCsgSubscriptionDataList();

    CallWaitingData getCwData();

    CallHoldData getChData();

    ClipData getClipData();

    ClirData getClirData();

    EctData getEctData();

}
