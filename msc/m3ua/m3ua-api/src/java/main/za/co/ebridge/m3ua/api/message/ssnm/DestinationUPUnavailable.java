/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.ssnm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.UserCause;

/**
 * Destination User Part Unavailable (DUPU) message is used by an SGP to inform concerned ASPs that a remote peer MTP3-User Part
 * (e.g., ISUP or SCCP) at an SS7 node is unavailable.
 *
 * @author amit bhayani
 *
 */
public interface DestinationUPUnavailable extends M3UAMessage {

    NetworkAppearance getNetworkAppearance();

    void setNetworkAppearance(NetworkAppearance p);

    RoutingContext getRoutingContext();

    void setRoutingContext(RoutingContext routingCntx);

    AffectedPointCode getAffectedPointCode();

    void setAffectedPointCode(AffectedPointCode afpc);

    UserCause getUserCause();

    void setUserCause(UserCause usrCau);

    InfoString getInfoString();

    void setInfoString(InfoString str);

}