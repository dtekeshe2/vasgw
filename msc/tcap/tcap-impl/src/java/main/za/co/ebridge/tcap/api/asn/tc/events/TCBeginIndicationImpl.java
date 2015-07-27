package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCBeginIndication;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public class TCBeginIndicationImpl
        extends DialogIndicationImpl
        implements TCBeginIndication
{

    private SccpAddress originatingAddress, destinationAddress;

    private ApplicationContextName applicationContextName;
    private UserInformation userInformation;

    TCBeginIndicationImpl()
    {
        super(EventType.Begin);
        // TODO Auto-generated constructor stub
    }

    public ApplicationContextName getApplicationContextName()
    {
        return applicationContextName;
    }

    public SccpAddress getDestinationAddress()
    {

        return this.destinationAddress;
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

    public void setDestinationAddress(SccpAddress dest)
    {
        this.destinationAddress = dest;

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
