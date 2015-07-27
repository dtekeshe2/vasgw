/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.DiameterIdentity;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.lsm.ServingNodeAddress;
import za.co.ebridge.map.impl.primitives.DiameterIdentityImpl;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 *
 *
 * @author david@tekeshe.com
 *
 */
public class ServingNodeAddressImpl implements ServingNodeAddress, MAPAsnPrimitive {

    public static final int _TAG_mscNumber = 0;
    public static final int _TAG_sgsnNumber = 1;
    public static final int _TAG_mmeNumber = 2;

    public static final String _PrimitiveName = "ProvideSubscriberLocationResponse";

    private ISDNAddressString mscNumber;
    private ISDNAddressString sgsnNumber;
    private DiameterIdentity mmeNumber;

    public ServingNodeAddressImpl() {
    }

    public ServingNodeAddressImpl(ISDNAddressString isdnNumber, boolean isMsc) {
        if (isMsc)
            this.mscNumber = isdnNumber;
        else
            this.sgsnNumber = isdnNumber;
    }

    public ServingNodeAddressImpl(DiameterIdentity mmeNumber) {
        this.mmeNumber = mmeNumber;
    }

    public ISDNAddressString getMscNumber() {
        return mscNumber;
    }

    public ISDNAddressString getSgsnNumber() {
        return sgsnNumber;
    }

    public DiameterIdentity getMmeNumber() {
        return mmeNumber;
    }

    public int getTag() throws MAPException {
        if (this.mscNumber != null) {
            return _TAG_mscNumber;
        } else if (this.sgsnNumber != null) {
            return _TAG_sgsnNumber;
        } else {
            return _TAG_mmeNumber;
        }
    }

    public int getTagClass() {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    public boolean getIsPrimitive() {
        return true;
    }

    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": ", e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        if (asnIS.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !asnIS.isTagPrimitive())
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": bad tag class or is not primitive: TagClass=" + asnIS.getTagClass(),
                    MAPParsingComponentExceptionReason.MistypedParameter);

        switch (asnIS.getTag()) {
            case _TAG_mscNumber:
                this.mscNumber = new ISDNAddressStringImpl();
                ((ISDNAddressStringImpl) this.mscNumber).decodeData(asnIS, length);
                break;
            case _TAG_sgsnNumber:
                this.sgsnNumber = new ISDNAddressStringImpl();
                ((ISDNAddressStringImpl) this.sgsnNumber).decodeData(asnIS, length);
                break;
            case _TAG_mmeNumber:
                this.mmeNumber = new DiameterIdentityImpl();
                ((DiameterIdentityImpl) this.mmeNumber).decodeData(asnIS, length);
                break;
            default:
                throw new MAPParsingComponentException(
                        "Error while decoding "
                                + _PrimitiveName
                                + ": Expected msc-Number ISDN-AddressString or sgsn-Number ISDN-AddressString or mmeNumber, but found: "
                                + asnIS.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
        try {
            asnOs.writeTag(tagClass, this.getIsPrimitive(), tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        int i1 = 0;
        if (mscNumber != null)
            i1++;
        if (sgsnNumber != null)
            i1++;
        if (mmeNumber != null)
            i1++;

        if (i1 != 1)
            throw new MAPException("Error while encoding the " + _PrimitiveName + ": one of choice must be defined, fiund: "
                    + i1);

        if (this.mscNumber != null) {
            ((ISDNAddressStringImpl) this.mscNumber).encodeData(asnOs);
        } else if (this.sgsnNumber != null) {
            ((ISDNAddressStringImpl) this.sgsnNumber).encodeData(asnOs);
        } else {
            ((DiameterIdentityImpl) this.mmeNumber).encodeData(asnOs);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.mscNumber != null) {
            sb.append(" mscNumber=");
            sb.append(this.mscNumber);
        }
        if (this.sgsnNumber != null) {
            sb.append(" sgsnNumber=");
            sb.append(this.sgsnNumber);
        }
        if (this.mmeNumber != null) {
            sb.append(" mmeNumber=");
            sb.append(this.mmeNumber);
        }

        sb.append("]");

        return sb.toString();
    }
}
