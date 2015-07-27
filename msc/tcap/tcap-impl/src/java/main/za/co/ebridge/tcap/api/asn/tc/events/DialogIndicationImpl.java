package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.api.tc.dialog.events.DialogIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.asn.comp.Component;

public abstract class DialogIndicationImpl
        implements DialogIndication
{

    private Component[] components;
    private Dialog dialog;
    private Byte qos;
    private EventType type;

    protected DialogIndicationImpl(EventType type)
    {
        super();
        this.type = type;
    }

    /**
     * @return the components
     */
    public Component[] getComponents()
    {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(Component[] components)
    {
        this.components = components;
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

    /**
     * @return the qos
     */
    public Byte getQos()
    {
        return qos;
    }

    /**
     * @param qos the qos to set
     */
    public void setQos(Byte qos)
    {
        this.qos = qos;
    }

}
