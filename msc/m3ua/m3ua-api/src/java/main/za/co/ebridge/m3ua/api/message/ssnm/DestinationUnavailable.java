/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.ssnm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

/**
 * <p>
 * Destination Unavailable (DUNA) message is sent from an SGP in an SG to all concerned ASPs to indicate that the SG has
 * determined that one or more SS7 destinations are unreachable.
 * </p>
 * <p>
 * look at section 3.4.1 in RFC 4666
 * </p>
 *
 * @author amit bhayani
 *
 */
public interface DestinationUnavailable extends M3UAMessage {

    NetworkAppearance getNetworkAppearance();

    void setNetworkAppearance(NetworkAppearance p);

    RoutingContext getRoutingContexts();

    void setRoutingContexts(RoutingContext routingCntx);

    AffectedPointCode getAffectedPointCodes();

    void setAffectedPointCodes(AffectedPointCode afpcs);

    InfoString getInfoString();

    void setInfoString(InfoString str);

}
