/* eBridge SS7 */

package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import javax.xml.bind.DatatypeConverter;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.TAId;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class TAIdImpl extends OctetStringBase implements TAId {

    private static final String DATA = "data";

    private static final String DEFAULT_VALUE = null;

    public TAIdImpl() {
        super(5, 5, "TAId");
    }

    public TAIdImpl(byte[] data) {
        super(5, 5, "TAId", data);
    }

    public byte[] getData() {
        return data;
    }

    // TODO: add implementing of internal structure

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<TAIdImpl> TA_ID_XML = new XMLFormat<TAIdImpl>() {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, TAIdImpl taId) throws XMLStreamException {
            String s = xml.getAttribute(DATA, DEFAULT_VALUE);
            if (s != null) {
                taId.data = DatatypeConverter.parseHexBinary(s);
            }
        }

        @Override
        public void write(TAIdImpl taId, javolution.xml.XMLFormat.OutputElement xml) throws XMLStreamException {
            if (taId.data != null) {
                xml.setAttribute(DATA, DatatypeConverter.printHexBinary(taId.data));
            }
        }
    };

}
