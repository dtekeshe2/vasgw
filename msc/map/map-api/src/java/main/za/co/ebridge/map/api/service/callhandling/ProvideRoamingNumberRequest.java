/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.EMLPPPriority;
import za.co.ebridge.map.api.primitives.ExtExternalSignalInfo;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.locationManagement.PagingArea;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OfferedCamel4CSIs;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SupportedCamelPhases;

/**
 *
 MAP V1-2-3:
 *
 * MAP V3: provideRoamingNumber OPERATION ::= { --Timer m -- The timer is set to the upper limit of the range if the HLR
 * supports pre-paging. ARGUMENT ProvideRoamingNumberArg RESULT ProvideRoamingNumberRes ERRORS { systemFailure | dataMissing |
 * unexpectedDataValue | facilityNotSupported | or-NotAllowed | absentSubscriber | noRoamingNumberAvailable} CODE local:4 }
 *
 * MAP V2: ProvideRoamingNumber ::= OPERATION--Timer m ARGUMENT provideRoamingNumber ArgProvideRoamingNumberArg RESULT
 * roamingNumber ISDN-AddressString ERRORS { SystemFailure, DataMissing, UnexpectedDataValue, FacilityNotSupported,
 * AbsentSubscriber, NoRoamingNumberAvailable}
 *
 * MAP V3: ProvideRoamingNumberArg ::= SEQUENCE { imsi [0] IMSI, msc-Number [1] ISDN-AddressString, msisdn [2]
 * ISDN-AddressString OPTIONAL, lmsi [4] LMSI OPTIONAL, gsm-BearerCapability [5] ExternalSignalInfo OPTIONAL, networkSignalInfo
 * [6] ExternalSignalInfo OPTIONAL, suppressionOfAnnouncement [7] SuppressionOfAnnouncement OPTIONAL, gmsc-Address [8]
 * ISDN-AddressString OPTIONAL, callReferenceNumber [9] CallReferenceNumber OPTIONAL, or-Interrogation [10] NULL OPTIONAL,
 * extensionContainer [11] ExtensionContainer OPTIONAL, ... , alertingPattern [12] AlertingPattern OPTIONAL, ccbs-Call [13] NULL
 * OPTIONAL, supportedCamelPhasesInInterrogatingNode [15] SupportedCamelPhases OPTIONAL, additionalSignalInfo [14]
 * Ext-ExternalSignalInfo OPTIONAL, orNotSupportedInGMSC [16] NULL OPTIONAL, pre-pagingSupported [17] NULL OPTIONAL,
 * longFTN-Supported [18] NULL OPTIONAL, suppress-VT-CSI [19] NULL OPTIONAL, offeredCamel4CSIsInInterrogatingNode [20]
 * OfferedCamel4CSIs OPTIONAL, mtRoamingRetrySupported [21] NULL OPTIONAL, pagingArea [22] PagingArea OPTIONAL, callPriority
 * [23] EMLPP-Priority OPTIONAL, mtrf-Indicator [24] NULL OPTIONAL, oldMSC-Number [25] ISDN-AddressString OPTIONAL }
 *
 * MAP V2: ProvideRoamingNumberArg ::= SEQUENCE { imsi[0] IMSI, msc-Number[1] ISDN-AddressString OPTIONAL, msc-Number must be
 * present in version greater 1 msisdn[2] ISDN-AddressString OPTIONAL, previousRoamingNumber[3] ISDN-AddressString OPTIONAL,
 * lmsi[4] LMSI OPTIONAL, gsm-BearerCapability[5] ExternalSignalInfo OPTIONAL, networkSignalInfo[6] ExternalSignalInfo OPTIONAL,
 * ...}
 *
 * SuppressionOfAnnouncement ::= NULL
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ProvideRoamingNumberRequest extends CallHandlingMessage {

     IMSI getImsi();

     ISDNAddressString getMscNumber();

     ISDNAddressString getMsisdn();

     LMSI getLmsi();

     ExternalSignalInfo getGsmBearerCapability();

     ExternalSignalInfo getNetworkSignalInfo();

     boolean getSuppressionOfAnnouncement();

     ISDNAddressString getGmscAddress();

     CallReferenceNumber getCallReferenceNumber();

     boolean getOrInterrogation();

     MAPExtensionContainer getExtensionContainer();

     AlertingPattern getAlertingPattern();

     boolean getCcbsCall();

     SupportedCamelPhases getSupportedCamelPhasesInInterrogatingNode();

     ExtExternalSignalInfo getAdditionalSignalInfo();

     boolean getOrNotSupportedInGMSC();

     boolean getPrePagingSupported();

     boolean getLongFTNSupported();

     boolean getSuppressVtCsi();

     OfferedCamel4CSIs getOfferedCamel4CSIsInInterrogatingNode();

     boolean getMtRoamingRetrySupported();

     PagingArea getPagingArea();

     EMLPPPriority getCallPriority();

     boolean getMtrfIndicator();

     ISDNAddressString getOldMSCNumber();

     long getMapProtocolVersion();

}
