/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

import za.co.ebridge.map.api.MAPException;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface UserData extends Serializable {

    DataCodingScheme getDataCodingScheme();

    byte[] getEncodedData();

    boolean getEncodedUserDataHeaderIndicator();

    int getEncodedUserDataLength();

    String getDecodedMessage();

    UserDataHeader getDecodedUserDataHeader();

    void encode() throws MAPException;

    void decode() throws MAPException;

}