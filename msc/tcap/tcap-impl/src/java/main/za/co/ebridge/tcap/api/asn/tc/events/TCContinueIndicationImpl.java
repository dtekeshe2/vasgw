package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCContinueIndication;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public class TCContinueIndicationImpl
        extends DialogIndicationImpl
        implements TCContinueIndication
{

    private SccpAddress originatingAddress;

    private ApplicationContextName applicationContextName;
    private UserInformation userInformation;

    TCContinueIndicationImpl()
    {
        super(EventType.Continue);
        // TODO Auto-generated constructor stub
    }

    public ApplicationContextName getApplicationContextName()
    {
        return applicationContextName;
    }

    public SccpAddress getOriginatingAddress()
    {

        return this.originatingAddress;
    }

    public UserInformation getUserInformation()
    {

        return this.userInformation;
    }

    public void setApplicationContextName(ApplicationContextName acn)
    {
        this.applicationContextName = acn;

    }

    public void setOriginatingAddress(SccpAddress dest)
    {
        this.originatingAddress = dest;

    }

    public void setUserInformation(UserInformation acn)
    {
        this.userInformation = acn;
    }
}
