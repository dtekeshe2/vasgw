/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * ExtensionContainer ::= SEQUENCE { privateExtensionList [0]PrivateExtensionList OPTIONAL, pcs-Extensions [1]PCS-Extensions
 * OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 */
public interface MAPExtensionContainer extends Serializable {
    /**
     * Get the PrivateExtension list
     *
     * @return
     */
    ArrayList<MAPPrivateExtension> getPrivateExtensionList();

    /**
     * Set the PrivateExtension list
     *
     * @param privateExtensionList
     */
    void setPrivateExtensionList(ArrayList<MAPPrivateExtension> privateExtensionList);

    /**
     * Get the Pcs-Extensions - ASN.1 encoded byte array
     *
     * @return
     */
    byte[] getPcsExtensions();

    /**
     * Set the Pcs-Extensions - ASN.1 encoded byte array
     *
     * @param pcsExtensions
     */
    void setPcsExtensions(byte[] pcsExtensions);

}
