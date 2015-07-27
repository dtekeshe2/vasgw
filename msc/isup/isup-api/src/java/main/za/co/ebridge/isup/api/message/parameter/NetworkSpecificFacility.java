package za.co.ebridge.isup.api.message.parameter;

public interface NetworkSpecificFacility
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x2F;

    /**
     * See Q.763 Type of network identification : national network identification
     */
    int _TNI_NNI = 0x02;

    /**
     * See Q.763 Type of network identification : reserved for international network identification
     */
    int _TNI_RESERVED_INI = 0x03;

    boolean isIncludeNetworkIdentification();

    int getLengthOfNetworkIdentification();

    int getTypeOfNetworkIdentification();

    void setTypeOfNetworkIdentification(byte typeOfNetworkIdentification);

    int getNetworkIdentificationPlan();

    void setNetworkIdentificationPlan(byte networkdIdentificationPlan);

    byte[] getNetworkIdentification();

    void setNetworkIdentification(byte[] networkdIdentification);

    byte[] getNetworkSpecificaFacilityIndicator();

    void setNetworkSpecificaFacilityIndicator(byte[] networkSpecificaFacilityIndicator);

}
