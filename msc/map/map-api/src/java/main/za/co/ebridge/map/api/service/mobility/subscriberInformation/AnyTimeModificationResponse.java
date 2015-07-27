/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 AnyTimeModificationRes ::= SEQUENCE { ss-InfoFor-CSE [0] Ext-SS-InfoFor-CSE OPTIONAL, camel-SubscriptionInfo [1]
 * CAMEL-SubscriptionInfo OPTIONAL, extensionContainer [2] ExtensionContainer OPTIONAL, ..., odb-Info [3] ODB-Info OPTIONAL,
 * cw-Data [4] CallWaitingData OPTIONAL, ch-Data [5] CallHoldData OPTIONAL, clip-Data [6] ClipData OPTIONAL, clir-Data [7]
 * ClirData OPTIONAL, ect-data [8] EctData OPTIONAL, serviceCentreAddress [9] AddressString OPTIONAL }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AnyTimeModificationResponse extends MobilityMessage {

    ExtSSInfoForCSE getSsInfoForCSE();

    CAMELSubscriptionInfo getCamelSubscriptionInfo();

    MAPExtensionContainer getExtensionContainer();

    ODBInfo getOdbInfo();

    CallWaitingData getCwData();

    CallHoldData getChData();

    ClipData getClipData();

    ClirData getClirData();

    EctData getEctData();

    AddressString getServiceCentreAddress();

}
