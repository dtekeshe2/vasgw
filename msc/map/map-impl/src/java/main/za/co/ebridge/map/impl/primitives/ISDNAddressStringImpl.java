/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.AddressNature;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.NumberingPlan;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class ISDNAddressStringImpl extends AddressStringImpl implements ISDNAddressString {

    public ISDNAddressStringImpl() {
    }

    public ISDNAddressStringImpl(AddressNature addressNature, NumberingPlan numberingPlan, String address) {
        super(addressNature, numberingPlan, address);
    }

    @Override
    protected void _testLengthDecode(int length) throws MAPParsingComponentException {
        if (length > 9)
            throw new MAPParsingComponentException("Error when decoding FTNAddressString: mesage length must not exceed 9",
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    @Override
    protected void _testLengthEncode() throws MAPException {

        if (this.address == null && this.address.length() > 16)
            throw new MAPException("Error when encoding ISDNAddressString: address length must not exceed 16 digits");
    }

    @Override
    public String toString() {
        return "ISDNAddressString[AddressNature=" + this.addressNature + ", NumberingPlan=" + this.numberingPlan + ", Address="
                + this.address + "]";
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<ISDNAddressStringImpl> ISDN_ADDRESS_STRING_XML = new XMLFormat<ISDNAddressStringImpl>() {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, ISDNAddressStringImpl isdnAddressStringImpl)
                throws XMLStreamException {
            ADDRESS_STRING_XML.read(xml, isdnAddressStringImpl);
        }

        @Override
        public void write(ISDNAddressStringImpl isdnAddressStringImpl, javolution.xml.XMLFormat.OutputElement xml)
                throws XMLStreamException {
            ADDRESS_STRING_XML.write(isdnAddressStringImpl, xml);
        }
    };
}
