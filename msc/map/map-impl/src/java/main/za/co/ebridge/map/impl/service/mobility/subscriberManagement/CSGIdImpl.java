package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSGId;
import za.co.ebridge.map.impl.primitives.BitStringBase;

public class CSGIdImpl
        extends BitStringBase
        implements CSGId
{

    private static final int BIT_STRING_LENGTH = 27;

    public CSGIdImpl()
    {
        super(BIT_STRING_LENGTH, BIT_STRING_LENGTH, BIT_STRING_LENGTH, "CSGId");
    }

    public CSGIdImpl(BitSetStrictLength data)
    {
        super(BIT_STRING_LENGTH, BIT_STRING_LENGTH, BIT_STRING_LENGTH, "CSGId", data);
    }

    public BitSetStrictLength getData()
    {
        return bitString;
    }

    // TODO: add implementing of internal structure (?)

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<CSGIdImpl> CSG_ID_XML = new XMLFormat<CSGIdImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, CSGIdImpl csgId)
                throws
                XMLStreamException
        {
            BIT_STRING_BASE_XML.read(xml, csgId);
        }

        @Override
        public void write(CSGIdImpl csgId, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {
            BIT_STRING_BASE_XML.write(csgId, xml);
        }
    };

}
