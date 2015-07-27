package za.co.ebridge.isup.api.message.parameter;

public interface InvokingPivotReason
        extends Information
{
    void setReason(PivotReason... reasons);

    PivotReason[] getReason();
}
