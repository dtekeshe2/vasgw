package za.co.ebridge.isup.api.message.parameter;

public interface PerformingRedirectIndicator
        extends Information
{
    void setReason(RedirectReason... reasons);

    RedirectReason[] getReason();
}
