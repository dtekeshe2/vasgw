package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.MAPException;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Lasith Waruna Perera
 */
public class TbcdStringWithFiller
        extends TbcdString
{

    protected static int DIGIT_MASK = 0xFF;

    public TbcdStringWithFiller(int minLength, int maxLength, String _PrimitiveName)
    {
        super(minLength, maxLength, _PrimitiveName);
    }

    public TbcdStringWithFiller(int minLength, int maxLength, String _PrimitiveName, String data)
    {
        super(minLength, maxLength, _PrimitiveName, data);
    }

    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        if (this.data == null)
            throw new MAPException("Error while encoding the " + _PrimitiveName + ": data is not defined");

        encodeString(asnOs, this.data);
        this.encodeFiller(asnOs);
    }

    public void encodeFiller(OutputStream asnOs)
            throws
            MAPException
    {

        for (int i = data.length() + 1; i < this.maxLength * 2; i = i + 2)
        {
            try
            {
                asnOs.write(DIGIT_MASK);
            }
            catch (IOException e)
            {
                throw new MAPException("Error when encoding TbcdString: " + e.getMessage(), e);
            }
        }

    }

}
