package za.co.ebridge.map.impl.smstpdu;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.smstpdu.AddressField;
import za.co.ebridge.map.api.smstpdu.NumberingPlanIdentification;
import za.co.ebridge.map.api.smstpdu.TypeOfNumber;
import za.co.ebridge.map.impl.GSMCharset;
import za.co.ebridge.map.impl.GSMCharsetDecoder;
import za.co.ebridge.map.impl.GSMCharsetDecodingData;
import za.co.ebridge.map.impl.GSMCharsetEncoder;
import za.co.ebridge.map.impl.primitives.TbcdString;

public class AddressFieldImpl
        implements AddressField
{

    private TypeOfNumber typeOfNumber;
    private NumberingPlanIdentification numberingPlanIdentification;
    private String addressValue;

    private AddressFieldImpl()
    {
    }

    public AddressFieldImpl(
            TypeOfNumber typeOfNumber, NumberingPlanIdentification numberingPlanIdentification,
            String addressValue)
    {
        this.typeOfNumber = typeOfNumber;
        this.numberingPlanIdentification = numberingPlanIdentification;
        this.addressValue = addressValue;
    }

    public static AddressFieldImpl createMessage(InputStream stm)
            throws
            MAPException
    {

        if (stm == null)
            throw new MAPException("Error creating AddressField: stream must not be null");

        AddressFieldImpl res = new AddressFieldImpl();

        try
        {
            // Address-Length
            int addressLength = stm.read();
            if (addressLength == -1)
                throw new MAPException("Error creating AddressField: Address-Length field not found");
            if (addressLength < 0 || addressLength > 20)
                throw new MAPException(
                        "Error creating AddressField: Address-Length field must be equal from 0 to 20, found: " +
                                "addressLength");

            // Type-of-Address
            int typeOfAddress = stm.read();
            if (typeOfAddress == -1)
                throw new MAPException("Error creating AddressField: Type-of-Address field not found");
            res.typeOfNumber = TypeOfNumber.getInstance((typeOfAddress & 0x70) >> 4);
            res.numberingPlanIdentification = NumberingPlanIdentification.getInstance(typeOfAddress & 0x0F);

            int addressArrayLength = (addressLength + 1) / 2;

            // Address-Value
            if (res.typeOfNumber == TypeOfNumber.Alphanumeric)
            {
                byte[] rawAddress = new byte[addressArrayLength];
                int dataRead = stm.read(rawAddress);

                ByteBuffer bb = ByteBuffer.wrap(rawAddress, 0, dataRead);
                GSMCharset cs = new GSMCharset(GSMCharset.GSM_CANONICAL_NAME, new String[]{});
                GSMCharsetDecoder decoder = (GSMCharsetDecoder) cs.newDecoder();
                int totalSeptetCount = (addressLength < 14 ? addressArrayLength : addressArrayLength + 1);
                GSMCharsetDecodingData encodingData = new GSMCharsetDecodingData(totalSeptetCount, 0);
                decoder.setGSMCharsetDecodingData(encodingData);

                CharBuffer bf = decoder.decode(bb);
                res.addressValue = bf.toString();
            } else
            {
                // Address-Value
                res.addressValue = TbcdString.decodeString(stm, addressArrayLength);
            }

        }
        catch (IOException e)
        {
            throw new MAPException("IOException when creating AddressField: " + e.getMessage(), e);
        }
        catch (MAPParsingComponentException e)
        {
            throw new MAPException("MAPParsingComponentException when creating AddressField: " + e.getMessage(), e);
        }

        return res;
    }

    public TypeOfNumber getTypeOfNumber()
    {
        return this.typeOfNumber;
    }

    public NumberingPlanIdentification getNumberingPlanIdentification()
    {
        return this.numberingPlanIdentification;
    }

    public String getAddressValue()
    {
        return this.addressValue;
    }

    public void encodeData(OutputStream stm)
            throws
            MAPException
    {

        if (typeOfNumber == null || numberingPlanIdentification == null || addressValue == null)
            throw new MAPException(
                    "Error encoding AddressFieldImpl: typeOfNumber, addressValue and numberingPlanIdentification " +
                            "fields must not be null");

        try
        {
            int addrLen = addressValue.length();
            int tpOfAddr = 0x80 + (this.typeOfNumber.getCode() << 4) + this.numberingPlanIdentification.getCode();

            if (this.typeOfNumber == TypeOfNumber.Alphanumeric)
            {
                GSMCharset cs = new GSMCharset(GSMCharset.GSM_CANONICAL_NAME, new String[]{});
                GSMCharsetEncoder encoder = (GSMCharsetEncoder) cs.newEncoder();
                ByteBuffer bb = encoder.encode(CharBuffer.wrap(this.addressValue));
                int dataLength = bb.limit();
                byte[] data = new byte[dataLength];
                bb.get(data);

                // As per 3GPP TS 23.040 (23040-3a[1].pdf)
                // The Address-Length field is an integer representation of the
                // number of useful semi-octets within the Address-Value field,
                // i.e. excludes any semi octet containing only fill bits.

                // TODO Here we have added flag 0xF0 as filler check. This needs
                // to verify for correctness
                // if ((data[dataLength - 1] & 0xF0) == 0x00) {
                // dataLength = (dataLength * 2) - 1;
                // } else {
                // dataLength = dataLength * 2;
                // }
                int semiOct = addrLen * 2 - (int) (addrLen / 4);

                stm.write(semiOct);
                stm.write(tpOfAddr);
                stm.write(data);
            } else
            {
                stm.write(addrLen);
                stm.write(tpOfAddr);
                TbcdString.encodeString(stm, addressValue);
            }
        }
        catch (IOException e)
        {
            // This can not occur
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("AddressField [");

        if (typeOfNumber != null)
        {
            sb.append("typeOfNumber=");
            sb.append(typeOfNumber);
        }
        if (numberingPlanIdentification != null)
        {
            sb.append(", numberingPlanIdentification=");
            sb.append(numberingPlanIdentification);
        }
        if (addressValue != null)
        {
            sb.append(", addressValue=");
            sb.append(addressValue);
        }
        sb.append("]");

        return sb.toString();
    }
}
