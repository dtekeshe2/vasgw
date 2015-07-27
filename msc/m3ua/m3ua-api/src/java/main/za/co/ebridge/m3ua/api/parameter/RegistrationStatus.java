package za.co.ebridge.m3ua.api.parameter;

/**
 * This is used to indicate whether or not a registration was successful.
 * - 0 Successfully Registered
 * - 1 Error - Unknown
 * - 2 Error - Invalid DPC
 * - 3 Error - Invalid Network Appearance
 * - 4 Error - Invalid Routing Key
 * - 5 Error - Permission Denied
 * - 6 Error - Cannot Support Unique Routing
 * - 7 Error - Routing Key not Currently Provisioned
 * - 8 Error - Insufficient Resources
 * - 9 Error - Unsupported RK parameter Field
 * - 10 Error - Unsupported/Invalid Traffic Handling Mode
 * - 11 Error - Routing Key Change Refused
 * - 12 Error - Routing Key Already Registered
 */
public interface RegistrationStatus
        extends Parameter
{
    int getStatus();
}
