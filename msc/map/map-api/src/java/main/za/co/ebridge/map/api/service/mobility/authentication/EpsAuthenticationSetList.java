/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 EPS-AuthenticationSetList ::= SEQUENCE SIZE (1..5) OF EPC-AV
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EpsAuthenticationSetList extends Serializable {

    ArrayList<EpcAv> getEpcAv();

}
