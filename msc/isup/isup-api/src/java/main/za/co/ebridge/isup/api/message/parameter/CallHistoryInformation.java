package za.co.ebridge.isup.api.message.parameter;

public interface CallHistoryInformation
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x2D;

    int getCallHistory();

    void setCallHistory(int callHistory);

}
