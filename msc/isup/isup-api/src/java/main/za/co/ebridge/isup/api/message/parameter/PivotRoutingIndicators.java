package za.co.ebridge.isup.api.message.parameter;

public interface PivotRoutingIndicators
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x7C;

    // FIXME: add C defs

    /**
     * See Q.763 3.85 Pivot routing indicators : no indication
     */
    int _PRI_NO_INDICATION = 0;
    /**
     * See Q.763 3.85 Pivot routing indicators : pivote request
     */
    int _PRI_PIVOT_REQUEST = 1;
    /**
     * See Q.763 3.85 Pivot routing indicators : cancel pivot request
     */
    int _PRI_C_PR = 2;
    /**
     * See Q.763 3.85 Pivot routing indicators : pivot request failure
     */
    int _PRI_PRF = 3;
    /**
     * See Q.763 3.85 Pivot routing indicators : interworking to redirection prohibited (backward) (national use)
     */
    int _PRI_ITRP = 4;

    byte[] getPivotRoutingIndicators();

    void setPivotRoutingIndicators(byte[] pivotRoutingIndicators);
}
