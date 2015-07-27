package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCPAbortIndication;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class TCPAbortIndicationImpl
        extends DialogIndicationImpl
        implements TCPAbortIndication
{
    // This indication is used to inform user of abnormal cases.
    private PAbortCauseType cause;

    // private boolean localProviderOriginated = false;

    TCPAbortIndicationImpl()
    {
        super(EventType.PAbort);
        // TODO Auto-generated constructor stub
    }

    public PAbortCauseType getPAbortCause()
    {
        return this.cause;
    }

    public void setPAbortCause(PAbortCauseType t)
    {
        this.cause = t;
    }

    // public boolean isLocalProviderOriginated() {
    // return localProviderOriginated;
    // }
    //
    // public void setLocalProviderOriginated(boolean val) {
    // localProviderOriginated = val;
    // }
}
