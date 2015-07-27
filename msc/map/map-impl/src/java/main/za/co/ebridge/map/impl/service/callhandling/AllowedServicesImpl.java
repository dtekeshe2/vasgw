package za.co.ebridge.map.impl.service.callhandling;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.callhandling.AllowedServices;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class AllowedServicesImpl
        implements AllowedServices, MAPAsnPrimitive
{
    private static final int _INDEX_FirstServiceAllowed = 0;
    private static final int _INDEX_SecondServiceAllowed = 1;

    private static final String _PrimitiveName = "AllowedServices";

    private BitSetStrictLength bitString = new BitSetStrictLength(2);

    /**
     *
     */
    public AllowedServicesImpl()
    {
    }

    public AllowedServicesImpl(boolean suppressCUG, boolean suppressCCBS)
    {
        if (suppressCUG)
            this.bitString.set(_INDEX_FirstServiceAllowed);
        if (suppressCCBS)
            this.bitString.set(_INDEX_SecondServiceAllowed);
    }

    @Override
    public boolean getFirstServiceAllowed()
    {
        return this.bitString.get(_INDEX_FirstServiceAllowed);
    }

    @Override
    public boolean getSecondServiceAllowed()
    {
        return this.bitString.get(_INDEX_SecondServiceAllowed);
    }

    @Override
    public int getTag()
            throws
            MAPException
    {
        return Tag.STRING_BIT;
    }

    @Override
    public int getTagClass()
    {
        return Tag.CLASS_UNIVERSAL;
    }

    @Override
    public boolean getIsPrimitive()
    {
        return true;
    }

    @Override
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

    @Override
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
        if ((length < 1) || (length > 2))
            throw new MAPParsingComponentException("Error decoding " + _PrimitiveName + ": "
                    + "the SuppressMTSS field must contain from 1 or 2 octets. Contains: " + length,
                    MAPParsingComponentExceptionReason.MistypedParameter);

        this.bitString = ansIS.readBitStringData(length);
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {
        this.encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.STRING_BIT);
    }

    @Override
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

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        try
        {
            asnOs.writeBitStringData(this.bitString);
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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (getFirstServiceAllowed())
            sb.append("FirstServiceAllowed, ");
        if (getSecondServiceAllowed())
            sb.append("SecondServiceAllowed, ");

        sb.append("]");
        return sb.toString();
    }
}
