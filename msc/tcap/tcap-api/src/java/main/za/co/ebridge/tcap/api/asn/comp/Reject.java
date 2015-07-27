package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;

public interface Reject
        extends Component
{

    int _TAG = 0x04;
    boolean _TAG_PC_PRIMITIVE = false;
    int _TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;

    int _TAG_IID = 0x02;
    boolean _TAG_IID_PC_PRIMITIVE = true;
    int _TAG_IID_CLASS = Tag.CLASS_UNIVERSAL;

    Problem getProblem();

    void setProblem(Problem p);

    /**
     * @return true: local originated Reject (rejecting a bad incoming primitive by a local side) false: remote
     * originated
     * Reject (rejecting a bad outgoing primitive by a peer)
     */
    boolean isLocalOriginated();

    void setLocalOriginated(boolean p);

}
