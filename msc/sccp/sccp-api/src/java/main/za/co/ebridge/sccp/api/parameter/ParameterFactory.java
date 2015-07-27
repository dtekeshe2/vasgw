package za.co.ebridge.sccp.api.parameter;

import java.io.Serializable;

import za.co.ebridge.sccp.api.indicator.RoutingIndicator;

public interface ParameterFactory
        extends Serializable
{

    /**
     * Create SccpAddress parameter
     *
     * @param ri
     * @param dpc
     * @param gt
     * @param ssn
     * @return
     */
    SccpAddress createSccpAddress(RoutingIndicator ri, int dpc, GlobalTitle gt, int ssn);

    /**
     * Create Importance parameter.
     *
     * @param value the value of this parameter
     * @return parameter
     */
    Importance createImportance(int value);

    /**
     * Create hop counter parameter
     */
    HopCounter createHopCounter(int hopCount);

    // ReturnCause createReturnCause(int cause);
    // /**
    // * Creates protocol class parameter.
    // *
    // * @param value the value of the parameter
    // * @return parameter
    // */
    // ProtocolClass createProtocolClass(int pClass, boolean returnMessageOnError);
    // /**
    // * Create segemntation parameter
    // *
    // * @return parameter.
    // */
    // Segmentation createSegmentation();
}
