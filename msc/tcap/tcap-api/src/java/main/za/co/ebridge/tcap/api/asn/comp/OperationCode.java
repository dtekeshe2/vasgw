package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.Encodable;

public interface OperationCode
        extends Encodable
{

    int _TAG_LOCAL = Tag.INTEGER;
    int _TAG_GLOBAL = Tag.OBJECT_IDENTIFIER;
    int _TAG_CLASS = Tag.CLASS_UNIVERSAL;
    boolean _TAG_PRIMITIVE = true;

    // it integer, but two different tags denotate this.

    // void setOperationType(OperationCodeType t);
    OperationCodeType getOperationType();

    void setLocalOperationCode(Long localOperationCode);

    void setGlobalOperationCode(long[] globalOperationCode);

    Long getLocalOperationCode();

    long[] getGlobalOperationCode();

}
