/* eBridge SS7 */

package za.co.ebridge.map.api;

import za.co.ebridge.map.api.errors.MAPErrorMessage;
import za.co.ebridge.tcap.api.asn.comp.Problem;

/**
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public interface MAPServiceListener {
    /**
     * Invoked when TC-U-ERROR primitive is received from the other peer
     *
     * @param mapDialog
     * @param invokeId
     * @param mapErrorMessage
     */
    void onErrorComponent(MAPDialog mapDialog, Long invokeId, MAPErrorMessage mapErrorMessage);

    /**
     * Invoked when the provider error when parsing the response
     *
     * @param mapDialog
     * @param invokeId
     * @param providerError
     */
    // void onProviderErrorComponent(MAPDialog mapDialog, Long invokeId, MAPProviderError providerError);

    /**
     * Invoked when TC-U-REJECT primitive is received from the other peer
     *
     * @param mapDialog
     * @param invokeId This parameter is optional and may be the null
     * @param problem
     * @param isLocalOriginated true: local originated Reject (rejecting a bad incoming primitive by a local side) false: remote
     *        originated Reject (rejecting a bad outgoing primitive by a peer)
     */
    void onRejectComponent(MAPDialog mapDialog, Long invokeId, Problem problem, boolean isLocalOriginated);

    /**
     * Invoked when no answer from the other peer for a long time - for sending the a reject for the Invoke
     *
     * @param mapDialog
     * @param invokeId
     */
    void onInvokeTimeout(MAPDialog mapDialog, Long invokeId);

    /**
     * Called when any MAPMessage received (Invoke, ReturnResult, ReturnResultLast components) This component will be invoked
     * before the special service component
     *
     * @param mapDialog
     */
    void onMAPMessage(MAPMessage mapMessage);

}
