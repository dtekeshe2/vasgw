package za.co.ebridge.map.impl.service.mobility.imei;

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
import za.co.ebridge.map.api.service.mobility.imei.CheckImeiResponse;
import za.co.ebridge.map.api.service.mobility.imei.EquipmentStatus;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIu;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.service.mobility.MobilityMessageImpl;

public class CheckImeiResponseImpl
        extends MobilityMessageImpl
        implements CheckImeiResponse
{

    public static final int _ID_extensionContainer = 0;

    public static final String _PrimitiveName = "CheckImeiResponse";

    private EquipmentStatus equipmentStatus;
    private UESBIIu bmuef;
    private MAPExtensionContainer extensionContainer;

    private long mapProtocolVersion;

    // For incoming messages
    public CheckImeiResponseImpl(long mapProtocolVersion)
    {
        this.mapProtocolVersion = mapProtocolVersion;
    }

    // for outgoing messages
    public CheckImeiResponseImpl(
            long mapProtocolVersion, EquipmentStatus equipmentStatus, UESBIIu bmuef,
            MAPExtensionContainer extensionContainer)
    {
        this.mapProtocolVersion = mapProtocolVersion;
        this.equipmentStatus = equipmentStatus;
        this.bmuef = bmuef;
        this.extensionContainer = extensionContainer;
    }

    public long getMapProtocolVersion()
    {
        return this.mapProtocolVersion;
    }

    @Override
    public int getTag()
            throws
            MAPException
    {
        if (this.mapProtocolVersion >= 3)
        {
            return Tag.SEQUENCE;
        } else
        {
            return Tag.ENUMERATED;
        }
    }

    @Override
    public int getTagClass()
    {
        return Tag.CLASS_UNIVERSAL;
    }

    @Override
    public boolean getIsPrimitive()
    {
        if (this.mapProtocolVersion >= 3)
        {
            return false;
        } else
        {
            return true;
        }
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

        this.equipmentStatus = null;
        this.bmuef = null;
        this.extensionContainer = null;

        if (mapProtocolVersion >= 3)
        {
            AsnInputStream ais = ansIS.readSequenceStreamData(length);
            int num = 0;
            while (true)
            {
                if (ais.available() == 0)
                {
                    break;
                }

                int tag = ais.readTag();

                if (ais.getTagClass() == Tag.CLASS_UNIVERSAL)
                {
                    switch (tag)
                    {
                        case Tag.ENUMERATED:
                            // equipmentStatus
                            if (!ais.isTagPrimitive())
                            {
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".requestedEquipmentInfo: is not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            }
                            int i1 = (int) ais.readInteger();
                            this.equipmentStatus = EquipmentStatus.getInstance(i1);
                            break;
                        case Tag.SEQUENCE:
                            // bmuef
                            if (ais.isTagPrimitive())
                            {
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".bmuef: is primitive", MAPParsingComponentExceptionReason.MistypedParameter);
                            }
                            this.bmuef = new UESBIIuImpl();
                            ((UESBIIuImpl) this.bmuef).decodeAll(ais);
                            break;
                        default:
                            ais.advanceElement();
                            break;
                    }
                } else if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
                {
                    switch (tag)
                    {
                        case _ID_extensionContainer:
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
                } else
                {
                    ais.advanceElement();
                }

                num++;
            }
        } else
        {
            int i1 = (int) ansIS.readIntegerData(length);
            this.equipmentStatus = EquipmentStatus.getInstance(i1);
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

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        try
        {
            if (mapProtocolVersion >= 3)
            {
                if (this.equipmentStatus != null)
                {
                    asnOs.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.equipmentStatus.getCode());
                }
                if (this.bmuef != null)
                {
                    ((UESBIIuImpl) this.bmuef).encodeAll(asnOs);
                }
                if (this.extensionContainer != null)
                {
                    ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                            _ID_extensionContainer);
                }
            } else
            {
                if (this.equipmentStatus == null)
                {
                    throw new MAPException("equipmentStatus parameter must not be null at version 2");
                }

                asnOs.writeIntegerData(this.equipmentStatus.getCode());
            }
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
    public MAPMessageType getMessageType()
    {
        return MAPMessageType.checkIMEI_Response;
    }

    @Override
    public int getOperationCode()
    {
        return MAPOperationCode.checkIMEI;
    }

    @Override
    public EquipmentStatus getEquipmentStatus()
    {
        return this.equipmentStatus;
    }

    @Override
    public UESBIIu getBmuef()
    {
        return bmuef;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.equipmentStatus != null)
        {
            sb.append("equipmentStatus=");
            sb.append(this.equipmentStatus.toString());
            sb.append(", ");
        }

        if (this.bmuef != null)
        {
            sb.append("bmuef=");
            sb.append(bmuef.toString());
            sb.append(", ");
        }

        if (this.extensionContainer != null)
        {
            sb.append("extensionContainer=");
            sb.append(extensionContainer.toString());
            sb.append(", ");
        }

        sb.append("mapProtocolVersion=");
        sb.append(mapProtocolVersion);

        sb.append("]");

        return sb.toString();
    }

}
