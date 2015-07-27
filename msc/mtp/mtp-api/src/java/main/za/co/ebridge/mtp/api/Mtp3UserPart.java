package za.co.ebridge.mtp.api;

import java.io.IOException;

public interface Mtp3UserPart
{

    /**
     * Add {@link Mtp3UserPartListener}
     */
    void addMtp3UserPartListener(Mtp3UserPartListener listener);

    /**
     * Remove {@link Mtp3UserPartListener}
     */
    void removeMtp3UserPartListener(Mtp3UserPartListener listener);

    /**
     * @return PointCodeFormat
     */
    RoutingLabelFormat getRoutingLabelFormat();

    /**
     * Set PointCodeFormat
     */
    void setRoutingLabelFormat(RoutingLabelFormat routingLabelFormat);

    /**
     * Get the Mtp3TransferPrimitiveFactory
     */
    Mtp3TransferPrimitiveFactory getMtp3TransferPrimitiveFactory();

    /**
     * Return the maximum data field length of the MTP-TRANSFER message to the DPC
     */
    int getMaxUserDataLength(int dpc);

    /**
     * If message delivering failed: MTP-PAUSE or MTR-STATUS indication will be sent
     */
    void sendMessage(Mtp3TransferPrimitive msg) throws IOException;

    /**
     * If set to true, lowest bit of SLS is used for load balancing between Linkset else highest bit of SLS is used.
     */
    void setUseLsbForLinksetSelection(boolean useLsbForLinksetSelection);

    /**
     * @return true if lowest bit of SLS is used for load balancing between Linkset else returns false
     */
    boolean isUseLsbForLinksetSelection();

}
