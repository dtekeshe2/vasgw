package za.co.ebridge.isup.api.message.parameter;

import java.io.Serializable;

public interface NatureOfAddressIndicator
        extends Serializable
{

    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _SPARE = 0;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _SUBSCRIBER = 1;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _UNKNOWN = 2;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _NATIONAL = 3;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _INTERNATIONAL = 4;
    /**
     * nature of address indicator value. See Q.763 - 3.9b
     */
    int _NETWORK_SPECIFIC = 5;
}
