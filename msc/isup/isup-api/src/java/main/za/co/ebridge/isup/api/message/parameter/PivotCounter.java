package za.co.ebridge.isup.api.message.parameter;

public interface PivotCounter
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x87;

    int getCounter();

    void setCounter(int counter);
}
