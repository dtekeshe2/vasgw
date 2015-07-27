package za.co.ebridge.isup.api.message.parameter;

public interface RedirectCounter
        extends ISUPParameter
{

    int _PARAMETER_CODE = 0x77;

    int getCounter();

    void setCounter(int counter);
}
