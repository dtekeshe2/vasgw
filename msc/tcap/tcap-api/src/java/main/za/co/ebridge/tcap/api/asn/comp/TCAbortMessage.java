package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.DialogPortion;
import za.co.ebridge.tcap.api.asn.Encodable;

/**
 * This message represents Abort messages (P and U). According to Q.773:<br>
 * <p/>
 * <pre>
 * Abort ::= SEQUENCE {
 * dtid DestTransactionID,
 * reason CHOICE
 * { p-abortCause P-AbortCause,
 * u-abortCause DialoguePortion } OPTIONAL
 * }
 * </pre>
 * <p/>
 * Cryptic ASN say:
 * <ul>
 * <li><b>TC-U-Abort</b> - if abort APDU is present</li>
 * <li><b>TC-P-Abort</b> - if P-Abort-Cause is present</li>
 * </ul>
 */
public interface TCAbortMessage
        extends Encodable
{

    int _TAG = 0x07;
    boolean _TAG_PC_PRIMITIVE = false;
    int _TAG_CLASS = Tag.CLASS_APPLICATION;

    int _TAG_P = 0x0A;
    boolean _TAG_P_PC_PRIMITIVE = true;
    int _TAG_CLASS_P = Tag.CLASS_APPLICATION;

    int _TAG_DTX = 0x09;
    boolean _TAG_DTX_PC_PRIMITIVE = true;
    int _TAG_CLASS_DTX = Tag.CLASS_APPLICATION;

    // mandatory
    byte[] getDestinationTransactionId();

    void setDestinationTransactionId(byte[] t);

    // optionals
    PAbortCauseType getPAbortCause();

    void setPAbortCause(PAbortCauseType t);

    DialogPortion getDialogPortion();

    void setDialogPortion(DialogPortion dp);

    // External getUserDefinedReason();
    //
    // void setUserDefinedReason(External dp);
}
