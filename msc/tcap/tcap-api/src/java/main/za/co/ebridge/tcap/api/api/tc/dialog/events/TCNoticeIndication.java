package za.co.ebridge.tcap.api.api.tc.dialog.events;

import java.io.Serializable;

import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;

public interface TCNoticeIndication
        extends Serializable
{

    SccpAddress getLocalAddress();

    void setLocalAddress(SccpAddress val);

    SccpAddress getRemoteAddress();

    void setRemoteAddress(SccpAddress val);

    ReturnCauseValue getReportCause();

    void setReportCause(ReturnCauseValue val);

    /*
     * This value can be equal null if TCAP can not match any existant Dialog to the incoming data
     */
    Dialog getDialog();

    void setDialog(Dialog val);

}
