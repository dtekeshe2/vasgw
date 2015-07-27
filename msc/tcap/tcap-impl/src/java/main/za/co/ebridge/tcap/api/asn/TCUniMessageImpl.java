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
import za.co.ebridge.tcap.api.asn.comp.TCUniMessage;

public class TCUniMessageImpl
        implements TCUniMessage
{

    private DialogPortion dp;
    private Component[] component;

    public Component[] getComponent()
    {

        return component;
    }

    public DialogPortion getDialogPortion()
    {

        return dp;
    }

    public void setComponent(Component[] c)
    {
        this.component = c;

    }

    public void setDialogPortion(DialogPortion dp)
    {
        this.dp = dp;

    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            while (true)
            {
                if (localAis.available() == 0)
                    return;

                int tag = localAis.readTag();
                if (localAis.isTagPrimitive() || localAis.getTagClass() != Tag.CLASS_APPLICATION)
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error decoding TC-Uni: DialogPortion and Component portion must be constructive and has " +
                                    "tag class CLASS_APPLICATION");

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
                                "Error decoding TC-Uni: DialogPortion and Componebt parsing: bad tag - " + tag);
                }
            }
        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "IOException while decoding " +
                    "TC-Uni: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "AsnException while decoding " +
                    "TC-Uni: "
                    + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (this.component == null || this.component.length == 0)
            throw new EncodeException("Error encoding TC-Uni: Component portion is mandatory but not defined");

        try
        {

            aos.writeTag(Tag.CLASS_APPLICATION, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            if (this.dp != null)
                this.dp.encode(aos);

            aos.writeTag(Tag.CLASS_APPLICATION, false, Component._COMPONENT_TAG);
            int pos2 = aos.StartContentDefiniteLength();
            for (Component c : this.component)
            {
                c.encode(aos);
            }
            aos.FinalizeContent(pos2);

            aos.FinalizeContent(pos);

        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding TC-Uni: " + e.getMessage(), e);
        }

    }

}
