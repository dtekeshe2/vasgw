package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;
import za.co.ebridge.tcap.api.asn.comp.TCAbortMessage;

public class TCAbortMessageImpl
        implements TCAbortMessage
{

    private static final String _OCTET_STRING_ENCODE = "US-ASCII";

    private byte[] destTxId;
    private PAbortCauseType type;
    private DialogPortion dp;

    public byte[] getDestinationTransactionId()
    {

        return destTxId;
    }

    public DialogPortion getDialogPortion()
    {

        return dp;
    }

    public PAbortCauseType getPAbortCause()
    {

        return type;
    }

    public void setDestinationTransactionId(byte[] t)
    {
        this.destTxId = t;

    }

    public void setDialogPortion(DialogPortion dp)
    {
        this.dp = dp;
        this.type = null;

    }

    public void setPAbortCause(PAbortCauseType t)
    {
        this.type = t;
        this.dp = null;

    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != _TAG_DTX || localAis.getTagClass() != Tag.CLASS_APPLICATION)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding TC-Abort: Expected DestinationTransactionId, found tag: " + tag);
            this.destTxId = localAis.readOctetString();

            if (localAis.available() == 0)
                return;
            tag = localAis.readTag();
            if (localAis.getTagClass() != Tag.CLASS_APPLICATION)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding TC-Abort: DialogPortion and P-AbortCause portion must has tag class " +
                                "CLASS_APPLICATION");

            switch (tag)
            {
                case DialogPortion._TAG:
                    if (localAis.isTagPrimitive())
                        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                                "Error decoding TC-End: DialogPortion must be constructive");
                    this.dp = TcapFactory.createDialogPortion(localAis);
                    break;

                case _TAG_P:
                    // primitive?
                    this.type = PAbortCauseType.getFromInt((int) localAis.readInteger());
                    break;

                default:
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error decoding TC-Abort: bad tag while parsing DialogPortion and P-AbortCause portion: "
                                    + tag);
            }

            if (localAis.available() > 0)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null, "Error decoding TC-Abort: too mych" +
                        " data");

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "IOException while decoding " +
                    "TC-Abort: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "AsnException while decoding " +
                    "TC-Abort: "
                    + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        try
        {
            aos.writeTag(Tag.CLASS_APPLICATION, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            aos.writeOctetString(Tag.CLASS_APPLICATION, _TAG_DTX, this.destTxId);

            if (this.type != null)
                aos.writeInteger(Tag.CLASS_APPLICATION, _TAG_P, this.type.getType());
            else if (this.dp != null)
                this.dp.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding TC-Abort: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding TC-Abort: " + e.getMessage(), e);
        }

    }

}
