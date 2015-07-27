package za.co.ebridge.map.impl.service.mobility.authentication;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationSetList;
import za.co.ebridge.map.api.service.mobility.authentication.QuintupletList;
import za.co.ebridge.map.api.service.mobility.authentication.TripletList;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class AuthenticationSetListImpl
        implements AuthenticationSetList, MAPAsnPrimitive
{

    public static final int _TAG_tripletList = 0;
    public static final int _TAG_quintupletList = 1;

    public static final String _PrimitiveName = "AuthenticationSetList";

    private TripletList tripletList;
    private QuintupletList quintupletList;
    private long mapProtocolVersion;

    public AuthenticationSetListImpl()
    {
    }

    public AuthenticationSetListImpl(TripletList tripletList)
    {
        this.tripletList = tripletList;
    }

    public AuthenticationSetListImpl(QuintupletList quintupletList)
    {
        this.quintupletList = quintupletList;
        this.mapProtocolVersion = 3;
    }

    public TripletList getTripletList()
    {
        return tripletList;
    }

    public QuintupletList getQuintupletList()
    {
        return quintupletList;
    }

    public long getMapProtocolVersion()
    {
        return mapProtocolVersion;
    }

    public void setMapProtocolVersion(long mapProtocolVersion)
    {
        this.mapProtocolVersion = mapProtocolVersion;
    }

    public int getTag()
            throws
            MAPException
    {
        if (this.mapProtocolVersion >= 3)
        {
            if (tripletList != null)
                return _TAG_tripletList;
            else
                return _TAG_quintupletList;
        } else
        {
            return Tag.SEQUENCE;
        }
    }

    public int getTagClass()
    {
        if (this.mapProtocolVersion >= 3)
            return Tag.CLASS_CONTEXT_SPECIFIC;
        else
            return Tag.CLASS_UNIVERSAL;
    }

    public boolean getIsPrimitive()
    {
        return false;
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

        this.tripletList = null;
        this.quintupletList = null;

        int tag = ais.getTag();

        if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
        { // MAP V3
            switch (tag)
            {
                case _TAG_tripletList:
                    this.tripletList = new TripletListImpl();
                    ((TripletListImpl) this.tripletList).decodeData(ais, length);
                    break;
                case _TAG_quintupletList:
                    this.quintupletList = new QuintupletListImpl();
                    ((QuintupletListImpl) this.quintupletList).decodeData(ais, length);
                    break;

                default:
                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": bad choice " +
                            "tag",
                            MAPParsingComponentExceptionReason.MistypedParameter);
            }
            mapProtocolVersion = 3;
        } else if (ais.getTagClass() == Tag.CLASS_UNIVERSAL)
        { // MAP V2
            switch (tag)
            {
                case Tag.SEQUENCE:
                case 0: // this special case when tag & tagClass are not set
                    this.tripletList = new TripletListImpl();
                    ((TripletListImpl) this.tripletList).decodeData(ais, length);
                    break;
                default:
                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": bad tag for " +
                            "MAP V2",
                            MAPParsingComponentExceptionReason.MistypedParameter);
            }
            mapProtocolVersion = 2;
        } else
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": bad choice tagClass",
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

        if (this.tripletList == null && this.quintupletList == null || this.tripletList != null && this
                .quintupletList != null)
        {
            throw new MAPException("Error while decoding " + _PrimitiveName + ": One and only one choice must be " +
                    "selected");
        }

        if (this.tripletList != null)
        {
            ((TripletListImpl) this.tripletList).encodeData(asnOs);
        } else
        {
            ((QuintupletListImpl) this.quintupletList).encodeData(asnOs);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthenticationSetList [");

        if (this.tripletList != null)
        {
            sb.append(this.tripletList.toString());
            sb.append(", ");
        }

        if (this.quintupletList != null)
        {
            sb.append(this.quintupletList.toString());
            sb.append(", ");
        }

        sb.append("mapProtocolVersion=");
        sb.append(this.mapProtocolVersion);

        sb.append("]");

        return sb.toString();
    }
}
