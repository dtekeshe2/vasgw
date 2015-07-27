/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 MAP V2:
 *
 * activateSS OPERATION ::= { --Timer m ARGUMENT SS-ForBS-Code RESULT SS-Info -- optional ERRORS { systemFailure | dataMissing |
 * unexpectedDataValue | bearerServiceNotProvisioned | teleserviceNotProvisioned | callBarred | illegalSS-Operation |
 * ss-ErrorStatus | ss-SubscriptionViolation | ss-Incompatibility | negativePW-Check | numberOfPW-AttemptsViolation} CODE
 * local:12 }
 *
 * ARGUMENT SS-ForBS-Code
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ActivateSSRequest extends SupplementaryMessage {

    SSForBSCode getSsForBSCode();

}
