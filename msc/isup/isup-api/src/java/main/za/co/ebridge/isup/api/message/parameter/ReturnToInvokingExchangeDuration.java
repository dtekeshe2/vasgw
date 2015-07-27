package za.co.ebridge.isup.api.message.parameter;

public interface ReturnToInvokingExchangeDuration
        extends Information
{

    void setDuration(int seconds);

    int getDuration();
}
