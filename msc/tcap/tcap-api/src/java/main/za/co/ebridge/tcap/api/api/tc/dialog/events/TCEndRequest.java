package za.co.ebridge.tcap.api.api.tc.dialog.events;

import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public interface TCEndRequest
        extends DialogRequest
{

    void setReturnMessageOnError(boolean val);

    boolean getReturnMessageOnError();

    /**
     * Application context name for this dialog.
     *
     * @return
     */
    ApplicationContextName getApplicationContextName();

    void setApplicationContextName(ApplicationContextName acn);

    /**
     * User information for this dialog.
     *
     * @return
     */
    UserInformation getUserInformation();

    void setUserInformation(UserInformation acn);

    /**
     * Type of termination. See values of {@link za.co.ebridge.tcap.api.api.tc.dialog.events.TerminationType
     * TerminationType} enum.
     *
     * @param t
     */
    void setTermination(TerminationType t);

    TerminationType getTerminationType();
}
