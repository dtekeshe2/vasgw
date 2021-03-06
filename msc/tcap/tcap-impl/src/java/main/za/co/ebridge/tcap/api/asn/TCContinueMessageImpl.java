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
import za.co.ebridge.tcap.api.asn.comp.TCContinueMessage;
import org.apache.log4j.Logger;

public class TCContinueMessageImpl
        implements TCContinueMessage
{

    private static final Logger logger = Logger.getLogger(TCContinueMessageImpl.class);

    private static final String _OCTET_STRING_ENCODE = "US-ASCII";

    // mandatory
    private byte[] originatingTransactionId;
    private byte[] destinationTransactionId;
    // opt
    private DialogPortion dp;
    // opt
    private Component[] component;

    public Component[] getComponent()
    {

        return this.component;
    }

    public byte[] getDestinationTransactionId()
    {

        return this.destinationTransactionId;
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

    public void setDestinationTransactionId(byte[] t)
    {
        this.destinationTransactionId = t;

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
                        "Error decoding TC-Continue: Expected OriginatingTransactionId, found tag: " + tag);
            this.originatingTransactionId = localAis.readOctetString();

            tag = localAis.readTag();
            if (tag != _TAG_DTX || localAis.getTagClass() != Tag.CLASS_APPLICATION)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding TC-Continue: Expected DestinationTransactionId, found tag: " + tag);
            this.destinationTransactionId = localAis.readOctetString();

            if (localAis.available() == 0)
                return;

            while (true)
            {
                if (localAis.available() == 0)
                    return;

                tag = localAis.readTag();
                if (localAis.isTagPrimitive() || localAis.getTagClass() != Tag.CLASS_APPLICATION)
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error decoding TC-Continue: DialogPortion and Component portion must be constructive and" +
                                    " has tag class CLASS_APPLICATION");

                switch (tag)
                {
                    case DialogPortion._TAG:
                        this.dp = TcapFactory.createDialogPortion(localAis);
                        break;

                    case Component._COMPONENT_TAG:
                        AsnInputStream compAis = localAis.readSequenceStream();
                        List<Component> cps = new ArrayList<Component>();
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
                                "Error decoding TC-Continue: DialogPortion and Componebt parsing: bad tag - " + tag);
                }
            }
        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "IOException while decoding " +
                    "TC-Continue: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "AsnException while decoding " +
                    "TC-Continue: "
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

            aos.writeOctetString(Tag.CLASS_APPLICATION, _TAG_OTX, this.originatingTransactionId);
            aos.writeOctetString(Tag.CLASS_APPLICATION, _TAG_DTX, this.destinationTransactionId);

            if (this.dp != null)
                this.dp.encode(aos);

            if (component != null)
            {
                aos.writeTag(Tag.CLASS_APPLICATION, false, Component._COMPONENT_TAG);
                int pos2 = aos.StartContentDefiniteLength();
                logger.debug(" component count : " + component.length);
                for (Component c : this.component)
                {
                    // David 2015-03-04
                    if (c == null)
                    {
                        logger.warn("Null Component found. Skipping.");
                        continue;
                    }

                    logger.debug(" component : " + c);
                    c.encode(aos);
                }
                aos.FinalizeContent(pos2);
            }

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding TC-Continue: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding TC-Continue: " + e.getMessage(), e);
        }

    }

}
