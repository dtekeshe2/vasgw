package za.co.ebridge.isup.api.message.parameter;

import za.co.ebridge.asn.impl.Tag;

import java.io.Serializable;

/**
 * Base interface for operations carried in {@link RemoteOperations}
 */
public interface RemoteOperation
        extends Serializable
{
    //I wonder why this is different then regular ops from TCAP...
    int _COMPONENT_TAG = 0x0C;
    boolean _COMPONENT_TAG_PC_PRIMITIVE = false;
    int _COMPONENT_TAG_CLASS = Tag.CLASS_APPLICATION;

    void setInvokeId(Long i);

    Long getInvokeId();

    OperationType getType();

    public enum OperationType
    {

        Invoke, ReturnResult, Reject, ReturnError;
    }
}
