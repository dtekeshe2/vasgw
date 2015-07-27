package za.co.ebridge.map.impl.service.mobility.locationManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPMessageType;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.locationManagement.UpdateGprsLocationResponse;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.service.mobility.MobilityMessageImpl;

public class UpdateGprsLocationResponseImpl
        extends MobilityMessageImpl
        implements UpdateGprsLocationResponse
{

    private static final int TAG_sgsnMmeSeparationSupported = 0;

    public static final String _PrimitiveName = "UpdateGprsLocationResponse";

    private ISDNAddressString hlrNumber;
    private MAPExtensionContainer extensionContainer;
    private boolean addCapability;
    private boolean sgsnMmeSeparationSupported;

    public UpdateGprsLocationResponseImpl()
    {
        super();
    }

    public UpdateGprsLocationResponseImpl(
            ISDNAddressString hlrNumber, MAPExtensionContainer extensionContainer,
            boolean addCapability, boolean sgsnMmeSeparationSupported)
    {
        super();
        this.hlrNumber = hlrNumber;
        this.extensionContainer = extensionContainer;
        this.addCapability = addCapability;
        this.sgsnMmeSeparationSupported = sgsnMmeSeparationSupported;
    }

    @Override
    public ISDNAddressString getHlrNumber()
    {
        return hlrNumber;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    @Override
    public boolean getAddCapability()
    {
        return this.addCapability;
    }

    @Override
    public boolean getSgsnMmeSeparationSupported()
    {
        return this.sgsnMmeSeparationSupported;
    }

    @Override
    public MAPMessageType getMessageType()
    {
        return MAPMessageType.updateGprsLocation_Request;
    }

    @Override
    public int getOperationCode()
    {
        return MAPOperationCode.updateGprsLocation;
    }

    @Override
    public int getTag()
            throws
            MAPException
    {
        return Tag.SEQUENCE;
    }

    @Override
    public int getTagClass()
    {
        return Tag.CLASS_UNIVERSAL;
    }

    @Override
    public boolean getIsPrimitive()
    {
        return false;
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
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        catch (AsnException e)
        {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": ", e,
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
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        catch (AsnException e)
        {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        this.hlrNumber = null;
        this.extensionContainer = null;
        this.addCapability = false;
        this.sgsnMmeSeparationSupported = false;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);
        int num = 0;
        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (num)
            {
                case 0:
                    // hlrNumber
                    if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive() || tag != Tag.STRING_OCTET)
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".hlrNumber: Parameter 0 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.hlrNumber = new ISDNAddressStringImpl();
                    ((ISDNAddressStringImpl) this.hlrNumber).decodeAll(ais);
                    break;
                default:
                    if (ais.getTagClass() == Tag.CLASS_UNIVERSAL)
                    {
                        switch (tag)
                        {
                            case Tag.SEQUENCE:
                                // extensionContainer
                                if (ais.isTagPrimitive())
                                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                            + ".extensionContainer: Parameter extensionContainer is primitive",
                                            MAPParsingComponentExceptionReason.MistypedParameter);
                                this.extensionContainer = new MAPExtensionContainerImpl();
                                ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                                break;
                            case Tag.NULL: // addCapability
                                if (!ais.isTagPrimitive())
                                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                            + ".addCapability: Parameter is  not primitive",
                                            MAPParsingComponentExceptionReason.MistypedParameter);
                                ais.readNull();
                                this.addCapability = true;
                                break;
                            default:
                                ais.advanceElement();
                                break;
                        }
                    } else if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
                    {

                        switch (tag)
                        {
                            case TAG_sgsnMmeSeparationSupported: // sgsnMmeSeparationSupported
                                if (!ais.isTagPrimitive())
                                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                            + ".sgsnMmeSeparationSupported: Parameter is  not primitive",
                                            MAPParsingComponentExceptionReason.MistypedParameter);
                                ais.readNull();
                                this.sgsnMmeSeparationSupported = true;
                                break;
                            default:
                                ais.advanceElement();
                                break;
                        }
                    } else
                    {
                        ais.advanceElement();
                    }
                    break;
            }

            num++;
        }

        if (this.hlrNumber == null)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": hlrNumber is null ",
                    MAPParsingComponentExceptionReason.MistypedParameter);

    }

    @Override
    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {
        try
        {
            this.encodeAll(asnOs, this.getTagClass(), this.getTag());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new MAPException(e);
        }
    }

    @Override
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
            e.printStackTrace();
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
        catch (Exception e)
        {
            e.printStackTrace();
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
            if (this.hlrNumber == null)
                throw new MAPException("hlrNumber parameter must not be null");

            ((ISDNAddressStringImpl) this.hlrNumber).encodeAll(asnOs);

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs);

            if (this.addCapability)
                asnOs.writeNull();

            if (this.sgsnMmeSeparationSupported)
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, TAG_sgsnMmeSeparationSupported);

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

        if (this.hlrNumber != null)
        {
            sb.append("hlrNumber=");
            sb.append(this.hlrNumber.toString());
            sb.append(", ");
        }

        if (this.extensionContainer != null)
        {
            sb.append("extensionContainer=");
            sb.append(this.extensionContainer.toString());
            sb.append(", ");
        }

        if (this.addCapability)
        {
            sb.append("addCapability, ");
        }

        if (this.sgsnMmeSeparationSupported)
        {
            sb.append("sgsnMmeSeparationSupported, ");
        }

        sb.append("]");

        return sb.toString();
    }

}
