package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.Encodable;

public interface ErrorCode
        extends Encodable
{

    // it contains valid params for error....

    int _TAG_LOCAL = Tag.INTEGER;
    int _TAG_GLOBAL = Tag.OBJECT_IDENTIFIER;
    int _TAG_CLASS = Tag.CLASS_UNIVERSAL;
    boolean _TAG_PRIMITIVE = true;

    // public void setErrorType(ErrorCodeType t);
    ErrorCodeType getErrorType();

    void setLocalErrorCode(Long localErrorCode);

    void setGlobalErrorCode(long[] globalErrorCode);

    Long getLocalErrorCode();

    long[] getGlobalErrorCode();

}
