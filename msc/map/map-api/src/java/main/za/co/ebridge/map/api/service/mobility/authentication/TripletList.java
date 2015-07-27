/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 TripletList ::= SEQUENCE SIZE (1..5) OF AuthenticationTriplet
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TripletList extends Serializable {

    ArrayList<AuthenticationTriplet> getAuthenticationTriplets();

}
