package za.co.ebridge.map.impl.service.mobility.locationManagement;

import java.io.IOException;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;

import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.locationManagement.LocationArea;
import za.co.ebridge.map.api.service.mobility.locationManagement.PagingArea;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class PagingAreaImpl
        implements PagingArea, MAPAsnPrimitive
{

    public static final String _PrimitiveName = "PagingArea";

    private ArrayList<LocationArea> locationAreas;

    public PagingAreaImpl()
    {
    }

    public PagingAreaImpl(ArrayList<LocationArea> locationAreas)
    {
        this.locationAreas = locationAreas;
    }

    public ArrayList<LocationArea> getLocationAreas()
    {
        return locationAreas;
    }

    public int getTag()
            throws
            MAPException
    {
        return Tag.SEQUENCE;
    }

    public int getTagClass()
    {
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

    private void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {

        this.locationAreas = new ArrayList<LocationArea>();

        AsnInputStream ais = ansIS.readSequenceStreamData(length);
        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();
            if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive())
                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                        + ": Parameter locationAreas has bad tag class or is not primitive",
                        MAPParsingComponentExceptionReason.MistypedParameter);
            LocationAreaImpl at = new LocationAreaImpl();
            at.decodeAll(ais);
            this.locationAreas.add(at);
        }

        if (this.locationAreas.size() < 1 || this.locationAreas.size() > 5)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": locationAreas must be from 1 to 5, found:" + this.locationAreas.size(),
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

        if (this.locationAreas == null || this.locationAreas.size() < 1 || this.locationAreas.size() > 5)
        {
            throw new MAPException("LocationAreas list must contains from 1 to 5 elemets");
        }

        for (LocationArea at : this.locationAreas)
        {
            ((LocationAreaImpl) at).encodeAll(asnOs);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.locationAreas != null)
        {
            for (LocationArea at : this.locationAreas)
            {
                if (at != null)
                {
                    sb.append(at.toString());
                    sb.append(", ");
                }
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
