package za.co.ebridge.map.impl.primitives;

import java.io.IOException;
import java.util.Arrays;

import org.apache.log4j.Logger;
import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;

/**
 * Super class for implementing primitives that are OCTET STRING (SIZE (x..y))
 */
public abstract class OctetStringBase
        implements MAPAsnPrimitive
{

    private static final Logger logger = Logger.getLogger(OctetStringBase.class);

    protected byte[] data;

    protected int minLength;
    protected int maxLength;
    protected String _PrimitiveName;

    public OctetStringBase(int minLength, int maxLength, String _PrimitiveName)
    {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this._PrimitiveName = _PrimitiveName;
    }

    public OctetStringBase(int minLength, int maxLength, String _PrimitiveName, byte[] data)
    {
        this(minLength, maxLength, _PrimitiveName);

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
            logger.debug("length : " + length);
            this._decode(ansIS, length);
        } catch (IOException e)
        {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
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
        } catch (IOException e)
        {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    protected void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException
    {

        logger.debug("decode(" + length + " )");
        logger.debug("ansIS.isTagPrimitive : " + ansIS.isTagPrimitive());
        if (!ansIS.isTagPrimitive())
            throw new MAPParsingComponentException("Error decoding " + _PrimitiveName + ": field must be primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (length < this.minLength || length > this.maxLength)
            throw new MAPParsingComponentException("Error decoding " + _PrimitiveName + ": the field must contain from "
                    + this.minLength + " to " + this.maxLength + " octets. Contains: " + length,
                    MAPParsingComponentExceptionReason.MistypedParameter);

        data = new byte[length];
        ansIS.read(data);
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
        } catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        if (this.data == null)
            throw new MAPException("Error while encoding the " + _PrimitiveName + ": data is not defined");

        if (this.data.length < this.minLength || this.data.length > this.maxLength)
            throw new MAPException("Error while encoding the " + _PrimitiveName + ": data field length must be from "
                    + this.minLength + " to " + this.maxLength + " octets");

        asnOs.write(this.data);
    }

    @Override
    public int hashCode()
    {
        if (data == null)
            return 0;

        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(data);
        return result;
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
        OctetStringBase other = (OctetStringBase) obj;
        if (data == null)
        {
            if (other.data != null)
                return false;
        } else if (!Arrays.equals(data, other.data))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return _PrimitiveName + " [Data= " + this.printDataArr() + "]";
    }

    protected String printDataArr()
    {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        if (this.data != null)
        {
            for (int b : this.data)
            {
                if (first)
                    first = false;
                else
                    sb.append(", ");
                sb.append(b);
            }
        }

        return sb.toString();
    }
}
