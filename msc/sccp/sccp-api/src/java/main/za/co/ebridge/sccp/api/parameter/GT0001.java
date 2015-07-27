package za.co.ebridge.sccp.api.parameter;

import java.io.IOException;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;
import za.co.ebridge.sccp.api.indicator.NatureOfAddress;

public class GT0001
        extends GlobalTitle
{
    private static final GlobalTitleIndicator gti = GlobalTitleIndicator.GLOBAL_TITLE_INCLUDES_NATURE_OF_ADDRESS_INDICATOR_ONLY;
    private NatureOfAddress nai;
    private String digits;
    private boolean odd = false;

    public GT0001()
    {
        digits = "";
    }

    public GT0001(NatureOfAddress nai, String digits)
    {
        this.nai = nai;
        this.digits = digits;
    }

    public NatureOfAddress getNoA()
    {
        return this.nai;
    }

    public String getDigits()
    {
        return digits;
    }

    public GlobalTitleIndicator getIndicator()
    {
        return this.gti;
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

        GT0001 gt1 = (GT0001) gt;
        return gt1.nai == nai && gt1.digits.equals(digits);
    }

    public int hashCode()
    {
        int hash = 7;
        hash = 53 * hash + (this.gti != null ? this.gti.hashCode() : 0);
        hash = 53 * hash + (this.digits != null ? this.digits.hashCode() : 0);
        return hash;
    }

    public String toString()
    {
        return "GT0001{na=" + nai + ", digits=" + digits + "}";
    }

    // default XML representation.
    protected static final XMLFormat<GT0001> XML = new XMLFormat<GT0001>()
    {

        public void write(GT0001 ai, OutputElement xml)
                throws
                XMLStreamException
        {
            // xml.setAttribute(GLOBALTITLE_INDICATOR, ai.gti.getValue());
            xml.setAttribute(NATURE_OF_ADDRESS_INDICATOR, ai.nai.getValue());
            xml.setAttribute(DIGITS, ai.digits);
        }

        public void read(InputElement xml, GT0001 ai)
                throws
                XMLStreamException
        {
            // ai.gti = GlobalTitleIndicator.valueOf(xml.getAttribute(GLOBALTITLE_INDICATOR).toInt());
            try
            {
                ai.nai = NatureOfAddress.valueOf(xml.getAttribute(NATURE_OF_ADDRESS_INDICATOR).toInt());
            }
            catch (IOException e)
            {
                throw new XMLStreamException(e);
            }
            ai.digits = xml.getAttribute(DIGITS).toString();
        }
    };
}
