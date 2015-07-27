/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import za.co.ebridge.map.api.MAPServiceListener;

/**
 * @author amit bhayani
 *
 */
public interface MAPServiceLsmListener extends MAPServiceListener {

    void onProvideSubscriberLocationRequest(ProvideSubscriberLocationRequest provideSubscriberLocationRequestIndication);

    void onProvideSubscriberLocationResponse(
            ProvideSubscriberLocationResponse provideSubscriberLocationResponseIndication);

    void onSubscriberLocationReportRequest(SubscriberLocationReportRequest subscriberLocationReportRequestIndication);

    void onSubscriberLocationReportResponse(SubscriberLocationReportResponse subscriberLocationReportResponseIndication);

    void onSendRoutingInfoForLCSRequest(SendRoutingInfoForLCSRequest sendRoutingInforForLCSRequestIndication);

    void onSendRoutingInfoForLCSResponse(SendRoutingInfoForLCSResponse sendRoutingInforForLCSResponseIndication);
}
