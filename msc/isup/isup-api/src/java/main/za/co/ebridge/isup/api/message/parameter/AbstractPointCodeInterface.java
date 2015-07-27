package za.co.ebridge.isup.api.message.parameter;

public interface AbstractPointCodeInterface
        extends ISUPParameter
{
    int getSignalingPointCode();

    void setSignalingPointCode(int signalingPointCode);
}
