package za.co.ebridge.isup.api.message.parameter;

public interface RedirectCapability
        extends ISUPParameter
{

    int _PARAMETER_CODE = 0x4E;

    /**
     * See Q.763 3.96 Redirect possible indicator : not used
     */
    int _RPI_NOT_USED = 0;
    /**
     * See Q.763 3.96 Redirect possible indicator : redirect possible before ACM use)
     */
    int _RPI_RPB_ACM = 1;
    /**
     * See Q.763 3.96 Redirect possible indicator : redirect possible before ANM
     */
    int _RPI_RPB_ANM = 2;
    /**
     * See Q.763 3.96 Redirect possible indicator : redirect possible at any time during the call
     */
    int _RPI_RPANTDC = 3;

    byte[] getCapabilities();

    void setCapabilities(byte[] capabilities);

    int getCapability(byte b);
}
