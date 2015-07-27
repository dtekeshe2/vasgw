package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.ParseException;

public enum ProblemType
{

    General(0), Invoke(1), ReturnResult(2), ReturnError(3);

    private long typeTag = -1;

    public static final int _TAG_CLASS = Tag.CLASS_APPLICATION;
    public static final boolean _TAG_PC_PRITIMITIVE = true;

    ProblemType(long l)
    {
        this.typeTag = l;
    }

    /**
     * @return the typeTag
     */
    public long getTypeTag()
    {
        return typeTag;
    }

    public static ProblemType getFromInt(long t)
            throws
            ParseException
    {
        if (t == 0)
        {
            return General;
        } else if (t == 1)
        {
            return Invoke;
        } else if (t == 2)
        {
            return ReturnResult;
        } else if (t == 3)
        {
            return ReturnError;
        }

        throw new ParseException(null, null, "Wrong value of type: " + t);
    }
}
