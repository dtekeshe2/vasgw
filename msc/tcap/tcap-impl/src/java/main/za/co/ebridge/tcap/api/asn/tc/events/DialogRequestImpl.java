package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.api.tc.dialog.events.DialogRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;

public abstract class DialogRequestImpl
        implements DialogRequest
{

    private Dialog dialog;
    private EventType type;

    protected DialogRequestImpl(EventType type)
    {
        super();
        this.type = type;
    }

    /**
     * @return the dialog
     */
    public Dialog getDialog()
    {
        return dialog;
    }

    /**
     * @param dialog the dialog to set
     */
    public void setDialog(Dialog dialog)
    {
        this.dialog = dialog;
    }

    /**
     * @return the type
     */
    public EventType getType()
    {
        return type;
    }

}
