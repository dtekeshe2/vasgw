package za.co.ebridge.map.impl.service.mobility.subscriberInformation;

import javax.xml.bind.DatatypeConverter;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.map.api.service.mobility.subscriberInformation.EUtranCgi;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class EUtranCgiImpl
        extends OctetStringBase
        implements EUtranCgi
{

    private static final String DATA = "data";

    private static final String DEFAULT_VALUE = null;

    public EUtranCgiImpl()
    {
        super(7, 7, "EUtranCgi");
    }

    public EUtranCgiImpl(byte[] data)
    {
        super(7, 7, "EUtranCgi", data);
    }

    public byte[] getData()
    {
        return data;
    }

    // TODO: add implementing of internal structure

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<EUtranCgiImpl> E_UTRAN_CGI_XML = new XMLFormat<EUtranCgiImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, EUtranCgiImpl eUtranCgi)
                throws
                XMLStreamException
        {
            String s = xml.getAttribute(DATA, DEFAULT_VALUE);
            if (s != null)
            {
                eUtranCgi.data = DatatypeConverter.parseHexBinary(s);
            }
        }

        @Override
        public void write(EUtranCgiImpl eUtranCgi, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {
            if (eUtranCgi.data != null)
            {
                xml.setAttribute(DATA, DatatypeConverter.printHexBinary(eUtranCgi.data));
            }
        }
    };
}
