package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.Tag;

public interface Result
        extends Encodable
{

    int _TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    boolean _TAG_PC_PRIMITIVE = false; // constructed....
    int _TAG = 0x02;

    void setResultType(ResultType t);

    ResultType getResultType();

}
