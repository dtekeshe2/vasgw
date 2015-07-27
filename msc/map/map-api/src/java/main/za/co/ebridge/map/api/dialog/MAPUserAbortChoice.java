/* eBridge SS7 */

package za.co.ebridge.map.api.dialog;

import java.io.Serializable;

/**
 * MAP-UserAbortChoice ::= CHOICE { userSpecificReason [0] NULL, userResourceLimitation [1] NULL, resourceUnavailable [2]
 * ResourceUnavailableReason, applicationProcedureCancellation [3] ProcedureCancellationReason}
 *
 * @author amit bhayani
 *
 */
public interface MAPUserAbortChoice extends Serializable {

    void setUserSpecificReason();

    void setUserResourceLimitation();

    void setResourceUnavailableReason(ResourceUnavailableReason resUnaReas);

    void setProcedureCancellationReason(ProcedureCancellationReason procCanReasn);

    ProcedureCancellationReason getProcedureCancellationReason();

    ResourceUnavailableReason getResourceUnavailableReason();

    boolean isUserSpecificReason();

    boolean isUserResourceLimitation();

    boolean isResourceUnavailableReason();

    boolean isProcedureCancellationReason();

}
