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
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.lsm.AdditionalNumber;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 *
 *
 *
 * @author amit bhayani
 *
 */
public class AdditionalNumberImpl implements AdditionalNumber, MAPAsnPrimitive {

    private static final int _TAG_MSC_NUMBER = 0;
    private static final int _TAG_SGSN_NUMBER = 1;

    public static final String _PrimitiveName = "AdditionalNumber";

    private ISDNAddressString mSCNumber = null;
    private ISDNAddressString sGSNNumber = null;

    /**
     *
     */
    public AdditionalNumberImpl() {
        super();
    }

    /**
     * @param mSCNumber
     * @param sGSNNumber
     */
    public AdditionalNumberImpl(ISDNAddressString mSCNumber, ISDNAddressString sGSNNumber) {
        super();
        this.mSCNumber = mSCNumber;
        this.sGSNNumber = sGSNNumber;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.AdditionalNumber#getMSCNumber ()
     */
    public ISDNAddressString getMSCNumber() {
        return this.mSCNumber;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.AdditionalNumber# getSGSNNumber()
     */
    public ISDNAddressString getSGSNNumber() {
        return this.sGSNNumber;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getTag()
     */
    public int getTag() throws MAPException {
        if (this.mSCNumber != null) {
            return _TAG_MSC_NUMBER;
        } else {
            return _TAG_SGSN_NUMBER;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getTagClass ()
     */
    public int getTagClass() {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getIsPrimitive ()
     */
    public boolean getIsPrimitive() {
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#decodeAll
     * (com.ebridge.protocols.asn.AsnInputStream)
     */
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

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#decodeData
     * (com.ebridge.protocols.asn.AsnInputStream, int)
     */
    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }

    }

    private void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        if (asnIS.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !asnIS.isTagPrimitive())
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": bad tag class or is not primitive: TagClass=" + asnIS.getTagClass(),
                    MAPParsingComponentExceptionReason.MistypedParameter);

        switch (asnIS.getTag()) {
            case _TAG_MSC_NUMBER:
                this.mSCNumber = new ISDNAddressStringImpl();
                ((ISDNAddressStringImpl) this.mSCNumber).decodeData(asnIS, length);
                break;
            case _TAG_SGSN_NUMBER:
                this.sGSNNumber = new ISDNAddressStringImpl();
                ((ISDNAddressStringImpl) this.sGSNNumber).decodeData(asnIS, length);
                break;
            default:
                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                        + ": Expexted msc-Number [0] ISDN-AddressString or sgsn-Number [1] ISDN-AddressString, but found "
                        + asnIS.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeAll
     * (com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeAll
     * (com.ebridge.protocols.asn.AsnOutputStream, int, int)
     */
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
        try {
            asnOs.writeTag(tagClass, true, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeData
     * (com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs) throws MAPException {
        if (this.mSCNumber == null && this.sGSNNumber == null)
            throw new MAPException("Error when encoding " + _PrimitiveName + ": both mscNumber and sgsnNumber must not be null");
        if (this.mSCNumber != null && this.sGSNNumber != null)
            throw new MAPException("Error when encoding " + _PrimitiveName
                    + ": both mscNumber and sgsnNumber must not be not null");

        if (this.mSCNumber != null) {
            ((ISDNAddressStringImpl) this.mSCNumber).encodeData(asnOs);
        } else {
            ((ISDNAddressStringImpl) this.sGSNNumber).encodeData(asnOs);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionalNumber [");

        if (this.mSCNumber != null) {
            sb.append("msc-Number=");
            sb.append(this.mSCNumber.toString());
        }
        if (this.sGSNNumber != null) {
            sb.append("sgsn-Number=");
            sb.append(this.sGSNNumber.toString());
        }

        sb.append("]");

        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mSCNumber == null) ? 0 : mSCNumber.hashCode());
        result = prime * result + ((sGSNNumber == null) ? 0 : sGSNNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AdditionalNumberImpl other = (AdditionalNumberImpl) obj;
        if (mSCNumber == null) {
            if (other.mSCNumber != null)
                return false;
        } else if (!mSCNumber.equals(other.mSCNumber))
            return false;
        if (sGSNNumber == null) {
            if (other.sGSNNumber != null)
                return false;
        } else if (!sGSNNumber.equals(other.sGSNNumber))
            return false;
        return true;
    }

}
