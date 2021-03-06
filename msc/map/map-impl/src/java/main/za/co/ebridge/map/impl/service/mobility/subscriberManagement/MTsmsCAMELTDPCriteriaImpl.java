package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import java.io.IOException;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MTSMSTPDUType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MTsmsCAMELTDPCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SMSTriggerDetectionPoint;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class MTsmsCAMELTDPCriteriaImpl
        extends SequenceBase
        implements MTsmsCAMELTDPCriteria
{

    private static final int _TAG_tPDUTypeCriterion = 0;

    private SMSTriggerDetectionPoint smsTriggerDetectionPoint;
    private ArrayList<MTSMSTPDUType> tPDUTypeCriterion;

    public MTsmsCAMELTDPCriteriaImpl()
    {
        super("MTsmsCAMELTDPCriteria");
    }

    public MTsmsCAMELTDPCriteriaImpl(
            SMSTriggerDetectionPoint smsTriggerDetectionPoint,
            ArrayList<MTSMSTPDUType> tPDUTypeCriterion)
    {
        super("MTsmsCAMELTDPCriteria");
        this.smsTriggerDetectionPoint = smsTriggerDetectionPoint;
        this.tPDUTypeCriterion = tPDUTypeCriterion;
    }

    @Override
    public SMSTriggerDetectionPoint getSMSTriggerDetectionPoint()
    {
        return this.smsTriggerDetectionPoint;
    }

    @Override
    public ArrayList<MTSMSTPDUType> getTPDUTypeCriterion()
    {
        return this.tPDUTypeCriterion;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        this.smsTriggerDetectionPoint = null;
        this.tPDUTypeCriterion = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (ais.getTagClass())
            {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag)
                    {
                        case Tag.ENUMERATED:
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".smsTriggerDetectionPoint:  not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);

                            int code = (int) ais.readInteger();
                            this.smsTriggerDetectionPoint = SMSTriggerDetectionPoint.getInstance(code);
                            break;
                        default:
                            ais.advanceElement();
                            break;
                    }
                    break;

                case Tag.CLASS_CONTEXT_SPECIFIC:

                    switch (tag)
                    {
                        case _TAG_tPDUTypeCriterion:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".tPDUTypeCriterion: is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            AsnInputStream ais2 = ais.readSequenceStream();
                            this.tPDUTypeCriterion = new ArrayList<MTSMSTPDUType>();
                            while (true)
                            {
                                if (ais2.available() == 0)
                                    break;

                                int tag2 = ais2.readTag();
                                if (tag2 != Tag.ENUMERATED || ais2.getTagClass() != Tag.CLASS_UNIVERSAL
                                        || !ais2.isTagPrimitive())
                                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                            + ".mtSMSTPDUType: bad tag or tagClass or is not primitive ",
                                            MAPParsingComponentExceptionReason.MistypedParameter);

                                int code = (int) ais2.readInteger();
                                MTSMSTPDUType mtSMSTPDUType = MTSMSTPDUType.getInstance(code);
                                this.tPDUTypeCriterion.add(mtSMSTPDUType);
                            }

                            if (this.tPDUTypeCriterion.size() < 1 || this.tPDUTypeCriterion.size() > 6)
                            {
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ": Parameter tPDUTypeCriterion size must be from 1 to 6, found: "
                                        + this.tPDUTypeCriterion.size(), MAPParsingComponentExceptionReason
                                        .MistypedParameter);
                            }
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

        if (this.smsTriggerDetectionPoint == null)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament smsTriggerDetectionPoint is mandatory but does not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);

    }

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        if (this.smsTriggerDetectionPoint == null)
            throw new MAPException("Error while encoding " + _PrimitiveName + ": smsTriggerDetectionPoint required.");

        if (this.tPDUTypeCriterion != null && (this.tPDUTypeCriterion.size() < 1 || this.tPDUTypeCriterion.size() > 6))
        {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + ": Parameter tPDUTypeCriterion size must be from 1 to 6, found: " + this.tPDUTypeCriterion.size
                    ());
        }

        try
        {
            asnOs.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.smsTriggerDetectionPoint.getCode());

            if (this.tPDUTypeCriterion != null)
            {
                asnOs.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG_tPDUTypeCriterion);
                int pos = asnOs.StartContentDefiniteLength();
                for (MTSMSTPDUType mtSMSTPDUType : this.tPDUTypeCriterion)
                {
                    asnOs.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, mtSMSTPDUType.getCode());
                }
                asnOs.FinalizeContent(pos);
            }

        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
        catch (IOException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.smsTriggerDetectionPoint != null)
        {
            sb.append("smsTriggerDetectionPoint=");
            sb.append(this.smsTriggerDetectionPoint.toString());
            sb.append(", ");
        }

        if (this.tPDUTypeCriterion != null)
        {
            sb.append("mobilityTriggers=[");
            boolean firstItem = true;
            for (MTSMSTPDUType be : this.tPDUTypeCriterion)
            {
                if (firstItem)
                    firstItem = false;
                else
                    sb.append(", ");
                sb.append(be.toString());
            }
            sb.append("] ");
        }

        sb.append("]");

        return sb.toString();
    }

}
