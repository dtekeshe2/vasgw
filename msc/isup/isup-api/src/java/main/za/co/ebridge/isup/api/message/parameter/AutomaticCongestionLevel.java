package za.co.ebridge.isup.api.message.parameter;

public interface AutomaticCongestionLevel
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x27;
    int _CONGESTION_LEVE_1_EXCEEDED = 1;
    int _CONGESTION_LEVE_2_EXCEEDED = 2;

    int getAutomaticCongestionLevel();

    void setAutomaticCongestionLevel(int automaticCongestionLevel);
}
