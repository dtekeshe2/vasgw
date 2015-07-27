package za.co.ebridge.isup.api.message.parameter;

import za.co.ebridge.asn.impl.Tag;

import java.io.Serializable;

public interface OperationCode
        extends Serializable
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
