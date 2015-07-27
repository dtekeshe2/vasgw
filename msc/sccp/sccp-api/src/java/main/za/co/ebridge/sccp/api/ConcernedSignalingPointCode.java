package za.co.ebridge.sccp.api;

/**
 * Concerned signaling point codes define a DPC which will be noticed when local SSN is registered (SSA messages) or
 * unregistered (SSP messages)
 */
public interface ConcernedSignalingPointCode
{

    /**
     * Point code to which SSA or SSP message is to be sent
     *
     * @return
     */
    int getRemoteSpc();
}
