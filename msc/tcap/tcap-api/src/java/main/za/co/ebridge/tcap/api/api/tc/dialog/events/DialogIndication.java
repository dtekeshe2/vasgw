package za.co.ebridge.tcap.api.api.tc.dialog.events;

import java.io.Serializable;

import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.Component;

public interface DialogIndication
        extends Serializable
{

    /**
     * Return dialog for this indication
     *
     * @return
     */
    Dialog getDialog();

    /**
     * get components if present, if there are none, it will return null;
     *
     * @return
     */
    Component[] getComponents();

    EventType getType();

    Byte getQos();
}
