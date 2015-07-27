package za.co.ebridge.isup.api;

import za.co.ebridge.mtp.api.Mtp3UserPart;

public interface ISUPStack
{

    /**
     * Get instance of provider.
     *
     * @return
     */
    ISUPProvider getIsupProvider();

    /**
     * Stop stack and all underlying resources.
     */
    void stop();

    /**
     * Start stack and all underlying resources
     *
     * @throws IllegalStateException - if stack is already running or is not configured yet.
     * @throws StartFailedException  - if start failed for some other reason.
     */
    void start()
            throws
            IllegalStateException;

    Mtp3UserPart getMtp3UserPart();

    void setMtp3UserPart(Mtp3UserPart mtp3UserPart);

    void setCircuitManager(CircuitManager mgr);

    CircuitManager getCircuitManager();
}
