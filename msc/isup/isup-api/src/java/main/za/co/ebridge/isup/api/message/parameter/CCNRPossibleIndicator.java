package za.co.ebridge.isup.api.message.parameter;

public interface CCNRPossibleIndicator
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x7A;

    /**
     * See Q.763 3.83 CCNR possible indicator : not possible
     */
    boolean _CCNR_PI_NOT_POSSIBLE = false;
    /**
     * See Q.763 3.83 CCNR possible indicator : possible
     */
    boolean _CCNR_PI_POSSIBLE = true;

    boolean isCcnrPossible();

    void setCcnrPossible(boolean ccnrPossible);
}
