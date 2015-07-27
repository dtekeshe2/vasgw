/* eBridge SS7 */

package za.co.ebridge.sccp.api.indicator;

import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;

/**
 * The AI is the first field within Calling Party Address (CgPA) and Called Party Address (CdPA) and is one octet in length. Its
 * function is to indicate which information elements are present so that the address can be interpreted in other words, it
 * indicates the type of addressing information that is to be found in the address field so the receiving node knows how to
 * interpret that data.
 */
public class AddressIndicator
        implements XMLSerializable
{

    private static final String VALUE = "value";

    // Global title indicator
    private GlobalTitleIndicator globalTitleIndicator;
    // point code indicator
    private boolean pcPresent;
    // ssn indicator
    private boolean ssnPresent;
    // routing indicator
    private RoutingIndicator routingIndicator;

    public AddressIndicator()
    {
    }

    public AddressIndicator(boolean pcPresent, boolean ssnPresent, RoutingIndicator rti, GlobalTitleIndicator gti)
    {
        this.pcPresent = pcPresent;
        this.ssnPresent = ssnPresent;
        this.routingIndicator = rti;
        this.globalTitleIndicator = gti;
    }

    public AddressIndicator(byte v)
    {
        init(v);
    }

    private void init(byte v)
    {
        pcPresent = (v & 0x01) == 0x01;
        ssnPresent = (v & 0x02) == 0x02;
        globalTitleIndicator = GlobalTitleIndicator.valueOf((v >> 2) & 0x0f);

        routingIndicator = ((v >> 6) & 0x01) == 0x01 ? RoutingIndicator.ROUTING_BASED_ON_DPC_AND_SSN
                : RoutingIndicator.ROUTING_BASED_ON_GLOBAL_TITLE;
    }

    public GlobalTitleIndicator getGlobalTitleIndicator()
    {
        return globalTitleIndicator;
    }

    public boolean pcPresent()
    {
        return pcPresent;
    }

    public boolean ssnPresent()
    {
        return ssnPresent;
    }

    public RoutingIndicator getRoutingIndicator()
    {
        return routingIndicator;
    }

    public byte getValue()
    {
        int b = 0;

        if (pcPresent)
        {
            b |= 0x01;
        }

        if (ssnPresent)
        {
            b |= 0x02;
        }

        b |= (globalTitleIndicator.getValue() << 2);

        if (routingIndicator == RoutingIndicator.ROUTING_BASED_ON_DPC_AND_SSN)
        {
            b |= 0x40;
        }

        return (byte) b;
    }

    // default XML representation.
    protected static final XMLFormat<AddressIndicator> XML = new XMLFormat<AddressIndicator>()
    {

        public void write(AddressIndicator ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(VALUE, ai.getValue());
        }

        public void read(InputElement xml, AddressIndicator ai)
                throws
                XMLStreamException
        {
            byte b = (byte) xml.getAttribute(VALUE).toInt();
            ai.init(b);
        }
    };
}
