package za.co.ebridge.m3ua.api.parameter;

/**
 * The Deregistration Result Status field indicates the success or the reason for failure of the deregistration.

 * Its values may be:
 * - 0 Successfully Deregistered
 * - 1 Error - Unknown
 * - 2 Error - Invalid Routing Context
 * - 3 Error - Permission Denied
 * - 4 Error - Not Registered
 * - 5 Error - ASP Currently Active for Routing Context
 */
public interface DeregistrationStatus
        extends Parameter
{
    int getStatus();
}
