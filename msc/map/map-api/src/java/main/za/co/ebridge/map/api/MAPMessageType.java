/* eBridge SS7 */

package za.co.ebridge.map.api;

/**
 *
 *
 * @author david@tekeshe.com
 *
 */
public enum MAPMessageType {

    // -- mobility
    anyTimeInterrogation_Request, anyTimeInterrogation_Response, sendAuthenticationInfo_Request, sendAuthenticationInfo_Response, updateLocation_Request, updateLocation_Response, checkIMEI_Request, checkIMEI_Response, cancelLocation_Request, cancelLocation_Response, insertSubscriberData_Request, insertSubscriberData_Response, sendIdentification_Request, sendIdentification_Response, updateGprsLocation_Request, updateGprsLocation_Response, purgeMS_Request, purgeMS_Response,

    // -- supplementary
    processUnstructuredSSRequest_Request, processUnstructuredSSRequest_Response, unstructuredSSRequest_Request, unstructuredSSRequest_Response, unstructuredSSNotify_Request, unstructuredSSNotify_Response,

    // -- sms
    sendRoutingInfoForSM_Request, sendRoutingInfoForSM_Response, reportSM_DeliveryStatus_Request, reportSM_DeliveryStatus_Response, InformServiceCentre_Request, forwardSM_Request, forwardSM_Response, moForwardSM_Request, moForwardSM_Response, mtForwardSM_Request, mtForwardSM_Response, MtForwardSM_VGCS_Request, MtForwardSM_VGCS_Response, alertServiceCentreWithoutResult_Request, alertServiceCentre_Request, alertServiceCentre_Response, noteSubscriberPresent_Request, noteSubscriberPresent_Response, readyForSM_Request, readyForSM_Response,

    // -- lms
    sendRoutingInfoForLCS_Request, sendRoutingInfoForLCS_Response, provideSubscriberLocation_Request, provideSubscriberLocation_Response, subscriberLocationReport_Request, subscriberLocationReport_Response,

    // -- call handling
    sendRoutingInfo_Request, sendRoutingInfo_Response, provideRoamingNumber_Request, privideRoamingNumber_Response;
}
