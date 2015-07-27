package za.co.ebridge.isup.api.message.parameter;

public interface RedirectBackwardInformation
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x8C;

    int INFORMATION_RETURN_TO_INVOKING_EXCHANGE_DURATION = 0x01;
    int INFORMATION_RETURN_TO_INVOKING_EXCHANGE_CALL_ID = 0x02;
    int INFORMATION_INVOKING_REDIRECT_REASON = 0x03;

    void setReturnToInvokingExchangeDuration(ReturnToInvokingExchangeDuration... duration);

    ReturnToInvokingExchangeDuration[] getReturnToInvokingExchangeDuration();

    void setReturnToInvokingExchangeCallIdentifier(ReturnToInvokingExchangeCallIdentifier... cid);

    ReturnToInvokingExchangeCallIdentifier[] getReturnToInvokingExchangeCallIdentifier();

    void setInvokingRedirectReason(InvokingRedirectReason... reason);

    InvokingRedirectReason[] getInvokingRedirectReason();
}
