package za.co.ebridge.tcap.api.asn;

public interface DialogAbortAPDU
        extends DialogAPDU
{

    // mandatory
    void setAbortSource(AbortSource as);

    AbortSource getAbortSource();

    // opt
    UserInformation getUserInformation();

    void setUserInformation(UserInformation ui);
}
