package za.co.ebridge.isup.api.message.parameter;

public interface NetworkManagementControls
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x5B;

    boolean isTARControlEnabled(byte b);

    byte createTAREnabledByte(boolean enabled);

    byte[] getNetworkManagementControls();

    void setNetworkManagementControls(byte[] networkManagementControls)
            throws
            IllegalArgumentException;

}
