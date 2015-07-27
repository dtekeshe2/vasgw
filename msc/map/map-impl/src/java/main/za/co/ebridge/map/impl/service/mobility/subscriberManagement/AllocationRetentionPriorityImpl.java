package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AllocationRetentionPriority;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class AllocationRetentionPriorityImpl
        extends SequenceBase
        implements AllocationRetentionPriority
{

    private static final int _TAG_priorityLevel = 0;
    private static final int _TAG_preEmptionCapability = 1;
    private static final int _TAG_preEmptionVulnerability = 2;
    private static final int _TAG_extensionContainer = 3;

    private int priorityLevel = -1;
    private Boolean preEmptionCapability = null;
    private Boolean preEmptionVulnerability = null;
    private MAPExtensionContainer extensionContainer = null;

    public AllocationRetentionPriorityImpl()
    {
        super("AllocationRetentionPriority");
    }

    public AllocationRetentionPriorityImpl(
            int priorityLevel, Boolean preEmptionCapability, Boolean preEmptionVulnerability,
            MAPExtensionContainer extensionContainer)
    {
        super("AllocationRetentionPriority");
        this.priorityLevel = priorityLevel;
        this.preEmptionCapability = preEmptionCapability;
        this.preEmptionVulnerability = preEmptionVulnerability;
        this.extensionContainer = extensionContainer;
    }

    @Override
    public int getPriorityLevel()
    {
        return this.priorityLevel;
    }

    @Override
    public Boolean getPreEmptionCapability()
    {
        return this.preEmptionCapability;
    }

    @Override
    public Boolean getPreEmptionVulnerability()
    {
        return this.preEmptionVulnerability;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {

        this.priorityLevel = -1;
        this.preEmptionCapability = null;
        this.preEmptionVulnerability = null;
        this.extensionContainer = null;
        boolean isPriorityLevelSet = false;

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
                    if (tag != _TAG_priorityLevel || ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais
                            .isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".priorityLevel: Parameter bad tag, tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.priorityLevel = (int) ais.readInteger();
                    isPriorityLevelSet = true;
                    break;
                default:
                    switch (ais.getTagClass())
                    {
                        case Tag.CLASS_CONTEXT_SPECIFIC:
                        {
                            switch (tag)
                            {
                                case _TAG_preEmptionCapability:
                                    if (!ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".preEmptionCapability: Parameter is not primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    this.preEmptionCapability = ais.readBoolean();
                                    break;
                                case _TAG_preEmptionVulnerability:
                                    if (!ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".preEmptionVulnerability: Parameter is not primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);

                                    this.preEmptionVulnerability = ais.readBoolean();
                                    break;
                                case _TAG_extensionContainer:
                                    if (ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".extensionContainer: Parameter is primitive",
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

        if (!isPriorityLevelSet)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament priorityLevel is mandatory but does not found",
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
            asnOs.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_priorityLevel, this.priorityLevel);

            if (this.preEmptionCapability != null && this.preEmptionCapability.equals(Boolean.TRUE))
                asnOs.writeBoolean(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_preEmptionCapability, preEmptionCapability
                        .booleanValue());

            if (this.preEmptionVulnerability != null)
                asnOs.writeBoolean(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_preEmptionVulnerability,
                        preEmptionVulnerability.booleanValue());

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
        sb.append(_PrimitiveName + " [");

        sb.append("priorityLevel=");
        sb.append(this.priorityLevel);
        sb.append(", ");

        if (this.preEmptionCapability != null)
        {
            sb.append("preEmptionCapability=");
            sb.append(this.preEmptionCapability.toString());
            sb.append(", ");
        }

        if (this.preEmptionVulnerability != null)
        {
            sb.append("preEmptionVulnerability=");
            sb.append(this.preEmptionVulnerability.toString());
            sb.append(", ");
        }

        if (this.extensionContainer != null)
        {
            sb.append("extensionContainer=");
            sb.append(this.extensionContainer.toString());
            sb.append(" ");
        }

        sb.append("]");

        return sb.toString();
    }
}
