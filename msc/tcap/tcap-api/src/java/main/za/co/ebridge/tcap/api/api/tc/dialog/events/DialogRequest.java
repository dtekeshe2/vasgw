package za.co.ebridge.tcap.api.api.tc.dialog.events;

import java.io.Serializable;

import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;

public interface DialogRequest
        extends Serializable
{
    /**
     * Return dialog for this indication
     *
     * @return
     */
    Dialog getDialog();

    EventType getType();

}
