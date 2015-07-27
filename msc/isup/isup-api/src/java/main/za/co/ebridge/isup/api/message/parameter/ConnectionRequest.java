package za.co.ebridge.isup.api.message.parameter;

public interface ConnectionRequest
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x0D;

    int getLocalReference();

    void setLocalReference(int localReference);

    int getSignalingPointCode();

    void setSignalingPointCode(int signalingPointCode);

    int getProtocolClass();

    void setProtocolClass(int protocolClass);

    int getCredit();

    void setCredit(int credit);
}
