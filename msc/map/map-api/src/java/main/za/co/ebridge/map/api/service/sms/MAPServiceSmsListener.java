/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.MAPServiceListener;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPServiceSmsListener extends MAPServiceListener {

    void onForwardShortMessageRequest(ForwardShortMessageRequest forwSmInd);

    void onForwardShortMessageResponse(ForwardShortMessageResponse forwSmRespInd);

    void onMoForwardShortMessageRequest(MoForwardShortMessageRequest moForwSmInd);

    void onMoForwardShortMessageResponse(MoForwardShortMessageResponse moForwSmRespInd);

    void onMtForwardShortMessageRequest(MtForwardShortMessageRequest mtForwSmInd);

    void onMtForwardShortMessageResponse(MtForwardShortMessageResponse mtForwSmRespInd);

    void onSendRoutingInfoForSMRequest(SendRoutingInfoForSMRequest sendRoutingInfoForSMInd);

    void onSendRoutingInfoForSMResponse(SendRoutingInfoForSMResponse sendRoutingInfoForSMRespInd);

    void onReportSMDeliveryStatusRequest(ReportSMDeliveryStatusRequest reportSMDeliveryStatusInd);

    void onReportSMDeliveryStatusResponse(ReportSMDeliveryStatusResponse reportSMDeliveryStatusRespInd);

    void onInformServiceCentreRequest(InformServiceCentreRequest informServiceCentreInd);

    void onAlertServiceCentreRequest(AlertServiceCentreRequest alertServiceCentreInd);

    void onAlertServiceCentreResponse(AlertServiceCentreResponse alertServiceCentreInd);

}
