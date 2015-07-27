package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.ApplicationTransport;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.OptionalBackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.OptionalForwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;

public interface PreReleaseInformationMessage
        extends ISUPMessage
{
    /**
     * Pre-release information Message, Q.763 reference table 52 <br>
     * {@link PreReleaseInformationMessage}
     */
    int MESSAGE_CODE = 0x42;

    MessageCompatibilityInformation getMessageCompatibilityInformation();

    void setMessageCompatibilityInformation(MessageCompatibilityInformation mci);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation pci);

    OptionalForwardCallIndicators getOptionalForwardCallIndicators();

    void setOptionalForwardCallIndicators(OptionalForwardCallIndicators obci);

    OptionalBackwardCallIndicators getOptionalBackwardCallIndicators();

    void setOptionalBackwardCallIndicators(OptionalBackwardCallIndicators obci);

    ApplicationTransport getApplicationTransport();

    void setApplicationTransport(ApplicationTransport at);
}
