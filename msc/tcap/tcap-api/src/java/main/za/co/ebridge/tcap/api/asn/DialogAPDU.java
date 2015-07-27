package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.Tag;

public interface DialogAPDU
        extends Encodable
{

    int _TAG_REQUEST = 0x00;
    int _TAG_UNIDIRECTIONAL = 0x00;
    int _TAG_RESPONSE = 0x01;
    int _TAG_ABORT = 0x04;
    int _TAG_CLASS = Tag.CLASS_APPLICATION;
    boolean _TAG_PRIMITIVE = false;

    boolean isUniDirectional();

    DialogAPDUType getType();

}
