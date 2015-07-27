package za.co.ebridge.isup.api.message.parameter;

public interface AccessDeliveryInformation
        extends ISUPParameter
{
    /**
     * See Q.763 3.2 Access delivery indicator: set-up message generated
     */
    int _SETUP_MESSAGE = 0;

    /**
     * See Q.763 3.2 Access delivery indicator:no set-up message generated
     */
    int _NO_SETUP_MESSAGE = 1;

    int _PARAMETER_CODE = 0x2E;

    int getAccessDeliveryIndicator();

    void setAccessDeliveryIndicator(int accessDeliveryIndicator);
}
