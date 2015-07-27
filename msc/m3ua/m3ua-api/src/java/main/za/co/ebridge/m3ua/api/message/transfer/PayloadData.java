package za.co.ebridge.m3ua.api.message.transfer;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.CorrelationId;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.ProtocolData;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

public interface PayloadData
        extends M3UAMessage
{
    NetworkAppearance getNetworkAppearance();

    void setNetworkAppearance(NetworkAppearance p);

    RoutingContext getRoutingContext();

    void setRoutingContext(RoutingContext p);

    ProtocolData getData();

    void setData(ProtocolData p);

    CorrelationId getCorrelationId();

    void setCorrelationId(CorrelationId corrId);

}
