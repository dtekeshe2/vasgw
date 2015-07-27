package za.co.ebridge.isup.api.message.parameter;

public interface DisplayInformation
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x73;

    byte[] getInfo();

    void setInfo(byte[] info)
            throws
            IllegalArgumentException;
}
