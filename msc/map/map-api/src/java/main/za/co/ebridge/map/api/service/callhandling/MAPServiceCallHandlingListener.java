/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.MAPServiceListener;

/*
 *
 * @author cristian veliscu
 *
 */
public interface MAPServiceCallHandlingListener extends MAPServiceListener {
     void onSendRoutingInformationRequest(SendRoutingInformationRequest request);

     void onSendRoutingInformationResponse(SendRoutingInformationResponse response);

     void onProvideRoamingNumberRequest(ProvideRoamingNumberRequest request);

     void onProvideRoamingNumberResponse(ProvideRoamingNumberResponse response);
}