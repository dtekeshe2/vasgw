package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public enum ResultType
{
    // its encoded as INT

    Accepted(0), RejectedPermanent(1);

    private long type = -1;

    ResultType(long t)
    {
        this.type = t;
    }

    /**
     * @return the type
     */
    public long getType()
    {
        return type;
    }

    public static ResultType getFromInt(long t)
            throws
            ParseException
    {
        if (t == 0)
        {
            return Accepted;
        } else if (t == 1)
        {
            return RejectedPermanent;
        }

        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null, "Wrong value of response: " + t);
    }
}
