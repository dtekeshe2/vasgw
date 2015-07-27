package za.co.ebridge.sccp.api.parameter;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;

public class GT0010
        extends GlobalTitle
{
    private static final GlobalTitleIndicator gti = GlobalTitleIndicator.GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_ONLY;
    /**
     * Translation type
     */
    private int tt;
    /**
     * address digits
     */
    private String digits;

    public GT0010()
    {
        digits = "";
    }

    public GT0010(int tt, String digits)
    {
        this.tt = tt;
        this.digits = digits;
    }

    public int getTranslationType()
    {
        return tt;
    }

    public String getDigits()
    {
        return digits;
    }

    public GlobalTitleIndicator getIndicator()
    {
        return gti;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof GlobalTitle))
        {
            return false;
        }

        GlobalTitle gt = (GlobalTitle) other;
        if (gt.getIndicator() != gti)
        {
            return false;
        }

        GT0010 gt1 = (GT0010) gt;
        return gt1.digits.equals(digits);
    }

    public int hashCode()
    {
        int hash = 3;
        hash = 31 * hash + (this.digits != null ? this.digits.hashCode() : 0);
        return hash;
    }

    public String toString()
    {
        return "GT0010{tt=" + tt + ", digits=" + digits + "}";
    }

    // default XML representation.
    protected static final XMLFormat<GT0010> XML = new XMLFormat<GT0010>()
    {

        public void write(GT0010 ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(TRANSLATION_TYPE, ai.tt);
            xml.setAttribute(DIGITS, ai.digits);
        }

        public void read(InputElement xml, GT0010 ai)
                throws
                XMLStreamException
        {
            ai.tt = xml.getAttribute(TRANSLATION_TYPE).toInt();
            ai.digits = xml.getAttribute(DIGITS).toString();
        }
    };

}
