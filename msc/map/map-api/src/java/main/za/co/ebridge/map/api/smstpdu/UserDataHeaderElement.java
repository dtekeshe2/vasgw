/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface UserDataHeaderElement extends Serializable {

    int getEncodedInformationElementIdentifier();

    byte[] getEncodedInformationElementData();

}