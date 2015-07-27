package za.co.ebridge.sccp.api.parameter;

import java.io.IOException;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.sccp.api.indicator.EncodingScheme;
import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;
import za.co.ebridge.sccp.api.indicator.NumberingPlan;

public class GT0011
        extends GlobalTitle
{
    private static final GlobalTitleIndicator gti = GlobalTitleIndicator.GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_AND_ENCODING_SCHEME;
    private int tt;
    private NumberingPlan np;
    private EncodingScheme es;

    private String digits;

    public GT0011()
    {
        digits = "";
    }

    public GT0011(int tt, NumberingPlan np, String digits)
    {
        this.tt = tt;
        this.np = np;
        this.digits = digits;
        this.es = digits.length() % 2 == 0 ? EncodingScheme.BCD_EVEN : EncodingScheme.BCD_ODD;
    }

    public int getTranslationType()
    {
        return tt;
    }

    public NumberingPlan getNp()
    {
        return np;
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

        GT0011 gt1 = (GT0011) gt;
        return gt1.tt == tt && gt1.np == np && gt1.digits.equals(digits);
    }

    public int hashCode()
    {
        int hash = 7;
        hash = 41 * hash + this.tt;
        hash = 41 * hash + (this.np != null ? this.np.hashCode() : 0);
        hash = 41 * hash + (this.digits != null ? this.digits.hashCode() : 0);
        return hash;
    }

    public String toString()
    {
        return "GT0011{tt=" + tt + ", np=" + np + ", digits=" + digits + "}";
    }

    // default XML representation.
    protected static final XMLFormat<GT0011> XML = new XMLFormat<GT0011>()
    {

        public void write(GT0011 ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(TRANSLATION_TYPE, ai.tt);
            xml.setAttribute(ENCODING_SCHEME, ai.es.getValue());
            xml.setAttribute(NUMBERING_PLAN, ai.np.getValue());
            xml.setAttribute(DIGITS, ai.digits);
        }

        public void read(InputElement xml, GT0011 ai)
                throws
                XMLStreamException
        {
            ai.tt = xml.getAttribute(TRANSLATION_TYPE).toInt();
            ai.es = EncodingScheme.valueOf(xml.getAttribute(ENCODING_SCHEME).toInt());
            try
            {
                ai.np = NumberingPlan.valueOf(xml.getAttribute(NUMBERING_PLAN).toInt());
            }
            catch (IOException e)
            {
                throw new XMLStreamException(e);
            }
            ai.digits = xml.getAttribute(DIGITS).toString();
        }
    };

}
