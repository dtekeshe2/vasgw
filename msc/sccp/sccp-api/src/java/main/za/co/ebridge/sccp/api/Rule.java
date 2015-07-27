package za.co.ebridge.sccp.api;

import za.co.ebridge.sccp.api.parameter.SccpAddress;

public interface Rule
{

    String getMask();

    RuleType getRuleType();

    LoadSharingAlgorithm getLoadSharingAlgorithm();

    SccpAddress getPattern();

    int getPrimaryAddressId();

    int getSecondaryAddressId();

    Integer getNewCallingPartyAddressId();

    OriginationType getOriginationType();

    boolean matches(SccpAddress address, boolean isMtpOriginated);

    SccpAddress translate(SccpAddress address, SccpAddress ruleAddress);

}
