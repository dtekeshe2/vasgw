package za.co.ebridge.isup.api.message.parameter;

public interface PropagationDelayCounter
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x31;

    int getPropagationDelay();

    void setPropagationDelay(int propagationDelay);

}
