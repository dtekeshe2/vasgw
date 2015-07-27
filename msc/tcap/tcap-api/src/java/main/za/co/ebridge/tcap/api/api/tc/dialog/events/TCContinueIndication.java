package za.co.ebridge.tcap.api.api.tc.dialog.events;

import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public interface TCContinueIndication
        extends DialogIndication
{

    // public Byte getQOS();

    ApplicationContextName getApplicationContextName();

    UserInformation getUserInformation();

    SccpAddress getOriginatingAddress();
}
