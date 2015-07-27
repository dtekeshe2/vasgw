package za.co.ebridge.isup.api.message.parameter;

public interface PivotStatus
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x86;

    void setStatus(Status... status);

    Status[] getStatus();
}
