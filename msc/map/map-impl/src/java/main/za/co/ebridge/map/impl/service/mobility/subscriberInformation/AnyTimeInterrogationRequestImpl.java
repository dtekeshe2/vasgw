package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPMessageType;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.SubscriberIdentity;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.AnyTimeInterrogationRequest;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RequestedInfo;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SubscriberIdentityImpl;
import za.co.ebridge.map.impl.service.mobility.MobilityMessageImpl;

public class AnyTimeInterrogationRequestImpl
        extends MobilityMessageImpl
        implements AnyTimeInterrogationRequest,
        MAPAsnPrimitive
{

    private static final int _TAG_SUBSCRIBER_IDENTITY = 0;
    private static final int _TAG_REQUESTED_INFO = 1;
    private static final int _TAG_EXTENSION_CONTAINER = 2;
    private static final int _TAG_GSM_SCF_ADDRESS = 3;

    public static final String _PrimitiveName = "AnyTimeInterrogationRequest";

    private SubscriberIdentity subscriberIdentity;
    private RequestedInfo requestedInfo;
    private ISDNAddressString gsmSCFAddress;
    private MAPExtensionContainer extensionContainer;

    public AnyTimeInterrogationRequestImpl()
    {

    }

    public AnyTimeInterrogationRequestImpl(
            SubscriberIdentity subscriberIdentity, RequestedInfo requestedInfo,
            ISDNAddressString gsmSCFAddress, MAPExtensionContainer extensionContainer)
    {
        this.subscriberIdentity = subscriberIdentity;
        this.requestedInfo = requestedInfo;
        this.gsmSCFAddress = gsmSCFAddress;
        this.extensionContainer = extensionContainer;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#getTag()
     */
    public int getTag()
            throws
            MAPException
    {
        return Tag.SEQUENCE;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#getTagClass()
     */
    public int getTagClass()
    {
        return Tag.CLASS_UNIVERSAL;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#getIsPrimitive ()
     */
    public boolean getIsPrimitive()
    {
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#decodeAll( com.ebridge
     * .protocols.asn.AsnInputStream)
     */
    public void decodeAll(AsnInputStream ansIS)
            throws
            MAPParsingComponentException
    {
        try
        {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        }
        catch (IOException e)
        {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e
                    .getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        catch (AsnException e)
        {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e
                    .getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#decodeData (com.ebridge
     * .protocols.asn.AsnInputStream,
     * int)
     */
    public void decodeData(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException
    {
        try
        {
            this._decode(ansIS, length);
        }
        catch (IOException e)
        {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e
                    .getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        catch (AsnException e)
        {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e
                    .getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        this.subscriberIdentity = null;
        this.requestedInfo = null;
        this.gsmSCFAddress = null;
        this.extensionContainer = null;

        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
            {
                switch (tag)
                {
                    case _TAG_SUBSCRIBER_IDENTITY:
                        // decode SubscriberIdentity
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter subscriberIdentity is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);

                        this.subscriberIdentity = new SubscriberIdentityImpl();
                        AsnInputStream ais2 = ais.readSequenceStream();
                        ais2.readTag();
                        ((SubscriberIdentityImpl) this.subscriberIdentity).decodeAll(ais2);
                        break;
                    case _TAG_REQUESTED_INFO:
                        // decode RequestedInfo
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter requestedInfo is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.requestedInfo = new RequestedInfoImpl();
                        ((RequestedInfoImpl) this.requestedInfo).decodeAll(ais);
                        break;
                    case _TAG_EXTENSION_CONTAINER:
                        // decode extensionContainer
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter extensionContainer is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        extensionContainer = new MAPExtensionContainerImpl();
                        ((MAPExtensionContainerImpl) extensionContainer).decodeAll(ais);
                        break;
                    case _TAG_GSM_SCF_ADDRESS:
                        // decode gsmSCF-Address
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter gsmSCFAddress is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.gsmSCFAddress = new ISDNAddressStringImpl();
                        ((ISDNAddressStringImpl) this.gsmSCFAddress).decodeAll(ais);
                        break;
                    default:
                        ais.advanceElement();
                        break;
                }
            } else
            {
                ais.advanceElement();
            }
        }

        if (this.subscriberIdentity == null || this.requestedInfo == null || this.gsmSCFAddress == null)
            throw new MAPParsingComponentException(
                    "Error while decoding "
                            + _PrimitiveName
                            + ": subscriberIdentity, requestedInfo and gsmSCFAddress parameters are mandatory but " +
                            "some of them are not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeAll( com.ebridge
     * .protocols.asn.AsnOutputStream)
     */
    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {
        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeAll( com.ebridge
     * .protocols.asn.AsnOutputStream,
     * int, int)
     */
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag)
            throws
            MAPException
    {
        try
        {
            asnOs.writeTag(tagClass, this.getIsPrimitive(), tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeData (com.ebridge
     * .protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        if (this.subscriberIdentity == null)
        {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + " the mandatory parameter subscriberIdentity is not defined");
        }
        if (this.requestedInfo == null)
        {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + " the mandatory parameter requestedInfo is not defined");
        }
        if (this.gsmSCFAddress == null)
        {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + " the mandatory parameter gsmSCF-Address is not defined");
        }

        try
        {
            asnOs.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG_SUBSCRIBER_IDENTITY);
            int pos = asnOs.StartContentDefiniteLength();
            ((SubscriberIdentityImpl) this.subscriberIdentity).encodeAll(asnOs);
            asnOs.FinalizeContent(pos);
        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException while encoding " + _PrimitiveName
                    + " parameter subscriberIdentity [0] SubscriberIdentity");
        }

        ((RequestedInfoImpl) this.requestedInfo).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_REQUESTED_INFO);

        ((ISDNAddressStringImpl) this.gsmSCFAddress).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_GSM_SCF_ADDRESS);

        if (this.extensionContainer != null)
        {
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                    _TAG_EXTENSION_CONTAINER);
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * AnyTimeInterrogationRequestIndication#getSubscriberIdentity()
     */
    public SubscriberIdentity getSubscriberIdentity()
    {
        return this.subscriberIdentity;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * AnyTimeInterrogationRequestIndication#getRequestedInfo()
     */
    public RequestedInfo getRequestedInfo()
    {
        return this.requestedInfo;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * AnyTimeInterrogationRequestIndication#getGsmSCFAddress()
     */
    public ISDNAddressString getGsmSCFAddress()
    {
        return this.gsmSCFAddress;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.
     * AnyTimeInterrogationRequestIndication#getExtensionContainer()
     */
    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPMessage#getMessageType()
     */
    public MAPMessageType getMessageType()
    {
        return MAPMessageType.anyTimeInterrogation_Request;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.MAPMessage#getOperationCode()
     */
    public int getOperationCode()
    {
        return MAPOperationCode.anyTimeInterrogation;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.subscriberIdentity != null)
        {
            sb.append("subscriberIdentity=");
            sb.append(this.subscriberIdentity);
        }
        if (this.requestedInfo != null)
        {
            sb.append(", requestedInfo=");
            sb.append(this.requestedInfo);
        }
        if (this.gsmSCFAddress != null)
        {
            sb.append(", gsmSCFAddress=");
            sb.append(this.gsmSCFAddress);
        }
        if (this.extensionContainer != null)
        {
            sb.append(", extensionContainer=");
            sb.append(this.extensionContainer);
        }

        sb.append("]");
        return sb.toString();
    }
}
