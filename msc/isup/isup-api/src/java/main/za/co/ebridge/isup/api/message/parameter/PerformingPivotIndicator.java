package za.co.ebridge.isup.api.message.parameter;

public interface PerformingPivotIndicator
        extends Information
{
    void setReason(PivotReason... reasons);

    PivotReason[] getReason();
}
