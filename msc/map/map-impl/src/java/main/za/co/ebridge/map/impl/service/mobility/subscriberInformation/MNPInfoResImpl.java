package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MNPInfoRes;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.NumberPortabilityStatus;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RouteingNumber;
import za.co.ebridge.map.impl.primitives.IMSIImpl;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

public class MNPInfoResImpl
        implements MNPInfoRes, MAPAsnPrimitive
{

    public static final String _PrimitiveName = "MNPInfoRes";

    private static final int _ID_routeingNumber = 0;
    private static final int _ID_imsi = 1;
    private static final int _ID_msisdn = 2;
    private static final int _ID_numberPortabilityStatus = 3;
    private static final int _ID_extensionContainer = 4;

    private RouteingNumber routeingNumber;
    private IMSI imsi;
    private ISDNAddressString msisdn;
    private NumberPortabilityStatus numberPortabilityStatus;
    private MAPExtensionContainer extensionContainer;

    /**
     *
     */
    public MNPInfoResImpl()
    {
    }

    public MNPInfoResImpl(
            RouteingNumber routeingNumber, IMSI imsi, ISDNAddressString msisdn,
            NumberPortabilityStatus numberPortabilityStatus, MAPExtensionContainer extensionContainer)
    {
        this.routeingNumber = routeingNumber;
        this.imsi = imsi;
        this.msisdn = msisdn;
        this.numberPortabilityStatus = numberPortabilityStatus;
        this.extensionContainer = extensionContainer;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.MNPInfoRes
     * #getRouteingNumber()
     */
    public RouteingNumber getRouteingNumber()
    {
        return this.routeingNumber;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.MNPInfoRes #getIMSI()
     */
    public IMSI getIMSI()
    {
        return this.imsi;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.MNPInfoRes #getMSISDN()
     */
    public ISDNAddressString getMSISDN()
    {
        return this.msisdn;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.MNPInfoRes
     * #getNumberPortabilityStatus()
     */
    public NumberPortabilityStatus getNumberPortabilityStatus()
    {
        return this.numberPortabilityStatus;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.MNPInfoRes
     * #getExtensionContainer()
     */
    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
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
        this.routeingNumber = null;
        this.imsi = null;
        this.msisdn = null;
        this.numberPortabilityStatus = null;
        this.extensionContainer = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
            {

                switch (tag)
                {
                    case _ID_routeingNumber:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " routeingNumber: Parameter is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.routeingNumber = new RouteingNumberImpl();
                        ((RouteingNumberImpl) this.routeingNumber).decodeAll(ais);
                        break;
                    case _ID_imsi:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " imsi: Parameter is not primitive", MAPParsingComponentExceptionReason
                                    .MistypedParameter);
                        this.imsi = new IMSIImpl();
                        ((IMSIImpl) this.imsi).decodeAll(ais);
                        break;
                    case _ID_msisdn:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " msisdn: Parameter is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.msisdn = new ISDNAddressStringImpl();
                        ((ISDNAddressStringImpl) this.msisdn).decodeAll(ais);
                        break;
                    case _ID_numberPortabilityStatus:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " numberPortabilityStatus: Parameter is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        int i1 = (int) ais.readInteger();
                        this.numberPortabilityStatus = NumberPortabilityStatus.getInstance(i1);
                        break;
                    case _ID_extensionContainer:
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " extensionContainer: Parameter is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.extensionContainer = new MAPExtensionContainerImpl();
                        ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
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
        if (this.routeingNumber != null)
            ((RouteingNumberImpl) this.routeingNumber).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_routeingNumber);

        if (this.imsi != null)
            ((IMSIImpl) this.imsi).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_imsi);

        if (this.msisdn != null)
            ((ISDNAddressStringImpl) this.msisdn).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_msisdn);

        if (this.numberPortabilityStatus != null)
        {
            try
            {
                asnOs.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _ID_numberPortabilityStatus,
                        this.numberPortabilityStatus.getType());
            }
            catch (IOException e)
            {
                throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
            }
            catch (AsnException e)
            {
                throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
            }
        }

        if (this.extensionContainer != null)
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                    _ID_extensionContainer);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.routeingNumber != null)
        {
            sb.append("routeingNumber=");
            sb.append(this.routeingNumber);
        }

        if (this.imsi != null)
        {
            sb.append(", imsi=");
            sb.append(this.imsi);
        }

        if (this.msisdn != null)
        {
            sb.append(", msisdn=");
            sb.append(this.msisdn);
        }

        if (this.numberPortabilityStatus != null)
        {
            sb.append(", numberPortabilityStatus=");
            sb.append(this.numberPortabilityStatus);
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
