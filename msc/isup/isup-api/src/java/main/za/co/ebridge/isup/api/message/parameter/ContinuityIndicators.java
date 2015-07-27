package za.co.ebridge.isup.api.message.parameter;

public interface ContinuityIndicators
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x10;

    /**
     * See Q.763 3.18
     */
    boolean _CONTINUITY_CHECK_FAILED = false;

    /**
     * See Q.763 3.18
     */
    boolean _CONTINUITY_CHECK_SUCCESSFUL = true;

    boolean isContinuityCheck();

    void setContinuityCheck(boolean continuityCheck);
}
