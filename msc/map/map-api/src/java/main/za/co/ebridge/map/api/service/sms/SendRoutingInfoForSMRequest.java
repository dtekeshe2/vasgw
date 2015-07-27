/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCode;

/**
 *
 MAP V1-2-3:
 *
 * MAP V3: sendRoutingInfoForSM OPERATION ::= { --Timer m ARGUMENT RoutingInfoForSM-Arg RESULT RoutingInfoForSM-Res ERRORS {
 * systemFailure | dataMissing | unexpectedDataValue | facilityNotSupported | unknownSubscriber | teleserviceNotProvisioned |
 * callBarred | absentSubscriberSM} CODE local:45 }
 *
 * MAP V2: SendRoutingInfoForSM ::= OPERATION --Timer m ARGUMENT routingInfoForSM-Arg RoutingInfoForSM-Arg RESULT
 * routingInfoForSM-Res RoutingInfoForSM-Res ERRORS { SystemFailure, DataMissing, UnexpectedDataValue, FacilityNotSupported,
 * UnknownSubscriber, TeleserviceNotProvisioned, AbsentSubscriber, CallBarred}
 *
 *
 * MAP V3: RoutingInfoForSM-Arg ::= SEQUENCE { msisdn [0] ISDN-AddressString, sm-RP-PRI [1] BOOLEAN, serviceCentreAddress [2]
 * AddressString, extensionContainer [6] ExtensionContainer OPTIONAL, ... , gprsSupportIndicator [7] NULL OPTIONAL, --
 * gprsSupportIndicator is set only if the SMS-GMSC supports -- receiving of two numbers from the HLR sm-RP-MTI [8] SM-RP-MTI
 * OPTIONAL, sm-RP-SMEA [9] SM-RP-SMEA OPTIONAL }
 *
 * MAP V2: RoutingInfoForSM-Arg ::= SEQUENCE { msisdn [0] ISDN-AddressString, sm-RP-PRI [1] BOOLEAN, serviceCentreAddress [2]
 * AddressString, teleservice [5] TeleserviceCode OPTIONAL, -- teleservice must be absent in version greater 1 ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendRoutingInfoForSMRequest extends SmsMessage {

    ISDNAddressString getMsisdn();

    boolean getSm_RP_PRI();

    AddressString getServiceCentreAddress();

    MAPExtensionContainer getExtensionContainer();

    boolean getGprsSupportIndicator();

    SM_RP_MTI getSM_RP_MTI();

    SM_RP_SMEA getSM_RP_SMEA();

    // for MAP V1 only
    TeleserviceCode getTeleservice();

}
