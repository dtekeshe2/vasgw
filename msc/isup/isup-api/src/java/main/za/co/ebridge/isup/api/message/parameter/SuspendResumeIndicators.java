package za.co.ebridge.isup.api.message.parameter;

public interface SuspendResumeIndicators
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x22;

    // FIXME: add C defs

    /**
     * See Q.763 3.52 Suspend/resume indicator : ISDN subscriber initiated
     */
    boolean _SRI_ISDN_SI = false;

    /**
     * See Q.763 3.52 Suspend/resume indicator : network initiated
     */
    boolean _SRI_NI = true;

    boolean isSuspendResumeIndicator();

    void setSuspendResumeIndicator(boolean suspendResumeIndicator);

}
