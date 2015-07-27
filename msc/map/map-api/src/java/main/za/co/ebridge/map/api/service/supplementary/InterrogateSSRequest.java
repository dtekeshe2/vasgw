/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 MAP V2:
 *
 * interrogateSS OPERATION ::= { --Timer m ARGUMENT SS-ForBS-Code RESULT InterrogateSS-Res ERRORS { systemFailure | dataMissing
 * | unexpectedDataValue | bearerServiceNotProvisioned | teleserviceNotProvisioned | callBarred | illegalSS-Operation |
 * ss-NotAvailable} CODE local:14 }
 *
 * ARGUMENT SS-ForBS-Code
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface InterrogateSSRequest extends SupplementaryMessage {

    SSForBSCode getSsForBSCode();

}