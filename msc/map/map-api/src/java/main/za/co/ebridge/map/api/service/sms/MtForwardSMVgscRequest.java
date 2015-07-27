/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.ASCICallReference;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * mt-ForwardSM-VGCS OPERATION ::= { --Timer ml ARGUMENT MT-ForwardSM-VGCS-Arg RESULT MT-ForwardSM-VGCS-Res -- optional ERRORS {
 * systemFailure | unexpectedDataValue } CODE local:21 }
 *
 * MT-ForwardSM-VGCS-Arg ::= SEQUENCE { asciCallReference ASCI-CallReference, sm-RP-OA SM-RP-OA, sm-RP-UI SignalInfo,
 * extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MtForwardSMVgscRequest extends SmsMessage {

    ASCICallReference getAsciCallReference();

    SM_RP_OA getSM_RP_OA();

    SmsSignalInfo getSM_RP_UI();

    MAPExtensionContainer getExtensionContainer();

}
