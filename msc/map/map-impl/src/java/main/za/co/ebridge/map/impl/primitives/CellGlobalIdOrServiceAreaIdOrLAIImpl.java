/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import java.io.IOException;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.CellGlobalIdOrServiceAreaIdFixedLength;
import za.co.ebridge.map.api.primitives.CellGlobalIdOrServiceAreaIdOrLAI;
import za.co.ebridge.map.api.primitives.LAIFixedLength;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class CellGlobalIdOrServiceAreaIdOrLAIImpl implements CellGlobalIdOrServiceAreaIdOrLAI, MAPAsnPrimitive {

    private static final int _TAG_CELL_GLOBAL_ID_OR_SERVICE_AREAR_ID = 0;
    private static final int _TAG_LAI = 1;

    private static final String CELL_GLOBAL_ID_OR_SERVICE_AREA_ID_FIXED_LENGTH = "cellGlobalIdOrServiceAreaIdFixedLength";
    private static final String LAI_FIXED_LENGTH = "laiFixedLength";

    private CellGlobalIdOrServiceAreaIdFixedLength cellGlobalIdOrServiceAreaIdFixedLength = null;
    private LAIFixedLength laiFixedLength = null;

    /**
     *
     */
    public CellGlobalIdOrServiceAreaIdOrLAIImpl() {
        super();
    }

    public CellGlobalIdOrServiceAreaIdOrLAIImpl(CellGlobalIdOrServiceAreaIdFixedLength cellGlobalIdOrServiceAreaIdFixedLength) {

        this.cellGlobalIdOrServiceAreaIdFixedLength = cellGlobalIdOrServiceAreaIdFixedLength;
    }

    public CellGlobalIdOrServiceAreaIdOrLAIImpl(LAIFixedLength laiFixedLength) {

        this.laiFixedLength = laiFixedLength;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm. CellGlobalIdOrServiceAreaIdOrLAI
     * #getCellGlobalIdOrServiceAreaIdFixedLength()
     */
    public CellGlobalIdOrServiceAreaIdFixedLength getCellGlobalIdOrServiceAreaIdFixedLength() {
        return this.cellGlobalIdOrServiceAreaIdFixedLength;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm. CellGlobalIdOrServiceAreaIdOrLAI#getLAIFixedLength()
     */
    public LAIFixedLength getLAIFixedLength() {
        return this.laiFixedLength;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getTag()
     */
    public int getTag() throws MAPException {
        if (this.cellGlobalIdOrServiceAreaIdFixedLength != null) {
            return _TAG_CELL_GLOBAL_ID_OR_SERVICE_AREAR_ID;
        } else {
            return _TAG_LAI;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getTagClass()
     */
    public int getTagClass() {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getIsPrimitive()
     */
    public boolean getIsPrimitive() {
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#decodeAll(com.ebridge.protocols.asn.AsnInputStream)
     */
    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding CellGlobalIdOrServiceAreaIdOrLAI: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding CellGlobalIdOrServiceAreaIdOrLAI: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#decodeData(com.ebridge.protocols.asn.AsnInputStream,
     * int)
     */
    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding CellGlobalIdOrServiceAreaIdOrLAI: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding CellGlobalIdOrServiceAreaIdOrLAI: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        if (asnIS.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !asnIS.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding CellGlobalIdOrServiceAreaIdOrLAI: bad tag class or is not primitive: TagClass="
                            + asnIS.getTagClass(), MAPParsingComponentExceptionReason.MistypedParameter);

        switch (asnIS.getTag()) {
            case _TAG_CELL_GLOBAL_ID_OR_SERVICE_AREAR_ID:
                this.cellGlobalIdOrServiceAreaIdFixedLength = new CellGlobalIdOrServiceAreaIdFixedLengthImpl();
                ((CellGlobalIdOrServiceAreaIdFixedLengthImpl) this.cellGlobalIdOrServiceAreaIdFixedLength).decodeData(asnIS,
                        length);
                break;
            case _TAG_LAI:
                this.laiFixedLength = new LAIFixedLengthImpl();
                ((LAIFixedLengthImpl) this.laiFixedLength).decodeData(asnIS, length);
                break;
            default:
                throw new MAPParsingComponentException(
                        "Error while decoding AdditionalNumber: Expexted msc-Number [0] ISDN-AddressString or sgsn-Number [1] ISDN-AddressString, but found "
                                + asnIS.getTag(), MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeAll(com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        this.encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, this.getTag());
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeAll(com.ebridge.protocols.asn.AsnOutputStream,
     * int, int)
     */
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
        try {
            asnOs.writeTag(tagClass, true, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding CellGlobalIdOrServiceAreaIdOrLAI: " + e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeData(com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.cellGlobalIdOrServiceAreaIdFixedLength == null && this.laiFixedLength == null)
            throw new MAPException(
                    "Error while encoding the CellGlobalIdOrServiceAreaIdOrLAI: both cellGlobalIdOrServiceAreaIdFixedLength and laiFixedLength are not defined");

        if (this.cellGlobalIdOrServiceAreaIdFixedLength != null) {
            ((CellGlobalIdOrServiceAreaIdFixedLengthImpl) this.cellGlobalIdOrServiceAreaIdFixedLength).encodeData(asnOs);
        } else {
            ((LAIFixedLengthImpl) this.laiFixedLength).encodeData(asnOs);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("CellGlobalIdOrServiceAreaIdOrLAI [");
        if (this.cellGlobalIdOrServiceAreaIdFixedLength != null)
            sb.append(this.cellGlobalIdOrServiceAreaIdFixedLength.toString());
        if (this.laiFixedLength != null)
            sb.append(this.laiFixedLength.toString());
        sb.append("]");

        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((cellGlobalIdOrServiceAreaIdFixedLength == null) ? 0 : cellGlobalIdOrServiceAreaIdFixedLength.hashCode());
        result = prime * result + ((laiFixedLength == null) ? 0 : laiFixedLength.hashCode());
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
        CellGlobalIdOrServiceAreaIdOrLAIImpl other = (CellGlobalIdOrServiceAreaIdOrLAIImpl) obj;
        if (cellGlobalIdOrServiceAreaIdFixedLength == null) {
            if (other.cellGlobalIdOrServiceAreaIdFixedLength != null)
                return false;
        } else if (!cellGlobalIdOrServiceAreaIdFixedLength.equals(other.cellGlobalIdOrServiceAreaIdFixedLength))
            return false;
        if (laiFixedLength == null) {
            if (other.laiFixedLength != null)
                return false;
        } else if (!laiFixedLength.equals(other.laiFixedLength))
            return false;
        return true;
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<CellGlobalIdOrServiceAreaIdOrLAIImpl> CELL_GLOBAL_ID_OR_SERVICE_AREA_ID_OR_LAI_XML = new XMLFormat<CellGlobalIdOrServiceAreaIdOrLAIImpl>(
            ) {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml,
                CellGlobalIdOrServiceAreaIdOrLAIImpl cellGlobalIdOrServiceAreaIdOrLAI) throws XMLStreamException {
            cellGlobalIdOrServiceAreaIdOrLAI.cellGlobalIdOrServiceAreaIdFixedLength = xml.get(
                    CELL_GLOBAL_ID_OR_SERVICE_AREA_ID_FIXED_LENGTH, CellGlobalIdOrServiceAreaIdFixedLengthImpl.class);
            cellGlobalIdOrServiceAreaIdOrLAI.laiFixedLength = xml.get(LAI_FIXED_LENGTH, LAIFixedLengthImpl.class);
        }

        @Override
        public void write(CellGlobalIdOrServiceAreaIdOrLAIImpl cellGlobalIdOrServiceAreaIdOrLAI,
                javolution.xml.XMLFormat.OutputElement xml) throws XMLStreamException {
            if (cellGlobalIdOrServiceAreaIdOrLAI.getCellGlobalIdOrServiceAreaIdFixedLength() != null) {
                xml.add((CellGlobalIdOrServiceAreaIdFixedLengthImpl) cellGlobalIdOrServiceAreaIdOrLAI
                        .getCellGlobalIdOrServiceAreaIdFixedLength(), CELL_GLOBAL_ID_OR_SERVICE_AREA_ID_FIXED_LENGTH,
                        CellGlobalIdOrServiceAreaIdFixedLengthImpl.class);
            }
            if (cellGlobalIdOrServiceAreaIdOrLAI.getLAIFixedLength() != null) {
                xml.add((LAIFixedLengthImpl) cellGlobalIdOrServiceAreaIdOrLAI.getLAIFixedLength(), LAI_FIXED_LENGTH,
                        LAIFixedLengthImpl.class);
            }
        }
    };
}
