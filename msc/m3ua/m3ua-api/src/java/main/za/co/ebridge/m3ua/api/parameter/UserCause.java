package za.co.ebridge.m3ua.api.parameter;

/**
 * The Unavailability Cause and MTP3-User Identity fields,
 * associated with the Affected PC in the Affected Point Code parameter
 */
public interface UserCause
        extends Parameter
{

    /**
     * The Unavailability Cause parameter provides the reason for the unavailability of the MTP3-User.
     * The valid values for the Unavailability Cause parameter are
     * - 0 Unknown
     * - 1 Unequipped Remote User
     * - 2 Inaccessible Remote User
     */
    int getCause();

    /**
     * The MTP3-User Identity describes the specific MTP3-User that is unavailable (e.g., ISUP, SCCP, etc.).
     * Some of the valid values for the MTP3-User Identity are:
     * - 0 to 2 Reserved
     * - 3 SCCP
     * - 4 TUP
     * - 5 ISUP
     * - 6 to 8 Reserved
     * - 9 Broadband ISUP
     * - 10 Satellite ISUP
     * - 11 Reserved
     * - 12 AAL type 2 Signalling
     * - 13 Bearer Independent Call Control (BICC)
     * - 14 Gateway Control Protocol
     * - 15 Reserved
     */
    int getUser();
}
