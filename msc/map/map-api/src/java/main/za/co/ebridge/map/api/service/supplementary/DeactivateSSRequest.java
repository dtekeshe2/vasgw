/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 MAP V2:
 *
 * deactivateSS OPERATION ::= { --Timer m ARGUMENT SS-ForBS-Code RESULT SS-Info -- optional ERRORS { systemFailure | dataMissing
 * | unexpectedDataValue | bearerServiceNotProvisioned | teleserviceNotProvisioned | callBarred | illegalSS-Operation |
 * ss-ErrorStatus | ss-SubscriptionViolation | negativePW-Check | numberOfPW-AttemptsViolation} CODE local:13 }
 *
 * ARGUMENT SS-ForBS-Code
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface DeactivateSSRequest extends SupplementaryMessage {

    SSForBSCode getSsForBSCode();

}
