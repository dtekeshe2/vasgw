package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public enum AbortSourceType
{

    User(0), Provider(1);

    private long type = -1;

    AbortSourceType(long t)
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

    public static AbortSourceType getFromInt(long t)
            throws
            ParseException
    {
        if (t == 0)
        {
            return User;
        } else if (t == 1)
        {
            return Provider;
        }

        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null, "Wrong value of type: " + t);
    }

}
