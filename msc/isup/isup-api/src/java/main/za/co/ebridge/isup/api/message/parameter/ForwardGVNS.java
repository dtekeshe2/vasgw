package za.co.ebridge.isup.api.message.parameter;

public interface ForwardGVNS
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x4C;

    OriginatingParticipatingServiceProvider getOpServiceProvider();

    void setOpServiceProvider(OriginatingParticipatingServiceProvider opServiceProvider);

    GVNSUserGroup getGvnsUserGroup();

    void setGvnsUserGroup(GVNSUserGroup gvnsUserGroup);

    TerminatingNetworkRoutingNumber getTnRoutingNumber();

    void setTnRoutingNumber(TerminatingNetworkRoutingNumber tnRoutingNumber);
}
