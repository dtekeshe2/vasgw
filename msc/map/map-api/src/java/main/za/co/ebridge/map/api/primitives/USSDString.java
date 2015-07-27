/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;
import java.nio.charset.Charset;

import za.co.ebridge.map.api.MAPException;

/**
 * USSD-String ::= OCTET STRING (SIZE (1..maxUSSD-StringLength)) -- The structure of the contents of the USSD-String is
 * dependent -- on the USSD-DataCodingScheme as described in TS 3GPP TS 23.038 [25].
 *
 * maxUSSD-StringLength INTEGER ::= 160
 *
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public interface USSDString extends Serializable {

    /**
     * Get the byte[] that represents encoded USSD String
     *
     * @return
     */
    byte[] getEncodedString();

    /**
     * Get the decoded USSD String
     *
     * @return
     */
    String getString(Charset gsm8Charset) throws MAPException;

}
