package za.co.ebridge.tcap.api.asn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.Component;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;
import za.co.ebridge.tcap.api.asn.comp.TCBeginMessage;

public class TCBeginMessageImpl
        implements TCBeginMessage
{

    private static final String _OCTET_STRING_ENCODE = "US-ASCII";
    // mandatory
    private byte[] originatingTransactionId;
    // opt
    private DialogPortion dp;
    // opt
    private Component[] component;

    public Component[] getComponent()
    {

        return this.component;
    }

    public DialogPortion getDialogPortion()
    {

        return this.dp;
    }

    public byte[] getOriginatingTransactionId()
    {

        return this.originatingTransactionId;
    }

    public void setComponent(Component[] c)
    {
        this.component = c;

    }

    public void setDialogPortion(DialogPortion dp)
    {
        this.dp = dp;

    }

    public void setOriginatingTransactionId(byte[] t)
    {
        this.originatingTransactionId = t;

    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != _TAG_OTX || localAis.getTagClass() != Tag.CLASS_APPLICATION)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding TC-Begin: Expected OriginatingTransactionId, found tag: " + tag);
            this.originatingTransactionId = localAis.readOctetString();

            while (true)
            {
                if (localAis.available() == 0)
                    return;

                tag = localAis.readTag();
                if (localAis.isTagPrimitive() || localAis.getTagClass() != Tag.CLASS_APPLICATION)
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error decoding TC-Begin: DialogPortion and Component portion must be constructive and " +
                                    "has tag class CLASS_APPLICATION");

                switch (tag)
                {
                    case DialogPortion._TAG:
                        this.dp = TcapFactory.createDialogPortion(localAis);
                        break;

                    case Component._COMPONENT_TAG:
                        AsnInputStream compAis = localAis.readSequenceStream();
                        List<Component> cps = new ArrayList<>();
                        // its iterator :)
                        while (compAis.available() > 0)
                        {
                            Component c = TcapFactory.createComponent(compAis);
                            if (c == null)
                            {
                                break;
                            }
                            cps.add(c);
                        }

                        this.component = new Component[cps.size()];
                        this.component = cps.toArray(this.component);
                        break;

                    default:
                        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                                "Error decoding TC-Begin: DialogPortion and Componebt parsing: bad tag - " + tag);
                }
            }

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "IOException while decoding " +
                    "TC-Begin: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "AsnException while decoding " +
                    "TC-Begin: "
                    + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        // if (this.originatingTransactionId == null)
        // throw new ParseException("Error encoding TC-Begin: originatingTransactionId must not be null");

        try
        {
            aos.writeTag(Tag.CLASS_APPLICATION, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            // Utils.writeTransactionId(aos, this.originatingTransactionId, Tag.CLASS_APPLICATION, _TAG_OTX);
            aos.writeOctetString(Tag.CLASS_APPLICATION, _TAG_OTX, this.originatingTransactionId);

            if (this.dp != null)
                this.dp.encode(aos);

            if (component != null)
            {
                aos.writeTag(Tag.CLASS_APPLICATION, false, Component._COMPONENT_TAG);
                int pos2 = aos.StartContentDefiniteLength();
                for (Component c : this.component)
                {
                    c.encode(aos);
                }
                aos.FinalizeContent(pos2);
            }

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding TC-Begin: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding TC-Begin: " + e.getMessage(), e);
        }

    }

}
