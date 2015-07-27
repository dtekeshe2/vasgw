/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 MAP V2:
 *
 * getPassword OPERATION ::= { --Timer m ARGUMENT GuidanceInfo RESULT Password CODE local:18 }
 *
 * ARGUMENT GuidanceInfo
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface GetPasswordRequest extends SupplementaryMessage {

    GuidanceInfo getGuidanceInfo();

}