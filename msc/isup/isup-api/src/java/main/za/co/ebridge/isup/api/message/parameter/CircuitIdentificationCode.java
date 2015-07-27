package za.co.ebridge.isup.api.message.parameter;

import java.io.Serializable;


/**
 * This is not real parameter, its present to follow same way of defining message, null not present, != null present.
 */
public interface CircuitIdentificationCode
        extends Serializable
{

    int getCIC();

    void setCIC(int cic);

}
