package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.events.EventType;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUniIndication;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.UserInformation;

public class TCUniIndicationImpl
        extends DialogIndicationImpl
        implements TCUniIndication
{
    // private Byte qos;
    private SccpAddress originatingAddress, destinationAddress;

    // fields
    private ApplicationContextName applicationContextName;
    private UserInformation userInformation;

    TCUniIndicationImpl()
    {
        super(EventType.Uni);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
     * getApplicationContextName()
     */
    public ApplicationContextName getApplicationContextName()
    {
        return applicationContextName;
    }

    public SccpAddress getDestinationAddress()
    {

        return this.destinationAddress;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
     * getOriginatingAddress()
     */
    public SccpAddress getOriginatingAddress()
    {

        return this.originatingAddress;
    }

    // /*
    // * (non-Javadoc)
    // *
    // * @see
    // * org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
    // * getQOS()
    // */
    // public Byte getQOS() {
    //
    // return this.qos;
    // }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest# getUserInformation()
     */
    public UserInformation getUserInformation()
    {

        return this.userInformation;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
     * setApplicationContextName
     * (org.mobicents.protocols.protocols.ss7.cap.api.tcap.asn.ApplicationContextName)
     */
    public void setApplicationContextName(ApplicationContextName acn)
    {
        this.applicationContextName = acn;

    }

    public void setDestinationAddress(SccpAddress dest)
    {
        this.destinationAddress = dest;

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
     * setOriginatingAddress
     * (org.mobicents.protocols.protocols.ss7.cap.api.sccp.parameter.SccpAddress)
     */
    public void setOriginatingAddress(SccpAddress dest)
    {
        this.originatingAddress = dest;

    }

    // /*
    // * (non-Javadoc)
    // *
    // * @see
    // * org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
    // * setQOS(java.lang.Byte)
    // */
    // public void setQOS(Byte b) throws IllegalArgumentException {
    // this.qos = b;
    //
    // }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.tcap.api.tc.dialog.events.TCBeginRequest#
     * setUserInformation(org.mobicents.protocols.protocols.ss7.cap.api.tcap.asn.UserInformation)
     */
    public void setUserInformation(UserInformation acn)
    {
        this.userInformation = acn;

    }

}
