package za.co.ebridge.map.impl.service.mobility.authentication;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.mobility.authentication.Cksn;
import za.co.ebridge.map.api.service.mobility.authentication.GSMSecurityContextData;
import za.co.ebridge.map.api.service.mobility.authentication.Kc;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class GSMSecurityContextDataImpl extends SequenceBase implements GSMSecurityContextData {

    private Kc kc;
    private Cksn cksn;

    public GSMSecurityContextDataImpl() {
        super("GSMSecurityContextData");
    }

    public GSMSecurityContextDataImpl(Kc kc, Cksn cksn) {
        super("GSMSecurityContextData");
        this.kc = kc;
        this.cksn = cksn;
    }

    @Override
    public Kc getKc() {
        return this.kc;
    }

    @Override
    public Cksn getCksn() {
        return this.cksn;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        AsnInputStream ais = asnIS.readSequenceStreamData(length);
        int num = 0;
        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();
            switch (num) {
                case 0:
                    if (tag != Tag.STRING_OCTET || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive()) {
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".kc: Parameter 0 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    }
                    this.kc = new KcImpl();
                    ((KcImpl) this.kc).decodeAll(ais);
                    break;
                case 1:
                    if (tag != Tag.STRING_OCTET || ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive()) {
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".cksn: Parameter 1 bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    }
                    this.cksn = new CksnImpl();
                    ((CksnImpl) this.cksn).decodeAll(ais);
                    break;
                default:
                    ais.advanceElement();
                    break;
            }

            num++;
        }
        if (num < 2)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Needs at least 2 mandatory parameters, found " + num,
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {
        if (this.kc == null || this.cksn == null) {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + " the mandatory parameter kc or cksn is not defined");
        }
        if (this.kc != null)
            ((KcImpl) this.kc).encodeAll(asnOs);

        if (this.cksn != null)
            ((CksnImpl) this.cksn).encodeAll(asnOs);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.kc != null) {
            sb.append("kc=");
            sb.append(this.kc.toString());
            sb.append(", ");
        }

        if (this.cksn != null) {
            sb.append("cksn=");
            sb.append(this.cksn.toString());
            sb.append(", ");
        }

        sb.append("]");

        return sb.toString();

    }

}
