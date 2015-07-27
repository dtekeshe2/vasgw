/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

/**
 * V 3: AuthenticationSetList ::= CHOICE { tripletList [0] TripletList, quintupletList [1] QuintupletList }
 *
 * V 2: AuthenticationSetList ::= SEQUENCE SIZE (1..5) OF AuthenticationSet
 *
 * AuthenticationSet ::= AuthenticationTriplet (from V 3)
 *
 * @author david@tekeshe.com
 *
 */
public interface AuthenticationSetList extends Serializable {

    TripletList getTripletList();

    QuintupletList getQuintupletList();

    long getMapProtocolVersion();

}
