/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

import za.co.ebridge.map.api.MAPException;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface CommandData extends Serializable {

    byte[] getEncodedData();

    String getDecodedMessage();

    void encode() throws MAPException;

    void decode() throws MAPException;

}