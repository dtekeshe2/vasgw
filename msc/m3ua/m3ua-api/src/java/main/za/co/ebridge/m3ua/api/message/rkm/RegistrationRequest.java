/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.rkm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.RoutingKey;

/**
 * The Registration Request message is sent by an ASP to indicate to a remote M3UA peer that it wishes to register one or more
 * given Routing Keys with the remote peer. Typically, an ASP would send this message to an SGP and expect to receive a REG RSP
 * message in return with an associated Routing Context value.
 *
 * TODO : It supports registration only for one Routing Key.
 *
 * @author amit bhayani
 *
 */
public interface RegistrationRequest extends M3UAMessage {

    /**
     * The Routing Key parameter is mandatory.
     *
     * @param keys
     */
    void setRoutingKey(RoutingKey keys);

    RoutingKey getRoutingKey();

}
