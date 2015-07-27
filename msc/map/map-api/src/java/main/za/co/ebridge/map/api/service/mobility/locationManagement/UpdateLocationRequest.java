/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 * <p>
 * When a subscriber registers with an MSC, the MSC uses MAP LU to request the HLR of that subscriber for GSM subscription data.
 * If the VLR supports CAMEL, then the VLR will indicate this in MAP LU; the VLR will indicate each individual CAMEL phase that
 * it supports. The indication of CAMEL support in MAP LU tells the HLR that it is allowed to send CAMEL subscription data to
 * that VLR
 * </p>
 *
 * MAP V1-2-3
 *
 * updateLocation OPERATION ::= { --Timer m ARGUMENT UpdateLocationArg RESULT UpdateLocationRes ERRORS { systemFailure |
 * dataMissing | -- DataMissing must not be used in version 1 unexpectedDataValue | unknownSubscriber | roamingNotAllowed} CODE
 * local:2 }
 *
 * MAP V3: UpdateLocationArg ::= SEQUENCE { imsi IMSI, msc-Number [1] ISDN-AddressString, vlr-Number ISDN-AddressString, lmsi
 * [10] LMSI OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ... , vlr-Capability [6] VLR-Capability OPTIONAL,
 * informPreviousNetworkEntity [11] NULL OPTIONAL, cs-LCS-NotSupportedByUE [12] NULL OPTIONAL, v-gmlc-Address [2] GSN-Address
 * OPTIONAL, add-info [13] ADD-Info OPTIONAL, pagingArea [14] PagingArea OPTIONAL, skipSubscriberDataUpdate [15] NULL OPTIONAL,
 * -- The skipSubscriberDataUpdate parameter in the UpdateLocationArg and the ADD-Info -- structures carry the same semantic.
 * restorationIndicator [16] NULL OPTIONAL }
 *
 * MAP V2: UpdateLocationArg ::= SEQUENCE { imsi IMSI, locationInfo LocationInfo, vlr-Number ISDN-AddressString, lmsi [10] LMSI
 * OPTIONAL, ...}
 *
 * LocationInfo ::= CHOICE { roamingNumber [0] ISDN-AddressString, -- roamingNumber must not be used in version greater 1
 * msc-Number [1] ISDN-AddressString}
 *
 * @author david@tekeshe.com
 *
 */
public interface UpdateLocationRequest extends MobilityMessage {

    IMSI getImsi();

    ISDNAddressString getMscNumber();

    ISDNAddressString getRoamingNumber();

    ISDNAddressString getVlrNumber();

    LMSI getLmsi();

    MAPExtensionContainer getExtensionContainer();

    VLRCapability getVlrCapability();

    boolean getInformPreviousNetworkEntity();

    boolean getCsLCSNotSupportedByUE();

    GSNAddress getVGmlcAddress();

    ADDInfo getADDInfo();

    PagingArea getPagingArea();

    boolean getSkipSubscriberDataUpdate();

    boolean getRestorationIndicator();

    long getMapProtocolVersion();

}
