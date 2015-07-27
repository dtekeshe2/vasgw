/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.primitives.EMLPPPriority;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3:
 *
 * provideSubscriberInfo OPERATION ::= { --Timer m ARGUMENT ProvideSubscriberInfoArg RESULT ProvideSubscriberInfoRes ERRORS {
 * dataMissing | unexpectedDataValue} CODE local:70 }
 *
 * ProvideSubscriberInfoArg ::= SEQUENCE { imsi [0] IMSI, lmsi [1] LMSI OPTIONAL, requestedInfo [2] RequestedInfo,
 * extensionContainer [3] ExtensionContainer OPTIONAL, ..., callPriority [4] EMLPP-Priority OPTIONAL }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ProvideSubscriberInfoRequest extends MobilityMessage {

    IMSI getImsi();

    LMSI getLmsi();

    RequestedInfo getRequestedInfo();

    MAPExtensionContainer getExtensionContainer();

    EMLPPPriority getCallPriority();

}
