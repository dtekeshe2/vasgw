package za.co.ebridge.isup.api.message.parameter;

public interface BackwardGVNS
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x4D;

    byte[] getBackwardGVNS();

    void setBackwardGVNS(byte[] backwardGVNS);
}
