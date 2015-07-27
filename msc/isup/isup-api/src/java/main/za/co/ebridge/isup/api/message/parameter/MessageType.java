package za.co.ebridge.isup.api.message.parameter;

public interface MessageType
        extends ISUPParameter
{
    // not defined, its not a real parameter
    int _PARAMETER_CODE = -300;

    int getCode();
}
