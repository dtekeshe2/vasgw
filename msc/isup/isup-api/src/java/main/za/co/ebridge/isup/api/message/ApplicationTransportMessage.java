package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.ApplicationTransport;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;

public interface ApplicationTransportMessage
        extends ISUPMessage
{

    /**
     * Application Transport Message, Q.763 reference table 51 <br>
     * {@link ApplicationTransportMessage}
     */
    int MESSAGE_CODE = 0x41;

    void setMessageCompatibilityInformation(MessageCompatibilityInformation mci);

    MessageCompatibilityInformation getMessageCompatibilityInformation();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation pci);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setApplicationTransport(ApplicationTransport atp);

    ApplicationTransport getApplicationTransport();
}
