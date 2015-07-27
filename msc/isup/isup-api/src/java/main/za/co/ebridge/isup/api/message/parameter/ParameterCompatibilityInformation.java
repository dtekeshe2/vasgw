package za.co.ebridge.isup.api.message.parameter;

public interface ParameterCompatibilityInformation
        extends ISUPParameter
{
    //TODO: this is not 100% correct, there might be more indicators than 1-2b...
    int _PARAMETER_CODE = 0x39;

    void setParameterCompatibilityInstructionIndicators(ParameterCompatibilityInstructionIndicators...
            compatibilityInstructionIndicators);

    ParameterCompatibilityInstructionIndicators[] getParameterCompatibilityInstructionIndicators();
}
