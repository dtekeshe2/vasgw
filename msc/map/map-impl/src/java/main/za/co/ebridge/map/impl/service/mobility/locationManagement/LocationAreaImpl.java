/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.locationManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.LAIFixedLength;
import za.co.ebridge.map.api.service.mobility.locationManagement.LAC;
import za.co.ebridge.map.api.service.mobility.locationManagement.LocationArea;
import za.co.ebridge.map.impl.primitives.LAIFixedLengthImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 * @author david@tekeshe.com
 */
public class LocationAreaImpl
        implements LocationArea, MAPAsnPrimitive
{

    public static final int _TAG_laiFixedLength = 0;
    public static final int _TAG_lac = 1;

    public static final String _PrimitiveName = "LocationArea";

    private LAIFixedLength laiFixedLength;
    private LAC lac;

    public LocationAreaImpl()
    {
    }

    public LocationAreaImpl(LAIFixedLength laiFixedLength)
    {
        this.laiFixedLength = laiFixedLength;
    }

    public LocationAreaImpl(LAC lac)
    {
        this.lac = lac;
    }

    public LAIFixedLength getLAIFixedLength()
    {
        return laiFixedLength;
    }

    public LAC getLAC()
    {
        return lac;
    }

    public int getTag()
            throws
            MAPException
    {
        if (this.laiFixedLength != null)
            return _TAG_laiFixedLength;
        else
            return _TAG_lac;
    }

    public int getTagClass()
    {
        return Tag.CLASS_CONTEXT_SPECIFIC;
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

    private void _decode(AsnInputStream ais, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {

        this.laiFixedLength = null;
        this.lac = null;

        int tag = ais.getTag();

        if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive())
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Primitive has bad tag class or is not primitive", MAPParsingComponentExceptionReason
                    .MistypedParameter);

        switch (tag)
        {
            case _TAG_laiFixedLength:
                this.laiFixedLength = new LAIFixedLengthImpl();
                ((LAIFixedLengthImpl) this.laiFixedLength).decodeData(ais, length);
                break;
            case _TAG_lac:
                this.lac = new LACImpl();
                ((LACImpl) this.lac).decodeData(ais, length);
                break;

            default:
                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": bad choice tag",
                        MAPParsingComponentExceptionReason.MistypedParameter);
        }
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

        if (this.laiFixedLength == null && this.lac == null || this.laiFixedLength != null && this.lac != null)
        {
            throw new MAPException("Error while decoding " + _PrimitiveName + ": One and only one choice must be " +
                    "selected");
        }

        if (this.laiFixedLength != null)
        {
            ((LAIFixedLengthImpl) this.laiFixedLength).encodeData(asnOs);
        } else
        {
            ((LACImpl) this.lac).encodeData(asnOs);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.laiFixedLength != null)
        {
            sb.append(this.laiFixedLength.toString());
            sb.append(", ");
        }

        if (this.lac != null)
        {
            sb.append(this.lac.toString());
            sb.append(", ");
        }

        sb.append("]");

        return sb.toString();
    }
}
