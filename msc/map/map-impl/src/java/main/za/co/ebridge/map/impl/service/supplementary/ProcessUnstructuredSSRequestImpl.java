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
import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSRequest;
import za.co.ebridge.map.impl.CBSDataCodingSchemeImpl;
import za.co.ebridge.map.impl.primitives.AlertingPatternImpl;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.USSDStringImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class ProcessUnstructuredSSRequestImpl extends SupplementaryMessageImpl implements ProcessUnstructuredSSRequest {

    private static final String MSISDN = "msisdn";
    private static final String ALERTING_PATTERN = "alertingPattern";

    private static final int _TAG_MSISDN = 0;

    private ISDNAddressString msisdnAddressString = null;
    private AlertingPattern alertingPattern = null;

    /**
     */
    public ProcessUnstructuredSSRequestImpl() {
        super();
    }

    public ProcessUnstructuredSSRequestImpl(CBSDataCodingScheme ussdDataCodingSch, USSDString ussdString,
            AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString) {
        super(ussdDataCodingSch, ussdString);
        this.alertingPattern = alertingPattern;
        this.msisdnAddressString = msisdnAddressString;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.supplementary.
     * ProcessUnstructuredSSRequestIndication#getMSISDNAddressString()
     */
    public ISDNAddressString getMSISDNAddressString() {
        return this.msisdnAddressString;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.supplementary.
     * ProcessUnstructuredSSRequestIndication#getAlertingPattern()
     */
    public AlertingPattern getAlertingPattern() {
        return this.alertingPattern;
    }

    public MAPMessageType getMessageType() {
        return MAPMessageType.processUnstructuredSSRequest_Request;
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
            throw new MAPParsingComponentException("IOException when decoding ProcessUnstructuredSSRequestIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding ProcessUnstructuredSSRequestIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding ProcessUnstructuredSSRequestIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding ProcessUnstructuredSSRequestIndication: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ansIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        int tag = ais.readTag();

        // ussd-DataCodingScheme USSD-DataCodingScheme
        if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSRequestIndication: Parameter ussd-DataCodingScheme bad tag class or not primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        this.ussdDataCodingSch = new CBSDataCodingSchemeImpl(ais.readOctetString()[0]);

        tag = ais.readTag();

        // ussd-String USSD-String
        if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || !ais.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error while decoding ProcessUnstructuredSSRequestIndication: Parameter ussd-String bad tag class or not primitive",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        this.ussdString = new USSDStringImpl(this.ussdDataCodingSch);
        ((USSDStringImpl) this.ussdString).decodeAll(ais);

        while (true) {
            if (ais.available() == 0)
                break;

            tag = ais.readTag();

            switch (tag) {
                case _TAG_MSISDN:
                    // msisdn [0] ISDN-AddressString OPTIONAL
                    if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException(
                                "Error while decoding ProcessUnstructuredSSRequestIndication: Parameter msisdn bad tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    this.msisdnAddressString = new ISDNAddressStringImpl();
                    ((ISDNAddressStringImpl) this.msisdnAddressString).decodeAll(ais);
                    break;
                default:
                    // alertingPattern AlertingPattern OPTIONAL
                    if (tag == Tag.STRING_OCTET && ais.getTagClass() == Tag.CLASS_UNIVERSAL && ais.isTagPrimitive()) {
                        this.alertingPattern = new AlertingPatternImpl();
                        ((AlertingPatternImpl) this.alertingPattern).decodeAll(ais);
                    } else {
                        ais.advanceElement();
                    }
                    break;
            }
        }

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
            throw new MAPException("AsnException when encoding ProcessUnstructuredSSRequestIndication", e);
        }
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.ussdString == null)
            throw new MAPException("ussdString must not be null");

        try {
            asnOs.writeOctetString(new byte[] { (byte) this.ussdDataCodingSch.getCode() });

            ((USSDStringImpl) this.ussdString).encodeAll(asnOs);

            if (this.alertingPattern != null) {
                ((AlertingPatternImpl) this.alertingPattern).encodeAll(asnOs);
            }

            if (this.msisdnAddressString != null) {
                ((ISDNAddressStringImpl) this.msisdnAddressString).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_MSISDN);
            }
        } catch (IOException e) {
            throw new MAPException("IOException when encoding ProcessUnstructuredSSRequestIndication", e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding ProcessUnstructuredSSRequestIndication", e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessUnstructuredSSRequest [");

        if (this.getMAPDialog() != null) {
            sb.append("DialogId=").append(this.getMAPDialog().getLocalDialogId());
        }

        sb.append(super.toString());

        if (alertingPattern != null) {
            sb.append(", alertingPattern=");
            sb.append(alertingPattern.toString());
        }
        if (msisdnAddressString != null) {
            sb.append(", msisdn=");
            sb.append(msisdnAddressString.toString());
        }

        sb.append("]");

        return sb.toString();
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<ProcessUnstructuredSSRequestImpl> PROCESS_UNSTRUCTURED_SS_REQUEST_XML = new XMLFormat<ProcessUnstructuredSSRequestImpl>() {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, ProcessUnstructuredSSRequestImpl ussdMessage)
                throws XMLStreamException {
            USSD_MESSAGE_XML.read(xml, ussdMessage);
            ussdMessage.msisdnAddressString = xml.get(MSISDN, ISDNAddressStringImpl.class);
            ussdMessage.alertingPattern = xml.get(ALERTING_PATTERN, AlertingPatternImpl.class);

        }

        @Override
        public void write(ProcessUnstructuredSSRequestImpl ussdMessage, javolution.xml.XMLFormat.OutputElement xml)
                throws XMLStreamException {
            USSD_MESSAGE_XML.write(ussdMessage, xml);
            xml.add(((ISDNAddressStringImpl) ussdMessage.msisdnAddressString), MSISDN, ISDNAddressStringImpl.class);
            xml.add(((AlertingPatternImpl) ussdMessage.alertingPattern), ALERTING_PATTERN, AlertingPatternImpl.class);
        }
    };

}
