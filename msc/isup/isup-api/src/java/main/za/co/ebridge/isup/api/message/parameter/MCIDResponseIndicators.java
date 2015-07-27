package za.co.ebridge.isup.api.message.parameter;

public interface MCIDResponseIndicators
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x3C;

    // FIXME: its byte[], there may be more indicators than one byte
    /**
     * Flag that indicates that information is requested
     */
    boolean _INDICATOR_PROVIDED = true;

    /**
     * Flag that indicates that information is not requested
     */
    boolean _INDICATOR_NOT_PROVIDED = false;

    boolean isMcidIncludedIndicator();

    void setMcidIncludedIndicator(boolean mcidIncludedIndicator);

    boolean isHoldingProvidedIndicator();

    void setHoldingProvidedIndicator(boolean holdingProvidedIndicator);
}
