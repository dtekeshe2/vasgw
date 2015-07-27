package za.co.ebridge.isup.api.message.parameter;

public interface CCSS
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x4B;

    /**
     * See Q.763 3.83 CCNR possible indicator : not possible
     */
    boolean _NOT_CCSS_CALL = false;
    /**
     * See Q.763 3.83 CCNR possible indicator : possible
     */
    boolean _CCSS_CALL = true;

    boolean isCcssCall();

    void setCcssCall(boolean ccssCall);
}
