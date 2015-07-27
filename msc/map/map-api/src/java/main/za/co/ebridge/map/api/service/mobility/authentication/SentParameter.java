/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.IMSI;

/**
 *
 SentParameter ::= CHOICE { imsi [0] IMSI, authenticationSet [1] AuthenticationSet, subscriberData [2] SubscriberData, ki [4]
 * Ki}
 *
 * Ki ::= octet STRING (SIZE (16))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SentParameter extends Serializable {

    IMSI getImsu();

    AuthenticationSet getAuthenticationSet();

    SubscriberData getSubscriberData();

    byte[] getKi();

}
