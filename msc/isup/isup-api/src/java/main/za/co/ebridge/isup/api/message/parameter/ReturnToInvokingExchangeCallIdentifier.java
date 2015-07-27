package za.co.ebridge.isup.api.message.parameter;

public interface ReturnToInvokingExchangeCallIdentifier
        extends Information
{
    int getCallIdentity();

    void setCallIdentity(int callIdentity);

    int getSignalingPointCode();

    void setSignalingPointCode(int signalingPointCode);
}
