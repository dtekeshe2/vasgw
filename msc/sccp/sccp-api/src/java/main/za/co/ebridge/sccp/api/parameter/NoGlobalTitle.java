package za.co.ebridge.sccp.api.parameter;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;

public class NoGlobalTitle
        extends GlobalTitle
{

    private String digits;

    public NoGlobalTitle()
    {

    }

    public NoGlobalTitle(String digits)
    {
        this.digits = digits;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.sccp.parameter.GlobalTitle#getIndicator()
     */
    @Override
    public GlobalTitleIndicator getIndicator()
    {
        return GlobalTitleIndicator.NO_GLOBAL_TITLE_INCLUDED;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.sccp.parameter.GlobalTitle#getDigits()
     */
    @Override
    public String getDigits()
    {
        return this.digits;
    }

    // default XML representation.
    protected static final XMLFormat<NoGlobalTitle> XML = new XMLFormat<NoGlobalTitle>()
    {

        public void write(NoGlobalTitle ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(DIGITS, ai.digits);
        }

        public void read(InputElement xml, NoGlobalTitle ai)
                throws
                XMLStreamException
        {
            ai.digits = xml.getAttribute(DIGITS).toString();
        }
    };
}
