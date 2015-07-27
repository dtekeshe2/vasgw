package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.GPRSMSClass;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSNetworkCapability;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSRadioAccessCapability;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class GPRSMSClassImpl
        implements GPRSMSClass, MAPAsnPrimitive
{

    public static final String _PrimitiveName = "GPRSMSClass";

    private static final int _ID_mSNetworkCapability = 0;
    private static final int _ID_mSRadioAccessCapability = 1;

    private MSNetworkCapability mSNetworkCapability;
    private MSRadioAccessCapability mSRadioAccessCapability;

    /**
     *
     */
    public GPRSMSClassImpl()
    {
    }

    public GPRSMSClassImpl(MSNetworkCapability mSNetworkCapability, MSRadioAccessCapability mSRadioAccessCapability)
    {
        this.mSNetworkCapability = mSNetworkCapability;
        this.mSRadioAccessCapability = mSRadioAccessCapability;
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
        this.mSNetworkCapability = null;
        this.mSRadioAccessCapability = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        while (true)
        {
            if (ais.available() == 0)
                break;

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
            {

                int tag = ais.readTag();
                switch (tag)
                {
                    case _ID_mSNetworkCapability:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " mSNetworkCapability: Parameter is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.mSNetworkCapability = new MSNetworkCapabilityImpl();
                        ((MSNetworkCapabilityImpl) this.mSNetworkCapability).decodeAll(ais);
                        break;
                    case _ID_mSRadioAccessCapability:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " mSRadioAccessCapability: Parameter is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.mSRadioAccessCapability = new MSRadioAccessCapabilityImpl();
                        ((MSRadioAccessCapabilityImpl) this.mSRadioAccessCapability).decodeAll(ais);
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

        if (this.mSNetworkCapability == null)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": mSNetworkCapability must not be null", MAPParsingComponentExceptionReason.MistypedParameter);
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
        if (this.mSNetworkCapability == null)
            throw new MAPException("MSNetworkCapability cannot be null");

        ((MSNetworkCapabilityImpl) this.mSNetworkCapability).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                _ID_mSNetworkCapability);

        if (this.mSRadioAccessCapability != null)
            ((MSRadioAccessCapabilityImpl) this.mSRadioAccessCapability).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                    _ID_mSRadioAccessCapability);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.GPRSMSClass
     * #getMSNetworkCapability()
     */
    public MSNetworkCapability getMSNetworkCapability()
    {
        return this.mSNetworkCapability;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.subscriberInformation.GPRSMSClass
     * #getMSRadioAccessCapability()
     */
    public MSRadioAccessCapability getMSRadioAccessCapability()
    {
        return this.mSRadioAccessCapability;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.mSNetworkCapability != null)
        {
            sb.append("mSNetworkCapability=");
            sb.append(this.mSNetworkCapability);
        }

        if (this.mSRadioAccessCapability != null)
        {
            sb.append(", mSRadioAccessCapability=");
            sb.append(this.mSRadioAccessCapability);
        }

        sb.append("]");
        return sb.toString();
    }

}
