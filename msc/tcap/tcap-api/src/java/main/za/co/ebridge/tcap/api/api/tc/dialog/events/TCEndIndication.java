package za.co.ebridge.tcap.api.api.tc.dialog.events;

import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public interface TCEndIndication
        extends DialogIndication
{

    // public Byte getQOS();

    // parts from DialogPortion, if present
    ApplicationContextName getApplicationContextName();

    UserInformation getUserInformation();

}
