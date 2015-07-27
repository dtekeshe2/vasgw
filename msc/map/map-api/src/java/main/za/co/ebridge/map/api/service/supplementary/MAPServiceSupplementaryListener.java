/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.MAPServiceListener;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPServiceSupplementaryListener extends MAPServiceListener {

    void onProcessUnstructuredSSRequest(ProcessUnstructuredSSRequest procUnstrReqInd);

    void onProcessUnstructuredSSResponse(ProcessUnstructuredSSResponse procUnstrResInd);

    void onUnstructuredSSRequest(UnstructuredSSRequest unstrReqInd);

    void onUnstructuredSSResponse(UnstructuredSSResponse unstrResInd);

    void onUnstructuredSSNotifyRequest(UnstructuredSSNotifyRequest unstrNotifyInd);

    void onUnstructuredSSNotifyResponse(UnstructuredSSNotifyResponse unstrNotifyInd);
}