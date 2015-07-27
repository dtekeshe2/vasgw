package za.co.ebridge.map.impl.service.mobility.imei;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIu;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIuA;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIuB;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class UESBIIuImpl
        extends SequenceBase
        implements UESBIIu
{

    private static final int _TAG_UESBI_IuA = 0;
    private static final int _TAG_UESBI_IuB = 1;

    private UESBIIuA uesbiIuA;
    private UESBIIuB uesbiIuB;

    public UESBIIuImpl()
    {
        super("UESBIIu");
    }

    public UESBIIuImpl(UESBIIuA uesbiIuA, UESBIIuB uesbiIuB)
    {
        super("UESBIIu");
        this.uesbiIuA = uesbiIuA;
        this.uesbiIuB = uesbiIuB;
    }

    @Override
    public UESBIIuA getUESBI_IuA()
    {
        return this.uesbiIuA;
    }

    @Override
    public UESBIIuB getUESBI_IuB()
    {
        return this.uesbiIuB;
    }

    public void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        this.uesbiIuA = null;
        this.uesbiIuB = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
            {
                switch (tag)
                {
                    case _TAG_UESBI_IuA:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter uesbiIuA is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.uesbiIuA = new UESBIIuAImpl();
                        ((UESBIIuAImpl) this.uesbiIuA).decodeAll(ais);
                        break;

                    case _TAG_UESBI_IuB:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter uesbiIuB is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.uesbiIuB = new UESBIIuBImpl();
                        ((UESBIIuBImpl) this.uesbiIuB).decodeAll(ais);
                        break;

                    default:
                        ais.advanceElement();
                        break;
                }
            } else
            {
                ais.advanceElement();
            }
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        if (this.uesbiIuA != null)
        {
            ((UESBIIuAImpl) this.uesbiIuA).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_UESBI_IuA);
        }
        if (this.uesbiIuB != null)
        {
            ((UESBIIuBImpl) this.uesbiIuB).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_UESBI_IuB);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");
        if (this.uesbiIuA != null)
        {
            sb.append("uesbiIuA=");
            sb.append(this.uesbiIuA);
            sb.append(", ");
        }

        if (this.uesbiIuB != null)
        {
            sb.append("uesbiIuB=");
            sb.append(this.uesbiIuB);
        }
        sb.append("]");

        return sb.toString();
    }

}
