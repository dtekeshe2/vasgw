package za.co.ebridge.sccp.api.parameter;

import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.sccp.api.indicator.AddressIndicator;
import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;
import za.co.ebridge.sccp.api.indicator.RoutingIndicator;

public class SccpAddress
        implements Parameter, XMLSerializable
{ // impl? pfff

    public static final String GLOBAL_TITLE = "gt";
    public static final String POINT_CODE = "pc";
    public static final String SUBSYSTEM_NUMBER = "ssn";
    public static final String AI = "ai";

    private GlobalTitle gt;
    private int pc = 0;
    private int ssn = -1;

    private AddressIndicator ai;

    // If this SccpAddress is translated address
    private boolean translated;

    public SccpAddress()
    {
    }

    /**
     * @param ri
     * @param dpc
     * @param gt
     * @param ssn
     */
    public SccpAddress(RoutingIndicator ri, int dpc, GlobalTitle gt, int ssn)
    {
        this.gt = gt;
        this.pc = dpc;
        this.ssn = ssn;
        this.ai = new AddressIndicator(dpc > 0, ssn > 0, ri, gt == null ? GlobalTitleIndicator.NO_GLOBAL_TITLE_INCLUDED
                : gt.getIndicator());

    }

    public boolean isTranslated()
    {
        return translated;
    }

    public void setTranslated(boolean translated)
    {
        this.translated = translated;
    }

    public AddressIndicator getAddressIndicator()
    {
        return this.ai;
    }

    public int getSignalingPointCode()
    {
        return pc;
    }

    public int getSubsystemNumber()
    {
        return ssn;
    }

    public GlobalTitle getGlobalTitle()
    {
        return gt;
    }

    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        if (!(other instanceof SccpAddress))
        {
            return false;
        }

        SccpAddress address = (SccpAddress) other;

        boolean res = false;

        if (address.gt != null)
        {
            res = gt != null && address.gt.getIndicator().compareTo(gt.getIndicator()) == 0;
            return res;
        }

        return address.ssn == ssn && address.pc == pc;
    }

    public int hashCode()
    {
        int hash = 7;
        // TODO Fix hashCode calculation.
        hash = 37 * hash; /* (this.gt != null ? this.gt.hashCode() : 0); */
        hash = 37 * hash + this.pc;
        hash = 37 * hash + this.ssn;
        return hash;
    }

    public String toString()
    {
        return ((new StringBuffer()).append("pc=").append(pc).append(",ssn=").append(ssn).append(",AI=").append(ai
                .getValue())
                .append(",gt=").append(gt)).toString();
    }

    protected static final XMLFormat<SccpAddress> XML = new XMLFormat<SccpAddress>()
    {

        public void write(SccpAddress ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(POINT_CODE, ai.pc);
            xml.setAttribute(SUBSYSTEM_NUMBER, ai.ssn);
            xml.add(ai.ai, AI, AddressIndicator.class);
            xml.add(ai.gt, GLOBAL_TITLE);

        }

        public void read(InputElement xml, SccpAddress ai)
                throws
                XMLStreamException
        {
            ai.pc = xml.getAttribute(POINT_CODE).toInt();
            ai.ssn = xml.getAttribute(SUBSYSTEM_NUMBER).toInt();
            ai.ai = xml.get(AI, AddressIndicator.class);
            ai.gt = xml.get(GLOBAL_TITLE);
        }
    };
}
