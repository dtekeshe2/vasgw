/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.asptm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

/**
 * The ASP Inactive Ack message is used to acknowledge an ASP Inactive message received from a remote M3UA peer.
 *
 * @author amit bhayani
 *
 */
public interface ASPInactiveAck extends M3UAMessage {

    RoutingContext getRoutingContext();

    void setRoutingContext(RoutingContext rc);

    InfoString getInfoString();

    void setInfoString(InfoString str);
}
