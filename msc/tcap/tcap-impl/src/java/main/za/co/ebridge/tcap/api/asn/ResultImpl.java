package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class ResultImpl
        implements Result
{

    private ResultType resultType;

    public ResultType getResultType()
    {

        return resultType;
    }

    public void setResultType(ResultType t)
    {
        this.resultType = t;

    }

    public String toString()
    {
        return "Result[resultType=" + resultType + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != Tag.INTEGER && localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error while decoding AARE-apdu.result: bad tag or tag class: tag=" + tag + ", tagClass="
                                + localAis.getTagClass());

            // y, its a bit of enum, should be ok to cast :)
            long t = localAis.readInteger();
            this.resultType = ResultType.getFromInt(t);
        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "IOException while decoding " +
                    "Result: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "AsnException while decoding " +
                    "Result: "
                    + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (resultType == null)
            throw new EncodeException("Error encoding Result: ResultType must not be null");

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();
            aos.writeInteger(this.resultType.getType());
            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding Result: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding Result: " + e.getMessage(), e);
        }
    }

}
