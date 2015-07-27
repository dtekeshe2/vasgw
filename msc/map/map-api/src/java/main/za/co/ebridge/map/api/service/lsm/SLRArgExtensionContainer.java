/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPPrivateExtension;

/**
 *
 SLR-ArgExtensionContainer ::= SEQUENCE { privateExtensionList [0]PrivateExtensionList OPTIONAL, slr-Arg-PCS-Extensions
 * [1]SLR-Arg-PCS-Extensions OPTIONAL, ...}
 *
 * PrivateExtensionList ::= SEQUENCE SIZE (1..10) OF PrivateExtension
 *
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public interface SLRArgExtensionContainer extends Serializable {

    ArrayList<MAPPrivateExtension> getPrivateExtensionList();

    SLRArgPCSExtensions getSlrArgPcsExtensions();

}
