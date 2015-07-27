package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;

/**
 * Super interface for Returns.
 */
public interface Return
        extends Component
{

    int _TAG_IID = 0x02;
    boolean _TAG_IID_PC_PRIMITIVE = true;
    int _TAG_IID_CLASS = Tag.CLASS_UNIVERSAL;

    // opt all
    void setOperationCode(OperationCode oc);

    OperationCode getOperationCode();

    void setParameter(Parameter p);

    Parameter getParameter();

}
