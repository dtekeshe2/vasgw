package za.co.ebridge.tcap.api.api.tc.dialog.events;

import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

/**
 * See Q.771 3.1.2.2.1
 */
public interface TCUniRequest
        extends DialogRequest
{

    void setReturnMessageOnError(boolean val);

    boolean getReturnMessageOnError();

    /**
     * Destination address. If this address is different than one in dialog, this value will overwrite dialog value.
     */
    SccpAddress getDestinationAddress();

    void setDestinationAddress(SccpAddress dest);

    /**
     * Origin address. If this address is different than one in dialog, this value will overwrite dialog value.
     */
    SccpAddress getOriginatingAddress();

    void setOriginatingAddress(SccpAddress dest);

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

}
