package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;

import java.io.IOException;

public abstract class OctetStringLength1Base
        implements MAPAsnPrimitive
{

    protected int data;

    protected String _PrimitiveName;

    public OctetStringLength1Base(String _PrimitiveName)
    {
        this._PrimitiveName = _PrimitiveName;
    }

    public OctetStringLength1Base(String _PrimitiveName, int data)
    {
        this(_PrimitiveName);

        this.data = data;
    }

    public int getTag()
            throws
            MAPException
    {
        return Tag.STRING_OCTET;
    }

    public int getTagClass()
    {
        return Tag.CLASS_UNIVERSAL;
    }

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
    }

    protected void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException
    {

        if (length != 1)
            throw new MAPParsingComponentException("Error decoding " + _PrimitiveName
                    + ": the field must contain 1 octet. Contains: " + length,
                    MAPParsingComponentExceptionReason.MistypedParameter);

        this.data = ansIS.read();
    }

    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {

        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

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

    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        asnOs.write(this.data);
    }

    @Override
    public int hashCode()
    {
        return data;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OctetStringLength1Base other = (OctetStringLength1Base) obj;

        return data == other.data;
    }

    @Override
    public String toString()
    {
        return _PrimitiveName + " [Data=" + this.data + "]";
    }
}
