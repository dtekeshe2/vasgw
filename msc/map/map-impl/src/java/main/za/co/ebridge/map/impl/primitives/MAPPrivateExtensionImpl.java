/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import java.io.IOException;
import java.util.Arrays;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.isup.impl.message.parameter.ByteArrayContainer;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPPrivateExtension;

/**
 * @author david@tekeshe.com
 *
 */
public class MAPPrivateExtensionImpl implements MAPPrivateExtension, MAPAsnPrimitive {

    private static final String OID = "oid";
    private static final String DATA = "data";

    private static final String DEFAULT_STRING = null;

    private long[] oId;
    private byte[] data;

    public MAPPrivateExtensionImpl() {
    }

    public MAPPrivateExtensionImpl(long[] oId, byte[] data) {
        this.oId = oId;
        this.data = data;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.MAPPrivateExtension#getOId()
     */
    public long[] getOId() {
        return this.oId;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.MAPPrivateExtension#setOId (long[])
     */
    public void setOId(long[] oId) {
        this.oId = oId;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.MAPPrivateExtension#getData()
     */
    public byte[] getData() {
        return this.data;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.dialog.MAPPrivateExtension#setData (byte[])
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    public int getTag() throws MAPException {
        return Tag.SEQUENCE;
    }

    public int getTagClass() {
        return Tag.CLASS_UNIVERSAL;
    }

    public boolean getIsPrimitive() {
        return false;
    }

    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
        // Definition from GSM 09.02 version 5.15.1 Page 690
        // extensionContainer SEQUENCE {
        // privateExtensionList [0] IMPLICIT SEQUENCE ( SIZE( 1 .. 10 ) ) OF
        // SEQUENCE {
        // extId MAP-EXTENSION .&extensionId ( {
        // ,
        // ...} ) ,
        // extType MAP-EXTENSION .&ExtensionType ( {
        // ,
        // ...} { @extId } ) OPTIONAL} OPTIONAL,
        // pcs-Extensions [1] IMPLICIT SEQUENCE {
        // ... } OPTIONAL,
        // ... } OPTIONAL,
        // ... }

        try {
            AsnInputStream ais = ansIS.readSequenceStream();
            this._decode(ais);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding PrivateExtension: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding PrivateExtension: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            AsnInputStream ais = ansIS.readSequenceStreamData(length);
            this._decode(ais);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding PrivateExtension: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding PrivateExtension: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ansIS) throws MAPParsingComponentException, IOException, AsnException {

        // extId
        int tag = ansIS.readTag();
        if (tag != Tag.OBJECT_IDENTIFIER || ansIS.getTagClass() != Tag.CLASS_UNIVERSAL || !ansIS.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error decoding PrivateExtension: bad tag, tagClass or primitiveFactor of ExtentionId",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        this.oId = ansIS.readObjectIdentifier();

        // extType
        if (ansIS.available() > 0) {
            this.data = new byte[ansIS.available()];
            ansIS.read(this.data);
        } else
            this.data = null;
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        this.encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.SEQUENCE);
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {

        try {
            asnOs.writeTag(tagClass, false, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding PrivateExtension: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.oId == null || this.oId.length < 2)
            throw new MAPException(
                    "Error when encoding PrivateExtension: OId value must not be empty when coding PrivateExtension");

        try {
            asnOs.writeObjectIdentifier(this.oId);
            if (this.data != null)
                asnOs.write(this.data);
        } catch (IOException e) {
            throw new MAPException("IOException when encoding PrivateExtension: " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding PrivateExtension: " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivateExtension [");

        if (this.oId != null || this.oId.length > 0) {
            sb.append("Oid=");
            sb.append(this.ArrayToString(this.oId));
        }

        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.ArrayToString(this.data));
        }

        sb.append("]");

        return sb.toString();
    }

    private String ArrayToString(byte[] array) {
        StringBuilder sb = new StringBuilder();
        int i1 = 0;
        for (byte b : array) {
            if (i1 == 0)
                i1 = 1;
            else
                sb.append(", ");
            sb.append(b);
        }
        return sb.toString();
    }

    private String ArrayToString(long[] array) {
        StringBuilder sb = new StringBuilder();
        int i1 = 0;
        for (long b : array) {
            if (i1 == 0)
                i1 = 1;
            else
                sb.append(", ");
            sb.append(b);
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(data);
        result = prime * result + Arrays.hashCode(oId);
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
        MAPPrivateExtensionImpl other = (MAPPrivateExtensionImpl) obj;
        if (!Arrays.equals(data, other.data))
            return false;
        if (!Arrays.equals(oId, other.oId))
            return false;
        return true;
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<MAPPrivateExtensionImpl> MAP_PRIVATE_EXTENSION_XML = new XMLFormat<MAPPrivateExtensionImpl>() {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, MAPPrivateExtensionImpl mapPrivateExtension)
                throws XMLStreamException {
            String globalCode = xml.getAttribute(OID, DEFAULT_STRING);
            if (globalCode != null) {
                OidContainer oid = new OidContainer();
                try {
                    oid.parseSerializedData(globalCode);
                } catch (NumberFormatException e) {
                    throw new XMLStreamException("NumberFormatException when parsing oid in MAPPrivateExtension", e);
                }
                mapPrivateExtension.oId = oid.getData();
            }
            ByteArrayContainer bc = xml.get(DATA, ByteArrayContainer.class);
            if (bc != null) {
                mapPrivateExtension.data = bc.getData();
            }
        }

        @Override
        public void write(MAPPrivateExtensionImpl mapPrivateExtension, javolution.xml.XMLFormat.OutputElement xml)
                throws XMLStreamException {
            if (mapPrivateExtension.oId != null) {
                OidContainer oid = new OidContainer(mapPrivateExtension.oId);
                xml.setAttribute(OID, oid.getSerializedData());
            }
            if (mapPrivateExtension.data != null) {
                ByteArrayContainer bac = new ByteArrayContainer(mapPrivateExtension.data);
                xml.add(bac, DATA, ByteArrayContainer.class);
            }
        }
    };
}
