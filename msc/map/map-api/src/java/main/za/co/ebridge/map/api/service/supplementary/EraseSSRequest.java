/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 * MAP V2:
 *
 * eraseSS OPERATION ::= { --Timer m ARGUMENT SS-ForBS-Code RESULT SS-Info -- optional ERRORS { systemFailure | dataMissing |
 * unexpectedDataValue | bearerServiceNotProvisioned | teleserviceNotProvisioned | callBarred | illegalSS-Operation |
 * ss-ErrorStatus } CODE local:11 }
 *
 * ARGUMENT SS-ForBS-Code
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EraseSSRequest extends SupplementaryMessage {

    SSForBSCode getSsForBSCode();

}