package za.co.ebridge.tcap.api.asn;

public interface DialogResponseAPDU
        extends DialogAPDU
{

    void setDoNotSendProtocolVersion(boolean val);

    ProtocolVersion getProtocolVersion();

    // mandatory
    ApplicationContextName getApplicationContextName();

    void setApplicationContextName(ApplicationContextName acn);

    Result getResult();

    void setResult(Result acn);

    ResultSourceDiagnostic getResultSourceDiagnostic();

    void setResultSourceDiagnostic(ResultSourceDiagnostic acn);

    // opt
    UserInformation getUserInformation();

    void setUserInformation(UserInformation ui);

}
