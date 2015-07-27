package za.co.ebridge.isup.api.message.parameter;

public interface CircuitGroupSuperVisionMessageType
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x15;
    // FIXME: V->v

    /**
     * See Q.763 3.13 Circuit group supervision message type indicator maintenance oriented
     */
    int _CIRCUIT_GROUP_SMTIMO = 0;
    /**
     * See Q.763 3.13 Circuit group supervision message type indicator hardware failure oriented
     */
    int _CIRCUIT_GROUP_SMTIHFO = 1;

    int getCircuitGroupSuperVisionMessageTypeIndicator();

    void setCircuitGroupSuperVisionMessageTypeIndicator(int CircuitGroupSuperVisionMessageTypeIndicator);
}
