package za.co.ebridge.map.impl.service.sms;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.*;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.sms.LocationInfoWithLMSI;
import za.co.ebridge.map.api.service.sms.SendRoutingInfoForSMResponse;
import za.co.ebridge.map.impl.primitives.IMSIImpl;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

public class SendRoutingInfoForSMResponseImpl
        extends SmsMessageImpl
        implements SendRoutingInfoForSMResponse
{

    protected static final int _TAG_LocationInfoWithLMSI = 0;
    protected static final int _TAG_mwdSet = 2;
    protected static final int _TAG_ExtensionContainer = 4;

    protected String _PrimitiveName = "SendRoutingInfoForSMResponse";

    private IMSI imsi;
    private LocationInfoWithLMSI locationInfoWithLMSI;
    private MAPExtensionContainer extensionContainer;
    private Boolean mwdSet;

    public SendRoutingInfoForSMResponseImpl()
    {
    }

    public SendRoutingInfoForSMResponseImpl(
            IMSI imsi, LocationInfoWithLMSI locationInfoWithLMSI,
            MAPExtensionContainer extensionContainer, Boolean mwdSet)
    {
        this.imsi = imsi;
        this.locationInfoWithLMSI = locationInfoWithLMSI;
        this.extensionContainer = extensionContainer;
        this.mwdSet = mwdSet;
    }

    public MAPMessageType getMessageType()
    {
        return MAPMessageType.sendRoutingInfoForSM_Response;
    }

    public int getOperationCode()
    {
        return MAPOperationCode.sendRoutingInfoForSM;
    }

    public IMSI getIMSI()
    {
        return this.imsi;
    }

    public LocationInfoWithLMSI getLocationInfoWithLMSI()
    {
        return this.locationInfoWithLMSI;
    }

    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    public Boolean getMwdSet()
    {
        return mwdSet;
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

        this.imsi = null;
        this.locationInfoWithLMSI = null;
        this.extensionContainer = null;
        this.mwdSet = null;

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
                    // imsi
                    if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive() || tag != Tag.STRING_OCTET)
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".imsi: Parameter 0 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.imsi = new IMSIImpl();
                    ((IMSIImpl) this.imsi).decodeAll(ais);
                    break;

                case 1:
                    // locationInfoWithLMSI
                    if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || ais.isTagPrimitive()
                            || tag != _TAG_LocationInfoWithLMSI)
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".locationInfoWithLMSI: Parameter 1 bad tag class or tag or primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.locationInfoWithLMSI = new LocationInfoWithLMSIImpl();
                    ((LocationInfoWithLMSIImpl) this.locationInfoWithLMSI).decodeAll(ais);
                    break;

                default:
                    if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
                    {
                        switch (tag)
                        {
                            case _TAG_ExtensionContainer:
                                if (ais.isTagPrimitive())
                                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                            + ".extensionContainer: Parameter extensionContainer is primitive",
                                            MAPParsingComponentExceptionReason.MistypedParameter);
                                this.extensionContainer = new MAPExtensionContainerImpl();
                                ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                                break;
                            case _TAG_mwdSet:
                                if (!ais.isTagPrimitive())
                                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                            + ".mwdSet: Parameter mwdSet is not primitive",
                                            MAPParsingComponentExceptionReason.MistypedParameter);
                                this.mwdSet = ais.readBoolean();
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

        if (num < 2)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Needs at least 2 mandatory parameters, found " + num,
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {
        this.encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.SEQUENCE);
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag)
            throws
            MAPException
    {
        try
        {
            asnOs.writeTag(tagClass, false, tag);
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

        if (this.imsi == null || this.locationInfoWithLMSI == null)
            throw new MAPException("imsi and locationInfoWithLMSI must not be null");

        ((IMSIImpl) this.imsi).encodeAll(asnOs);
        ((LocationInfoWithLMSIImpl) this.locationInfoWithLMSI).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                _TAG_LocationInfoWithLMSI);
        if (this.extensionContainer != null)
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                    _TAG_ExtensionContainer);
        if (this.mwdSet != null)
            try
            {
                asnOs.writeBoolean(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_mwdSet, this.mwdSet);
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
        sb.append("SendRoutingInfoForSMResponse [");

        if (this.getMAPDialog() != null)
        {
            sb.append("DialogId=").append(this.getMAPDialog().getLocalDialogId());
        }

        if (this.imsi != null)
        {
            sb.append(", imsi=");
            sb.append(this.imsi.toString());
        }
        if (this.locationInfoWithLMSI != null)
        {
            sb.append(", locationInfoWithLMSI=");
            sb.append(this.locationInfoWithLMSI.toString());
        }
        if (this.extensionContainer != null)
        {
            sb.append(", extensionContainer=");
            sb.append(this.extensionContainer.toString());
        }
        if (this.mwdSet != null)
        {
            sb.append(", mwdSet=");
            sb.append(this.mwdSet.toString());
        }

        sb.append("]");

        return sb.toString();
    }
}
