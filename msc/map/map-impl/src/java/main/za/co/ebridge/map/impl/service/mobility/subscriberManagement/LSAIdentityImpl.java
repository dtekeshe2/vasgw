package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import javax.xml.bind.DatatypeConverter;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAIdentity;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class LSAIdentityImpl
        extends OctetStringBase
        implements LSAIdentity
{

    private static final String DATA = "data";

    private static final String DEFAULT_VALUE = null;

    public LSAIdentityImpl()
    {
        super(3, 3, "LSAIdentity");
    }

    public LSAIdentityImpl(byte[] data)
    {
        super(3, 3, "LSAIdentity", data);
    }

    public byte[] getData()
    {
        return data;
    }

    @Override
    public boolean isPlmnSignificantLSA()
    {
        return ((this.data[2] & 0x01) == 0x01);
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<LSAIdentityImpl> LSA_IDENTITY_XML = new XMLFormat<LSAIdentityImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, LSAIdentityImpl lsaIdentity)
                throws
                XMLStreamException
        {
            String s = xml.getAttribute(DATA, DEFAULT_VALUE);
            if (s != null)
            {
                lsaIdentity.data = DatatypeConverter.parseHexBinary(s);
            }
        }

        @Override
        public void write(LSAIdentityImpl lsaIdentity, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {
            if (lsaIdentity.data != null)
            {
                xml.setAttribute(DATA, DatatypeConverter.printHexBinary(lsaIdentity.data));
            }
        }
    };
}
