package za.co.ebridge.map.impl.service.mobility.authentication;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.authentication.CK;
import za.co.ebridge.map.api.service.mobility.authentication.IK;
import za.co.ebridge.map.api.service.mobility.authentication.KSI;
import za.co.ebridge.map.api.service.mobility.authentication.UMTSSecurityContextData;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class UMTSSecurityContextDataImpl
        extends SequenceBase
        implements UMTSSecurityContextData
{

    private CK ck;
    private IK ik;
    private KSI ksi;

    public UMTSSecurityContextDataImpl()
    {
        super("UMTSSecurityContextData");
    }

    public UMTSSecurityContextDataImpl(CK ck, IK ik, KSI ksi)
    {
        super("UMTSSecurityContextData");
        this.ck = ck;
        this.ik = ik;
        this.ksi = ksi;
    }

    @Override
    public CK getCK()
    {
        return this.ck;
    }

    @Override
    public IK getIK()
    {
        return this.ik;
    }

    @Override
    public KSI getKSI()
    {
        return this.ksi;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {

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
                    if (tag != Tag.STRING_OCTET || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                    {
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".ck: Parameter 0 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    }
                    this.ck = new CKImpl();
                    ((CKImpl) this.ck).decodeAll(ais);
                    break;
                case 1:
                    if (tag != Tag.STRING_OCTET || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                    {
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".ik: Parameter 1 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    }
                    this.ik = new IKImpl();
                    ((IKImpl) this.ik).decodeAll(ais);
                    break;
                case 2:
                    if (tag != Tag.STRING_OCTET || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
                    {
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".ck: Parameter 2 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    }
                    this.ksi = new KSIImpl();
                    ((KSIImpl) this.ksi).decodeAll(ais);
                    break;
                default:
                    ais.advanceElement();
                    break;
            }
            num++;
        }
        if (num < 3)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Needs at least 3 mandatory parameters, found " + num,
                    MAPParsingComponentExceptionReason.MistypedParameter);

    }

    @Override
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {
        if (this.ck == null || this.ik == null || this.ksi == null)
        {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + " the mandatory parameter ck,ik or ksi is not defined");
        }
        if (this.ck != null)
            ((CKImpl) this.ck).encodeAll(asnOs);

        if (this.ik != null)
            ((IKImpl) this.ik).encodeAll(asnOs);

        if (this.ksi != null)
            ((KSIImpl) this.ksi).encodeAll(asnOs);

    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.ck != null)
        {
            sb.append("ck=");
            sb.append(this.ck.toString());
            sb.append(", ");
        }

        if (this.ik != null)
        {
            sb.append("ik=");
            sb.append(this.ik.toString());
            sb.append(", ");
        }

        if (this.ksi != null)
        {
            sb.append("ksi=");
            sb.append(this.ksi.toString());
            sb.append(", ");
        }

        sb.append("]");

        return sb.toString();

    }

}
