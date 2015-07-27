package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.DialogPortion;
import za.co.ebridge.tcap.api.asn.Encodable;

public interface TCUniMessage
        extends Encodable
{

    int _TAG = 0x01;
    boolean _TAG_PC_PRIMITIVE = false;
    int _TAG_CLASS = Tag.CLASS_APPLICATION;

    // opt FIXME: make this External?
    DialogPortion getDialogPortion();

    void setDialogPortion(DialogPortion dp);

    // mandatory
    Component[] getComponent();

    void setComponent(Component[] c);
}
