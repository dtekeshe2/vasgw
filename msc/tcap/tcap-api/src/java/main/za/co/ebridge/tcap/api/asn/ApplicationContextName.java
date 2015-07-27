package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.Tag;

public interface ApplicationContextName
        extends Encodable
{

    // its type of OID

    int _TAG = 0x01;
    int _TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    boolean _TAG_PC_PRIMITIVE = false;

    /**
     * @return the oid
     */
    long[] getOid();

    /**
     * @param oid the oid to set
     */
    void setOid(long[] oid);
}
