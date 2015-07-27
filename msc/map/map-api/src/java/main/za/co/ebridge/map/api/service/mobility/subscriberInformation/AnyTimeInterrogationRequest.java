/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.SubscriberIdentity;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3:
 *
 * anyTimeInterrogation OPERATION ::= { --Timer m ARGUMENT AnyTimeInterrogationArg RESULT AnyTimeInterrogationRes ERRORS {
 * systemFailure | ati-NotAllowed | dataMissing | unexpectedDataValue | unknownSubscriber} CODE local:71 }
 *
 *
 * AnyTimeInterrogationArg ::= SEQUENCE { subscriberIdentity [0] SubscriberIdentity, requestedInfo [1] RequestedInfo,
 * gsmSCF-Address [3] ISDN-AddressString, extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 * @author abhayani
 *
 */
public interface AnyTimeInterrogationRequest extends MobilityMessage {

    SubscriberIdentity getSubscriberIdentity();

    RequestedInfo getRequestedInfo();

    ISDNAddressString getGsmSCFAddress();

    MAPExtensionContainer getExtensionContainer();
}
