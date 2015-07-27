/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 MAP V2:
 *
 * registerPassword OPERATION ::= { --Timer ml ARGUMENT SS-Code RESULT Password ERRORS { systemFailure | dataMissing |
 * unexpectedDataValue | callBarred | ss-SubscriptionViolation | pw-RegistrationFailure | negativePW-Check |
 * numberOfPW-AttemptsViolation} LINKED { getPassword} CODE local:17 }
 *
 * RESULT Password
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RegisterPasswordRequest extends SupplementaryMessage {

    SSCode getSsCode();

}