package za.co.ebridge.sccp.api.message;

import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.ProtocolClass;
import za.co.ebridge.sccp.api.parameter.Segmentation;

/**
 * This interface represents a SCCP message for connectionless data transfer (UDT, XUDT and LUDT)
 */
public interface SccpDataMessage
        extends SccpAddressedMessage
{

    ProtocolClass getProtocolClass();

    HopCounter getHopCounter();

    byte[] getData();

    Segmentation getSegmentation();

    Importance getImportance();

    void setProtocolClass(ProtocolClass v);

    void setHopCounter(HopCounter hopCounter);

    void setData(byte[] data);

    void setImportance(Importance p);

}
