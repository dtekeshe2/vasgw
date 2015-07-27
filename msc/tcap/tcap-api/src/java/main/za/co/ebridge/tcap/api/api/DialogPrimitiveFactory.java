package za.co.ebridge.tcap.api.api;

import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCBeginRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCContinueRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCEndRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUniRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUserAbortRequest;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public interface DialogPrimitiveFactory
{

    TCBeginRequest createBegin(Dialog d);

    TCContinueRequest createContinue(Dialog d);

    TCEndRequest createEnd(Dialog d);

    TCUserAbortRequest createUAbort(Dialog d);

    TCUniRequest createUni(Dialog d);

    ApplicationContextName createApplicationContextName(long[] oid);

    UserInformation createUserInformation();

}