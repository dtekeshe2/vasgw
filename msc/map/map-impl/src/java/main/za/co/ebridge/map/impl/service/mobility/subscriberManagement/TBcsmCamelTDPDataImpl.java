package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DefaultCallHandling;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TBcsmCamelTDPData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TBcsmTriggerDetectionPoint;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class TBcsmCamelTDPDataImpl
        extends SequenceBase
        implements TBcsmCamelTDPData
{

    public static final int _TAG_gsmSCF_Address = 0;
    public static final int _TAG_defaultCallHandling = 1;
    public static final int _TAG_extensionContainer = 2;

    private TBcsmTriggerDetectionPoint tBcsmTriggerDetectionPoint;
    private long serviceKey;
    private ISDNAddressString gsmSCFAddress;
    private DefaultCallHandling defaultCallHandling;
    private MAPExtensionContainer extensionContainer;

    public TBcsmCamelTDPDataImpl()
    {
        super("TBcsmCamelTDPData");
    }

    public TBcsmCamelTDPDataImpl(
            TBcsmTriggerDetectionPoint tBcsmTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer)
    {
        super("TBcsmCamelTDPData");

        this.tBcsmTriggerDetectionPoint = tBcsmTriggerDetectionPoint;
        this.serviceKey = serviceKey;
        this.gsmSCFAddress = gsmSCFAddress;
        this.defaultCallHandling = defaultCallHandling;
        this.extensionContainer = extensionContainer;
    }

    @Override
    public TBcsmTriggerDetectionPoint getTBcsmTriggerDetectionPoint()
    {
        return tBcsmTriggerDetectionPoint;
    }

    @Override
    public long getServiceKey()
    {
        return serviceKey;
    }

    @Override
    public ISDNAddressString getGsmSCFAddress()
    {
        return gsmSCFAddress;
    }

    @Override
    public DefaultCallHandling getDefaultCallHandling()
    {
        return defaultCallHandling;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer()
    {
        return extensionContainer;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {

        this.tBcsmTriggerDetectionPoint = null;
        this.serviceKey = -1;
        this.gsmSCFAddress = null;
        this.defaultCallHandling = null;
        this.extensionContainer = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        int num = 0;
        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (num)
            {
                case 0:
                    // t-BcsmTriggerDetectionPoint
                    if (tag != Tag.ENUMERATED || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ": Parameter 0 bad tag, tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    int i1 = (int) ais.readInteger();
                    this.tBcsmTriggerDetectionPoint = TBcsmTriggerDetectionPoint.getInstance(i1);
                    break;

                case 1:
                    // serviceKey
                    if (tag != Tag.INTEGER || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ": Parameter 1 bad tag, tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.serviceKey = (int) ais.readInteger();
                    break;

                default:
                    switch (ais.getTagClass())
                    {
                        case Tag.CLASS_CONTEXT_SPECIFIC:
                        {
                            switch (tag)
                            {
                                case _TAG_gsmSCF_Address:
                                    if (!ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".gsmSCF_Address: Parameter is not primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    this.gsmSCFAddress = new ISDNAddressStringImpl();
                                    ((ISDNAddressStringImpl) this.gsmSCFAddress).decodeAll(ais);
                                    break;
                                case _TAG_defaultCallHandling:
                                    if (!ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".defaultCallHandling: Parameter is not primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    i1 = (int) ais.readInteger();
                                    this.defaultCallHandling = DefaultCallHandling.getInstance(i1);
                                    break;
                                case _TAG_extensionContainer:
                                    if (ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".extensionContainer: Parameter extensionContainer is primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    this.extensionContainer = new MAPExtensionContainerImpl();
                                    ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                                    break;
                                default:
                                    ais.advanceElement();
                                    break;
                            }
                        }
                        break;
                        default:
                            ais.advanceElement();
                            break;
                    }
            }

            num++;
        }

        if (this.tBcsmTriggerDetectionPoint == null)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament tBcsmTriggerDetectionPoint is mandatory but does not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }

        if (this.serviceKey == -1)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament serviceKey is mandatory but does not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        try
        {
            if (this.tBcsmTriggerDetectionPoint == null)
                throw new MAPException("Error while encoding" + _PrimitiveName
                        + ": tBcsmTriggerDetectionPoint must not be null");

            asnOs.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.tBcsmTriggerDetectionPoint.getCode());
            asnOs.writeInteger(this.serviceKey);

            if (this.gsmSCFAddress != null)
                ((ISDNAddressStringImpl) this.gsmSCFAddress).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                        _TAG_gsmSCF_Address);

            if (this.defaultCallHandling != null)
                asnOs.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_defaultCallHandling, this.defaultCallHandling
                        .getCode());

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                        _TAG_extensionContainer);

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
        sb.append(this._PrimitiveName);
        sb.append(" [");

        if (this.tBcsmTriggerDetectionPoint != null)
        {
            sb.append("tBcsmTriggerDetectionPoint=");
            sb.append(this.tBcsmTriggerDetectionPoint.toString());
        }
        sb.append(", serviceKey=");
        sb.append(this.serviceKey);
        if (this.gsmSCFAddress != null)
        {
            sb.append(", gsmSCFAddress=");
            sb.append(this.gsmSCFAddress.toString());
        }
        if (this.defaultCallHandling != null)
        {
            sb.append(", defaultCallHandling=");
            sb.append(this.defaultCallHandling.toString());
        }
        if (this.extensionContainer != null)
        {
            sb.append(", extensionContainer=");
            sb.append(this.extensionContainer.toString());
        }

        sb.append("]");

        return sb.toString();
    }
}
