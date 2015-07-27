package za.co.ebridge.sccp.api.message;

import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.ReturnCause;
import za.co.ebridge.sccp.api.parameter.Segmentation;

/**
 * This interface represents SCCP a connectionless notice message (UDTS, XUDTS and LUDTS)
 */
public interface SccpNoticeMessage
        extends SccpAddressedMessage
{

    ReturnCause getReturnCause();

    byte[] getData();

    Segmentation getSegmentation();

    Importance getImportance();

    void setReturnCause(ReturnCause rc);

    void setData(byte[] data);

    void setImportance(Importance p);

}
