package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCEndIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TerminationType;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public class TCEndIndicationImpl
        extends DialogIndicationImpl
        implements TCEndIndication
{

    private TerminationType terminationType;

    // fields
    private ApplicationContextName applicationContextName;
    private UserInformation userInformation;

    TCEndIndicationImpl()
    {
        super(EventType.End);
        // TODO Auto-generated constructor stub
    }

    public ApplicationContextName getApplicationContextName()
    {
        return applicationContextName;
    }

    public UserInformation getUserInformation()
    {

        return this.userInformation;
    }

    public void setApplicationContextName(ApplicationContextName acn)
    {
        this.applicationContextName = acn;

    }

    public void setUserInformation(UserInformation acn)
    {
        this.userInformation = acn;

    }

}
