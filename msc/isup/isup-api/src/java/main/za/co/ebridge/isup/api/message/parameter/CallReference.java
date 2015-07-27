package za.co.ebridge.isup.api.message.parameter;

public interface CallReference
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x01;

    int getCallIdentity();

    void setCallIdentity(int callIdentity);

    int getSignalingPointCode();

    void setSignalingPointCode(int signalingPointCode);
}
