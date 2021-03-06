package za.co.ebridge.map.impl.service.sms;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.service.sms.SM_RP_DA;
import za.co.ebridge.map.impl.primitives.AddressStringImpl;
import za.co.ebridge.map.impl.primitives.IMSIImpl;
import za.co.ebridge.map.impl.primitives.LMSIImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class SM_RP_DAImpl
        implements SM_RP_DA, MAPAsnPrimitive
{

    private static final int _TAG_IMSI = 0;
    private static final int _TAG_LMSI = 1;
    private static final int _TAG_ServiceCentreAddressDA = 4;
    private static final int _TAG_NoSM_RP_DA = 5;

    public static final String _PrimitiveName = "SM_RP_DA";

    private IMSI imsi;
    private LMSI lmsi;
    private AddressString serviceCentreAddressDA;

    public SM_RP_DAImpl()
    {
    }

    public SM_RP_DAImpl(IMSI imsi)
    {
        this.imsi = imsi;
    }

    public SM_RP_DAImpl(LMSI lmsi)
    {
        this.lmsi = lmsi;
    }

    public SM_RP_DAImpl(AddressString serviceCentreAddressDA)
    {
        this.serviceCentreAddressDA = serviceCentreAddressDA;
    }

    public IMSI getIMSI()
    {
        return this.imsi;
    }

    public LMSI getLMSI()
    {
        return this.lmsi;
    }

    public AddressString getServiceCentreAddressDA()
    {
        return serviceCentreAddressDA;
    }

    public int getTagClass()
    {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    public int getTag()
    {
        if (this.imsi != null)
            return _TAG_IMSI;
        else if (this.lmsi != null)
            return _TAG_LMSI;
        else if (this.serviceCentreAddressDA != null)
            return _TAG_ServiceCentreAddressDA;
        else
            return _TAG_NoSM_RP_DA;
    }

    public boolean getIsPrimitive()
    {
        return true;
    }

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

        this.imsi = null;
        this.lmsi = null;
        this.serviceCentreAddressDA = null;

        if (ansIS.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ansIS.isTagPrimitive())
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": bad tag class or is not primitive: TagClass=" + ansIS.getTagClass(),
                    MAPParsingComponentExceptionReason.MistypedParameter);

        switch (ansIS.getTag())
        {
            case _TAG_IMSI:
                this.imsi = new IMSIImpl();
                ((IMSIImpl) this.imsi).decodeData(ansIS, length);
                break;

            case _TAG_LMSI:
                this.lmsi = new LMSIImpl();
                ((LMSIImpl) this.lmsi).decodeData(ansIS, length);
                break;

            case _TAG_ServiceCentreAddressDA:
                this.serviceCentreAddressDA = new AddressStringImpl();
                ((AddressStringImpl) this.serviceCentreAddressDA).decodeData(ansIS, length);
                break;

            case _TAG_NoSM_RP_DA:
                try
                {
                    ansIS.readNullData(length);
                }
                catch (AsnException e)
                {
                    throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": "
                            + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
                }
                catch (IOException e)
                {
                    throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": "
                            + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
                }
                break;

            default:
                throw new MAPParsingComponentException("Error while SM_RP_DA: bad tag: " + ansIS.getTag(),
                        MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {

        this.encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, this.getTag());
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag)
            throws
            MAPException
    {

        try
        {
            asnOs.writeTag(tagClass, true, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        if (this.imsi != null)
            ((IMSIImpl) this.imsi).encodeData(asnOs);
        else if (this.lmsi != null)
            ((LMSIImpl) this.lmsi).encodeData(asnOs);
        else if (this.serviceCentreAddressDA != null)
            ((AddressStringImpl) this.serviceCentreAddressDA).encodeData(asnOs);
        else
        {
            asnOs.writeNullData();
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("SM_RP_DA [");

        if (this.imsi != null)
        {
            sb.append("imsi=");
            sb.append(this.imsi.toString());
        }
        if (this.lmsi != null)
        {
            sb.append("lmsi=");
            sb.append(this.lmsi.toString());
        }
        if (this.serviceCentreAddressDA != null)
        {
            sb.append("serviceCentreAddressDA=");
            sb.append(this.serviceCentreAddressDA.toString());
        }

        sb.append("]");

        return sb.toString();
    }
}
