/* eBridge SS7 */

package za.co.ebridge.map.api;

import za.co.ebridge.map.api.dialog.ServingCheckData;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPServiceBase {

    MAPProvider getMAPProvider();

    /**
     * Creates a new Dialog. This is equivalent to issuing MAP_OPEN Service Request to MAP Provider.
     *
     * @param applicationCntx This parameter identifies the type of application context being established. If the dialogue is
     *        accepted the received application context name shall be echoed. In case of refusal of dialogue this parameter
     *        shall indicate the highest version supported.
     *
     * @param destAddress A valid SCCP address identifying the destination peer entity. As an implementation option, this
     *        parameter may also, in the indication, be implicitly associated with the service access point at which the
     *        primitive is issued.
     *
     * @param destReference This parameter is a reference which refines the identification of the called process. It may be
     *        identical to Destination address but its value is to be carried at MAP level.
     *
     * @param origAddress A valid SCCP address identifying the requestor of a MAP dialogue. As an implementation option, this
     *        parameter may also, in the request, be implicitly associated with the service access point at which the primitive
     *        is issued.
     *
     * @param origReference This parameter is a reference which refines the identification of the calling process. It may be
     *        identical to the Originating address but its value is to be carried at MAP level. Processing of the
     *        Originating-reference shall be performed according to the supplementary service descriptions and other service
     *        descriptions, e.g. operator determined barring.
     * @return
     */
    MAPDialog createNewDialog(MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn) throws MAPException;

    /**
     * Create new structured dialog with predefined local TransactionId.
     * We do not normally invoke this method. Use it only when you need this and only this local TransactionId
     * (for example if we need of recreating a Dialog for which a peer already has in memory)
     * If a Dialog with local TransactionId is already present there will be MAPException
     */
    MAPDialog createNewDialog(MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn, Long localTrId) throws MAPException;

    /**
     * Returns true if the service can perform dialogs with given ApplicationContext
     */
    ServingCheckData isServingService(MAPApplicationContext dialogApplicationContext);

    // /**
    // * Generate ApplicationContext depending on operationCode for MAP v1
    // *
    // * @param operationCode
    // * @param invoke
    // * @return ApplicationContext or null if operationCode is not supported by a service
    // */
    // MAPApplicationContext getMAPv1ApplicationContext(int operationCode, Invoke invoke);
    //
    // /**
    // * Process a component
    // */
    // void processComponent(ComponentType compType, OperationCode oc, Parameter parameter, MAPDialog mapDialog, Long
    // invokeId, Long linkedId)
    // throws MAPParsingComponentException;

    boolean isActivated();

    void acivate();

    void deactivate();
}
