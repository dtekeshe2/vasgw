package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.Encodable;

public interface Component
        extends Encodable
{

    int _COMPONENT_TAG = 0x0C;
    boolean _COMPONENT_TAG_PC_PRIMITIVE = false;
    int _COMPONENT_TAG_CLASS = Tag.CLASS_APPLICATION;

    // this is doubled by each interface,
    void setInvokeId(Long i);

    Long getInvokeId();

    ComponentType getType();

}
