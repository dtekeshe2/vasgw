/* eBridge SS7 */

package za.co.ebridge.map.impl.service.supplementary;

import java.io.IOException;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPMessageType;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSResponse;
import za.co.ebridge.map.impl.CBSDataCodingSchemeImpl;
import za.co.ebridge.map.impl.primitives.USSDStringImpl;

/**
 *
 * @author amit bhayani
 *
 */
public class ProcessUnstructuredSSResponseImpl extends SupplementaryMessageImpl implements ProcessUnstructuredSSResponse {

    /**
     *
     */
    public ProcessUnstructuredSSResponseImpl() {
        super();
    }

    public ProcessUnstructuredSSResponseImpl(CBSDataCodingScheme ussdDataCodingSch, USSDString ussdString) {
        super(ussdDataCodingSch, ussdString);
    }

    public MAPMessageType getMessageType() {
        return MAPMessageType.processUnstructuredSSRequest_Response;
    }

    public int getOperationCode() {
        return MAPOperationCode.processUnstructuredSS_Request;
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

        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding ProcessUnstructuredSSResponseIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding ProcessUnstructuredSSResponseIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding ProcessUnstructuredSSResponseIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding ProcessUnstructuredSSResponseIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ansIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        int tag = ais.readTag();

        // ussd-DataCodingScheme USSD-DataCodingScheme
        if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSResponseIndication: Parameter ussd-DataCodingScheme bad tag class or not primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        int length1 = ais.readLength();
        this.ussdDataCodingSch = new CBSDataCodingSchemeImpl(ais.readOctetStringData(length1)[0]);

        tag = ais.readTag();

        // ussd-String USSD-String
        if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSResponseIndication: Parameter ussd-String bad tag class or not primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        this.ussdString = new USSDStringImpl(this.ussdDataCodingSch);
        ((USSDStringImpl) this.ussdString).decodeAll(ais);

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
            throw new MAPException("AsnException when encoding ProcessUnstructuredSSResponseIndication", e);
        }
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.ussdString == null)
            throw new MAPException("ussdString must not be null");

        try {
            asnOs.writeOctetString(new byte[] { (byte) this.ussdDataCodingSch.getCode() });

            ((USSDStringImpl) this.ussdString).encodeAll(asnOs);

        } catch (IOException e) {
            throw new MAPException("IOException when encoding ProcessUnstructuredSSResponseIndication", e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding ProcessUnstructuredSSResponseIndication", e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessUnstructuredSSResponse [");
        if (this.getMAPDialog() != null) {
            sb.append("DialogId=").append(this.getMAPDialog().getLocalDialogId());
        }
        sb.append(super.toString());
        sb.append("]");

        return sb.toString();
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<ProcessUnstructuredSSResponseImpl> PROCESS_UNSTRUCTURED_SS_RESPONSE_XML = new XMLFormat<ProcessUnstructuredSSResponseImpl>() {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, ProcessUnstructuredSSResponseImpl ussdMessage)
                throws XMLStreamException {
            USSD_MESSAGE_XML.read(xml, ussdMessage);

        }

        @Override
        public void write(ProcessUnstructuredSSResponseImpl ussdMessage, javolution.xml.XMLFormat.OutputElement xml)
                throws XMLStreamException {
            USSD_MESSAGE_XML.write(ussdMessage, xml);
        }
    };

}
