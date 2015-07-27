/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.mgmt;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.DiagnosticInfo;
import za.co.ebridge.m3ua.api.parameter.ErrorCode;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

/**
 * The Error message is used to notify a peer of an error event associated with an incoming message. For example, the message
 * type might be unexpected given the current state, or a parameter value might be invalid. Error messages MUST NOT be generated
 * in response to other Error messages.
 *
 * @author amit bhayani
 *
 */
public interface Error extends M3UAMessage {

    ErrorCode getErrorCode();

    void setErrorCode(ErrorCode code);

    RoutingContext getRoutingContext();

    void setRoutingContext(RoutingContext rc);

    NetworkAppearance getNetworkAppearance();

    void setNetworkAppearance(NetworkAppearance netApp);

    AffectedPointCode getAffectedPointCode();

    void setAffectedPointCode(AffectedPointCode affPc);

    DiagnosticInfo getDiagnosticInfo();

    void setDiagnosticInfo(DiagnosticInfo diagInfo);

}
