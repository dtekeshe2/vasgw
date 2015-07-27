/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.asptm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;

/**
 * The ASP Active message is sent by an ASP to indicate to a remote M3UA peer that it is ready to process signalling traffic for
 * a particular Application Server. The ASP Active message affects only the ASP state for the Routing Keys identified by the
 * Routing Contexts, if present.
 *
 * @author amit bhayani
 *
 */
public interface ASPActive extends M3UAMessage {

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
