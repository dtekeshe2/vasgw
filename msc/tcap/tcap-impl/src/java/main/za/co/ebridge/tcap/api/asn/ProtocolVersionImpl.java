package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class ProtocolVersionImpl
        implements ProtocolVersion
{

    private boolean supportedVersion = true;

    public boolean isSupportedVersion()
    {

        return supportedVersion;
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {

            BitSetStrictLength readV = ais.readBitString();
            if (readV.getStrictLength() >= 1 && readV.get(0))
            {
                // ok
            } else
            {
                this.supportedVersion = false;
            }
        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException while decoding ProtocolVersion: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException while decoding ProtocolVersion: " + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        // commented code is the whole case encoding implementation
        // now only one version is supported - we use for optimization purpose simple encoding
        // aos.writeBitString(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_PROTOCOL_VERSION, _VALUE);
        aos.write(128);
        aos.write(2);
        aos.write(7);
        aos.write(128);

        // BitSetStrictLength bs = new BitSetStrictLength(1);
        // bs.set(0);
        // try {
        // aos.writeBitString(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_PROTOCOL_VERSION, bs);
        // } catch (AsnException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }
}
