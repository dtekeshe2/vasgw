/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.map.api.primitives.IMSI;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class IMSIImpl extends TbcdString implements IMSI {

    private static final String NUMBER = "number";

    public IMSIImpl() {
        super(3, 8, "IMSI");
    }

    public IMSIImpl(String data) {
        super(3, 8, "IMSI", data);
    }

    public String getData() {
        return this.data;
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<IMSIImpl> IMSI_XML = new XMLFormat<IMSIImpl>() {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, IMSIImpl imsi) throws XMLStreamException {
            imsi.data = xml.getAttribute(NUMBER, "");
        }

        @Override
        public void write(IMSIImpl imsi, javolution.xml.XMLFormat.OutputElement xml) throws XMLStreamException {
            xml.setAttribute(NUMBER, imsi.data);
        }
    };
}
