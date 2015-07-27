package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCNoticeIndication;

public class TCNoticeIndicationImpl
        implements TCNoticeIndication
{

    private SccpAddress localAddress;
    private SccpAddress remoteAddress;
    private ReturnCauseValue reportCause;
    private Dialog dialog;

    public SccpAddress getLocalAddress()
    {
        return localAddress;
    }

    public void setLocalAddress(SccpAddress val)
    {
        localAddress = val;
    }

    public SccpAddress getRemoteAddress()
    {
        return remoteAddress;
    }

    public void setRemoteAddress(SccpAddress val)
    {
        remoteAddress = val;
    }

    public ReturnCauseValue getReportCause()
    {
        return reportCause;
    }

    public void setReportCause(ReturnCauseValue val)
    {
        reportCause = val;
    }

    public Dialog getDialog()
    {
        return dialog;
    }

    public void setDialog(Dialog val)
    {
        dialog = val;
    }
}
