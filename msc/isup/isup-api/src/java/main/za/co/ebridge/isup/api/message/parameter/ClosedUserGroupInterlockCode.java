package za.co.ebridge.isup.api.message.parameter;

public interface ClosedUserGroupInterlockCode
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x1A;

    byte[] getNiDigits();

    void setNiDigits(byte[] niDigits);

    int getBinaryCode();

    void setBinaryCode(int binaryCode);
}
