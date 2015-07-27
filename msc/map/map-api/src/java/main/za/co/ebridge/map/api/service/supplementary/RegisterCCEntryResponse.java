/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 RegisterCC-EntryRes ::= SEQUENCE { ccbs-Feature [0] CCBS-Feature OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RegisterCCEntryResponse extends SupplementaryMessage {

    CCBSFeature getCcbsFeature();

}