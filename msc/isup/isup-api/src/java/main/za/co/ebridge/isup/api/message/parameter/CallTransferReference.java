package za.co.ebridge.isup.api.message.parameter;

public interface CallTransferReference
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x43;

    int getCallTransferReference();

    void setCallTransferReference(int callTransferReference);

}
