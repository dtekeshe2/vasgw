package za.co.ebridge.m3ua.api.parameter;

/**
 * The Registration Result parameter contains the registration result for a single Routing Key in an REG REQ message.
 */
public interface RegistrationResult
        extends Parameter
{
    LocalRKIdentifier getLocalRKIdentifier();

    RegistrationStatus getRegistrationStatus();

    RoutingContext getRoutingContext();
}
