/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 EraseCC-EntryRes ::= SEQUENCE { ss-Code [0] SS-Code, ss-Status [1] SS-Status OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EraseCCEntryResponse extends SupplementaryMessage {

    SSCode getSsEvent();

    SSStatus getSsStatus();

}
