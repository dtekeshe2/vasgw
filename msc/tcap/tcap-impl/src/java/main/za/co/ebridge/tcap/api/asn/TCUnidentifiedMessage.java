package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import org.apache.log4j.Logger;
import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;

public class TCUnidentifiedMessage
        implements Encodable
{

    private static final Logger logger = Logger.getLogger(TCUnidentifiedMessage.class);

    public static final int _TAG_OTX = 0x08;

    public static final int _TAG_DTX = 0x09;

    // mandatory
    private byte[] originatingTransactionId;
    private byte[] destinationTransactionId;

    /**
     *
     */
    public TCUnidentifiedMessage()
    {
    }

    public byte[] getOriginatingTransactionId()
    {
        return originatingTransactionId;
    }

    public byte[] getDestinationTransactionId()
    {
        return destinationTransactionId;
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {
        throw new EncodeException("Not Supported");
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != _TAG_OTX)
            {
                return;
            }

            // this.originatingTransactionId = Utils.readTransactionId(localAis);
            this.originatingTransactionId = localAis.readOctetString();

            if (localAis.available() > 0)
            {
                tag = localAis.readTag();

                if (tag != _TAG_DTX)
                {
                    return;
                }

                // this.destinationTransactionId = Utils.readTransactionId(localAis);
                this.destinationTransactionId = localAis.readOctetString();
            }

        }
        catch (IOException e)
        {
            logger.error("Error while decoding for TCUnidentifiedMessage", e);
        }
        catch (AsnException e)
        {
            logger.error("Error while decoding for TCUnidentifiedMessage", e);
        }

    }

}
