package za.co.ebridge.m3ua.api.parameter;

/**
 * The routing context is used for routing of a message
 * and is employed by either the signaling gateway or the ASP when determining to which association the message
 * is to be sent.
 * Think of this as an index to registered routing keys.
 */
public interface RoutingContext
        extends Parameter
{
    long[] getRoutingContexts();
}
