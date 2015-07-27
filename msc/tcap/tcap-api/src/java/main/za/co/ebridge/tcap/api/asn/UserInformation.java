package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.asn.impl.Tag;

public interface UserInformation
        extends Encodable
{

    int _TAG = 0x1E;
    int _TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    boolean _TAG_PC_PRIMITIVE = false;

    byte[] getEncodeType()
            throws
            AsnException;

    void setEncodeType(byte[] data);

    BitSetStrictLength getEncodeBitStringType()
            throws
            AsnException;

    void setEncodeBitStringType(BitSetStrictLength data);

    /**
     * @return the oid
     */
    boolean isOid();

    /**
     * @param oid the oid to set
     */
    void setOid(boolean oid);

    /**
     * @return the integer
     */
    boolean isInteger();

    /**
     * @param integer the integer to set
     */
    void setInteger(boolean integer);

    /**
     * @return the objDescriptor
     */
    boolean isObjDescriptor();

    /**
     * @param objDescriptor the objDescriptor to set
     */
    void setObjDescriptor(boolean objDescriptor);

    /**
     * @return the oidValue
     */
    long[] getOidValue();

    /**
     * @param oidValue the oidValue to set
     */
    void setOidValue(long[] oidValue);

    /**
     * @return the integerValue
     */
    long getIndirectReference();

    /**
     * @param integerValue the integerValue to set
     */
    void setIndirectReference(long indirectReference);

    /**
     * @return the objDescriptorValue
     */
    String getObjDescriptorValue();

    /**
     * @param objDescriptorValue the objDescriptorValue to set
     */
    void setObjDescriptorValue(String objDescriptorValue);

    /**
     * @return the asn
     */
    boolean isAsn();

    /**
     * @param asn the asn to set
     */
    void setAsn(boolean asn);

    /**
     * @return the octet
     */
    boolean isOctet();

    /**
     * @param octet the octet to set
     */
    void setOctet(boolean octet);

    /**
     * @return the arbitrary
     */
    boolean isArbitrary();

    /**
     * @param arbitrary the arbitrary to set
     */
    void setArbitrary(boolean arbitrary);

}
