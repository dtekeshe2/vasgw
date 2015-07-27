package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.SubsequentNumber;

public interface SubsequentDirectoryNumberMessage
        extends ISUPMessage
{
    /**
     * Subsequent Directory Number Message, Q.763 reference table 53 <br>
     * {@link SubsequentDirectoryNumberMessage}
     */
    int MESSAGE_CODE = 0x43;

    SubsequentNumber getSubsequentNumber();

    void setSubsequentNumber(SubsequentNumber sn);

    MessageCompatibilityInformation getMessageCompatibilityInformation();

    void setMessageCompatibilityInformation(MessageCompatibilityInformation mci);
}
