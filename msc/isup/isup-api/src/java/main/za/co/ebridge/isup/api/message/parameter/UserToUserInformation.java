package za.co.ebridge.isup.api.message.parameter;

public interface UserToUserInformation
        extends ISUPParameter
{
    // FIXME: fill this!
    int _PARAMETER_CODE = 0x20;

    byte[] getInformation();

    void setInformation(byte[] b);
}
