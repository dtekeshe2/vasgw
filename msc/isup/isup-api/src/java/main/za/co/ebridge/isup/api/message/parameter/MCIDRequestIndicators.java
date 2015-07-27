package za.co.ebridge.isup.api.message.parameter;

public interface MCIDRequestIndicators
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x3B;

    // FIXME: its byte[], there may be more indicators than one byte

    /**
     * Flag that indicates that information is requested
     */
    boolean _INDICATOR_REQUESTED = true;

    /**
     * Flag that indicates that information is not requested
     */
    boolean _INDICATOR_NOT_REQUESTED = false;

    boolean isMcidRequestIndicator();

    void setMcidRequestIndicator(boolean mcidRequestIndicator);

    boolean isHoldingIndicator();

    void setHoldingIndicator(boolean holdingIndicator);

}
