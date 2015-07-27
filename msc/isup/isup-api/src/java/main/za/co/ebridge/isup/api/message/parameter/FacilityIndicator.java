package za.co.ebridge.isup.api.message.parameter;

public interface FacilityIndicator
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x18;

    /**
     * See Q.763 3.22 facility indicator user-to-user service
     */
    byte _FACILITY_INDICATOR_UTUS = 2;

    byte getFacilityIndicator();

    void setFacilityIndicator(byte facilityIndicator);
}
