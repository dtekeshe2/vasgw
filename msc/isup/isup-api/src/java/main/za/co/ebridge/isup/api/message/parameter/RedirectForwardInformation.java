package za.co.ebridge.isup.api.message.parameter;

public interface RedirectForwardInformation
        extends ISUPParameter
{
    // FIXME: fill this!
    int _PARAMETER_CODE = 0x8C;

    int INFORMATION_RETURN_TO_INVOKING_EXCHANGE_POSSIBLE = 0x01;
    int INFORMATION_RETURN_TO_INVOKING_EXCHANGE_CALL_ID = 0x02;
    int INFORMATION_PERFORMING_REDIRECT_INDICATOR = 0x03;
    int INFORMATION_INVOKING_REDIRECT_REASON = 0x04;

    void setReturnToInvokingExchangePossible(ReturnToInvokingExchangePossible... duration);

    ReturnToInvokingExchangePossible[] getReturnToInvokingExchangePossible();

    void setReturnToInvokingExchangeCallIdentifier(ReturnToInvokingExchangeCallIdentifier... cid);

    ReturnToInvokingExchangeCallIdentifier[] getReturnToInvokingExchangeCallIdentifier();

    void setPerformingRedirectIndicator(PerformingRedirectIndicator... reason);

    PerformingRedirectIndicator[] getPerformingRedirectIndicator();

    void setInvokingRedirectReason(InvokingRedirectReason... reason);

    InvokingRedirectReason[] getInvokingRedirectReason();
}
