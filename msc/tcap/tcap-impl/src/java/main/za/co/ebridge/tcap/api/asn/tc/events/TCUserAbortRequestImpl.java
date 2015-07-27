package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUserAbortRequest;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.DialogServiceUserType;
import za.co.ebridge.tcap.api.asn.UserInformation;

public class TCUserAbortRequestImpl
        extends DialogRequestImpl
        implements TCUserAbortRequest
{

    private boolean returnMessageOnError;

    // fields
    private ApplicationContextName applicationContextName;
    private UserInformation userInformation;

    private DialogServiceUserType dialogServiceUserType;

    TCUserAbortRequestImpl()
    {
        super(EventType.UAbort);
    }

    // public External getAbortReason() {
    // return this.abortReason;
    // }

    public ApplicationContextName getApplicationContextName()
    {
        return this.applicationContextName;
    }

    public UserInformation getUserInformation()
    {
        return this.userInformation;
    }

    // public void setAbortReason(External abortReason) {
    // this.abortReason = abortReason;
    // }

    public void setApplicationContextName(ApplicationContextName acn)
    {
        this.applicationContextName = acn;
    }

    public void setUserInformation(UserInformation userInformation)
    {
        this.userInformation = userInformation;

    }

    public void setDialogServiceUserType(DialogServiceUserType dialogServiceUserType)
    {
        this.dialogServiceUserType = dialogServiceUserType;
    }

    public DialogServiceUserType getDialogServiceUserType()
    {
        return this.dialogServiceUserType;
    }

    public void setReturnMessageOnError(boolean val)
    {
        returnMessageOnError = val;
    }

    public boolean getReturnMessageOnError()
    {
        return returnMessageOnError;
    }

}
