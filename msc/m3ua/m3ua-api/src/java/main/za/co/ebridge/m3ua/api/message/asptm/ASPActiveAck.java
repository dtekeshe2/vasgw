/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.asptm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;

/**
 * The ASP Active Ack message is used to acknowledge an ASP Active message received from a remote M3UA peer.
 *
 * @author amit bhayani
 *
 */
public interface ASPActiveAck extends M3UAMessage {

    /**
     * The Traffic Mode Type parameter identifies the traffic mode of operation of the ASP within an AS. Optional
     *
     * @return
     */
    TrafficModeType getTrafficModeType();

    void setTrafficModeType(TrafficModeType mode);

    /**
     * The optional Routing Context parameter contains (a list of) integers indexing the Application Server traffic that the
     * sending ASP is configured/registered to receive.
     *
     * @return
     */
    RoutingContext getRoutingContext();

    void setRoutingContext(RoutingContext rc);

    InfoString getInfoString();

    void setInfoString(InfoString str);
}
