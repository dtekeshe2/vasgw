/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.ssnm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.ConcernedDPC;
import za.co.ebridge.m3ua.api.parameter.CongestedIndication;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

/**
 * <p>
 * The Signalling Congestion SCON message can be sent from an SGP to all concerned ASPs to indicate that an SG has determined
 * that there is congestion in the SS7 network to one or more destinations, or to an ASP in response to a DATA or DAUD message,
 * as appropriate. For some MTP protocol variants (e.g., ANSI MTP) the SCON message may be sent when the SS7 congestion level
 * changes. The SCON message MAY also be sent from the M3UA layer of an ASP to an M3UA peer, indicating that the congestion
 * level of the M3UA layer or the ASP has changed.
 * </p>
 *
 * @author amit bhayani
 *
 */
public interface SignallingCongestion extends M3UAMessage {

    NetworkAppearance getNetworkAppearance();

    void setNetworkAppearance(NetworkAppearance p);

    RoutingContext getRoutingContexts();

    void setRoutingContexts(RoutingContext routingCntx);

    AffectedPointCode getAffectedPointCodes();

    void setAffectedPointCodes(AffectedPointCode afpcs);

    ConcernedDPC getConcernedDPC();

    void setConcernedDPC(ConcernedDPC dpc);

    CongestedIndication getCongestedIndication();

    void setCongestedIndication(CongestedIndication congInd);

    InfoString getInfoString();

    void setInfoString(InfoString str);

}
