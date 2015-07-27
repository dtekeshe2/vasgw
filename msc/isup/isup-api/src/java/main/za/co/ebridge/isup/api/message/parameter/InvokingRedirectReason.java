package za.co.ebridge.isup.api.message.parameter;

public interface InvokingRedirectReason
        extends Information
{
    void setReason(RedirectReason... reasons);

    RedirectReason[] getReason();
}
