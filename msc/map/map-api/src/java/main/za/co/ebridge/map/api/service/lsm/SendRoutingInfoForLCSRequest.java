/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.SubscriberIdentity;

/**
 *
 MAP V3:
 *
 * sendRoutingInfoForLCS OPERATION ::= { --Timer m ARGUMENT RoutingInfoForLCS-Arg RESULT RoutingInfoForLCS-Res ERRORS {
 * systemFailure | dataMissing | unexpectedDataValue | facilityNotSupported | unknownSubscriber | absentSubscriber |
 * unauthorizedRequestingNetwork } CODE local:85 }
 *
 * RoutingInfoForLCS-Arg ::= SEQUENCE { mlcNumber [0] ISDN-AddressString, targetMS [1] SubscriberIdentity, extensionContainer
 * [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author amit bhayani
 *
 */
public interface SendRoutingInfoForLCSRequest extends LsmMessage {
    ISDNAddressString getMLCNumber();

    SubscriberIdentity getTargetMS();

    MAPExtensionContainer getExtensionContainer();

}
