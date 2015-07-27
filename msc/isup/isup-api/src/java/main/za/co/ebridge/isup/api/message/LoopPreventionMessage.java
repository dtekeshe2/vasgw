package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CallTransferReference;
import za.co.ebridge.isup.api.message.parameter.LoopPreventionIndicators;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;

public interface LoopPreventionMessage
        extends ISUPMessage
{
    /**
     * Loopback Prevention Message, Q.763 reference table 50 <br>
     * {@link LoopPreventionMessage}
     */
    int MESSAGE_CODE = 0x40;

    MessageCompatibilityInformation getMessageCompatibilityInformation();

    void setMessageCompatibilityInformation(MessageCompatibilityInformation mci);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation pci);

    CallTransferReference getCallTransferReference();

    void setCallTransferReference(CallTransferReference ctr);

    LoopPreventionIndicators getLoopPreventionIndicators();

    void setLoopPreventionIndicators(LoopPreventionIndicators lpi);
}
