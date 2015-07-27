package za.co.ebridge.tcap.api.asn;

public interface DialogUniAPDU
        extends DialogAPDU
{

    void setDoNotSendProtocolVersion(boolean val);

    // opt, default is 1(no other defined)
    int getProtocolVersion();

    // mandatory
    ApplicationContextName getApplicationContextName();

    void setApplicationContextName(ApplicationContextName acn);

    // opt
    UserInformation getUserInformation();

    void setUserInformation(UserInformation ui);

}
