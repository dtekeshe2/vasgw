/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.ssnm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

/**
 * Destination State Audit (DAUD) MAY be sent from the ASP to the SGP to audit the availability/congestion state of SS7 routes
 * from the SG to one or more affected destinations.
 *
 * @author amit bhayani
 *
 */
public interface DestinationStateAudit extends M3UAMessage {

    NetworkAppearance getNetworkAppearance();

    void setNetworkAppearance(NetworkAppearance p);

    RoutingContext getRoutingContexts();

    void setRoutingContexts(RoutingContext routingCntx);

    AffectedPointCode getAffectedPointCodes();

    void setAffectedPointCodes(AffectedPointCode afpcs);

    InfoString getInfoString();

    void setInfoString(InfoString str);

}
