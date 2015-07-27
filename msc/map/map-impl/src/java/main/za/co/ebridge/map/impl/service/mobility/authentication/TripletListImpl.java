package za.co.ebridge.map.impl.service.mobility.authentication;

import java.io.IOException;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationTriplet;
import za.co.ebridge.map.api.service.mobility.authentication.TripletList;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

public class TripletListImpl
        implements TripletList, MAPAsnPrimitive
{

    public static final String _PrimitiveName = "TripletList";

    private ArrayList<AuthenticationTriplet> authenticationTriplets;

    public TripletListImpl()
    {
    }

    public TripletListImpl(ArrayList<AuthenticationTriplet> authenticationTriplets)
    {
        this.authenticationTriplets = authenticationTriplets;
    }

    public ArrayList<AuthenticationTriplet> getAuthenticationTriplets()
    {
        return authenticationTriplets;
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

        this.authenticationTriplets = new ArrayList<AuthenticationTriplet>();

        AsnInputStream ais = ansIS.readSequenceStreamData(length);
        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();
            if (ais.getTagClass() == Tag.CLASS_UNIVERSAL)
            {

                switch (tag)
                {
                    case Tag.SEQUENCE:
                        // authenticationTriplet
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter AuthenticationTriplet is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        AuthenticationTripletImpl at = new AuthenticationTripletImpl();
                        at.decodeAll(ais);
                        this.authenticationTriplets.add(at);
                        break;
                }
            } else
            {

                ais.advanceElement();
            }
        }

        if (this.authenticationTriplets.size() < 1 || this.authenticationTriplets.size() > 5)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": authenticationTriplets must be from 1 to 5, found:" + this.authenticationTriplets.size(),
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

        if (this.authenticationTriplets == null || this.authenticationTriplets.size() < 1
                || this.authenticationTriplets.size() > 5)
        {
            throw new MAPException("AuthenticationTriplets list must contains from 1 to 5 elemets");
        }

        for (AuthenticationTriplet at : this.authenticationTriplets)
        {
            ((AuthenticationTripletImpl) at).encodeAll(asnOs);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("TripletList [");

        if (this.authenticationTriplets != null)
        {
            for (AuthenticationTriplet at : this.authenticationTriplets)
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
