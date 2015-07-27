package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CircuitStateIndicator;
import za.co.ebridge.isup.api.message.parameter.RangeAndStatus;

public interface CircuitGroupQueryResponseMessage
        extends ISUPMessage
{

    /**
     * Circuit Group Query Response Message, Q.763 reference table 24 <br>
     * {@link CircuitGroupQueryResponseMessage}
     */
    int MESSAGE_CODE = 0x2B;

    void setRangeAndStatus(RangeAndStatus ras);

    RangeAndStatus getRangeAndStatus();

    void setCircuitStateIndicator(CircuitStateIndicator ras);

    CircuitStateIndicator getCircuitStateIndicator();
}
