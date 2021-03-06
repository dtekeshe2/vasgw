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
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.lsm.LCSClientName;
import za.co.ebridge.map.api.service.lsm.LCSFormatIndicator;
import za.co.ebridge.map.impl.CBSDataCodingSchemeImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;
import za.co.ebridge.map.impl.primitives.USSDStringImpl;

/**
 * @author amit bhayani
 *
 */
public class LCSClientNameImpl implements LCSClientName, MAPAsnPrimitive {

    private static final int _TAG_DATA_CODING_SCHEME = 0;
    private static final int _TAG_NAME_STRING = 2;
    private static final int _TAG_LCS_FORMAT_INDICATOR = 3;

    public static final String _PrimitiveName = "LCSClientName";

    private CBSDataCodingScheme dataCodingScheme;
    private USSDString nameString;
    private LCSFormatIndicator lcsFormatIndicator;

    /**
     *
     */
    public LCSClientNameImpl() {
        super();
    }

    /**
     * @param dataCodingScheme
     * @param nameString
     * @param lcsFormatIndicator
     */
    public LCSClientNameImpl(CBSDataCodingScheme dataCodingScheme, USSDString nameString, LCSFormatIndicator lcsFormatIndicator) {
        super();
        this.dataCodingScheme = dataCodingScheme;
        this.nameString = nameString;
        this.lcsFormatIndicator = lcsFormatIndicator;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSClientName# getDataCodingScheme()
     */
    public CBSDataCodingScheme getDataCodingScheme() {
        return this.dataCodingScheme;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSClientName#getNameString ()
     */
    public USSDString getNameString() {
        return this.nameString;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LCSClientName# getLCSFormatIndicator()
     */
    public LCSFormatIndicator getLCSFormatIndicator() {
        return this.lcsFormatIndicator;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getTag()
     */
    public int getTag() throws MAPException {
        return Tag.SEQUENCE;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getTagClass ()
     */
    public int getTagClass() {
        return Tag.CLASS_UNIVERSAL;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#getIsPrimitive ()
     */
    public boolean getIsPrimitive() {
        return false;
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
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
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

        this.dataCodingScheme = null;
        this.nameString = null;
        this.lcsFormatIndicator = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        int tag = ais.readTag();

        // Decode mandatory dataCodingScheme [0] USSD-DataCodingScheme,
        if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive() || tag != _TAG_DATA_CODING_SCHEME) {
            throw new MAPParsingComponentException(
                    "Error while decoding LCSClientName: Parameter 0[dataCodingScheme [0] USSD-DataCodingScheme] bad tag class, tag or not primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }

        int length1 = ais.readLength();
        this.dataCodingScheme = new CBSDataCodingSchemeImpl(ais.readOctetStringData(length1)[0]);

        tag = ais.readTag();

        // Decode mandatory nameString [2] NameString,
        if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive() || tag != _TAG_NAME_STRING) {
            throw new MAPParsingComponentException(
                    "Error while decoding LCSClientName: Parameter 1[nameString [2] NameString,] bad tag class, tag or not primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }

        this.nameString = new USSDStringImpl(this.dataCodingScheme);
        ((USSDStringImpl) this.nameString).decodeAll(ais);

        while (true) {
            if (ais.available() == 0)
                break;

            tag = ais.readTag();
            switch (tag) {
                case _TAG_LCS_FORMAT_INDICATOR:
                    // Decode lcs-FormatIndicator [3] LCS-FormatIndicator OPTIONAL
                    if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive()) {
                        throw new MAPParsingComponentException(
                                "Error while decoding LCSClientName: Parameter 2[lcs-FormatIndicator [3] LCS-FormatIndicator OPTIONAL] bad tag class, tag or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    }
                    length1 = ais.readLength();
                    this.lcsFormatIndicator = LCSFormatIndicator.getLCSFormatIndicator((int) ais.readIntegerData(length1));
                    break;

                default:
                    ais.advanceElement();
            }
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
            asnOs.writeTag(tagClass, this.getIsPrimitive(), tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + "", e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.MAPAsnPrimitive#encodeData
     * (com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.nameString == null)
            throw new MAPException("nameString must not be null");

        try {
            asnOs.writeOctetString(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_DATA_CODING_SCHEME,
                    new byte[] { (byte) this.dataCodingScheme.getCode() });

            ((USSDStringImpl) this.nameString).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_NAME_STRING);

            if (this.lcsFormatIndicator != null) {
                asnOs.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_LCS_FORMAT_INDICATOR,
                        this.lcsFormatIndicator.getIndicator());
            }
        } catch (IOException e) {
            throw new MAPException("IOException when encoding LCSClientName", e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding LCSClientName", e);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dataCodingScheme.getCode();
        result = prime * result + ((lcsFormatIndicator == null) ? 0 : lcsFormatIndicator.hashCode());
        result = prime * result + ((nameString == null) ? 0 : nameString.hashCode());
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
        LCSClientNameImpl other = (LCSClientNameImpl) obj;
        if (dataCodingScheme.getCode() != other.dataCodingScheme.getCode())
            return false;
        if (lcsFormatIndicator != other.lcsFormatIndicator)
            return false;
        if (nameString == null) {
            if (other.nameString != null)
                return false;
        } else if (!nameString.equals(other.nameString))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        sb.append("dataCodingScheme=");
        sb.append(this.dataCodingScheme);

        if (this.nameString != null) {
            sb.append(", nameString=");
            sb.append(this.nameString.toString());
        }
        if (this.lcsFormatIndicator != null) {
            sb.append(", lcsFormatIndicator=");
            sb.append(this.lcsFormatIndicator.toString());
        }

        sb.append("]");

        return sb.toString();
    }
}
