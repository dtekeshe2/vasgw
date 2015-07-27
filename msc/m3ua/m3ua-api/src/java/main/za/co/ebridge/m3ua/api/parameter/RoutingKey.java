package za.co.ebridge.m3ua.api.parameter;

/**
 * The routing key is used to associate traffic with the proper application server and ASP.
 */
public interface RoutingKey
        extends Parameter
{

    LocalRKIdentifier getLocalRKIdentifier();

    RoutingContext getRoutingContext();

    TrafficModeType getTrafficModeType();

    NetworkAppearance getNetworkAppearance();

    DestinationPointCode[] getDestinationPointCodes();

    ServiceIndicators[] getServiceIndicators();

    OPCList[] getOPCLists();

}
