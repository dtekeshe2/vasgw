/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.locationManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.service.mobility.locationManagement.IMSIWithLMSI;
import za.co.ebridge.map.impl.primitives.IMSIImpl;
import za.co.ebridge.map.impl.primitives.LMSIImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class IMSIWithLMSIImpl
        extends SequenceBase
        implements IMSIWithLMSI
{

    private IMSI imsi;
    private LMSI lmsi;

    public IMSIWithLMSIImpl()
    {
        super("IMSIWithLMSI");
    }

    public IMSIWithLMSIImpl(IMSI imsi, LMSI lmsi)
    {
        super("IMSIWithLMSI");
        this.imsi = imsi;
        this.lmsi = lmsi;
    }

    protected void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {

        this.imsi = null;
        this.lmsi = null;

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
                    if (tag != Tag.STRING_OCTET && ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ": Parameter imsi has bad tag class or is not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.imsi = new IMSIImpl();
                    ((IMSIImpl) this.imsi).decodeAll(ais);
                    break;
                case 1:
                    if (tag != Tag.STRING_OCTET && ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ": Parameter lmsi has bad tag class or is not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.lmsi = new LMSIImpl();
                    ((LMSIImpl) this.lmsi).decodeAll(ais);
                    break;
                default:
                    ais.advanceElement();
                    break;
            }
            num++;
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        if (this.imsi == null || this.lmsi == null)
        {
            throw new MAPException("Error while decoding " + _PrimitiveName + " : lmsi or lmsi is null");
        }

        ((IMSIImpl) this.imsi).encodeAll(asnOs);
        ((LMSIImpl) this.lmsi).encodeAll(asnOs);
    }

    @Override
    public IMSI getImsi()
    {
        return this.imsi;
    }

    @Override
    public LMSI getLmsi()
    {
        return this.lmsi;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.imsi != null)
        {
            sb.append("imsi=");
            sb.append(imsi.toString());
            sb.append(", ");
        }

        if (this.lmsi != null)
        {
            sb.append("lmsi=");
            sb.append(lmsi.toString());
            sb.append(", ");
        }

        sb.append("]");

        return sb.toString();
    }
}
