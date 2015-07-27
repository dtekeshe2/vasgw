/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

/**
 * User data header for concatenates SMS messages
 *
 * @author david@tekeshe.com
 *
 */
public interface ConcatenatedShortMessagesIdentifier extends UserDataHeaderElement {

    boolean getReferenceIs16bit();

    int getReference();

    int getMesageSegmentCount();

    int getMesageSegmentNumber();

    byte[] getEncodedInformationElementData();

}