package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUserAbortIndication;
import za.co.ebridge.tcap.api.asn.AbortSource;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.ResultSourceDiagnostic;
import za.co.ebridge.tcap.api.asn.UserInformation;

public class TCUserAbortIndicationImpl
        extends DialogIndicationImpl
        implements TCUserAbortIndication
{
    // fields_1
    // private External abortReason;
    // fields_2
    // private ApplicationContextName applicationContextName;
    private UserInformation userInformation;
    private AbortSource abortSource;
    private ApplicationContextName acn;
    private ResultSourceDiagnostic resultSourceDiagnostic;
    private Boolean aareApdu = false;
    private Boolean abrtApdu = false;

    // XXX: fields_1 and fields_2 are mutually exclusive!
    TCUserAbortIndicationImpl()
    {
        super(EventType.UAbort);
        // TODO Auto-generated constructor stub
    }

    // public External getAbortReason() {
    //
    // return abortReason;
    // }

    public Boolean IsAareApdu()
    {
        return this.aareApdu;
    }

    public void SetAareApdu()
    {
        this.aareApdu = true;
    }

    public Boolean IsAbrtApdu()
    {
        return this.abrtApdu;

    }

    public void SetAbrtApdu()
    {
        this.abrtApdu = true;
    }

    public UserInformation getUserInformation()
    {

        return userInformation;
    }

    /**
     * @param userInformation the userInformation to set
     */
    public void setUserInformation(UserInformation userInformation)
    {
        this.userInformation = userInformation;
    }

    /**
     * @return the abortSource
     */
    public AbortSource getAbortSource()
    {
        return abortSource;
    }

    public void setAbortSource(AbortSource abortSource)
    {
        this.abortSource = abortSource;

    }

    public ApplicationContextName getApplicationContextName()
    {
        return this.acn;
    }

    public void setApplicationContextName(ApplicationContextName acn)
    {
        this.acn = acn;
    }

    public ResultSourceDiagnostic getResultSourceDiagnostic()
    {
        return this.resultSourceDiagnostic;
    }

    public void setResultSourceDiagnostic(ResultSourceDiagnostic resultSourceDiagnostic)
    {
        this.resultSourceDiagnostic = resultSourceDiagnostic;
    }

}
