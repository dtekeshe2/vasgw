package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public enum DialogServiceUserType
{

    Null(0), NoReasonGive(1), AcnNotSupported(2);

    private long type = -1;

    DialogServiceUserType(long t)
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

    public static DialogServiceUserType getFromInt(long t)
            throws
            ParseException
    {
        if (t == 0)
        {
            return Null;
        } else if (t == 1)
        {
            return NoReasonGive;
        } else if (t == 2)
        {
            return AcnNotSupported;
        }

        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null, "Wrong value of type: " + t);
    }

}
