/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility;

import za.co.ebridge.map.api.MAPServiceListener;
import za.co.ebridge.map.api.service.mobility.authentication.SendAuthenticationInfoRequest;
import za.co.ebridge.map.api.service.mobility.authentication.SendAuthenticationInfoResponse;
import za.co.ebridge.map.api.service.mobility.imei.CheckImeiRequest;
import za.co.ebridge.map.api.service.mobility.imei.CheckImeiResponse;
import za.co.ebridge.map.api.service.mobility.locationManagement.CancelLocationRequest;
import za.co.ebridge.map.api.service.mobility.locationManagement.CancelLocationResponse;
import za.co.ebridge.map.api.service.mobility.locationManagement.PurgeMSRequest;
import za.co.ebridge.map.api.service.mobility.locationManagement.PurgeMSResponse;
import za.co.ebridge.map.api.service.mobility.locationManagement.SendIdentificationRequest;
import za.co.ebridge.map.api.service.mobility.locationManagement.SendIdentificationResponse;
import za.co.ebridge.map.api.service.mobility.locationManagement.UpdateGprsLocationRequest;
import za.co.ebridge.map.api.service.mobility.locationManagement.UpdateGprsLocationResponse;
import za.co.ebridge.map.api.service.mobility.locationManagement.UpdateLocationRequest;
import za.co.ebridge.map.api.service.mobility.locationManagement.UpdateLocationResponse;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.AnyTimeInterrogationRequest;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.AnyTimeInterrogationResponse;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.InsertSubscriberDataRequest;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.InsertSubscriberDataResponse;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPServiceMobilityListener extends MAPServiceListener {

    // -- Location Management Service
    void onUpdateLocationRequest(UpdateLocationRequest ind);

    void onUpdateLocationResponse(UpdateLocationResponse ind);

    void onCancelLocationRequest(CancelLocationRequest request);

    void onCancelLocationResponse(CancelLocationResponse response);

    void onSendIdentificationRequest(SendIdentificationRequest request);

    void onSendIdentificationResponse(SendIdentificationResponse response);

    void onUpdateGprsLocationRequest(UpdateGprsLocationRequest request);

    void onUpdateGprsLocationResponse(UpdateGprsLocationResponse response);

    void onPurgeMSRequest(PurgeMSRequest request);

    void onPurgeMSResponse(PurgeMSResponse response);

    // -- Authentication management services
    void onSendAuthenticationInfoRequest(SendAuthenticationInfoRequest ind);

    void onSendAuthenticationInfoResponse(SendAuthenticationInfoResponse ind);

    // -- Subscriber Information services
    void onAnyTimeInterrogationRequest(AnyTimeInterrogationRequest request);

    void onAnyTimeInterrogationResponse(AnyTimeInterrogationResponse response);

    // -- Subscriber Management services
    void onInsertSubscriberDataRequest(InsertSubscriberDataRequest request);

    void onInsertSubscriberDataResponse(InsertSubscriberDataResponse request);

    // -- International mobile equipment identities management services
    void onCheckImeiRequest(CheckImeiRequest request);

    void onCheckImeiResponse(CheckImeiResponse response);

}
