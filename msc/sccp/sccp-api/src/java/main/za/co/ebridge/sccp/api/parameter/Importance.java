package za.co.ebridge.sccp.api.parameter;

/**
 * Importance parameter
 */
public interface Importance
        extends Parameter
{

    int PARAMETER_CODE = 0x12;

    /**
     * Gets the value of this parameter.
     *
     * @return parameter value.
     */
    int getValue();
}
