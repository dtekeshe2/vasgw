package za.co.ebridge.isup.api.message.parameter;

public interface HopCounter
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x3D;

    int getHopCounter();

    void setHopCounter(int hopCounter);

}
