package za.co.ebridge.m3ua.api.parameter;

/**
 * The Deregistration Result parameter contains the deregistration status for a single Routing Context in a
 * DEREG REQ message.
 * The number of results in a single DEREG RSP message MAY be anywhere from one to the total number of number
 * of Routing Context values found in the corresponding DEREG REQ message.
 *
 * Where multiple DEREG RSP messages are used in reply to DEREG REQ message,
 * a specific result SHOULD be in only one DEREG RSP message.
 */
public interface DeregistrationResult
        extends Parameter
{
    RoutingContext getRoutingContext();

    DeregistrationStatus getDeregistrationStatus();
}
