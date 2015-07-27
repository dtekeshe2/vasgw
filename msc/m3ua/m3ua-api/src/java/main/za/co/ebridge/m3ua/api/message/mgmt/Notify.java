/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.mgmt;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.Status;

/**
 * The Notify message used to provide an autonomous indication of M3UA events to an M3UA peer.
 *
 * @author amit bhayani
 *
 */
public interface Notify extends M3UAMessage {
    Status getStatus();

    void setStatus(Status status);

    ASPIdentifier getASPIdentifier();

    void setASPIdentifier(ASPIdentifier id);

    RoutingContext getRoutingContext();

    void setRoutingContext(RoutingContext rc);

    InfoString getInfoString();

    void setInfoString(InfoString str);
}
