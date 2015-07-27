package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class AbortSourceImpl
        implements AbortSource
{

    private AbortSourceType type;

    public AbortSourceType getAbortSourceType()
    {
        return this.type;
    }

    public void setAbortSourceType(AbortSourceType t)
    {
        this.type = t;

    }

    public String toString()
    {
        return "AbortSource[type=" + type + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            long t = ais.readInteger();
            this.type = AbortSourceType.getFromInt(t);

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "IOException while decoding " +
                    "AbortSource: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "AsnException while decoding " +
                    "AbortSource: "
                    + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (type == null)
            throw new EncodeException("Error encoding AbortSource: No type set");

        try
        {
            aos.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _TAG, type.getType());

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding AbortSource: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding AbortSource: " + e.getMessage(), e);
        }
    }

}
