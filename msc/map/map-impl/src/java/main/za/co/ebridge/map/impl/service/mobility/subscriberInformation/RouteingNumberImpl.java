package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.RouteingNumber;
import za.co.ebridge.map.impl.primitives.TbcdString;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class RouteingNumberImpl extends TbcdString implements RouteingNumber {

    public RouteingNumberImpl() {
        super(1, 5, "RouteingNumber");
    }

    public RouteingNumberImpl(String data) {
        super(1, 5, "RouteingNumber", data);
    }

    public String getRouteingNumber() {
        return data;
    }
}
