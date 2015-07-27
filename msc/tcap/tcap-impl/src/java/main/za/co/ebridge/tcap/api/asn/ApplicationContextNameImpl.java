package za.co.ebridge.tcap.api.asn;

import java.io.IOException;
import java.util.Arrays;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class ApplicationContextNameImpl
        implements ApplicationContextName
{

    // object identifier value
    private long[] oid;

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();
            int tag = localAis.readTag();
            if (tag != Tag.OBJECT_IDENTIFIER || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding ApplicationContextName: bad tag or tagClass, found tag=" + tag + ", tagClass="
                                + localAis.getTagClass());
            this.oid = localAis.readObjectIdentifier();

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException while decoding ApplicationContextName: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException while decoding ApplicationContextName: " + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (this.oid == null)
            throw new EncodeException("Error while decoding ApplicationContextName: No OID value set");

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            aos.writeObjectIdentifier(this.oid);

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding ApplicationContextName: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("IOException while encoding ApplicationContextName: " + e.getMessage(), e);
        }

    }

    /**
     * @return the oid
     */
    public long[] getOid()
    {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(long[] oid)
    {
        this.oid = oid;
    }

    public String getStringValue()
    {
        return Arrays.toString(oid);
    }

    public String toString()
    {
        return "ApplicationContextName[oid=" + Arrays.toString(oid) + "]";
    }

}
