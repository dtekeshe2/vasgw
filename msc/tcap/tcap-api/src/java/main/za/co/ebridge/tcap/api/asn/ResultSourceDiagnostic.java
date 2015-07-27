package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.Tag;

public interface ResultSourceDiagnostic
        extends Encodable
{

    // Annoying... TL[CHOICE[TL[TLV]]

    int _TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    boolean _TAG_PC_PRIMITIVE = false; // constructed....
    int _TAG = 0x03;

    // membersL CHOICE
    int _TAG_U_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    boolean _TAG_U_PC_PRIMITIVE = false; // constructed....
    int _TAG_U = 0x01;

    int _TAG_P_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    boolean _TAG_P_PC_PRIMITIVE = false; // constructed....
    int _TAG_P = 0x02;

    void setDialogServiceProviderType(DialogServiceProviderType t);

    DialogServiceProviderType getDialogServiceProviderType();

    void setDialogServiceUserType(DialogServiceUserType t);

    DialogServiceUserType getDialogServiceUserType();

}
