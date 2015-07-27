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

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.locationManagement.PurgeMSResponse;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.service.mobility.MobilityMessageImpl;

public class PurgeMSResponseImpl
        extends MobilityMessageImpl
        implements PurgeMSResponse
{

    protected static final int _TAG_freezeTMSI = 0;
    protected static final int _TAG_freezePTMSI = 1;
    protected static final int _TAG_freezeMTMSI = 2;

    public static final String _PrimitiveName = "PurgeMSResponse";

    private boolean freezeTMSI;
    private boolean freezePTMSI;
    private MAPExtensionContainer extensionContainer;
    private boolean freezeMTMSI;

    public PurgeMSResponseImpl()
    {
        super();
    }

    public PurgeMSResponseImpl(
            boolean freezeTMSI, boolean freezePTMSI, MAPExtensionContainer extensionContainer,
            boolean freezeMTMSI)
    {
        super();
        this.freezeTMSI = freezeTMSI;
        this.freezePTMSI = freezePTMSI;
        this.extensionContainer = extensionContainer;
        this.freezeMTMSI = freezeMTMSI;
    }

    @Override
    public MAPMessageType getMessageType()
    {
        return MAPMessageType.purgeMS_Response;
    }

    @Override
    public int getOperationCode()
    {
        return MAPOperationCode.purgeMS;
    }

    @Override
    public boolean getFreezeTMSI()
    {
        return this.freezeTMSI;
    }

    @Override
    public boolean getFreezePTMSI()
    {
        return this.freezePTMSI;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    @Override
    public boolean getFreezeMTMSI()
    {
        return this.freezeMTMSI;
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

        freezeTMSI = false;
        freezePTMSI = false;
        extensionContainer = null;
        freezeMTMSI = false;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        while (true)
        {

            if (ais.available() == 0)
            {
                break;
            }

            int tag = ais.readTag();

            switch (ais.getTagClass())
            {
                case Tag.CLASS_CONTEXT_SPECIFIC:

                    switch (tag)
                    {
                        case _TAG_freezeTMSI:
                            // freezeTMSI
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".freezeTMSI: Parameter is not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            ais.readNull();
                            this.freezeTMSI = true;
                            break;
                        case _TAG_freezePTMSI:
                            // freezePTMSI
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".freezePTMSI: Parameter is not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            ais.readNull();
                            this.freezePTMSI = true;
                            break;
                        case _TAG_freezeMTMSI:
                            // freezeMTMSI
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".freezeMTMSI: Parameter is not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            ais.readNull();
                            this.freezeMTMSI = true;
                            break;
                        default:
                            ais.advanceElement();
                            break;
                    }
                    break;
                case Tag.CLASS_UNIVERSAL:
                    switch (tag)
                    {
                        case Tag.SEQUENCE:
                            if (ais.isTagPrimitive())
                            {
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".extensionContainer: is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            }
                            this.extensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                            break;
                        default:
                            ais.advanceElement();
                            break;
                    }
                    break;
                default:
                    ais.advanceElement();
                    break;
            }

        }
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {
        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag)
            throws
            MAPException
    {
        try
        {
            asnOs.writeTag(tagClass, getIsPrimitive(), tag);
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
            if (freezeTMSI)
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_freezeTMSI);

            if (freezePTMSI)
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_freezePTMSI);

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs);

            if (freezeMTMSI)
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_freezeMTMSI);

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

        if (this.freezeTMSI)
        {
            sb.append("freezeTMSI, ");
        }

        if (this.freezePTMSI)
        {
            sb.append("freezePTMSI, ");
        }

        if (this.extensionContainer != null)
        {
            sb.append("extensionContainer=");
            sb.append(extensionContainer.toString());
            sb.append(", ");
        }

        if (this.freezeMTMSI)
        {
            sb.append("freezeMTMSI ");
        }

        sb.append("]");

        return sb.toString();
    }

}
