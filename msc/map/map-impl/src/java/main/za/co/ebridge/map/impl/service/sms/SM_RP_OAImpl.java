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
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.sms.SM_RP_OA;
import za.co.ebridge.map.impl.primitives.AddressStringImpl;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class SM_RP_OAImpl
        implements SM_RP_OA, MAPAsnPrimitive
{

    private static final int _TAG_Msisdn = 2;
    private static final int _TAG_ServiceCentreAddressOA = 4;
    private static final int _TAG_noSM_RP_OA = 5;

    public static final String _PrimitiveName = "SM_RP_OA";

    private ISDNAddressString msisdn;
    private AddressString serviceCentreAddressOA;

    public SM_RP_OAImpl()
    {
    }

    public void setMsisdn(ISDNAddressString msisdn)
    {
        this.msisdn = msisdn;
    }

    public void setServiceCentreAddressOA(AddressString serviceCentreAddressOA)
    {
        this.serviceCentreAddressOA = serviceCentreAddressOA;
    }

    public ISDNAddressString getMsisdn()
    {
        return this.msisdn;
    }

    public AddressString getServiceCentreAddressOA()
    {
        return this.serviceCentreAddressOA;
    }

    public int getTagClass()
    {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    public int getTag()
    {
        if (this.msisdn != null)
            return _TAG_Msisdn;
        else if (this.serviceCentreAddressOA != null)
            return _TAG_ServiceCentreAddressOA;
        else
            return _TAG_noSM_RP_OA;
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

        this.msisdn = null;
        this.serviceCentreAddressOA = null;

        if (ansIS.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ansIS.isTagPrimitive())
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": bad tag class or is not primitive: TagClass=" + ansIS.getTagClass(),
                    MAPParsingComponentExceptionReason.MistypedParameter);

        switch (ansIS.getTag())
        {
            case _TAG_Msisdn:
                this.msisdn = new ISDNAddressStringImpl();
                ((ISDNAddressStringImpl) this.msisdn).decodeData(ansIS, length);
                break;

            case _TAG_ServiceCentreAddressOA:
                this.serviceCentreAddressOA = new AddressStringImpl();
                ((AddressStringImpl) this.serviceCentreAddressOA).decodeData(ansIS, length);
                break;

            case _TAG_noSM_RP_OA:
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
                throw new MAPParsingComponentException("Error while " + _PrimitiveName + ": bad tag: " + ansIS.getTag(),
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

        if (this.msisdn != null)
            ((ISDNAddressStringImpl) this.msisdn).encodeData(asnOs);
        else if (this.serviceCentreAddressOA != null)
            ((AddressStringImpl) this.serviceCentreAddressOA).encodeData(asnOs);
        else
            asnOs.writeNullData();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.msisdn != null)
        {
            sb.append("msisdn=");
            sb.append(this.msisdn.toString());
        }
        if (this.serviceCentreAddressOA != null)
        {
            sb.append("serviceCentreAddressOA=");
            sb.append(this.serviceCentreAddressOA.toString());
        }

        sb.append("]");

        return sb.toString();
    }
}
