package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.DialogPortion;
import za.co.ebridge.tcap.api.asn.Encodable;

public interface TCBeginMessage
        extends Encodable
{

    int _TAG = 0x02;
    boolean _TAG_PC_PRIMITIVE = false;
    int _TAG_CLASS = Tag.CLASS_APPLICATION;

    int _TAG_OTX = 0x08;
    boolean _TAG_OTX_PC_PRIMITIVE = true;
    int _TAG_CLASS_OTX = Tag.CLASS_APPLICATION;

    // mandatory
    byte[] getOriginatingTransactionId();

    void setOriginatingTransactionId(byte[] t);

    // opt FIXME: make this External?
    DialogPortion getDialogPortion();

    void setDialogPortion(DialogPortion dp);

    // opt
    Component[] getComponent();

    void setComponent(Component[] c);

}
