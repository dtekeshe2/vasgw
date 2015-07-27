/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 QuintupletList ::= SEQUENCE SIZE (1..5) OF AuthenticationQuintuplet
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface QuintupletList extends Serializable {

    ArrayList<AuthenticationQuintuplet> getAuthenticationQuintuplets();

}
